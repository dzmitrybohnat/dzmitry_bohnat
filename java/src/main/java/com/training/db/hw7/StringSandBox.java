package com.training.db.hw7;

public class StringSandBox {
  public static void main(String[] args){
    String s = "Hello";

    StringBuilder sb = new StringBuilder(s);
    System.out.println(sb);

    sb.insert(1,"-test-");
    System.out.println(sb);
  }
}
