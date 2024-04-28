package com.training.twosum;

import java.util.Arrays;

public class Executor {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(nums, target)));

    }
}
