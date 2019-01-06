package com.htp.kuzmenok.task1;

import java.util.*;

public class task02 {
    public static void main(String[] args) {
        double[] firstArray = {10, 30, 50, 70, 90};
        double[] tempArray = new double[5];
        System.out.println("First round: " + Arrays.toString(firstArray));

        for (int i = 0; i <=4; i++) {
            tempArray[i] = firstArray[i] * 1.1;
        }
        firstArray = tempArray;
        System.out.println("Second round: " + Arrays.toString(firstArray));
    }
}
