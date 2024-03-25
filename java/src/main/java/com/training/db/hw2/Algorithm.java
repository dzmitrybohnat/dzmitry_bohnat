package com.training.db.hw2;

public class Algorithm {

    public static void main(String[] args) {

        int n1 = UiUtil.input("Input first number: "); // calculates fibbonacci (1) or factorial (2)
        int n2 = UiUtil.input("Input second number: "); // use WHILE (1), DO_WHILE (2) or FOR (3)
        int n3 = UiUtil.input("Input third number: "); // number for which to calculate
  
        switch (n1) {
            case 1:
                Fibbonacci.listFibbonacci(n2, n3);
                break;
            case 2:
                Factorial.calculateFactorial(n2, n3);
                break;
            default:
                System.out.println("First number should be 1 or 2");
        }
    }
}