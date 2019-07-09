/**
 * 
 */
package com.bw.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.bean.Goods;
import com.bw.bean.Shop;
import com.bw.mapper.GoodsMapperDao;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月9日
 */
@Service
public class GoodsServiceImp implements GoodsService {
	@Resource
	private GoodsMapperDao gmd;

	//列表页面，模糊查询
	@Override
	public List<Map<String, Object>> getList(Map<String, Object> map) {
		return gmd.getList(map);
	}

	//查询所有商品信息
	@Override
	public List<Goods> selGoodsList() {
		return gmd.selGoodsList();
	}

	//添加店铺
	@Override
	public int addShop(Map<String, Object> map,String[] s) {
		int a = gmd.addShop(map);
		if(a>0){
			System.out.println("添加店铺成功");
			String sname = (String) map.get("sname");
			System.out.println(sname);
			Shop shop = gmd.getShop(sname);
			System.out.println(shop);
			if(shop != null){
				Integer sid = shop.getSid();
				System.out.println(sid);
				int c=2;
				
				for (int i = 0; i < s.length; i++) {
					
					System.out.println("gid="+s[i]);
					
					Map<String, Object> m = new HashMap<>();
					m.put("sid", sid);
					m.put("gid", s[i]);
					
					int b = gmd.addZhong(m);
					
					System.out.println(b);
					if(b<0){
						c=1;
					}
				}
				return c;
				
			}
			else{
				return 1;
			}
		}
		else{
			return 0;
		}
	}

	//查询单个信息
	@Override
	public Map<String, Object> getOne(Integer sid) {
		return gmd.getOne(sid);
	}

	//批删
	@Override
	public int delAll(String ids) {
		return gmd.delAll(ids);
	}
}
