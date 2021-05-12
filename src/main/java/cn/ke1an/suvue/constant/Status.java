package cn.ke1an.suvue.constant;

import lombok.Getter;

/**
 * 状态码封装
 *
 * @author zhaokeyan
 * @date 2021/05/12 22:52
 */
@Getter
public enum Status {
    /**
     * 操作成功
     */
    OK(200, "操作成功"),

    /**
     * 未知异常
     */
    SYSTEM_ERROR(500, "系统错误");
    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 内容
     */
    private final String message;

    Status(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
