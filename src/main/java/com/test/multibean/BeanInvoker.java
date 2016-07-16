package com.test.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//调用类
@Component
public class BeanInvoker {
	
	//List的方式
	@Autowired
	private List<BeanInterface> list;
	
	//Map的方式
	@Autowired
	private Map<String,BeanInterface> map;
	
	public void say()
	{
		System.out.println("List方式： ");
		if(null != list &&list.size() != 0)
		{
			for (BeanInterface bean : list) {
				System.out.println(bean.getClass().getName());
			}
		}else
		{
			System.out.println("List<BeanInterface> is null!!!!");
		}
		
		
		
		System.out.println("Map方式： ");
		if(null != map &&map.size() !=0)
		{
			//遍历map
			for(Map.Entry<String, BeanInterface> entry:map.entrySet())
			{
				System.out.println(entry.getKey()+"    "+entry.getValue().getClass().getName());
			}
		}else
		{
			System.out.println("Map<String,BeanInterface> map is null!");
		}
	}

}
