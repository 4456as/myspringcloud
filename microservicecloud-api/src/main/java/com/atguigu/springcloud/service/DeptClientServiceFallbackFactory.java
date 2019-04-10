package com.atguigu.springcloud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.atguigu.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>{
	
	public DeptClientService create(Throwable arg0) {
		// TODO Auto-generated method stub
		return new DeptClientService() {
			public List<Dept> list() {
				// TODO Auto-generated method stub
				Long deptno = (long) -1;
				List<Dept> list = new ArrayList<Dept>();
				list.add(new Dept().setDeptno(deptno).setDname("null").setDb_source("no database in MySQL")) ;
				return list;
			}
			public Dept get(long id) {
				// TODO Auto-generated method stub
			       return new Dept().setDeptno(id)
			               .setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
			               .setDb_source("no this database in MySQL");
			}
			public boolean add(Dept dept) {
				// TODO Auto-generated method stub
				return false;
			}
		};
	}

}
