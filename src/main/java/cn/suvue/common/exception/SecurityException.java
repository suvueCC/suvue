package cn.suvue.common.exception;

import cn.suvue.common.constant.Status;
import lombok.EqualsAndHashCode;

/**
 * security异常
 *
 * @author suvuecc
 * @date 2021/05/17 13:46
 */
@EqualsAndHashCode(callSuper = true)
public class SecurityException extends BaseException {
    public SecurityException(Status status) {
        super(status);
    }

    public SecurityException(Status status, Object data) {
        super(status, data);
    }

    public SecurityException(Integer code, String message) {
        super(code, message);
    }

    public SecurityException(Integer code, String message, Object data) {
        super(code, message, data);
    }
}