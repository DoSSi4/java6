package com.company;

public class HouseMapBuilder implements Builder{
    private String type;
    private int rooms;
    private int window;
    private int doors;
    private Walls walls;
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
    public void setWindow(int window) {
        this.window = window;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setWalls(Walls walls) {
        this.walls = walls;
    }

    @Override
    public void setGarage(int garage) {
        this.garage = garage;
    }


    public HouseMap getResult(){
        return new HouseMap(type, rooms, doors, window, walls, garage);
    }
}
