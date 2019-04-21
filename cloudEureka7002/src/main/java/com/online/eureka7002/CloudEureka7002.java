package com.online.eureka7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 标注这个是注册中心 eureka
public class CloudEureka7002 {

	public static void main(String[] args) {
		SpringApplication.run(CloudEureka7002.class, args);
	}
}
