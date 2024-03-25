package com.training.db.hw4;

public class DebitCard extends Card{

  public DebitCard(String cardOwner) {
    super(cardOwner);
  }

  public DebitCard(String cardOwner, double initialBalance) {
    super(cardOwner, initialBalance);
  }
@Override
  public void withdraw(double amount){
    if(amount<=getBalance()){
      super.withdraw(amount);
    } else {
      System.out.println("Debit card does not allow withdrawals exceeding the balance.");
    }
  }
}
