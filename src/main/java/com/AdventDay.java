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
        System.out.println(input);
        List<Integer> result = new ArrayList<>();
        int currentSum = 0;
        int biggestSum = 0;

        for (String line : input) {
            if (line.isEmpty()) {
                if (currentSum > biggestSum) {
                    biggestSum = currentSum;
                    result.add(biggestSum);
                }

                currentSum = 0;
            } else {
                currentSum += Integer.valueOf(line);
            }
        }

        System.out.println(result);
        Collections.reverse(result);
        System.out.println("Biggest amount: " + result.get(0));
        System.out.println("Sum of biggest 3: " + result.stream().limit(3).mapToInt(a -> a).sum());
    }
}
