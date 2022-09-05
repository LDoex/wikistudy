package com.oyyk.wiki.controller;

import com.oyyk.wiki.domain.Demo;
import com.oyyk.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// RestController 用于返回字符串或json对象
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> list(){
        return demoService.list();
    }
}
