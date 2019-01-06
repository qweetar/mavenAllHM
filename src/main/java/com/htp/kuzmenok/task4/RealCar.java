package com.htp.kuzmenok.task4;

public class RealCar {

    public static void main(String[] args) {
        Car DreamCar = new Car(100, 80);
        CarPrice DreamCarPrice = new CarPrice();

        System.out.println("Price of Car: " + DreamCarPrice.count(DreamCar) + " $");

        System.out.println(DreamCar.getBrend() + " " + DreamCar.getModel());

        DreamCar.setEngine(5555);
        System.out.println("Price of Car after engine price increase: " + DreamCarPrice.count(DreamCar) + " $");


    }
}
