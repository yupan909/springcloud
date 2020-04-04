package com.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 启动类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 17:23
 */
@SpringBootApplication
@EnableHystrixDashboard
public class SpringCloudConsumerHystrixDashboardApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerHystrixDashboardApp.class, args);
    }
}
