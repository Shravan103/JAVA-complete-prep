package com.example.demo;

public class GFG {

    private IGeek geek;

    public GFG(IGeek geek) {

        this.geek = geek;

    }

    public void show() {

        geek.language();

    }

}