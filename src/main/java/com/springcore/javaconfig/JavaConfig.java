package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean(name = {"temp","new"})
	public Student getStudent() {
		Student s=new Student(getSamosa());
		return s;
	}
	
	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	
}
