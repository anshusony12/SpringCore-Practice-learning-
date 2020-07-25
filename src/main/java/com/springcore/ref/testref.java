package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A temp=(A)context.getBean("aref");
		System.out.println(temp);
		
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
		
		
	}

}
