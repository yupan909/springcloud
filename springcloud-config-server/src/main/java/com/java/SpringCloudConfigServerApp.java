package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 17:23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class SpringCloudConfigServerApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigServerApp.class, args);
    }
}
