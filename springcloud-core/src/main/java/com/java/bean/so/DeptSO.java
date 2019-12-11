package com.java.bean.so;

import com.java.bean.base.PageSO;

import java.io.Serializable;

/**
 * 部门查询
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 14:21
 */
public class DeptSO extends PageSO implements Serializable {
    private static final long serialVersionUID = -2714749064552607033L;

    /**
     * 部门名称
     */
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
