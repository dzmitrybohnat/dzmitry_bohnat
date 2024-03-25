package com.training.db.hw6;

public class BubbleSortStrategy implements Strategy {
  @Override
  public void doSort(int[] arr) {

    int n = arr.length;
    int t = 0;
    for (int j = 0; j < n - 1; j++) {

      for (int i = 0; i < n -j- 1; i++) { //[4,1,5]

        if (arr[i] > arr[i+1]) {

          t = arr[i + 1];
          arr[i + 1] = arr[i];
          arr[i] = t;

        }
      }
    }
    for (int a : arr) {
      System.out.print(" "+ a);
    }
  }
}
