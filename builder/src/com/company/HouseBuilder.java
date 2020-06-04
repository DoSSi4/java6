package com.company;

public class HouseBuilder implements Builder{
    private String type;
    private int rooms;
    private int doors;
    private Walls walls;
    private int window;
    private int garage;

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setWindow(int window) {
        this.window = window;
    }

    @Override
    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    @Override
    public void setGarage(int garage) {
        this.garage = garage;
    }


    public House getResult(){
        return new House(type, rooms, window, walls, garage, doors);
    }
}