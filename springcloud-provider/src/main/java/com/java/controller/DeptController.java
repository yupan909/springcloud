package com.java.controller;

import com.github.pagehelper.PageInfo;
import com.java.bean.base.BaseResult;
import com.java.bean.dto.DeptDTO;
import com.java.bean.so.DeptSO;
import com.java.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 部门
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 14:29
 */
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    /**
     * 部门列表
     */
    @PostMapping("/listDept")
    public BaseResult listDept(@RequestBody DeptSO deptSO) {
        PageInfo<DeptDTO> list = deptService.listDept(deptSO);
        System.out.println("provider");
        return new BaseResult<>(list);
    }

    /**
     * 获取部门信息
     */
    @GetMapping("/getDept/{id}")
    public BaseResult getDept(@PathVariable("id") Long id) {
        DeptDTO deptDTO = deptService.getDept(id);
        return new BaseResult<>(deptDTO);
    }

    /**
     * 新增部门
     */
    @PostMapping("/saveDept")
    public BaseResult saveDept(@RequestBody DeptDTO deptDTO) {
        deptService.saveDept(deptDTO);
        return BaseResult.successResult();
    }

    /**
     * 修改部门
     */
    @PostMapping("/updateDept")
    public BaseResult updateDept(@RequestBody DeptDTO deptDTO) {
        deptService.updateDept(deptDTO);
        return BaseResult.successResult();
    }

    /**
     * 删除部门
     */
    @GetMapping("/deleteDept/{id}")
    public BaseResult deleteDept(@PathVariable("id") Long id) {
        deptService.deleteDept(id);
        return BaseResult.successResult();
    }

    /**
     * 负载均衡测试
     */
    @GetMapping("/hello")
    public BaseResult hello() {
        return new BaseResult<>("hello world【01】");
    }
}
