package cn.ke1an.suvue.common.exception;

import cn.ke1an.suvue.common.constant.Status;

/**
 * 业务异常
 *
 * @author zhaokeyan
 * @date 2021/05/12 22:58
 */
public class ServiceException extends BaseException{
    public ServiceException(Status status) {
        super(status);
    }

    public ServiceException(Integer code, String message) {
        super(code, message);
    }
}