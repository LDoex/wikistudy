package com.oyyk.wiki.controller;

import com.oyyk.wiki.domain.Ebook;
import com.oyyk.wiki.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

// RestController 用于返回字符串或json对象
@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    private EbookService ebookService;


    @GetMapping("/list")
    public List<Ebook> list(){
        return ebookService.list();
    }
}
