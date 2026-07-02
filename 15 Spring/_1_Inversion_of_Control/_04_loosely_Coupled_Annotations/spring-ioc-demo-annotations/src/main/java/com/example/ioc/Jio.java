package com.example.ioc;

import org.springframework.stereotype.Component;
// @Component: Spring, please create an object of this class automatically.
@Component
public class Jio implements Sim {

    @Override
    public void calling() {
        System.out.println("Jio Calling");
    }

    @Override
    public void data() {
        System.out.println("Jio Data");
    }

}