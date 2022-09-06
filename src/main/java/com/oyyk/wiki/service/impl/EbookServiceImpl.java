package com.oyyk.wiki.service.impl;

import com.oyyk.wiki.domain.Ebook;
import com.oyyk.wiki.mapper.EbookMapper;
import com.oyyk.wiki.service.EbookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookServiceImpl implements EbookService {

    @Resource
    private EbookMapper ebookMapper;

    @Override
    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
