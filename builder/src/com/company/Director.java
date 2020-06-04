package com.company;

public class Director {
    public void buildLargeHouse(Builder builder){
        builder.setType("Palace");
        builder.setRooms(10);
        builder.setDoors(12);
        builder.setWindow(22);
        builder.setGarage(2);
        builder.setWalls(new Walls("Gold and Diamonds"));
    }

    public void buildAverageHouse(Builder builder){
        builder.setType("Small castle");
        builder.setRooms(5);
        builder.setDoors(6);
        builder.setWindow(10);
        builder.setGarage(1);
        builder.setWalls(new Walls("Stone and Iron"));
    }

    public void buildSmallHouse(Builder builder){
        builder.setType("Regular house");
        builder.setRooms(2);
        builder.setDoors(3);
        builder.setWindow(4);
        builder.setGarage(0);
        builder.setWalls(new Walls("Wood and Glass"));
    }
}