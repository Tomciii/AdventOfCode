package com;

import java.util.ArrayList;
import java.util.List;

public class AdventDay {

    public static void day2(){
        System.out.println(solveDay2_2("day2.txt"));
    }

    private static Integer solveDay2_2(String path) {
        List<String> input = Util.readFile(path);
        int result = 0;

        for (String line : input){
            String[] lineInArray = line.split(" ");

            if (lineInArray[1].equals("X")){
                if (lineInArray[0].equals("A")){
                    result = result + 3;
                } else if (lineInArray[0].equals("B")){
                    result = result + 1;
                } else if (lineInArray[0].equals("C")){
                    result = result + 2;
                }
            } else if (lineInArray[1].equals("Y")){
                result = result + 3;

                if (lineInArray[0].equals("A")){
                    result = result + 1;
                } else if (lineInArray[0].equals("B")){
                    result = result + 2;
                }
                else if (lineInArray[0].equals("C")){
                    result = result + 3;
                }
            } else if (lineInArray[1].equals("Z")){
                result = result + 6;

                if (lineInArray[0].equals("B")){
                    result = result + 3;
                } else if (lineInArray[0].equals("C")){
                    result = result + 1;
                } else if (lineInArray[0].equals("A")){
                    result = result + 2;
                }
            }
        }

        return result;
    }

    private static Integer solveDay2(String path) {
        List<String> input = Util.readFile(path);
        int result = 0;

        for (String line : input){
            String[] lineInArray = line.split(" ");

            if (lineInArray[1].equals("X")){
                result = result + 1;

                if (lineInArray[0].equals("A")){
                    result = result + 3;
                }

                if (lineInArray[0].equals("C")){
                    result = result + 6;
                }
            } else if (lineInArray[1].equals("Y")){
                result = result + 2;

                if (lineInArray[0].equals("A")){
                    result = result + 6;
                } else if (lineInArray[0].equals("B")){
                    result = result + 3;
                }
            } else if (lineInArray[1].equals("Z")){
                result = result + 3;

                if (lineInArray[0].equals("B")){
                    result = result + 6;
                } else if (lineInArray[0].equals("C")){
                    result = result + 3;
                }
            }
        }

        return result;
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
