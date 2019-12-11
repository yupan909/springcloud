package com.java.convertor;

import com.java.bean.DeptPO;
import com.java.bean.dto.DeptDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

/**
 * 部门转换类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 15:01
 */
@Component
public class DeptConvertor extends AbstractConvertor<DeptDTO, DeptPO>{

    @Override
    public DeptPO convert(DeptDTO deptDTO) {
        if (deptDTO == null) {
            return null;
        }
        DeptPO deptPO = new DeptPO();
        BeanUtils.copyProperties(deptDTO, deptPO);
        return deptPO;
    }

    @Override
    public DeptDTO reverseConvert(DeptPO deptPO) {
        if (deptPO == null) {
            return null;
        }
        DeptDTO deptDTO = new DeptDTO();
        BeanUtils.copyProperties(deptPO, deptDTO);
        return deptDTO;
    }
}
