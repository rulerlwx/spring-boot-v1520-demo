package com.bjsxt.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Thymeleaf入门案例
 *
 *
 */
@Controller
public class DemoController {
	
	@RequestMapping("/{page}")
	public String showInfo(@PathVariable String page,Integer id,String name){
		System.out.println(id+"--"+name);
		return page;
	}
	
}
