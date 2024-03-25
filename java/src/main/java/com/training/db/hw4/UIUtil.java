package com.training.db.hw4;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class UIUtil {

  public static String readInputString(String message) {
    System.out.println(message);
    Scanner sc = new Scanner(System.in);
    String stringInput = sc.nextLine();
    return stringInput;
  }

  public static double readDoubleInput(String message) {
    Scanner sc = new Scanner(System.in);

    boolean isValid = false;
    double scannedValue = 0;
    do {
      try{
        System.out.println(message);
        scannedValue = sc.nextDouble();
        isValid = true;
      } catch (InputMismatchException e){
        System.out.println("Invalid input. Please try again");
      }
    } while (!isValid);

    return scannedValue;
  }
}
