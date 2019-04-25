package com.provide.dept8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 服务注入注册中心 1111
public class ProvideDept8001 {
	
	public static void main(String[] args) {
		System.out.println("开发商品详情........ 完成 了老大提交代码了啊");
		System.out.println("开发商品详情........ 完成 了老大提交代码了啊");
		System.out.println("开发商品详情........ 完成 了老大提交代码了啊");
		System.out.println("开发商品详情........ 完成 了老大提交代码了啊");
		SpringApplication.run(ProvideDept8001.class, args);
	}

}
