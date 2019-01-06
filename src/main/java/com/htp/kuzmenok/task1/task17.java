package com.htp.kuzmenok.task1;

public class task17 {
    public static void main (String[] args) {
        double[] simpleArray = {32, 56, 12, 89, 8, 29, 85, 12};
        double largestNum = 0;

        System.out.print("Array: ");
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i] + " ");
        }

        for (int i = 0; i < simpleArray.length; i++) {
            if (simpleArray[i] > largestNum) {
                largestNum = simpleArray[i];
            }
        }
        System.out.println();
        System.out.println("largest Number of Array is: " + largestNum);
        System.out.print("Array divided by Largest number: ");
        for (int i = 0; i < simpleArray.length; i++) {
            System.out.print(simpleArray[i]/largestNum + " ");
        }
    }
}
