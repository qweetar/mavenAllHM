package com.htp.kuzmenok.task4;

public class Car {
    private static String Brend = "BMW";
    private static String Model = "x6";

    private int wheel = 50;
    private int door = 150;
    private int engine = 5000;
    private int tire = 100;
    private int seat = 200;

    public Car() {

    }

    public Car(int wheel, int tire) {
        this.wheel = wheel;
        this.tire = tire;
    }

    public Car(int wheel, int door, int engine, int tire, int seat) {
        this.wheel = wheel;
        this.door = door;
        this.engine = engine;
        this.tire = tire;
        this.seat = seat;
    }

    public static String getBrend() {
        return Brend;
    }

    public static void setBrend(String brend) {
        Brend = brend;
    }

    public static String getModel() {
        return Model;
    }

    public static void setModel(String model) {
        Model = model;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getTire() {
        return tire;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
