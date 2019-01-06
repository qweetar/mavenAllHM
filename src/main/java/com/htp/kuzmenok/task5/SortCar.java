package com.htp.kuzmenok.task5;

public class SortCar {

    public static void bubbleCarSort(Car[] cars) {
        for (int a = 1; a < cars.length; a++) {
            for (int b = 0; b < cars.length - a; b++) {
                if (cars[b].getYear() > cars[b + 1].getYear()) {
                    Car temp = cars[b];
                    cars[b] = cars[b + 1];
                    cars[b + 1] = temp;
                }
            }
        }
    }




}
