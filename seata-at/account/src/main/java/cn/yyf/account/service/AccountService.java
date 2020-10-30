package cn.yyf.account.service;

import java.math.BigDecimal;

/**
 * @author wangchen
 * @create 2020/10/29/9:47
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);

}
