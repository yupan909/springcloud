package com.java.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * RestTemplate注入
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 20:14
 */
@Configuration
public class RestConfig {

    @Bean
    @LoadBalanced  // 开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 设置指定的负载均衡算法
     */
    @Bean
    public IRule myRule(){
        // 默认轮询，这里设置为随机
        return new RandomRule();
    }
}
