package com.htp.kuzmenok.task1;

public class task03 {
    public static void main (String[] args) {

        boolean number = polyndromeCheck(123321);

        System.out.println("Number polyndrome is: " + number);
    }
    // Polyndrome Method for Task 3
    public static boolean polyndromeCheck (int num) {
        int reversNum = 0;
        int notReversNym = num;

        while (num != 0) {
            int temp = num % 10;
            reversNum = reversNum * 10 + temp;
            num /= 10;
        }

        if(notReversNym == reversNum) {
            return true;
        } else {
            return false;
        }

    }
}
