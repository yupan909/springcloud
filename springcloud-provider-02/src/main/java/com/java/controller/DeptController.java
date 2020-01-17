package com.java.controller;

import com.java.bean.base.BaseResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 部门
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 14:29
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    /**
     * 负载均衡测试
     */
    @GetMapping("/hello")
    public BaseResult hello() {
        return new BaseResult<>("hello world【02】");
    }
}
