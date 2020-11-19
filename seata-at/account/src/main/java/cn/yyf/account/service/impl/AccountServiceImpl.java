package cn.yyf.account.service.impl;

import cn.yyf.account.mapper.AccountMapper;
import cn.yyf.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

/**
 * @author wangchen
 * @create 2020/10/29/9:48
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        accountMapper.decrease(userId, money);
        if (Math.random() < 0.5) {
            throw new RuntimeException("模拟异常");
        }
    }
}
