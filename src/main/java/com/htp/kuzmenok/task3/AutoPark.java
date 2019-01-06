package com.htp.kuzmenok.task3;

public class AutoPark {
    public static void main(String[] args) {

        final int mainRout = 13;
        final int allowdYear = 2000;
        final int allowdMileage = 200000;

        Bus[] busArray = new Bus[5];
        busArray[0] = new Bus("Freddy", "Maz",  2143, 21, 2011, 50000);
        busArray[1] = new Bus("Ronny", "Icarus", 8924, 13, 1976, 250000 );
        busArray[2] = new Bus("Harry", "Neoplan", 8288, 43, 1998, 300000);
        busArray[3] = new Bus("Tomas", "Mercedes", 2381, 98, 2018, 10000);
        busArray[4] = new Bus("Adam", "Paz", 9823, 13, 1987, 340000);

        System.out.println("List of buses on the rout #13 ");
        for (int i = 0; i < busArray.length; i++) {
            if (busArray[i].getRoutNumber() == mainRout) {
                System.out.println(busArray[i].getBusModel() + " - " + busArray[i].getBusNumber());
            }
        }
        System.out.println();
        System.out.println("List of buses older then 18 years: ");
        for (int j = 0; j < busArray.length; j++) {
            if (busArray[j].getBusStartYear() < allowdYear) {
                System.out.println(busArray[j].getBusModel() + " - " + busArray[j].getBusStartYear() + " year");
            }
        }
        System.out.println();
        System.out.println("List of buses with expired mileage limit: ");
        for (int k = 0; k < busArray.length; k++) {
            if (busArray[k].getMileage() > allowdMileage) {
                System.out.println(busArray[k].getBusModel() + " - " + busArray[k].getMileage() + " miles");
            }
        }


        System.out.println();
        System.out.println("Sort bus array by year");

        SortArray sortBusArrayByYear = new SortArray();
        sortBusArrayByYear.bubbleSort(busArray);

        for (int x = 0; x < busArray.length; x++) {
            System.out.println(busArray[x].getBusModel() + " - " + busArray[x].getBusStartYear() + " year");
        }

        System.out.println();
        System.out.println("Sort bus array by mileage");

        SortArray sortBusArrayByMileage = new SortArray();
        sortBusArrayByMileage.insertionSort(busArray);


        for (int x = 0; x < busArray.length; x++) {
            System.out.println(busArray[x].getBusModel() + " - " + busArray[x].getMileage() + " miles");
        }

        System.out.println();
        System.out.println("Sort bus array by rout number");

        SortArray sortBusArrayByRout = new SortArray();
        sortBusArrayByRout.shellSort(busArray);

        for (int y = 0; y < busArray.length; y++) {
            System.out.println(busArray[y].getBusModel() + " - rout # " + busArray[y].getRoutNumber());
        }


    }
}
