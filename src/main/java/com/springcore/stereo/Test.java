package com.springcore.stereo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereo/stereoconfig.xml");
		
		Student s=context.getBean("student", Student.class);
		
		System.out.println(s);
		System.out.println(s.getAddress());
		System.out.println(s.getAddress().getClass());
	}

}
