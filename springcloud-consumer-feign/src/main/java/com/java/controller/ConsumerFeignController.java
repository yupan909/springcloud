package com.java.controller;

import com.java.service.ConsumerFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门消费者
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 17:27
 */
@RestController
public class ConsumerFeignController {

    @Autowired
    private ConsumerFeignService service;

    /**
     * Feign负载均衡测试
     */
    @GetMapping("/feign/{id}")
    public String feign(@PathVariable("id") String id) {
        return service.hello(id);
    }
}
