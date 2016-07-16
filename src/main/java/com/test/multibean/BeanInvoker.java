package com.test.multibean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//������
@Component
public class BeanInvoker {
	
	//List�ķ�ʽ
	@Autowired
	private List<BeanInterface> list;
	
	//Map�ķ�ʽ
	@Autowired
	private Map<String,BeanInterface> map;
	
	public void say()
	{
		System.out.println("List��ʽ�� ");
		if(null != list &&list.size() != 0)
		{
			for (BeanInterface bean : list) {
				System.out.println(bean.getClass().getName());
			}
		}else
		{
			System.out.println("List<BeanInterface> is null!!!!");
		}
		
		
		
		System.out.println("Map��ʽ�� ");
		if(null != map &&map.size() !=0)
		{
			//����map
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
