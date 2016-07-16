package com.test.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Scope("prototype")
@Service("bean")
public class TestBeanAnnotation {
	
	public void say(String word)
	{
		System.out.println("BeanAnnotation: "+word.hashCode());
	}
	
	public void myHashCode()
	{
		System.out.println("this is a test".hashCode());
	}
}
