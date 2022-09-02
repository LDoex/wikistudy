package com.oyyk.wiki.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// RestController 用于返回字符串或json对象
@RestController
public class TestController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
