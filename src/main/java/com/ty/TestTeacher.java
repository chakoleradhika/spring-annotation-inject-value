package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTeacher
{
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Teacher teacher = (Teacher) context.getBean("teacher");
		
		System.out.println(teacher.age);
	}

}
