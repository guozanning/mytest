package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.pojo.Notice;

public interface NoticeService {

	/**
	 * 查询所有公告
	 * 
	 */
	public List<Notice> findAll();

	/**
	 * 分页查询所有公告
	 * @param i
	 * @param rows
	 * @return
	 */
	public Map<String, Object> findByPage(Integer page, Integer rows);
}
