package com.java.convertor;

import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 转换抽象类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 14:52
 */
public abstract class AbstractConvertor<M, N> {

    /**
     * 单个对象转换
     */
    public abstract N convert(M m);

    /**
     * 单个对象反转换
     */
    public abstract M reverseConvert(N n);

    /**
     * 集合转换
     */
    public List<N> convert(List<M> mList) {
        if (CollectionUtils.isEmpty(mList)) {
            return Collections.EMPTY_LIST;
        }
        return mList.stream().map(p -> convert(p)).filter(p -> p != null).collect(Collectors.toList());
    }

    /**
     * 集合反转换
     */
    public List<M> reverseConvert(List<N> nList) {
        if (CollectionUtils.isEmpty(nList)) {
            return Collections.EMPTY_LIST;
        }
        return nList.stream().map(p -> reverseConvert(p)).filter(p -> p != null).collect(Collectors.toList());
    }

}
