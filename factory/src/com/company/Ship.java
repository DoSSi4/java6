package com.company;

public class Ship implements Transport{
    Ship(){

    }
    @Override
    public void deliver() {
        System.out.println("Deliver by sea in a container");
    }
}
