package com.java.service;

import com.java.bean.base.BaseResult;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign - 声明式的WebService客户端
 *
 * @author yupan@yijiupi.cn
 * @date 2020-03-24 17:50
 */
@FeignClient("SPRINGCLOUD-PROVIDER")
public interface DeptConsumerService {

    @RequestMapping(value = "/dept/hello", method = RequestMethod.GET)
    BaseResult hello();
}
