package com.company;

public class House {
    private String type;
    private int rooms;
    private int doors;
    private Walls walls;
    private int window;
    private int garage;

    public House(String type, int rooms, int doors , Walls walls, int window, int garage) {
        this.type = type;
        this.rooms = rooms;
        this.doors = doors;
        this.garage = garage;
        this.walls = walls;
        this.window = window;
    }

    public String getType() {
        return type;
    }

    public int getRooms() {
        return rooms;
    }

    public int getDoors() {
        return doors;
    }

    public int getGarage() {
        return garage;
    }

    public Walls getWalls() {
        return walls;
    }

    public int getWindow(){ return window;}
}
