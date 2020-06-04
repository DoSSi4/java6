package com.company;

import java.util.Scanner;

public class Application {
    private static final Director director = new Director();
    private static final HouseBuilder houseBuilder = new HouseBuilder();
    private static final HouseMapBuilder houseMapBuilder = new HouseMapBuilder();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the type of house Large, Average or Small?");
        String choose = in.next();


        if(choose.equals("Large")) {
            director.buildLargeHouse(houseBuilder);
            director.buildLargeHouse(houseMapBuilder);
        }
        if(choose.equals("Average")) {
            director.buildAverageHouse(houseBuilder);
            director.buildAverageHouse(houseMapBuilder);
        }
        if(choose.equals("Small")) {
            director.buildSmallHouse(houseBuilder);
            director.buildSmallHouse(houseMapBuilder);
        }

        //House house = houseBuilder.getResult();
        HouseMap houseMap = houseMapBuilder.getResult();

        System.out.println(houseMap.showMap());

        in.close();
    }
}