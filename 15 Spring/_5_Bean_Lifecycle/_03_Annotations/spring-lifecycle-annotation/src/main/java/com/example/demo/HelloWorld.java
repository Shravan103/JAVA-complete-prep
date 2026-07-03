package com.example.demo;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class HelloWorld {

    public HelloWorld() {

        System.out.println("Constructor Executed");

    }

//  @PostConstruct: "Spring, after creating this bean and injecting all dependencies, automatically call this method."
    @PostConstruct
    public void init() {

        System.out.println("Bean Initialized");

    }

//  @PreDestroy: "Spring, just before destroying this bean, automatically call this method."
    @PreDestroy
    public void destroy() {

        System.out.println("Bean Destroyed");

    }

}