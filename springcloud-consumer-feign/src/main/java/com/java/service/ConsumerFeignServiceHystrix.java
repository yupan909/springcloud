package com.java.service;

import org.springframework.stereotype.Component;

/**
 * 熔断降级
 *
 * @author yupan@yijiupi.cn
 * @date 2020-04-02 17:41
 */
@Component
public class ConsumerFeignServiceHystrix implements ConsumerFeignService {

    @Override
    public String hello() {
        return "调用失败，服务熔断降级";
    }
}
