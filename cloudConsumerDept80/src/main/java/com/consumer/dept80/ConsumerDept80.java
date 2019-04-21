package com.consumer.dept80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // 服务注入注册中心
public class ConsumerDept80 {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerDept80.class, args);
	}

}
