package com.training.db.hw2;

public class Fibbonacci {

    public static void listFibbonacci() {

        int n2 = UiUtil.input("Input second number: ");
        int n3 = UiUtil.input("Input third number: ");

        int f1 = 0, f2 = 1, f3 = 0;
        int counter = 0;

        if (n2 == 1) {
            System.out.print("First " + n3 + " Fibonacci numbers are: ");
            while (counter < n3) {
                System.out.print(f1 + " ");
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
                counter++;
            }
            System.out.println("\nThis is 'while' loop");

        } else if (n2 == 2) {
            System.out.print("First " + n3 + " Fibonacci numbers are: ");
            do {
                System.out.print(f1 + " ");
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
                counter++;
            }
            while (counter < n3);
            System.out.println("\nThis is 'do-while' loop");
        } else if (n2 == 3) {
            System.out.print("First " + n3 + " Fibonacci numbers are: ");
            for (; counter < n3; counter++) {
                System.out.print(f1 + " ");
                f3 = f1 + f2;
                f1 = f2;
                f2 = f3;
            }
            System.out.println("\nThis is 'for' loop");
        } else {
            System.out.println("Second number should be 1, 2 or 3");
            System.exit(0);
        }
    }
}