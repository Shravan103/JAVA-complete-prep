package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {

        BeanFactory factory =
                new ClassPathXmlApplicationContext("bean-factory-demo.xml");

        // Object getBean(String name) : Require Typecast from Object to (Student)
        Student student = (Student) factory.getBean("student");  
        
       // Its not getBean(String name, Class<T> requiredType) : Doesn't require Typecast
       // Its not getBean(Class<T> requiredType) : Doesn't require Typecast

        System.out.println(student);

    }

}

//	WORKFLOW:
//	When you run:
//	BeanFactory factory = new ClassPathXmlApplicationContext("bean-factory-demo.xml");
//	
//	the following happens:
//	   Run main()
//	        │
//	        ▼
//	Create BeanFactory
//	        │
//	        ▼
//	Open bean-factory-demo.xml
//	        │
//	        ▼
//	     Read XML
//	        │
//	        ▼
//	Found Bean:
//	id = student
//	class = Student
//	        │
//	        ▼
//	Read constructor arguments:
//		name = Tina
//		age = 21
//	        │
//	        ▼
//	Internally executes:
//	new Student("Tina","21")
//	        │
//	        ▼
//	Store inside BeanFactory
//	Bean Name : student
//	Bean Type : Student
//	Bean Object : Student(...)
//	
//	At this point, the Student bean is available in the container.
//	------------------------------------------------------------------------------------------------------
//	Then this line executes:
//	Student student = (Student) factory.getBean("student");
//	
//	Spring performs:
//	BeanFactory
//		↓
//	Search bean
//		↓
//	student
//		↓
//	Found
//		↓
//	Return Object
//		↓
//	Typecast to Student
//		↓
//	Store in student variable

//	Now:
//	student
//		↓
//	Student Object
//	------------------------------------------------------------------------------------------------------
