/**
 * 
 */
package com.bw.service;

import java.util.List;
import java.util.Map;

import com.bw.bean.Goods;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月9日
 */
public interface GoodsService {

	public List<Map<String, Object>> getList(Map<String, Object> map);

	public List<Goods> selGoodsList();

	public int addShop(Map<String, Object> map, String[] s);

	public Map<String, Object> getOne(Integer sid);

	public int delAll(String ids);

}
