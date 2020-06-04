package com.company;

import java.util.Scanner;

public class Application {
    public static Logistics logic;

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the type of logistics, on land or on sea?");
        String choose = in.next();
        if(choose.equals("land")) {
            logic = new RoadLogistics();
        }
        if(choose.equals("sea")) {
            logic = new SeaLogistics();
        }
        logic.planDelivery();
        in.close();
    }
}
