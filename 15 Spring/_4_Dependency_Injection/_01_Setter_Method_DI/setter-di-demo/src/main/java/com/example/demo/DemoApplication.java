package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        GFG gfg = context.getBean("gfg", GFG.class);

        gfg.show();

    }

}

//	HOW TO CHANGE IMPLEMENTATION?
//	Open:
//	beans.xml
//	
//	Change:
//	<property
//	        name="geek"
//	        ref="csv"/>
//	
//	to:	
//	<property
//	        name="geek"
//	        ref="json"/>
//	
//	Run again
//	Output:
//	JSON Implementation

//-------------------------------------------------------------------------------------------------------

//	WORKFLOW (Setter Dependency Injection):
//	
//	When you run:
//	ApplicationContext context =
//	        new ClassPathXmlApplicationContext("beans.xml");
//	
//	Spring performs:
//	Run DemoApplication.main()
//	        │
//	        ▼
//	Create ApplicationContext
//	        │
//	        ▼
//	Read beans.xml
//	        │
//	        ▼
//		Found Bean:
//		   gfg
//	        │
//	        ▼
//	Create GFG Object
//	        │
//	        ▼
//	  Found Property:
//	   name = geek
//	    ref = csv
//	        │
//	        ▼
//	Create CsvGFG Object
//	        │
//	        ▼
//		  Call
//	gfg.setGeek(csvObject)
//	        │
//	        ▼
//	Setter Injection Completed
//	        │
//	        ▼
//	Store GFG Bean
//	Store CsvGFG Bean

//	Then:
//	GFG gfg = context.getBean("gfg", GFG.class);
//	
//	Spring Search Bean
//	↓
//	gfg
//	↓
//	Found
//	↓
//	Return GFG Object

//	Then
//	gfg.show();	
//	↓
//	geek.language()
//	↓
//	CsvGFG.language()
//	↓
//	CSV Implementation
