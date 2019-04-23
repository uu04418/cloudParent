package com.provide.dept8001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 服务注入注册中心 1111
public class ProvideDept8001 {
	
	public static void main(String[] args) {
		SpringApplication.run(ProvideDept8001.class, args);
	}

}
