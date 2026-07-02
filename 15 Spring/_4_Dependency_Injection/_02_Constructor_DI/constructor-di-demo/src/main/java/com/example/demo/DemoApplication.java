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

//	CHANGE DEPENDENCY:
//	Change:
//	<constructor-arg ref="csv"/>
//	
//	to:
//	<constructor-arg ref="json"/>
//	
//	Run again:
//	Output:
//	JSON Implementation

//	------------------------------------------------------------------------------------------------------

// WORKFLOW:
//	Run Main()
//		│
//		▼
//	Read beans.xml
//		│
//		▼
//	Create IoC Container
//		│
//		▼
//	Read Bean: csv
//		│
//		▼
//	Create CsvGFG Object
//		│
//		▼
//	Store as "csv"
//		│
//		▼
//	Read Bean: json
//		│
//		▼
//	Create JsonGFG Object
//		│
//		▼
//	Store as "json"
//		│
//		▼
//	Read Bean: gfg
//		│
//		▼
//	Needs constructor argument
//		│
//		▼
//	ref="csv"
//		│
//		▼
//	Search bean id "csv"
//		│
//		▼
//	Found CsvGFG Object
//		│
//		▼
//	Call
//	new GFG(csvObject)
//		│
//		▼
//	Store GFG Object
//		│
//		▼
//	IoC Container Ready
//		│
//		▼
//	context.getBean("gfg")
//		│
//		▼
//	Return Existing GFG Object
//		│
//		▼
//	gfg.show()
//		│
//		▼
//	CsvGFG.language()
