package cn.yyf.storage.service;

/**
 * @author wangchen
 * @create 2020/10/30/10:24
 */
public interface StorageService {

    void decrease(Long productId, Integer count);

}
