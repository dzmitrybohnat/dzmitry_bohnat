package com.training.db.hw2;

public class Algorithm {

    public static void main(String[] args) {

        int n1 = UiUtil.input("Input first number: ");
        int n2_fac = UiUtil.input("Input second number: ");
        int n2_fib = n2_fac;
        
        switch (n1) {
            case 1:
                Fibbonacci.listFibbonacci(n2_fib);
                break;
            case 2:
                Factorial.calculateFactorial(n2_fac);
                break;
            default:
                System.out.println("First number should be 1 or 2");
        }
    }
}