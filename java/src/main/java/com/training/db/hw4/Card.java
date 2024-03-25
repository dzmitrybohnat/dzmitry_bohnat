package com.training.db.hw4;

public class Card {
  private String ownerName;
  private double balance;

  public Card() {
  }
  public Card(String ownerName, double initialBalance) {
    this.ownerName = ownerName;
    this.balance = initialBalance;
  }

  public Card(String ownerName) {
    this.ownerName = ownerName;
    this.balance = 0.0;
  }

  public String setOwnerName(String ownerName) {
    this.ownerName = ownerName;
    return ownerName;
  }

  public void deposit(double amount){
    balance += amount;
  }

  public void withdraw(double amount){
    balance -= amount;
  }

  public double convertBalance(double exchangeRate){
    double convertedBalance = balance * exchangeRate;
    return convertedBalance;
  }

  public double getBalance(){
    return balance;
  }
  public String getOwner(){
    return ownerName;
  }

}
