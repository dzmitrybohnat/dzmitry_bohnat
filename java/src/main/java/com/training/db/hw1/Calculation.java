package com.training.db.hw1;

public class Calculation{
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        double m1 = Double.parseDouble(args[2]);
        double m2 = Double.parseDouble(args[3]);
        double G = 4*Math.pow(Math.PI,2)*((Math.pow(a,3))/(Math.pow(p,2)*(m1+m2)));
        System.out.println(G);

    }
}