package com.training.db.hw3;

public class Order {

    static int age;
    int number;
{
    print(number);
}

    public Order(int number) {
        System.out.println("This is default constructor"); 
    }

    {
        System.out.println("This is initialization block 1");
    }
    {
        System.out.println("This is initialization block 2");
    }
    static {
        System.out.println("This is static initialization block 1");
    }
    static {
        System.out.println("This is static initialization block 2");
    }

    public static void print(int n){
        System.out.println("This is initial 'usual' variable: "+n);
    }

    public static void main(String[] args){
        System.out.println("This is static variable: "+Order.age);

        Order obj;
        System.out.println("Created reference variable");

        obj = new Order(1);
        System.out.println("Assigned reference to object");
    }
}