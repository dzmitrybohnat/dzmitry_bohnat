package com.training.db.hw2;

public class Factorial {

    public static void calculateFactorial() {

        int n2 = UiUtil.input("Input second number: ");
        int n3 = UiUtil.input("Input third number: ");
        int i = 1, result = 1;

        if (n2 == 1) {
            while (i <= n3) {
                result = result * i;
                i++;
            }
            System.out.println("This is 'while' loop");
        } else if (n2 == 2) {

            do {
                result = result * i;
                i++;
            } while (i <= n3);
            System.out.println("This is 'do-while' loop");

        } else if (n2 == 3) {

            for (; i <= n3; i++) {
                result = result * i;
            }
            System.out.println("This is 'for' loop");

        } else {
            System.out.println("Second number should be 1, 2 or 3");
            System.exit(0);
        }

        System.out.print("Factorial of " + n3 + " is: " + result);
    }
    
}