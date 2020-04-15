package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 17:23
 */
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConfigClientApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigClientApp.class, args);
    }
}
