package com.java.service;

import com.github.pagehelper.PageInfo;
import com.java.bean.dto.DeptDTO;
import com.java.bean.so.DeptSO;

/**
 * 部门服务
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 14:29
 */
public interface DeptService {

    /**
     * 部门列表
     */
    PageInfo<DeptDTO> listDept(DeptSO deptSO);

    /**
     * 获取部门信息
     */
    DeptDTO getDept(Long id);

    /**
     * 新增部门
     */
    void saveDept(DeptDTO deptDTO);

    /**
     * 修改部门
     */
    void updateDept(DeptDTO deptDTO);

    /**
     * 删除部门
     */
    void deleteDept(Long id);
}
