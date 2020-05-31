package com.company;

public class Application {
    private Chair chair;
    private Sofa sofa;
    private CoffeeTable coffeeTable;

    public Application(FurnitureFactory factory){
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable=factory.createCoffeeTable();
    }
    public void delivered(){
        chair.deliver();
        sofa.deliver();
        coffeeTable.deliver();
    }
}
