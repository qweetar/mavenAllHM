package com.htp.kuzmenok.task3;

public class Bus {
    private String driverName;
    private int busNumber;
    private int routNumber;
    private String busModel;
    private int busStartYear;
    private int mileage;


    public Bus() {

    }

    public Bus(String driverName, String busModel, int busNumber, int routNumber, int busStartYear, int mileage) {
        this.driverName = driverName;
        this.busModel = busModel;
        this.busNumber = busNumber;
        this.routNumber = routNumber;
        this.busStartYear = busStartYear;
        this.mileage = mileage;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBussNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getRoutNumber() {
        return routNumber;
    }

    public void setRoutNumber(int routNumber) {
        this.routNumber = routNumber;
    }

    public String getBusModel() {
        return busModel;
    }

    public void setBusModel(String busModel) {
        this.busModel = busModel;
    }

    public int getBusStartYear() {
        return busStartYear;
    }

    public void setBusStartYear(int busStartYear) {
        this.busStartYear = busStartYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}


