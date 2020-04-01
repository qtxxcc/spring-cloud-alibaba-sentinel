package com.example.spring.cloud.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author wanghanbin
 * @Date 2020/3/31 13:57
 * @Version 1.0
 **/
@RestController
@RequestMapping
public class SentinelController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

}
