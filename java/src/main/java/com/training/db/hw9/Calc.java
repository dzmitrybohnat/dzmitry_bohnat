package com.training.db.hw9;

public class Calc {

    double calcArea() {
        UiUtil a = new UiUtil();
        return Math.pow(a.readInput(), 2) * Math.PI;
    }
}
