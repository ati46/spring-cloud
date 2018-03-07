package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//在工程的启动类中,通过@EnableDiscoveryClient向服务中心注册；
@EnableDiscoveryClient
//开启Hystrix断路器
@EnableHystrix
//开启HystrixDashboard断路器仪表盘
@EnableHystrixDashboard
public class DemoRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRibbonApplication.class, args);
	}
	
	//向程序的ioc注入一个bean: restTemplate;并通过@LoadBalanced注解表明这个restRemplate开启负载均衡的功能。
	@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
