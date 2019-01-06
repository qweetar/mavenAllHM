package com.htp.kuzmenok.task5;

public class CarCreator {
    public static void main (String[] args) {

        // public SportCar (int tank, int fuel, int speed, int time, String model, int year, String brand, int price)
        SportCar[] sportCarsArray = new SportCar[5];
        sportCarsArray[0] = new SportCar(80, 8, 150, 5, "Roadster", 2015, "Porsche", 90000);
        sportCarsArray[1] = new SportCar(60, 12, 200, 2, "Roadster", 2005, "Ferrary", 15000);
        sportCarsArray[2] = new SportCar(70, 10, 140, 6, "Coupe", 2010, "BMW", 50000);
        sportCarsArray[3] = new SportCar(70, 11, 150, 4, "Coupe", 2012, "Mercedes", 60000);
        sportCarsArray[4] = new SportCar(50, 7, 145, 8, "Roadster", 2018, "Lotus", 55000);

        System.out.println("Array of SportCar");
        for (int i = 0; i < sportCarsArray.length; i++) {
            System.out.println(sportCarsArray[i].getModel() + " - " + sportCarsArray[i].getBrand());
        }

        Car[] carArray = new Car[5];
        carArray[0] = new Car(80, 9, 120, 8, "Minivan", 2010);
        carArray[1] = new Car(70, 8, 110, 9, "Sedan", 2000);
        carArray[2] = new Car(60, 5, 100, 8, "Cabriolet", 1998);
        carArray[3] = new Car(90, 12, 120, 5, "SUV", 2018);
        carArray[4] = new Car(70, 10, 110, 7, "Hatchback", 2008);

        System.out.println();
        System.out.println("Array of Car");
        for (int i = 0; i < carArray.length; i++) {
            System.out.println(carArray[i].getModel() + " - " + carArray[i].getYear());
        }

        System.out.println();
        System.out.println("Sort array by year");
        SortCar sortByYear = new SortCar();
        sortByYear.bubbleCarSort(sportCarsArray);

        for (int i = 0; i < sportCarsArray.length; i++) {
            System.out.println(sportCarsArray[i].getYear() + " - " + sportCarsArray[i].getBrand());
        }

        System.out.println();
        System.out.print("Total price of sports cars in array: ");
        int count = 0;
        for (int i = 0; i < sportCarsArray.length; i++) {
            count += sportCarsArray[i].getPrice();
        }
        System.out.println(count + " $");

    }
}
