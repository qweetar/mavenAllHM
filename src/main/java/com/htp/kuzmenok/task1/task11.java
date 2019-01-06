package com.htp.kuzmenok.task1;

public class task11 {
    public static void main(String[] args) {
        int first = 8;
        int second = 4;
        int third = 23;

        if (first > second && first > third) {
            System.out.println("the bigest of three is first number: " + first);
        } else if (second > first && second > third) {
            System.out.println("the bigest of three is second number: " + second);
        } else {
            System.out.println("the bigest of three is third number: " + third);
        }
    }
}
