package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-06 17:28
 */
@SpringBootApplication
@EnableEurekaClient  // Eureka客户端，启动后自动将本服务注册到Eureka服务中
public class SpringCloudProvider02App {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider02App.class, args);
    }
}
