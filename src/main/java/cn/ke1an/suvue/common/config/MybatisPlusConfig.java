package cn.ke1an.suvue.common.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * mybatis-plus 配置
 *
 * @author zhaokeyan
 * @date 2021/05/14 23:23
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"cn.ke1an.suvue.mapper"})
public class MybatisPlusConfig {

    /**
     * 分页插件
     *
     * @author zhaokeyan
     * @date 2021/5/14 11:26 下午
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}