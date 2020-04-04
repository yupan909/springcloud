package com.java.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * 生产者
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 14:29
 */
@RestController
public class DemoController {

    /**
     * 生产者
     */
    @HystrixCommand(fallbackMethod = "ribbonHystrix")
    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") String id) {
        if (Objects.equals(id, "404")) {
            throw new RuntimeException("运行异常：" + id);
        }
        return "hello world【hystrix】:" + id;
    }

    /**
     * 熔断降级方法（参数返回体必须和原方法保持一致）
     * @return
     */
    public String ribbonHystrix(String id) {
        return "调用失败，服务熔断: " + id;
    }
}
