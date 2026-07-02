package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobile {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // retrieving the bean by type, not by name.
        Sim sim = context.getBean(Sim.class);
        
//        Now Spring searches for a bean named: sim
//        Sim sim = context.getBean("sim", Sim.class);

        sim.calling();
        sim.data();

    }

}

//	WORKFLOW:
//	Run Mobile.java
//		│
//		▼
//	new AnnotationConfigApplicationContext(AppConfig.class)
//		│
//		▼
//	Spring creates IoC Container
//		│
//		▼
//	Reads AppConfig.java
//		│
//		▼
//	Finds @Configuration
//		│
//		▼
//	Looks for @Bean methods
//		│
//		▼
//	Finds sim()
//		│
//		▼
//	Executes
//		│
//		▼
//	return new Jio();
//		│
//		▼
//	Creates Jio Object
//		│
//		▼
//	Stores it inside IoC Container
//		│
//		▼
//	Bean Type = Sim
//	Bean Name = sim
//		│
//		▼
//	context.getBean(Sim.class)
//		│
//		▼
//	Returns Jio Object
//		│
//		▼
//	calling()
//	data()