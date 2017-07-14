package com.mimicake.web.modules.index.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mimicake.web.modules.index.service.IndexService;

/**
 * 首页 
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController{
	
	@Resource(name="indexService")
	private IndexService indexService;
	
	@RequestMapping(value = "/index",method = {RequestMethod.GET,RequestMethod.POST})
	public String index(ModelMap modelMap) { 

		modelMap.put("data", indexService.getIndexData());
		return "/index/index";
	}
	
	
}
