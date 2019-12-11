package com.java.bean.base;

import java.io.Serializable;

/**
 * 分页对象
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 14:23
 */
public class PageSO implements Serializable {
    private static final long serialVersionUID = -5602481188188056881L;

    /**
     * 页码
     */
    private Integer pageNum;

    /**
     * 分页大小
     */
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
