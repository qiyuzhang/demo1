/**
 * 
 */
package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.bean.Goods;
import com.bw.bean.Shop;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月9日
 */
public interface GoodsMapperDao {

	List<Map<String, Object>> getList(Map<String, Object> map);

	List<Goods> selGoodsList();

	int addShop(Map<String, Object> map);

	Shop getShop(String sname);

	int addZhong(Map<String, Object> map);

	Map<String, Object> getOne(Integer sid);

	int delAll(String ids);

}
