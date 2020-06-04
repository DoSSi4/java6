package com.company;

public interface Builder {
    void setType(String type);
    void setRooms(int rooms);
    void setDoors(int doors);
    void setWalls(Walls wallsType);
    void setWindow(int window );
    void setGarage(int garage);

}

