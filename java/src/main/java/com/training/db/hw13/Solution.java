package com.training.db.hw13;

public class Solution {
    public int lengthOfLastWord(String s) {
        //String[] st2 = s.trim().replaceAll("\\s+", " ").replaceAll("[^A-Za-z ]", "").split("\\s+");

        String[] tokens = s.split(" ");

        return tokens[tokens.length - 1].length();
    }

}
