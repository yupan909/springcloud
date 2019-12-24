package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 运行Eureka服务器
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 20:55
 */
@SpringBootApplication
@EnableEurekaServer   // Eureka服务端启动类
public class Eureka03App {
    public static void main(String[] args) {
        SpringApplication.run(Eureka03App.class, args);
    }
}
