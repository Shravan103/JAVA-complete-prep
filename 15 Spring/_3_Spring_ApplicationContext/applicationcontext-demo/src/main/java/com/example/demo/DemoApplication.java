package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Student student = context.getBean(Student.class);

        System.out.println(student);

    }

}

//	WORKFLOW:
//	Run main()
//		│
//		▼
//	AnnotationConfigApplicationContext(AppConfig.class)
//		│
//		▼
//	Spring creates IoC Container
//		│
//		▼
//	Reads AppConfig
//		│
//		▼
//	@Configuration
//		│
//		▼
//	Looks for @Bean methods
//		│
//		▼
//	@Bean student()
//		│
//		▼
//	Creates Student Object
//		│
//		▼
//	Stores Bean
//		│
//		▼
//	context.getBean(Student.class)
//		│
//		▼
//	Returns Student Object
//		│
//		▼
//	System.out.println(student)
//		│
//		▼
//	student.toString()
//		│
//		▼
//	Console Output