package com.training.db.hw10;

import com.training.db.hw9.UiUtil;

public class EvenOdd {
    public static void main(String[] args) {
//        UiUtil userInput = new UiUtil();
//        double x = userInput.readInput();
//        if (x % 2 == 0) {
//            System.out.println(x + " is even.");
//        } else {
//            System.out.println(x + " is odd.");
//        }
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            System.out.println(sum);
        }

    }
}
