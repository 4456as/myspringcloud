package com.atguigu.loadrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MyLoadRule {//自定义ribbon规则类
	@Bean
	public IRule myRule() {
		//return new RandomRule();
		return new MyRoundRule();//自定义的负载均衡算法
	}
}
