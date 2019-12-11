package com.java.exception;

/**
 * 数据校验异常类
 *
 * @author yupan@yijiupi.cn
 * @date 2019-12-11 15:12
 */
public class DataValidateException extends RuntimeException{

    public DataValidateException() {
    }

    public DataValidateException(String message) {
        super(message);
    }

    public DataValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public DataValidateException(Throwable cause) {
        super(cause);
    }

    public DataValidateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
