package com.consumer.dept80.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

	@Bean
	@LoadBalanced // ribbon 加入客户端负载均衡
	public RestTemplate geRestTemplate () {
		return new RestTemplate();
	}
}
