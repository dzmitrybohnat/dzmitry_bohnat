package com.training.db.hw4;

public class Atm {
  public static void withdraw(Card card, double amount){
    card.withdraw(amount);
  }
  public static void deposit(Card card, double amount){
    card.deposit(amount);
  }
}
