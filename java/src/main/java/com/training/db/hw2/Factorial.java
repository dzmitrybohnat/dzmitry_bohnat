package com.training.db.hw2;

public class Factorial {

    public static void calculateFactorial(int n2, int n3) {

        int i = 1, result = 1;

        switch (n2){
            case 1:
                while (i <= n3) {
                    result *= i;
                    i++;
                }
                System.out.println("This is 'while' loop");
                break;
            case 2:
                do {
                    result *= i;
                    i++;
                } while (i <= n3);
                System.out.println("This is 'do-while' loop");
                break;
            case 3:
                for (; i <= n3; i++) {
                    result *= i;
                }
                System.out.println("This is 'for' loop");
                break;
            default:
                System.out.println("Second number should be 1, 2 or 3");
                System.exit(0);
        }
        System.out.print("Factorial of " + n3 + " is: " + result);
    }

}
