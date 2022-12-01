package com;

import java.util.ArrayList;
import java.util.List;

public class AdventDay {
    
    public static void day2(){
        System.out.println(solveDay1("day2.txt"));
    }

    private static void solveDay2(String path) {

    }

    public static void day1() {
        System.out.println(solveDay1("day1.txt"));
    }

    private static List<Integer> solveDay1(String path) {
        List<Integer> result = new ArrayList<>();
        List<String> input = Util.readFile(path);
        List<Integer> calorieList = new ArrayList<>();
        int currentSum = 0;
        int biggestSum = 0;

        for (String line : input) {
            if (line.isEmpty()) {
                if (currentSum > biggestSum) {
                    biggestSum = currentSum;
                }

                calorieList.add(currentSum);
                currentSum = 0;
            } else {
                currentSum += Integer.valueOf(line);
            }
        }

        List<Integer> sorted = calorieList.stream().sorted().toList();
        int biggestThreeSum = sorted.get(sorted.size() - 1) + sorted.get(sorted.size() - 2) + sorted.get(sorted.size() - 3) ;

        result.add(biggestSum);
        result.add(biggestThreeSum);

        return result;
    }
}
