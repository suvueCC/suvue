package cn.ke1an.suvue.controller;

import cn.ke1an.suvue.common.constant.Status;
import cn.ke1an.suvue.common.exception.SecurityException;
import cn.ke1an.suvue.common.model.ApiResponse;
import cn.ke1an.suvue.common.model.JwtResponse;
import cn.ke1an.suvue.common.util.JwtUtil;
import cn.ke1an.suvue.model.LoginRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * 认证 Controller，包括用户注册，用户登录请求
 *
 * @author zhaokeyan
 * @date 2021/05/17 16:32
 */
@Slf4j
@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;

    /**
     * 登录
     *
     * @param loginRequest 登录请求参数
     * @return cn.ke1an.suvue.common.model.ApiResponse
     * @author zhaokeyan
     * @date 2021/5/17 9:19 下午
     */
    @PostMapping("/login")
    public ApiResponse login(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsernameOrEmailOrPhone(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtUtil.createJWT(authentication, loginRequest.getRememberMe());
        return ApiResponse.ofSuccess(new JwtResponse(jwt));
    }

    /**
     * 退出登录
     *
     * @return cn.ke1an.suvue.common.model.ApiResponse
     * @author zhaokeyan
     * @date 2021/5/17 9:19 下午
     */
    @PostMapping("/logout")
    public ApiResponse logout(HttpServletRequest request) {
        try {
            // 设置JWT过期
            jwtUtil.invalidateJWT(request);
        } catch (SecurityException e) {
            throw new SecurityException(Status.UNAUTHORIZED);
        }
        return ApiResponse.ofStatus(Status.LOGOUT);
    }
}
