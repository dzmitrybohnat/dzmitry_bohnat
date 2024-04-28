package com.training.db.hw11;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int romanToInt2(String x) {

        int date = 0, n = 0;

        for (int i = x.length() - 1; i >= 0; i--) {

            n = switch (x.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> n;
            };

            if (x.charAt(i) >= x.charAt(i + 1)) {
                date += n;

            } else {
                date -= n;

            }
        }

        return date;
    }
}
