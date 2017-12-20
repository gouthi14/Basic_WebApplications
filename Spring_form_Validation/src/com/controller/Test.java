package com.controller;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Resource rs=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		
		
	}

}
