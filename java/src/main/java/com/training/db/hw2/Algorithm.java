package com.training.db.hw2;

public class Algorithm {

    public static void main(String[] args) {

        int n1 = UiUtil.input("Input first number: ");

        if (n1 == 1) {
            Fibbonacci.listFibbonacci();
        } else if (n1 == 2) {
            Factorial.calculateFactorial();
        } else {
            System.out.println("First number should be 1 or 2");
        }
    }
}