package com.training.db.hw4;

public class CreditCard extends Card{
  public CreditCard(String cardOwner) {
    super(cardOwner);
  }

  public CreditCard(String cardOwner, double initialBalance) {
    super(cardOwner, initialBalance);
  }
//  @Override
//  public void withdraw(double amount){
//      super.withdraw(amount);
//  }
}
