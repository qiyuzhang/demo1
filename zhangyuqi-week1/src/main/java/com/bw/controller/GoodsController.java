/**
 * 
 */
package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitterReturnValueHandler;

import com.bw.bean.Goods;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月9日
 */
@Controller
public class GoodsController {
	@Resource
	private GoodsService gs;
	
	@RequestMapping("list.do")
	public String getList(HttpServletRequest srq,@RequestParam(defaultValue="1") Integer pageNum,String sname,String gname){
		
		System.out.println(sname);
		System.out.println(gname);
		
		PageHelper.startPage(pageNum,3);
		
		Map<String, Object> map = new HashMap<>();
		map.put("sname", sname);
		map.put("gname", gname);
		
		List<Map<String, Object>> list = gs.getList(map);
		PageInfo<Map<String, Object>> pageInfo = new PageInfo<>(list);
		
		srq.setAttribute("list", list);
		srq.setAttribute("p", pageInfo);
		srq.setAttribute("slike", sname);
		srq.setAttribute("glike", gname);
		
		return "list";
	}
	
	@RequestMapping("selGoodsList.do")
	public String selGoodsList(HttpServletRequest srq){
		List<Goods> list = gs.selGoodsList();
		srq.setAttribute("list", list);
		return "add";
	}
	
	@RequestMapping("add.do")
	@ResponseBody
	public Integer addShop(String ids,String sname,String sdate ){
		System.out.println(ids);
		System.err.println(sname);
		
		String[] s = ids.split(",");
		Map<String, Object> map = new HashMap<>();
		map.put("sname", sname);
		map.put("sdate", sdate);
	
		int a = gs.addShop(map,s);
		
		return a; 
	}
	
	@RequestMapping("selOne.do")
	public String selOne(Integer sid,HttpServletRequest srq){
		Map<String, Object> one = gs.getOne(sid);
		srq.setAttribute("o", one);
		return "selOne";
	}
	
	@RequestMapping("delAll.do")
	@ResponseBody
	public Integer delAll(String ids){
		
		System.out.println(ids);
		int a = gs.delAll(ids);
		System.out.println(a);
		return a; 
	}
}
