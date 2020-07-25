package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");
		
		demo d=context.getBean("demo", demo.class);
		System.out.println(d);
		
		SpelExpressionParser parser=new SpelExpressionParser();
		org.springframework.expression.Expression expression=parser.parseExpression("305+5+5");
		System.out.println(expression.getValue());
		
	}
}

