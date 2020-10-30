package cn.yyf.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangchen
 * @create 2020/10/30/11:22
 */
@FeignClient(name = "storage")
public interface StorageClient {

    @GetMapping("/decrease")
    String decrease(@RequestParam Long productId, @RequestParam Integer count);
}
