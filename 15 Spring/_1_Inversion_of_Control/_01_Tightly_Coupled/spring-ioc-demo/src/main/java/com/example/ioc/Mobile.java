package com.example.ioc;

public class Mobile {

    public static void main(String[] args) {

        Sim sim = new Jio();

        sim.calling();

        sim.data();

    }

}

// Every time you change the SIM provider (Jio to Airtel, or IDEA), you must edit the source code.
// This is tight coupling, which is what Spring IoC aims to eliminate.
// The Mobile class is tightly coupled to the concrete implementation (Jio or Airtel).