package com.consumer.dept80.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cloud.common.entity.Dept;

@RequestMapping("/consumer/dept")
@RestController
public class DeptConsumerController {
	
	// 没有加入客户端负载均衡可以直接调用
	//public static final String PREFIX_URL = "http://localhost:8001";
	
	// 加入客户端负载均衡后不能直接调取服务需要调用服务名称
	public static final String PREFIX_URL = "http://CLOUDPROVIDEDEPT8001";
	
	@Autowired
	RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@RequestMapping("/list")
	public List<Dept> list () {
		return restTemplate.getForObject(PREFIX_URL +"/dept/list", List.class);
	}
	
	@RequestMapping("/get/{id}")
	public Dept get (@PathVariable Long id) {
		return restTemplate.getForObject(PREFIX_URL +"/dept/get/" +id,  Dept.class);
	}
	
	@RequestMapping("/add")
	public boolean add ( Dept dept) {
		return restTemplate.postForObject(PREFIX_URL +"/dept/add" ,dept,  Boolean.class);
	}
}
