package com.htp.kuzmenok.task5;

public class SportCar extends Car {
    private String brand;
    private int price;

    public SportCar() {
    }

    public SportCar(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public SportCar(int tank, int fuel, int speed, int time, String model, int year, String brand, int price) {
        super(tank, fuel, speed, time, model, year);
        this.brand = brand;
        this.price = price;
    }






    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
