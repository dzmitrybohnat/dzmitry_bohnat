package com.training.db.hw2;

import java.util.Scanner;

public class UiUtil {

    public static int input(String message) {
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        boolean isValid = false;
        int scannedNumber = 0;

        do {
            try {
                scannedNumber = Integer.parseInt(sc.nextLine());
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again");
            }
        } while (!isValid);

        return scannedNumber;
    }

}