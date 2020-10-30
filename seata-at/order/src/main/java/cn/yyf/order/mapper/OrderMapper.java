package cn.yyf.order.mapper;

import cn.yyf.order.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


public interface OrderMapper extends BaseMapper<Order> {

    void create(Order order);

}