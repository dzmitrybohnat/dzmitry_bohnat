package com.training.stack;

public class Executor {
    public static void main(String[] args) {
        String s = "({}{[]})";
        Solution sol = new Solution();
        System.out.println(sol.isValid(s));
    }
}
