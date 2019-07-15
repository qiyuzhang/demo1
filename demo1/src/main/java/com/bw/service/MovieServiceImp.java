/**
 * 
 */
package com.bw.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.mapper.MovieMapperDao;

/**
 * @作者 张玉琪
 *
 * @时间 /2019年7月8日
 */
@Service
public class MovieServiceImp implements MovieService{
	@Resource
	private MovieMapperDao mmd;

	@Override
	public List<Map<String, Object>> getList() {
		return mmd.getList();
	}
}
