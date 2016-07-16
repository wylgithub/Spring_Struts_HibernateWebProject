package com.test.dao;

public class InjectionDAOImpl implements InjectionDAO {

	@Override
	public void save(String arg) {
		
		System.out.println("保存的数据： "+arg);
	}

}
