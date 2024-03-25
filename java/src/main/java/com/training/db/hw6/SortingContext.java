package com.training.db.hw6;

public class SortingContext {

  private Strategy strategy;

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }

  public SortingContext(Strategy strategy) {
    this.strategy = strategy;
  }

  public void execute(int[] arr) {
    strategy.doSort(arr);
  }

}
