package com.oyyk.wiki.service.impl;

import com.oyyk.wiki.domain.Ebook;
import com.oyyk.wiki.domain.EbookExample;
import com.oyyk.wiki.mapper.EbookMapper;
import com.oyyk.wiki.req.EbookReq;
import com.oyyk.wiki.resp.EbookResp;
import com.oyyk.wiki.service.EbookService;
import com.oyyk.wiki.util.CopyUtil;
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

    @Override
    public List<EbookResp> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%"+req.getName()+"%");
        List<Ebook> ebookList = ebookMapper.selectByExample(ebookExample);

        List<EbookResp> list = CopyUtil.copyList(ebookList, EbookResp.class);
        return list;
    }
}
