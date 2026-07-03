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

// WORKFLOW:
//	Run Client.main()
//		│
//		▼
//	new ClassPathXmlApplicationContext("spring.xml")
//		│
//		▼
//	Spring creates IoC Container
//		│
//		▼
//	Reads spring.xml
//		│
//		▼
//	Finds Bean:
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
//	Spring checks:
//	Does HelloWorld implement InitializingBean?
//		│
//		▼
//	   YES
//		│
//		▼
//	Calls:
//	afterPropertiesSet()
//		│
//		▼
//	Bean Initialized
//		│
//		▼
//	Stores Bean in IoC Container
//		│
//		▼
//	Application Running
//		│
//		▼
//	context.close()
//		│
//		▼
//	Spring checks:
//	Does HelloWorld implement DisposableBean?
//		│
//		▼
//	   YES
//		│
//		▼
//	Calls:
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