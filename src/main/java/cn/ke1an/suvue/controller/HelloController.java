package cn.ke1an.suvue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello
 *
 * @author zhaokeyan
 * @date 2021/05/12 21:55
 */
@RestController
public class HelloController {
    @GetMapping
    public String hello() {
        return "Hello,From Docker!";
    }
}