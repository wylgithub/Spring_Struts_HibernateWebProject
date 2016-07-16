package com.test.service;

import com.test.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	InjectionDAO injectionDAO;
	
	//实现设值注入
	public void setInjectionDAO(InjectionDAO injectionDAO) {
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
