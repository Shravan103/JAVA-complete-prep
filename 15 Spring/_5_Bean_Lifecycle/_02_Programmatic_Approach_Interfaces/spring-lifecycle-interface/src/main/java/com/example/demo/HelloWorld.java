package com.example.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean {

    public HelloWorld() {

        System.out.println("Constructor Executed");

    }

    @Override
    public void afterPropertiesSet() throws Exception {

        System.out.println("Bean Initialized");

    }

    @Override
    public void destroy() throws Exception {

        System.out.println("Bean Destroyed");

    }

}

//	You cannot change these method names.
//	These methods come from the Spring interfaces you're implementing.
//	
//	For example:
//	public class HelloWorld implements InitializingBean, DisposableBean
//	
//	InitializingBean declares this method:
//	public interface InitializingBean {
//	    void afterPropertiesSet() throws Exception;
//	}
//	
//	and DisposableBean declares:
//	public interface DisposableBean {
//	    void destroy() throws Exception;
//	}
//	
//	Since your class implements these interfaces, Java forces you to implement these exact methods.