package cn.yyf.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangchen
 * @create 2020/10/30/11:17
 */
@FeignClient(name = "easy-id-generator")
public interface EasyIdGeneratorClient {

    @GetMapping("/segment/ids/next_id")
    String nextId(@RequestParam String businessType);

}
