package com.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-06 17:28
 */
@MapperScan("com.java.dao")
@SpringBootApplication
public class SpringCloudProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProviderApp.class, args);
    }
}
