/**
 * 
 */
package com.bw.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.service.MovieService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月8日
 */
@Controller
public class MovieController {
	@Resource
	private MovieService ms;	
	
	@RequestMapping("list.do")
	public String getList(HttpServletRequest srq,@RequestParam(defaultValue="1") Integer pageNum){
		PageHelper.startPage(pageNum,3);
		
		List<Map<String, Object>> list = ms.getList();
		
		PageInfo<Map<String, Object>> p = new PageInfo<>(list);
		srq.setAttribute("p", p);
		srq.setAttribute("list", list);
		return "list";
	}
	
}
