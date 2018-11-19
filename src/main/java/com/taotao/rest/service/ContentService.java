package com.taotao.rest.service;

import com.taotao.pojo.Content;

import java.util.List;

public interface ContentService {
	List<Content> getContentList(long contentCid);
}
