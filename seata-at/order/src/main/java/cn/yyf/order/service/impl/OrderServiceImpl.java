package cn.yyf.order.service.impl;

import cn.yyf.order.entity.Order;
import cn.yyf.order.feign.AccountClient;
import cn.yyf.order.feign.EasyIdGeneratorClient;
import cn.yyf.order.feign.StorageClient;
import cn.yyf.order.mapper.OrderMapper;
import cn.yyf.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author wangchen
 * @create 2020/10/30/10:43
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private AccountClient accountClient;
    @Autowired
    private StorageClient storageClient;
    @Autowired
    private EasyIdGeneratorClient easyIdGeneratorClient;

    @Override
    public void create(Order order) {
        //从全局唯一id发号器获得id，这里暂时随机产生一个 orderId
        order.setId(Long.parseLong(easyIdGeneratorClient.nextId("order_business")));
        orderMapper.create(order);
        //调用storage，修改库存
        storageClient.decrease(order.getProductId(), order.getCount());
        //调用account，修改账户余额
        accountClient.decrease(order.getUserId(), order.getMoney());
    }
}
