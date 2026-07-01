package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");

        Sim sim = context.getBean("sim", Sim.class);
        sim.calling();
        sim.data();
    }
}

//	Change SIM Provider:
//	1. Open beans.xml
//	
//	2. Change
//	<bean id="sim"
//	      class="com.example.ioc.Jio"/>
//	to
//	<bean id="sim"
//	      class="com.example.ioc.Airtel"/>
//	
//	3. Save
//	Run Mobile.java again.
//	
//	4. Output:
//	Airtel Calling
//	Airtel Data
//	
//	5. Notice that Mobile.java is exactly the same. You didn't touch any Java code.