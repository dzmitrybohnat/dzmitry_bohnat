package com.training.db.hw6;

public class SelectSortStrategy implements Strategy {

  @Override
  public void doSort(int[] arr) {
    int indexMin;
    int n = arr.length;

    for (int j = 1; j < n; j++) {
      indexMin = j-1;
      for (int i = j; i < n; i++) {
        if (arr[indexMin] > arr[i]) {
          indexMin = i;
        }
      }

      int t = arr[indexMin];
      arr[indexMin] = arr[j-1];
      arr[j-1] = t;
    }

    for (int b : arr) {
      System.out.print(" "+b);
    }

  }

}