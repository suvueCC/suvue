package cn.ke1an.suvue.common.constant;

import lombok.Getter;

/**
 * 状态码封装
 *
 * @author zhaokeyan
 * @date 2021/05/12 22:52
 */
@Getter
public enum Status {

    OK(200, "操作成功"),

    //通用错误=========================================================
    SYSTEM_ERROR(500, "系统异常"),
    BAD_REQUEST(400, "错误请求"),
    UNAUTHORIZED(401, "未授权的访问"),
    FORBIDDEN(403, "接口目前禁止使用，请不要再尝试请求"),
    NOT_FOUND(404, "不存在的地址"),
    EXPECTATION_FAILED(417, "未满足期望值"),
    PARAMETER_INVALID(1001, "参数错误"),
    IO_EXCEPTION(1004, "IO异常"),

    //登录与授权=========================================================
    LOGIN_ERROR(1101, "账户或者密码错误"),
    ACCOUNT_DISABLED(1102, "账户不可用"),
    ACCOUNT_EXIST(1103, "账户已存在"),
    SIGN_ERROR(1104, "签名错误"),
    ACCOUNT_NO_PERMISSION(1105, "账户无权限"),
    TOKEN_TIMEOUT(1106, "token过期"),

    //数据查询中出现的错误=============================================
    DATA_NOT_EXIST(1201, "数据不存在"),
    DATA_NOT_READY(1202, "数据没有准备好"),
    DATA_INVALID(1203, "数据无效或者数据损坏"),
    DATA_ALREADY_EXIST(1204, "数据已存在"),
    DATA_PROCESS_ERROR(1205, "数据处理时错误"),
    DATA_ACQUIRE_ERROR(1206, "获取redis分布式锁失败"),
    ;

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
