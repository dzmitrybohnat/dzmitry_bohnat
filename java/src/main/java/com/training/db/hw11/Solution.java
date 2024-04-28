package com.training.db.hw11;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String x) {
        Map<Character, Integer> romanIntMap = new HashMap<>();
        romanIntMap.put('I', 1);
        romanIntMap.put('V', 5);
        romanIntMap.put('X', 10);
        romanIntMap.put('L', 50);
        romanIntMap.put('C', 100);
        romanIntMap.put('D', 500);
        romanIntMap.put('M', 1000);

        int date = 0;

        date += romanIntMap.get(x.charAt(x.length() - 1));

        for (int i = x.length() - 2; i >= 0; i--) {
            if (romanIntMap.get(x.charAt(i)) >= romanIntMap.get(x.charAt(i + 1))) {
                date += romanIntMap.get(x.charAt(i));

            } else {
                date -= romanIntMap.get(x.charAt(i));
            }
        }

        return date;
    }
}
