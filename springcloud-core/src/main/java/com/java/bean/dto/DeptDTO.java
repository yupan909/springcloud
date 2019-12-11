package com.java.bean.dto;

import java.io.Serializable;

/**
 * 部门
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-05 20:40
 */
public class DeptDTO implements Serializable {
    private static final long serialVersionUID = 2636090964930154831L;

    /**
     * 部门ID
     */
    private Long id;

    /**
     * 部门名称
     */
    private String deptName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
