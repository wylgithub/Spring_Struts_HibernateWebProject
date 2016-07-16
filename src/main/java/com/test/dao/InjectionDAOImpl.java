package com.test.dao;

import org.springframework.stereotype.Repository;

@Repository
public class InjectionDAOImpl implements InjectionDAO {

	@Override
	public void save(String arg) {
		
		System.out.println("保存的数据： "+arg);
	}

}
