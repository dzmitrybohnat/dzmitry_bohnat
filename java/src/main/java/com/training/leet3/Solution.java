package com.training.leet3;

public class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    break;
                }
                if (j == nums.length - 1) {
                    return nums[i];
                }
            }
        }
        return 0;
    }
    public int singleNumber1(int[] nums) {
        int x = nums[0];
        for (int i = 1; i < nums.length; i++) {
            System.out.println("x = " + x);

            x = x^nums[i];
            System.out.println("x^nums[i] = " + x);
        }
        return x;
    }


}
