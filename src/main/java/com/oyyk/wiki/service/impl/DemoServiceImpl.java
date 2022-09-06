package com.oyyk.wiki.service.impl;

import com.oyyk.wiki.domain.Demo;
import com.oyyk.wiki.mapper.DemoMapper;
import com.oyyk.wiki.service.DemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
