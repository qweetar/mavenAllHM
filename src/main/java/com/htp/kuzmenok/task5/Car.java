package com.htp.kuzmenok.task5;

public class Car extends Vehicle {
    private String model;
    private int year;

    public Car() {
    }

    public Car (int tank, int fuel) {
        super (tank, fuel);
    }

    public Car (int tank, int fuel, int speed, int time) {
        super (tank, fuel, speed, time);
    }

    public Car (int tank, int fuel, int speed, int time, String model, int year) {
        super(tank, fuel, speed, time);
        this.model = model;
        this.year = year;
    }



    @Override
    public int maxDistance() {
        int maxDist;
        maxDist = getTank() / getYear();
        return maxDist;
    }

    @Override
    public int travelDistance() {
        int travelDist;
        travelDist = getSpeed() * getTime();
        return travelDist;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car Car = (Car) o;
        return  model.equals(Car.model) &&
                year == Car.year;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", year=" + year +
                '}';
    }
}
