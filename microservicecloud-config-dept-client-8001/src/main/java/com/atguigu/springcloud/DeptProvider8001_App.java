package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableDiscoveryClient //服务发现  好像不加也可以
@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进eureka服务中
public class DeptProvider8001_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DeptProvider8001_App.class, args);
	}

}

