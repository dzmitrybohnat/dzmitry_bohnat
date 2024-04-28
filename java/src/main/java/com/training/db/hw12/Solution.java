package com.training.db.hw12;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        int minStringLength = strs[0].length();

        String st;
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            if (s.length() < minStringLength)
                minStringLength = s.length();
        }
        if (minStringLength > 0) {
            for (int k = 0; k < minStringLength; k++) {
                int count = 1;

                for (int l = 1; l < strs.length; l++) {
                    if (strs[l].charAt(k) == strs[0].charAt(k)) {
                        count += 1;
                    }
                }
                if (count == strs.length) {
                    sb.append(strs[0].charAt(k));
                } else {
                    break;
                }
            }

            st = String.valueOf(sb);
        } else {
            return "";
        }

        return st;
    }

    public String longestCommonPrefix2(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}