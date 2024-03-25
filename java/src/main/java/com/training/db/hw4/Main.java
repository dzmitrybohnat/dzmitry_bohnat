package com.training.db.hw4;

public class Main {

  public static void main(String[] args){

    DebitCard johnDebitCard = new DebitCard("John White",100.0);

    CreditCard jackCreditCard = new CreditCard("Jack Green");

    System.out.println(johnDebitCard.getOwner()+" balance is: "+johnDebitCard.getBalance());

    Atm.deposit(johnDebitCard,100.0);

    System.out.println(johnDebitCard.getOwner()+" balance is: "+johnDebitCard.getBalance());

    Atm.withdraw(johnDebitCard,300.0);

    System.out.println(johnDebitCard.getOwner()+" balance is: "+johnDebitCard.getBalance());

    Atm.deposit(jackCreditCard,100.0);
    System.out.println(jackCreditCard.getOwner()+" balance is: "+jackCreditCard.getBalance());
    Atm.withdraw(jackCreditCard,150.0);
    System.out.println(jackCreditCard.getOwner()+" balance is: "+jackCreditCard.getBalance());



  }

}
