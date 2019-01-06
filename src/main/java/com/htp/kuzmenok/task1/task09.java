package com.htp.kuzmenok.task1;

public class task09 {
    public static void main(String[] args) {
        int first = 5;
        int second = 8;
        System.out.println("first number: " + first);
        System.out.println("second number: " + second);

        int temp = first;
        first = second;
        second = temp;
        System.out.println("After change!");
        System.out.println("first number: " + first);
        System.out.println("second number: " + second);
    }
}
