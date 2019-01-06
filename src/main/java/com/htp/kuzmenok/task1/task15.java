package com.htp.kuzmenok.task1;

public class task15 {
    public static void main(String[] args) {
        System.out.print("Cicle for: ");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
        }

        System.out.println();
        System.out.print("Cicle while: ");
        int x = 1;
        while (x <= 100) {
            System.out.print(x);
            x++;
        }

        System.out.println();
        System.out.print("Cicle do while: ");

        int z = 1;
        do {
            System.out.print(z);
            z++;
        } while (z <= 100);
    }
}
