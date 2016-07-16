package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.InjectionDAO;

@Service
public class InjectionServiceImpl implements InjectionService {

	//@Autowired: 给属性添加注解
	InjectionDAO injectionDAO;

	//@Autowired//给setter方法添加注解
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
	
	@Autowired//使用构造器添加注解注入
	public InjectionServiceImpl(InjectionDAO injectionDAO)
	{
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String arg) {

		System.out.println("接收的数据: "+arg);
		//处理数据
		arg = arg+":"+this.hashCode();
		
		//调用InjectionDAO的save方法处理数据
		injectionDAO.save(arg);//--->配置xml配置文件
	}

}
