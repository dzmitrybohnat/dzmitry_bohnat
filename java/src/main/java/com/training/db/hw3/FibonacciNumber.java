package com.training.db.hw3;

public class FibonacciNumber {
    public static void main(String[] args){

        fibbonacci();
    }

    public static void fibbonacci() {

        long f1 = 0;
        long f2 = 1;
        long f3 = 0;
        int counter = 1;
        int counterInt = 0;
        int counterLong = 0;

        while (f3 < Long.MAX_VALUE) {
            f3 = f1 + f2;

            if (f3 >= Integer.MAX_VALUE && counterInt == 0) {
                counterInt = counter;
            } else if (f3 < 0 || f3 >= Long.MAX_VALUE)
            {
                counterLong = counter;
                break;
            }
            f1 = f2;
            f2 = f3;
            counter++;
        }
        System.out.println("Proper int fibonnacci value can be counted for: " + counterInt+" numbers");
        System.out.println("Proper long fibonnacci value can be counted for: " + counterLong+" numbers");
    }
}