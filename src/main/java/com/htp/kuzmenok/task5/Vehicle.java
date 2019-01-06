package com.htp.kuzmenok.task5;

public abstract class Vehicle {
    private int tank; // объем топливного бака
    private int fuel; // расход топлива

    private int speed; // скорость в час
    private int time;  // время в пути

    Vehicle () {
    }

    Vehicle (int tank, int fuel) {
        this.tank = tank;
        this.fuel = fuel;
    }

    Vehicle (int tank, int fuel, int speed, int time) {
        this.tank = tank;
        this.tank = fuel;
        this.speed = speed;
        this.time = time;
    }

    // расчет растояние максимального пробега на одном баке
    abstract int maxDistance();

    // расчет растояния
    abstract int travelDistance();

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
