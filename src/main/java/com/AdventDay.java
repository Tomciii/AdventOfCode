package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdventDay {

    public static void day1() {
        day1_1("day1.txt");
    }

    public static void day1_1(String path) {

        List<String> input = Util.readFile(path);
        List<Integer> result = new ArrayList<>();
        int currentSum = 0;
        int biggestSum = 0;

        for (String line : input) {
            if (line.isEmpty()) {
                if (currentSum > biggestSum) {
                    biggestSum = currentSum;

                }
                result.add(currentSum);
                currentSum = 0;
            } else {
                currentSum += Integer.valueOf(line);
            }
        }

        Collections.reverse(result);
        List<Integer> sorted = result.stream().sorted().toList();

        int biggestThreeSum =sorted.get(sorted.size() - 1) + sorted.get(sorted.size() - 2) + sorted.get(sorted.size() - 3) ;
        System.out.println("Biggest amount: " + sorted.get(sorted.size() - 1));
        System.out.println("Sum of biggest 3: " + biggestThreeSum );
    }
}
