package com;

import java.util.ArrayList;
import java.util.List;

public class AdventDay {

    public static void day2(){
        solveDay2("day2.txt");
    }

    private static void solveDay2(String path) {

    }

    public static void day1() {
        solveDay1("day1.txt");
    }

    private static void solveDay1(String path) {

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

        List<Integer> sorted = result.stream().sorted().toList();
        int biggestThreeSum = sorted.get(sorted.size() - 1) + sorted.get(sorted.size() - 2) + sorted.get(sorted.size() - 3) ;

        System.out.println("Biggest amount: " + biggestSum);
        System.out.println("Sum of biggest 3: " + biggestThreeSum );
    }
}
