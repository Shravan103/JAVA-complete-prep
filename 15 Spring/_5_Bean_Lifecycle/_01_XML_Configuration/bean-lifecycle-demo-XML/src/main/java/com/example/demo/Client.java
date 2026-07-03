package com.example.demo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("spring.xml");

        System.out.println("Application Running");

        context.close();

    }

}

// 	WORKFLOW:
//	Run Client.main()
//		│
//		▼
//	Create ApplicationContext
//		│
//		▼
//	Read spring.xml
//		│
//		▼
//	Found Bean:
//	HelloWorld
//		│
//		▼
//	Call Constructor:
//	new HelloWorld()
//		│
//		▼
//	Constructor Executed
//		│
//		▼
//	Call init()
//	(init-method)
//		│
//		▼
//	Bean Initialized
//		│
//		▼
//	Store Bean
//		│
//		▼
//	Application Running
//		│
//		▼
//	context.close()
//		│
//		▼
//	Call destroy()
//	(destroy-method)
//		│
//		▼
//	Bean Destroyed
//		│
//		▼
//	Remove Bean
//		│
//		▼
//	Application Ends