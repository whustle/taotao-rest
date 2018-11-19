package com.taotao.rest.service.impl;

import com.taotao.mapper.ContentMapper;
import com.taotao.pojo.Content;
import com.taotao.pojo.ContentExample;
import com.taotao.rest.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ContentServiceImpl implements ContentService {
	@Autowired
	private ContentMapper contentMapper;
	@Override
	public List<Content> getContentList(long contentCid) {
		//根据内容分类id查询内容列表
		ContentExample example = new ContentExample();
		ContentExample.Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(contentCid);
		//执行查询
		List<Content> list = contentMapper.selectByExample(example);
		return list;
	}
}
