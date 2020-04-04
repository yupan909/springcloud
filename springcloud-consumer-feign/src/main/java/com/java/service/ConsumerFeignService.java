package com.java.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign - 声明式的WebService客户端
 *
 * @author yupan@yijiupi.cn
 * @date 2020-03-24 17:50
 */
@FeignClient(value = "SPRINGCLOUD-PROVIDER", fallback = ConsumerFeignServiceHystrix.class)
public interface ConsumerFeignService {

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    String hello(@PathVariable("id") String id);
}
