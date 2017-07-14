package com.mimicake.web.modules.index.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mimicake.web.modules.index.dao.IndexDao;
import com.mimicake.web.modules.index.service.IndexService;

@Service("indexService")
public class IndexServiceImpl implements IndexService {

	@Resource(name="indexDao")
	private IndexDao indexDao;
	
	@Override
	public List<Map<String, Object>> getIndexData() {
		return indexDao.getIndexData();
	}
	
	
}
