package cn.yyf.storage.mapper;

import cn.yyf.storage.entity.Storage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @author wangchen
 * @create 2020/10/30/10:25
 */
public interface StorageMapper extends BaseMapper<Storage> {

    void decrease(Long productId, Integer count);

}
