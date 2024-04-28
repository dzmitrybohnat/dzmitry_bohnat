package com.training.leet7;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] myArray = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            myArray[i] = nums[i];
            myArray[i + nums.length] = nums[i];
        }

        return myArray;
    }
}
