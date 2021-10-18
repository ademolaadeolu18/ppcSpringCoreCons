package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.CalculatorService;

public class MainApp {

	public static void main(String[] args) {
		// step-1 (initialize the container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
//		CalculatorService cs =(CalculatorService)ctx.getBean("service");
//		
//		System.out.println(cs.service(7687));

	}

}
