package com.test.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.service.InjectionService;

public class TestSpringCase {

	//��ȡ��ǰʱ��
	Date date = new Date();
	
	//��ʽ����ʽ
	String ftype="yyyy��MM��dd�� hhʱ:mm��:ss��";
	
	//ʱ���ʽ������
	SimpleDateFormat sdf = new SimpleDateFormat(ftype);
	
	//before����
	@Before
	public void beforeMethod()
	{
		System.out.println("��ʼִ��: "+sdf.format(date));
	}
	
	//after����
	@After
	public void afterMethod()
	{
		System.out.println("ִ�����: "+sdf.format(date));
	}
	
	//����Spring����
	@Test
	public void testSpring()
	{
		//���������ļ�
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//���ʵ��
		InjectionService is = (InjectionService)ac.getBean("injectionService");
		
		//���ñ��淽����������
		is.save("������Ҫ�����data");
	}
}
