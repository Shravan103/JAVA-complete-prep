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

//--------------------------------------------------------------------------------

//	A) On Execution of:
//	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//	
//	B) It updates the:
//	IoC Container
//	
//	------------------------
//	Bean ID : sim
//	Object  : Jio
//	------------------------
//
//	C) Now Java executes	
//	Sim sim = context.getBean("sim", Sim.class);
//
//	D) It finds
//	sim → Jio Object
	
//	E) Spring checks
//		• Sim.class
//	
//		• This means: "Can this object be returned as a Sim?"
//	
//		• The object is: Jio
//	
//		• Since: public class Jio implements Sim
//	
//		• the answer is YES.

//	F) Spring returns
//	Jio Object → as → Sim