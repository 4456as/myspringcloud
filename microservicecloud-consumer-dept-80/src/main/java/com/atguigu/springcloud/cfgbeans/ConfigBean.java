package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class ConfigBean {
	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate() {
		return new RestTemplate();
	}
//	@Bean
//	public IRule myRule() {
//		return new RandomRule();//用随机的负载均衡算法代替默认的轮询
//		//RetryRule();//先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试，获取可用的服务
//		//AvailabilityFilteringRule   WeightedResponseTimeRule   BestAvailableRule  ZoneAvoidanceRule
//	}  //也可自定义MyLoadRule.java
}
