package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.atguigu.loadrule.MyLoadRule;

@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MyLoadRule.class)//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，
@EnableEurekaClient
@SpringBootApplication
public class DeptConsumer80_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DeptConsumer80_App.class, args);
	}

}
