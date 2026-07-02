package com.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
//	@Autowired: Find a bean of this type and inject it into this field.
    @Autowired
    private Sim sim;

    public void useSim() {

        sim.calling();

        sim.data();

    }

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Mobile mobile = context.getBean(Mobile.class);

        mobile.useSim();

    }

}

//	1. NoUniqueBeanDefinitionException EXCEPTION:
//	Run
//	Mobile.java
//	
//	You will get
//	NoUniqueBeanDefinitionException
//	
//	because Spring found
//	   Sim
//		↑
//	Airtel, Jio
//	
//	There are 2 implementations.
//	Spring doesn't know which one to inject.

// 	FIX:
//	A) Fix using @Primary
//	Open Airtel.java:
//	@Component
//	@Primary
//	public class Airtel implements Sim {
//	
//	Run again
//	
//	Output:
//	Airtel Calling
//	Airtel Data
//	
//	Spring always chooses the @Primary bean when multiple candidates exist.

//	B) Fix using @Qualifier
//	Instead of:
//	@Autowired
//	private Sim sim;
//	
//	write:
//	@Autowired
//	@Qualifier("jio")
//	private Sim sim;
//	
//	Output
//	Jio Calling
//	Jio Data
//	
//	Why jio and not Jio?
//	Because default bean names are
//	Jio
//	↓
//	jio
//	
//	Airtel
//	↓
//	airtel
//	
//	Spring uses the class name with the first letter in lowercase as the default bean name.

//	C) Explicit Bean Names
//	Instead of:
//	@Component
//	
//	write:
//	@Component("jioBean")
//	public class Jio implements Sim
//	
//	and
//	
//	@Component("airtelBean")
//	public class Airtel implements Sim
//	
//	Then:
//	@Autowired
//	@Qualifier("jioBean")
//	private Sim sim;
//	
//	Now Spring injects:
//	jioBean
//	
//	instead of:
//	airtelBean

//------------------------------------------------------------------------------------------------------

// WORKFLOW:
//	Run Mobile.main()
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
//	@Configuration found
//		│
//		▼
//	@ComponentScan("com.example.ioc")
//		│
//		▼
//	Scans package
//		│
//		▼
//	Finds:
//	@Component
//	Airtel
//	
//	@Component
//	Jio
//	
//	@Component
//	Mobile
//		│
//		▼
//	Creates Airtel Object
//	Creates Jio Object
//	Creates Mobile Object
//		│
//		▼
//	Mobile contains:
//	@Autowired Sim sim
//		│
//		▼
//	Spring searches for Sim beans
//		│
//		▼
//	Finds:
//	Airtel
//	Jio
//		│
//		▼
//	One bean?
//	NO
//		│
//		▼
//	Throws: NoUniqueBeanDefinitionException
//------------------------------------------------------------------------------------------------------
// 	After adding @Primary:
//	Find Sim Beans
//		│
//		▼
//	Airtel (@Primary)
//	Jio
//		│
//		▼
//	Choose Airtel
//		│
//		▼
//	Inject into Mobile.sim
//		│
//		▼
//	Mobile.useSim()
//		│
//		▼
//	Airtel Calling
//	Airtel Data