package com.java.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 消费者
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 17:27
 */
@RestController
public class ConsumerRibbonController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String URL = "http://SPRINGCLOUD-PROVIDER";

    /**
     * Ribbon负载均衡测试
     */
    @HystrixCommand(fallbackMethod = "ribbonHystrix")
    @GetMapping("/ribbon/{id}")
    public String ribbon(@PathVariable("id") String id) {
        return restTemplate.getForObject(URL + "/hello/" + id, String.class);
    }

    /**
     * 熔断降级方法（参数返回体必须和原方法保持一致）
     * @return
     */
    public String ribbonHystrix(String id) {
        return "调用失败，服务熔断降级: " + id;
    }

}
