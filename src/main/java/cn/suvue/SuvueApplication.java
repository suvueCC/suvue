package cn.suvue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 项目启动类
 *
 * @author suvuecc
 * @date 2021/05/12 21:09
 */
@SpringBootApplication
@MapperScan(basePackages = {"cn.suvue.module.mapper"})
public class SuvueApplication {
    public static void main(String[] args) {
        SpringApplication.run(SuvueApplication.class, args);
    }
}
