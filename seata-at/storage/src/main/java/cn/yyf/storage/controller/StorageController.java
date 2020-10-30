package cn.yyf.storage.controller;

import cn.yyf.storage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangchen
 * @create 2020/10/30/10:25
 */
@RestController
public class StorageController {

    @Autowired
    private StorageService storageService;

    @GetMapping("/decrease")
    public String decrease(Long productId, Integer count){
        storageService.decrease(productId,count);
        return "减少商品数量成功!";
    }
}
