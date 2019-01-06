package com.htp.kuzmenok.task1;

public class task18 {
    public static void main (String[] args) {

        double moneyAmount = currencyConverter(2500.00, 2.1208);
        System.out.println("IPhone price: " + moneyAmount + " USD");

    }
    public static double currencyConverter(double amountBYN, double valueUSD) {
        return amountBYN / valueUSD;
    }
}
