package com.java.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * todo
 *
 * @author yupan@yijiupi.cn
 * @date 2020-04-15 10:18
 */
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @GetMapping("/config")
    public String getConfig() {
        return "获取spring.application.name：" + applicationName + "，port：" + port;
    }
}
