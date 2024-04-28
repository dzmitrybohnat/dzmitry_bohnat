package com.training.db.hw9;

import java.util.Scanner;

public class UiUtil {

    public double readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        double number;
        return number = scanner.nextDouble();
    }

}
