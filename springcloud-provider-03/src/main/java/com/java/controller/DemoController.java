package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/hello/{id}")
    public String hello(@PathVariable("id") String id) {
        return "hello world【03】:" + id;
    }
}
