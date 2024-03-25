package com.training.db.hw7;

import java.util.HashMap;

public class WordGroupingHashMap {
  public static void main(String[] args) {
    String str1 = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";
    String[] st = str1.replaceAll("[^A-Za-z ]", "").split("\\s+");

    HashMap<Character, StringBuilder> map = new HashMap<>();
    for (String word : st) {
      char firstChar = Character.toUpperCase(word.charAt(0));
      map.computeIfAbsent(firstChar, k -> new StringBuilder()).append(word).append(" ");
    }

    map.forEach((key, value) -> System.out.println(key + ": " + value));
  }
}
