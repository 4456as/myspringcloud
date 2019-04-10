package com.atguigu.springcloud.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
//(url,request,responsebean.class)
@RestController
public class DeptController_Consumer
{
    @Autowired
    private DeptClientService deptClientService = null;
    
    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
         return this.deptClientService.add(dept);
    }//post
    
    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
         return this.deptClientService.get(id);
    }//get
    
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
         return this.deptClientService.list();
    }   //get
}