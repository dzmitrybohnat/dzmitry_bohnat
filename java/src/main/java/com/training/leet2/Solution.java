package com.training.leet2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subList = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {

            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i) {
                    subList.add(1);
                } else {
                    subList.add(list.get(i-2).get(j-2)+list.get(i-2).get(j-1));
                }
            }
            list.add(new ArrayList<>(subList));
            subList.clear();
        }
        return list;
    }
}