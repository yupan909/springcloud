package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 17:27
 */
@RestController
@RequestMapping("/ribbon")
public class ConsumerRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String URL = "http://SPRINGCLOUD-PROVIDER";

    /**
     * Ribbon负载均衡测试
     */
    @GetMapping("/hello")
    public String ribbon() {
        return restTemplate.getForObject(URL + "/hello", String.class);
    }

}
