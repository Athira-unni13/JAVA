package com.luminar;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String[] args) {
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(r);
		
		Employee emp =(Employee) beanFactory.getBean("e");
		System.out.println(emp);

	}

}
