package com.company;

public class HouseMap {
    private String type;
    private int rooms;
    private int window;
    private int doors;
    private Walls walls;
    private int garage;

    public HouseMap(String type, int rooms, int window, int doors, Walls walls, int garage) {
        this.type = type;
        this.rooms = rooms;
        this.window = window;
        this.doors = doors;
        this.walls = walls;
        this.garage = garage;
    }

    public String showMap(){
        String returned = "";
        returned += "House Type: " + this.type + "\n";
        returned += "Rooms: " + this.rooms + "\n";
        returned += "Number of windows : " + this.window + "\n";
        returned += "Number of doors: " +this.doors + "\n";
        returned += "Wall materials: " + this.walls.getWallType() + "\n";
        returned += "Number of garage: " + this.garage + "\n";
        return returned;
    }
}