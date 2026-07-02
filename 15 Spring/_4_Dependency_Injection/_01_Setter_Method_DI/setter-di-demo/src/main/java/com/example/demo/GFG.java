package com.example.demo;

public class GFG {

    private IGeek geek;

    // Setter Injection
    public void setGeek(IGeek geek) {

        this.geek = geek;

    }

    public void show() {

        geek.language();

    }

}