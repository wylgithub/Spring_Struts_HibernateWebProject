package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.InjectionDAO;

@Service
public class InjectionServiceImpl implements InjectionService {

	//@Autowired: ���������ע��
	InjectionDAO injectionDAO;

	//@Autowired//��setter�������ע��
	public void setInjectionDAO(InjectionDAO injectionDAO) {
		this.injectionDAO = injectionDAO;
	}
	
	@Autowired//ʹ�ù��������ע��ע��
	public InjectionServiceImpl(InjectionDAO injectionDAO)
	{
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
