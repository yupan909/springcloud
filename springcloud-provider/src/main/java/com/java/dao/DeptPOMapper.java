package com.java.dao;


import com.github.pagehelper.Page;
import com.java.bean.DeptPO;
import com.java.bean.dto.DeptDTO;
import com.java.bean.so.DeptSO;

public interface DeptPOMapper {

    /**
     * 根据部门ID查询部门信息
     * @return
     */
    DeptPO selectByPrimaryKey(Long id);

    /**
     * 部门列表
     * @return
     */
    Page<DeptDTO> listDept(DeptSO deptSO);

    /**
     * 新增
     */
    int insert(DeptPO record);

    /**
     * 选择性新增
     */
    int insertSelective(DeptPO record);

    /**
     * 修改
     * @return
     */
    int updateByPrimaryKey(DeptPO record);

    /**
     * 选择性修改
     * @return
     */
    int updateByPrimaryKeySelective(DeptPO record);

    /**
     * 删除
     * @return
     */
    int deleteByPrimaryKey(Long id);

}