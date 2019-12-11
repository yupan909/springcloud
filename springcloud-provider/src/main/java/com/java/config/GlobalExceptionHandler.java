package com.java.config;

import com.java.bean.base.BaseResult;
import com.java.exception.BusinessException;
import com.java.exception.DataValidateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 全局异常处理
 *
 * @author Administrator
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public BaseResult exceptionHandler(Exception exception) {
        LOG.error("异常信息", exception);
        String message = "运行异常，请联系管理员！";
        if (exception instanceof BusinessException) {
            message = exception.getMessage();
        } else if (exception instanceof DataValidateException) {
            message = exception.getMessage();
        }
        return BaseResult.errorResult(message);
    }
}
