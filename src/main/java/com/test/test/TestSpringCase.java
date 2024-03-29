package com.test.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.annotation.TestBeanAnnotation;
import com.test.multibean.BeanInvoker;
import com.test.service.InjectionService;

public class TestSpringCase {

	//获取当前时间
	Date date = new Date();
	
	//格式化格式
	String ftype="yyyy年MM月dd日 hh时:mm分:ss秒";
	
	//时间格式化对象
	SimpleDateFormat sdf = new SimpleDateFormat(ftype);
	
	//before设置
	@Before
	public void beforeMethod()
	{
		System.out.println("开始执行: "+sdf.format(date));
	}
	
	//after设置
	@After
	public void afterMethod()
	{
		System.out.println("执行完成: "+sdf.format(date));
	}
	
	//测试Spring环境
	@Test
	public void testSpring()
	{
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得实例
		InjectionService is = (InjectionService)ac.getBean("injectionService");
		
		//调用保存方法保存数据
		is.save("我是需要保存的data");
	}
	
	@Test
	public void testSay()
	{
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext_BeanAnnotation.xml");
		//获得实例
		TestBeanAnnotation ta = (TestBeanAnnotation)ac.getBean("bean");
		
		ta.myHashCode();
		
		
		//加载配置文件
		ApplicationContext ac2 = new ClassPathXmlApplicationContext("applicationContext_BeanAnnotation.xml");
		//获得实例
		TestBeanAnnotation ta2 = (TestBeanAnnotation)ac.getBean("bean");
		
		ta2.myHashCode();
	}
	
	@Test
	public void testAutowired()
	{
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得实例
		InjectionService is = (InjectionService)ac.getBean("injectionServiceImpl");
		
		//调用保存方法保存数据
		is.save("@Autowired");
	}
	
	@Test
	public void testBeanInvoke()
	{
		//加载配置文件
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//获得实例
		BeanInvoker bi = (BeanInvoker)ac.getBean("beanInvoker");
		
		bi.say();
	}
}
