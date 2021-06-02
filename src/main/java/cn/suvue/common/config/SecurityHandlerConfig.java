package cn.suvue.common.config;

import cn.suvue.common.constant.Status;
import cn.suvue.common.util.ResponseUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.web.access.AccessDeniedHandler;

/**
 * Security 结果处理配置
 *
 * @author suvuecc
 * @date 2021/05/17 13:36
 */
@Configuration
public class SecurityHandlerConfig {
    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return (request, response, accessDeniedException) -> ResponseUtil.renderJson(response, Status.ACCESS_DENIED, null);
    }
}