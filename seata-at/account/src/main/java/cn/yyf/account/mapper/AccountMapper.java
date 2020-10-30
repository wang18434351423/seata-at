package cn.yyf.account.mapper;

import cn.yyf.account.entity.Account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.math.BigDecimal;

/**
 * @author wangchen
 * @create 2020/10/29/9:45
 */
public interface AccountMapper extends BaseMapper<Account> {

    void decrease(Long userId, BigDecimal money);
}
