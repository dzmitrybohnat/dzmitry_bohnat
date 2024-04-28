package com.training.leet4;

public class Solution {
    public boolean isPalindrome1(String s) {
        if (s.length() < 2) {
            return true;
        }
        char ch;
        String string2 = "";

        String string1 = s.toLowerCase()
                .replaceAll("[^A-Za-z0-9]", "")
                .replaceAll("\\s+", "");
        for (int i = 0; i < string1.length(); i++) {
            ch = string1.charAt(i);
            string2 = ch + string2;
        }

        return string1.equals(string2);
    }

    public boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return true;
        }
        Character ch = 'd';
        StringBuilder string2 = new StringBuilder();

        String string1 = s.toLowerCase()
                .replaceAll("[^A-Za-z0-9]", "")
                .replaceAll("\\s+", "");

        string2.append(string1).reverse();

        return string2.toString().equals(string1);
    }
}
