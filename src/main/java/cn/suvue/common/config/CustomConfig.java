package cn.suvue.common.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自定义配置
 *
 * @author suvuecc
 * @date 2021/05/17 13:10
 */
@Data
@ConfigurationProperties(prefix = "custom.config")
public class CustomConfig {
    /**
     * 不需要拦截的地址
     */
    private IgnoreConfig ignores;
}