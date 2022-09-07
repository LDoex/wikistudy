package com.oyyk.wiki.service;

import com.oyyk.wiki.domain.Ebook;
import com.oyyk.wiki.req.EbookReq;
import com.oyyk.wiki.resp.EbookResp;

import java.util.List;

public interface EbookService {
    public List<Ebook> list();

    public List<EbookResp> list(EbookReq req);
}
