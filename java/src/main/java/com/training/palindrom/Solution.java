package com.training.palindrom;

public class Solution {
    public boolean isPalindrome(int x) {
        String st = String.valueOf(x);

        for (int i = 1; i < st.length(); i++) {
            if ((i - 1) == (st.length() - i)) {
                break;
            }
            if (st.charAt(i - 1) != st.charAt(st.length() - i)) {
                return false;
            }
        }
        return true;
    }
}
