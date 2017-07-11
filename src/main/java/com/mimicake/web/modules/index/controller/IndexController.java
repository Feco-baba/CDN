package com.mimicake.web.modules.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 首页 
 */
@Controller
@RequestMapping(value = "/index")
public class IndexController{
	
	@RequestMapping(value = "/index",method = {RequestMethod.GET,RequestMethod.POST})
	public String index(ModelMap modelMap) {

		
		return "/index/index";
	}
	
	
}
