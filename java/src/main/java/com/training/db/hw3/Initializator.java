package com.training.db.hw3;

import java.lang.reflect.Field;

public class Initializator {
    public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {

        Student student = new Student();
        Field[] field = student.getClass().getDeclaredFields();

        System.out.println("Class declared variables and initial values are:");

        for (Field classField : field) {
            String fieldName = classField.getName();
            Object fieldValue = classField.get(student);
            System.out.println(fieldName+": "+fieldValue);
        }
    }
}

class Student {
    String name;
    char letter;
    int num;
    Integer age;
    double rate;
    boolean isEnabled;
}