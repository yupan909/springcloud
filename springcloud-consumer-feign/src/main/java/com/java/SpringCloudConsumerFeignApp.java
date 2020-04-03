package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * 启动类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 17:23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudConsumerFeignApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerFeignApp.class, args);
    }
}
