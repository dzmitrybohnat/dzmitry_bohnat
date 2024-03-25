package com.training.db.hw6;

public class Program {
  public static void main(String[] args) {
    int[] arr2 = {10, 2, 3, 5, 1, 10, 0};

    BubbleSortStrategy bubbleSort = new BubbleSortStrategy();
    SelectSortStrategy selectSortS = new SelectSortStrategy();

    SortingContext context = new SortingContext(bubbleSort);
    SortingContext context2 = new SortingContext(selectSortS);

    context.execute(arr2);
    context2.execute(arr2);
  }
}
