package com.test.service;

import com.test.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

	InjectionDAO injectionDAO;
	
	//ʵ����ֵע��
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}

	@Override
	public void save(String arg) {

		System.out.println("���յ�����: "+arg);
		//��������
		arg = arg+":"+this.hashCode();
		
		//����InjectionDAO��save������������
		injectionDAO.save(arg);//--->����xml�����ļ�
	}

}
