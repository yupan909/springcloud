package com.java.controller;

import com.java.bean.base.BaseResult;
import com.java.bean.dto.DeptDTO;
import com.java.bean.so.DeptSO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * 部门消费者
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-21 17:27
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    private final static String URL = "http://SPRINGCLOUD-PROVIDER";

    /**
     * 负载均衡测试
     */
    @GetMapping("/hello")
    public BaseResult hello() {
        return restTemplate.getForObject(URL + "/dept/hello", BaseResult.class);
    }

    /**
     * 部门列表
     */
    @PostMapping("/listDept")
    public BaseResult listDept(@RequestBody DeptSO deptSO) {
        System.out.println("consumer");
        return restTemplate.postForObject(URL + "/dept/listDept", deptSO, BaseResult.class);
    }

    /**
     * 获取部门信息
     */
    @GetMapping("/getDept/{id}")
    public BaseResult getDept(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL + "/dept/getDept/" + id, BaseResult.class);
    }

    /**
     * 新增部门
     */
    @PostMapping("/saveDept")
    public BaseResult saveDept(@RequestBody DeptDTO deptDTO) {
        return restTemplate.postForObject(URL + "/dept/saveDept", deptDTO, BaseResult.class);
    }

    /**
     * 修改部门
     */
    @PostMapping("/updateDept")
    public BaseResult updateDept(@RequestBody DeptDTO deptDTO) {
        return restTemplate.postForObject(URL + "/dept/updateDept", deptDTO, BaseResult.class);
    }

    /**
     * 删除部门
     */
    @GetMapping("/deleteDept/{id}")
    public BaseResult deleteDept(@PathVariable("id") Long id) {
        return restTemplate.getForObject(URL + "/dept/deleteDept/" + id, BaseResult.class);
    }
}
