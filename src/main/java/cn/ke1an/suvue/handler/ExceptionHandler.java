package cn.ke1an.suvue.handler;

import cn.ke1an.suvue.exception.ServiceException;
import cn.ke1an.suvue.model.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理
 *
 * @author zhaokeyan
 * @date 2021/05/12 23:00
 */
@Slf4j
@ControllerAdvice
public class ExceptionHandler {

    @ResponseBody
    @org.springframework.web.bind.annotation.ExceptionHandler(value = ServiceException.class)
    public ApiResponse jsonErrorHandler(ServiceException exception) {
        log.error("【ServiceException】:{}", exception.getMessage());
        return ApiResponse.ofException(exception);
    }
}