package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Students student1=(Students)context.getBean("student1");
        Students student2=(Students)context.getBean("student2");
        
        System.out.println(student1);
        System.out.println(student2);
        
    }
}
