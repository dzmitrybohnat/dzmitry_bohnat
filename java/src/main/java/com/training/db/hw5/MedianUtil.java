package com.training.db.hw5;

import java.util.Arrays;

public class MedianUtil {

  public static void calculateMedian(int[] s){
    double median;
    Arrays.sort(s);
    if(s.length % 2 == 0){
      System.out.println(s[s.length/2-1]);
      System.out.println(s[s.length/2]);

      median = ((double)s[s.length/2]+(double)s[s.length/2-1])/2;
      System.out.println("Median: "+median);
    }
    else {
      median = s[s.length/2];
      System.out.println("Median: "+median);
    }
  }
}
