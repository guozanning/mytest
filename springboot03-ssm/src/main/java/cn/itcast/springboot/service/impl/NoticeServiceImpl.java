package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.pojo.Notice;
import cn.itcast.springboot.service.NoticeService;

@Service
public class NoticeServiceImpl implements NoticeService {

	//注入mapper接口
	@Autowired
	private NoticeMapper noticeMapper;
	@Override
	public List<Notice> findAll() {
		return noticeMapper.findAll();
	}
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		//创建map集合封装响应数据
		Map<String,Object> data = new HashMap<>();
		//统计数量
		Long totals = noticeMapper.count();
		data.put("total", totals);
		//分页查询
		List<Notice> list = noticeMapper.findByPage(page, rows);
		data.put("rows", list);
		
		return data;
	}

}
