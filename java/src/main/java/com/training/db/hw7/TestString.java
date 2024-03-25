package com.training.db.hw7;

import java.util.Arrays;

public class TestString {
  public static void main(String[] args) {

    String str1 = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";

    String[] st = str1.replaceAll("[^A-Za-z ]","").toLowerCase().split("\\s+");
    Arrays.sort(st);

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < st.length; i++) {

      if (sb.length() == 0 || sb.charAt(0) != st[i].toUpperCase().charAt(0)) {
        sb = new StringBuilder("")
            .append(st[i].toUpperCase().charAt(0))
            .append(": ");
      }


      if (i > 0) {
        if (st[i].equals(st[i - 1])) {
          continue;
        } else {
          sb.append(st[i]).append(" ");
        }
      } else {
        sb.append(st[i]).append(" ");
      }

      if (i + 1 < st.length) {
        if (st[i].charAt(0) != st[i + 1].charAt(0))
          System.out.println(sb);
      } else {
        System.out.println(sb);
      }
    }
  }
}
