

package com.htp.kuzmenok.task3;

public class SortArray implements Comparable {



    public static void bubbleSort(Bus[] buses) {
        for (int a = 1; a < buses.length; a++) {
            for (int b = 0; b < buses.length - a; b++) {
                if (buses[b].getBusStartYear() > buses[b + 1].getBusStartYear()) {
                    Bus temp = buses[b];
                    buses[b] = buses[b + 1];
                    buses[b + 1] = temp;
                }
            }
        }
    }

    public static void insertionSort(Bus[] buses) {
        for (int a = 1; a < buses.length; a++) {
            int key = buses[a].getMileage();
            Bus keyArr = buses[a];
            int b = a - 1;
            while (b >= 0 && key < buses[b].getMileage()) {
                buses[b + 1] = buses[b];
                b--;
            }
            buses[b + 1] = keyArr;
        }
    }

    public static void shellSort(Bus[] buses) {
        int b;
        for (int gap = buses.length / 2; gap > 0; gap /= 2) {
            for (int a = gap; a < buses.length; a++) {
                int temp = buses[a].getRoutNumber();
                Bus tempArr = buses[a];
                for (b = a; b >= gap && buses[b - gap].getRoutNumber() > temp; b -= gap) {
                    buses[b] = buses[b - gap];
                }
                buses[b] = tempArr;
            }
        }
    }



    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

