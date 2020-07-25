package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee emp1=(Employee)context.getBean("Employee1");
		
		System.out.println(emp1.getEmpName());
		System.out.println(emp1.getPhones());
		System.out.println(emp1.getCourses());
		System.out.println(emp1.getAddresses());
		System.out.println(emp1.getProps());
		
	}

}
