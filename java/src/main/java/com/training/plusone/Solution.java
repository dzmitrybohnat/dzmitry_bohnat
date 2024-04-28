package com.training.plusone;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {

        if (digits[digits.length - 1] != 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        int position = digits.length - 1;

        for (int i = digits.length - 1; i >= 0; i = i - 1) {
            if (digits[i] == 9) {
                position = i;
            } else {
                break;
            }
        }
        if (position == 0) {
            int[] digits2 = new int[digits.length + 1];
            for (int j = 0; j < digits2.length; j++) {
                if (j == 0) {
                    digits2[j] = 1;
                } else {
                    digits2[j] = 0;
                }
            }
            return digits2;
        } else {
            for (int k = position - 1; k < digits.length; k++) {
                if (k == position - 1) {
                    digits[k] += 1;
                } else {
                    digits[k] = 0;
                }
            }
            return digits;
        }

    }
}
