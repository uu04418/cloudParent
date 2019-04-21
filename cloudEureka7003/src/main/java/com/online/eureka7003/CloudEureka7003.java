package com.online.eureka7003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 标注这个是注册中心 eureka
public class CloudEureka7003 {

	public static void main(String[] args) {
		SpringApplication.run(CloudEureka7003.class, args);
	}
}
