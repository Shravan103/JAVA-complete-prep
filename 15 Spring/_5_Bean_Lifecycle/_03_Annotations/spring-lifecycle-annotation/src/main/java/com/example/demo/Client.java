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
//	Create ClassPathXmlApplicationContext
//		│
//		▼
//	Spring creates IoC Container
//		│
//		▼
//	Reads: spring.xml
//		│
//		▼
//	Reads:
//	<context:annotation-config/>
//		│
//		▼
//	Enables Annotation Processing
//		│
//		▼
//	Reads Bean:
//	HelloWorld
//		│
//		▼
//	Creates Object:
//	new HelloWorld()
//		│
//		▼
//	Constructor Executed
//		│
//		▼
//	Spring scans HelloWorld
//		│
//		▼
//	Finds:
//	@PostConstruct
//		│
//		▼
//	Automatically calls:
//	init()
//		│
//		▼
//	Bean Initialized
//		│
//		▼
//	Stores Bean
//		│
//		▼
//	Application Running
//		│
//		▼
//	context.close()
//		│
//		▼
//	Spring scans Bean
//		│
//		▼
//	Finds:
//	@PreDestroy
//		│
//		▼
//	Automatically calls:
//	destroy()
//		│
//		▼
//	Bean Destroyed
//		│
//		▼
//	Removes Bean
//		│
//		▼
//	Program Ends