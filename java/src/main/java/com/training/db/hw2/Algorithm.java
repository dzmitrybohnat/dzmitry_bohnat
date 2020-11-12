package com.training.db.hw2;

public class Algorithm {

    public static void main(String[] args) {

        int n1 = UiUtil.input("Input first number: ");
        int n2 = UiUtil.input("Input second number: ");
        int n3 = UiUtil.input("Input third number: ");
  
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