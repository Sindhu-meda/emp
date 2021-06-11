package com.cg1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	 public static void main(String[] args) {
		  ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		  Employee emp=(Employee) ctx.getBean("employee");
		 
		  emp.getEmployeeDetails();
		  emp.getSbuDetails();
		  
		 }
}
