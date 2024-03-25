package com.training.db.hw7;
import java.util.*;

public class WordGrouping {
  public static void main(String[] args) {
    String inputText = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";

    Map<Character, Set<String>> wordMap = new TreeMap<>();
    String[] words = inputText.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

    for(String s : words){
      System.out.print(s+" ");
    }
    System.out.println();

    for (String word : words) {
      if (!word.isEmpty()) {
        char firstChar = word.charAt(0);
        Set<String> wordSet = wordMap.getOrDefault(firstChar, new TreeSet<>());
        wordSet.add(word);
        wordMap.put(firstChar, wordSet);
      }
    }

    for (Map.Entry<Character, Set<String>> entry : wordMap.entrySet()) {
      char firstChar = entry.getKey();
      Set<String> wordSet = entry.getValue();

      System.out.print(Character.toUpperCase(firstChar) + ": ");
      for (String word : wordSet) {
        System.out.print(word + " ");
      }
      System.out.println();
    }
  }
}
