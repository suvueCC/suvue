package cn.suvue.module.model;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 登录请求参数
 *
 * @author suvuecc
 * @date 2021/05/17 13:59
 */
@Data
public class LoginRequest {
    /**
     * 用户名或邮箱或手机号
     */
    @NotBlank(message = "用户名不能为空")
    private String usernameOrEmailOrPhone;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    private String password;

    /**
     * 记住我
     */
    private Boolean rememberMe = false;
}