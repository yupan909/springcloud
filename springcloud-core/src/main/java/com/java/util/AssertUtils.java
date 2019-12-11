package com.java.util;

import com.java.exception.DataValidateException;

import java.util.Collection;

/**
 * 数据校验工具类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 15:13
 */
public class AssertUtils {

    /**
     * 判断表达式是true
     *
     * @param expression
     * @param message
     */
    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            fail(message);
        }
    }

    /**
     * 判断表达式是true
     *
     * @param expression
     */
    public static void isTrue(boolean expression) {
        isTrue(expression, "[断言失败] - 这个表达式必须是true");
    }

    /**
     * 判断对象是空
     *
     * @param object
     * @param message
     */
    public static void isNull(Object object, String message) {
        if (object != null) {
            fail(message);
        }
    }

    /**
     * 判断对象是空
     *
     * @param object
     */
    public static void isNull(Object object) {
        isNull(object, "[断言失败] - 这个对象必须是null");
    }

    /**
     * 判断对象不为空
     *
     * @param object
     * @param message
     */
    public static void notNull(Object object, String message) {
        if (object == null) {
            fail(message);
        }
    }

    /**
     * 判断对象不为空
     *
     * @param object
     */
    public static void notNull(Object object) {
        notNull(object, "[断言失败] - 这个对象必须不为null");
    }

    /**
     * 判断数组不为空
     *
     * @param array
     * @param message
     */
    public static void notEmpty(Object[] array, String message) {
        if (array == null || array.length == 0) {
            fail(message);
        }
    }

    /**
     * 判断数组不为空
     *
     * @param array
     */
    public static void notEmpty(Object[] array) {
        notEmpty(array, "[断言失败] - 这个数组必须不为空");
    }

    /**
     * 判断集合不为空
     *
     * @param collection
     * @param message
     */
    public static void notEmpty(Collection<?> collection, String message) {
        if (collection == null || collection.isEmpty()) {
            fail(message);
        }
    }

    /**
     * 判断集合不为空
     *
     * @param collection
     */
    public static void notEmpty(Collection<?> collection) {
        notEmpty(collection, "[断言失败] - 这个集合必须不为空");
    }

    /**
     * 抛出自定义异常
     *
     * @param message
     */
    private static void fail(String message) {
        throw new DataValidateException(message);
    }
}
