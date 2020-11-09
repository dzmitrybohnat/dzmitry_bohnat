package com.training.db.hw2;

public class Factorial {

    public static void calculateFactorial(int n2_fac) {

        int n3 = UiUtil.input("Input third number: ");
        int i = 1, result = 1;

        switch (n2_fac){
            case 1:
                while (i <= n3) {
                    result = result * i;
                    i++;
                }
                System.out.println("This is 'while' loop");
                break;
            case 2:
                do {
                    result = result * i;
                    i++;
                } while (i <= n3);
                System.out.println("This is 'do-while' loop");
                break;
            case 3:
                for (; i <= n3; i++) {
                    result = result * i;
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
