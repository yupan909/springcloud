package com.java.service.impl;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.java.bean.DeptPO;
import com.java.bean.dto.DeptDTO;
import com.java.bean.so.DeptSO;
import com.java.convertor.DeptConvertor;
import com.java.dao.DeptPOMapper;
import com.java.service.DeptService;
import com.java.util.AssertUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 部门服务
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 14:30
 */
@Service
public class DeptServiceImpl implements DeptService {

    private static final Logger LOG = LoggerFactory.getLogger(DeptServiceImpl.class);

    @Autowired
    private DeptPOMapper deptPOMapper;

    @Autowired
    private DeptConvertor deptConvertor;

    /**
     * 部门列表
     */
    @Override
    public PageInfo<DeptDTO> listDept(DeptSO deptSO) {
        Page<DeptDTO> page = deptPOMapper.listDept(deptSO);
        return page.toPageInfo();
    }

    /**
     * 获取部门信息
     */
    @Override
    public DeptDTO getDept(Long id) {
        AssertUtils.notNull(id, "部门ID不能为空");
        DeptPO deptPO = deptPOMapper.selectByPrimaryKey(id);
        return deptConvertor.reverseConvert(deptPO);
    }

    /**
     * 新增部门
     */
    @Override
    public void saveDept(DeptDTO deptDTO) {
        AssertUtils.notNull(deptDTO, "参数不能为空");
        AssertUtils.notNull(deptDTO.getDeptName(), "部门名称不能为空");
        DeptPO deptPO = deptConvertor.convert(deptDTO);
        if (deptPO != null) {
            deptPOMapper.insertSelective(deptPO);
            LOG.info("新增部门：{}", JSON.toJSONString(deptPO));
        }
    }

    /**
     * 修改部门
     */
    @Override
    public void updateDept(DeptDTO deptDTO) {
        AssertUtils.notNull(deptDTO, "参数不能为空");
        AssertUtils.notNull(deptDTO.getId(), "部门ID不能为空");
        DeptPO deptPO = deptConvertor.convert(deptDTO);
        if (deptPO != null) {
            deptPOMapper.updateByPrimaryKeySelective(deptPO);
            LOG.info("修改部门：{}", JSON.toJSONString(deptPO));
        }
    }

    /**
     * 删除部门
     */
    @Override
    public void deleteDept(Long id) {
        AssertUtils.notNull(id, "部门ID不能为空");
        deptPOMapper.deleteByPrimaryKey(id);
        LOG.info("删除部门：{}", id);
    }
}
