package com.htp.kuzmenok.task1;

public class task04 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int x = i % 2;
            if (x == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
