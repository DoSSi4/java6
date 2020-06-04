package com.company;

public class Truck implements Transport{
    Truck(){

    }
    @Override
    public void deliver() {
        System.out.println("Deliver by land in a box");
    }
}
