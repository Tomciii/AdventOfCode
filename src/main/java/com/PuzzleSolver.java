package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class PuzzleSolver {

    public static Function<String, Integer> solveDay3_2 = (path) -> {
        Integer result = 0;
        List<String> input = Util.readFile(path);
        for (int k = 0; k < input.size(); k = k + 3){
            char[] lineAsArray = input.get(k).toCharArray();
            char[] lineAsArray2 = input.get(k + 1).toCharArray();
            char[] lineAsArray3 = input.get(k + 2).toCharArray();

            OUTER: for (int i = 0; i < lineAsArray.length; i++){
                for (int j = 0; j < lineAsArray2.length; j++){
                    if (lineAsArray[i] == lineAsArray2[j]){
                        for (int m = 0; m < lineAsArray3.length; m++){
                            if (lineAsArray[i] == lineAsArray3[m]){
                                switch (lineAsArray[i]){
                                    case 'a':  result = result + 1;
                                        break OUTER;
                                    case 'b':  result = result + 2;
                                        break OUTER;
                                    case 'c':  result = result + 3;
                                        break OUTER;
                                    case 'd':  result = result + 4;
                                        break OUTER;
                                    case 'e':  result = result + 5;
                                        break OUTER;
                                    case 'f':  result = result + 6;
                                        break OUTER;
                                    case 'g':  result = result + 7;
                                        break OUTER;
                                    case 'h':  result = result + 8;
                                        break OUTER;
                                    case 'i':  result = result + 9;
                                        break OUTER;
                                    case 'j':  result = result + 10;
                                        break OUTER;
                                    case 'k':  result = result + 11;
                                        break OUTER;
                                    case 'l':  result = result + 12;
                                        break OUTER;
                                    case 'm':  result = result + 13;
                                        break OUTER;
                                    case 'n':  result = result + 14;
                                        break OUTER;
                                    case 'o':  result = result + 15;
                                        break OUTER;
                                    case 'p':  result = result + 16;
                                        break OUTER;
                                    case 'q':  result = result + 17;
                                        break OUTER;
                                    case 'r':  result = result + 18;
                                        break OUTER;
                                    case 's':  result = result + 19;
                                        break OUTER;
                                    case 't':  result = result + 20;
                                        break OUTER;
                                    case 'u':  result = result + 21;
                                        break OUTER;
                                    case 'v':  result = result + 22;
                                        break OUTER;
                                    case 'w':  result = result + 23;
                                        break OUTER;
                                    case 'x':  result = result + 24;
                                        break OUTER;
                                    case 'y':  result = result + 25;
                                        break OUTER;
                                    case 'z':  result = result + 26;
                                        break OUTER;
                                    case 'A':  result = result + 27;
                                        break OUTER;
                                    case 'B':  result = result + 28;
                                        break OUTER;
                                    case 'C':  result = result + 29;
                                        break OUTER;
                                    case 'D':  result = result + 30;
                                        break OUTER;
                                    case 'E':  result = result + 31;
                                        break OUTER;
                                    case 'F':  result = result + 32;
                                        break OUTER;
                                    case 'G':  result = result + 33;
                                        break OUTER;
                                    case 'H':  result = result + 34;
                                        break OUTER;
                                    case 'I':  result = result + 35;
                                        break OUTER;
                                    case 'J':  result = result + 36;
                                        break OUTER;
                                    case 'K':  result = result + 37;
                                        break OUTER;
                                    case 'L':  result = result + 38;
                                        break OUTER;
                                    case 'M':  result = result + 39;
                                        break OUTER;
                                    case 'N':  result = result + 40;
                                        break OUTER;
                                    case 'O':  result = result + 41;
                                        break OUTER;
                                    case 'P':  result = result + 42;
                                        break OUTER;
                                    case 'Q':  result = result + 43;
                                        break OUTER;
                                    case 'R':  result = result + 44;
                                        break OUTER;
                                    case 'S':  result = result + 45;
                                        break OUTER;
                                    case 'T':  result = result + 46;
                                        break OUTER;
                                    case 'U':  result = result + 47;
                                        break OUTER;
                                    case 'V':  result = result + 48;
                                        break OUTER;
                                    case 'W':  result = result + 49;
                                        break OUTER;
                                    case 'X':  result = result + 50;
                                        break OUTER;
                                    case 'Y':  result = result + 51;
                                        break OUTER;
                                    case 'Z':  result = result + 52;
                                        break OUTER;
                                }
                            }
                        }
                    }
                }
            }
        }

        return result;
    };

    public static Function<String, Integer> solveDay3 = (path) -> {
        Integer result = 0;
        List<String> input = Util.readFile(path);
        for (int k = 0; k < input.size(); k++ ){
            char[] lineAsArray = input.get(k).toCharArray();

        OUTER:   for (int i = 0; i < lineAsArray.length/2; i++){
             for (int j = lineAsArray.length/2; j < lineAsArray.length; j++){
                    if (lineAsArray[i] == lineAsArray[j]){
                        switch (lineAsArray[i]){
                            case 'a':  result = result + 1;
                                break OUTER;
                            case 'b':  result = result + 2;
                                break OUTER;
                            case 'c':  result = result + 3;
                                break OUTER;
                            case 'd':  result = result + 4;
                                break OUTER;
                            case 'e':  result = result + 5;
                                break OUTER;
                            case 'f':  result = result + 6;
                                break OUTER;
                            case 'g':  result = result + 7;
                                break OUTER;
                            case 'h':  result = result + 8;
                                break OUTER;
                            case 'i':  result = result + 9;
                                break OUTER;
                            case 'j':  result = result + 10;
                                break OUTER;
                            case 'k':  result = result + 11;
                                break OUTER;
                            case 'l':  result = result + 12;
                                break OUTER;
                            case 'm':  result = result + 13;
                                break OUTER;
                            case 'n':  result = result + 14;
                                break OUTER;
                            case 'o':  result = result + 15;
                                break OUTER;
                            case 'p':  result = result + 16;
                                break OUTER;
                            case 'q':  result = result + 17;
                                break OUTER;
                            case 'r':  result = result + 18;
                                break OUTER;
                            case 's':  result = result + 19;
                                break OUTER;
                            case 't':  result = result + 20;
                                break OUTER;
                            case 'u':  result = result + 21;
                                break OUTER;
                            case 'v':  result = result + 22;
                                break OUTER;
                            case 'w':  result = result + 23;
                                break OUTER;
                            case 'x':  result = result + 24;
                                break OUTER;
                            case 'y':  result = result + 25;
                                break OUTER;
                            case 'z':  result = result + 26;
                                break OUTER;
                            case 'A':  result = result + 27;
                                break OUTER;
                            case 'B':  result = result + 28;
                                break OUTER;
                            case 'C':  result = result + 29;
                                break OUTER;
                            case 'D':  result = result + 30;
                                break OUTER;
                            case 'E':  result = result + 31;
                                break OUTER;
                            case 'F':  result = result + 32;
                                break OUTER;
                            case 'G':  result = result + 33;
                                break OUTER;
                            case 'H':  result = result + 34;
                                break OUTER;
                            case 'I':  result = result + 35;
                                break OUTER;
                            case 'J':  result = result + 36;
                                break OUTER;
                            case 'K':  result = result + 37;
                                break OUTER;
                            case 'L':  result = result + 38;
                                break OUTER;
                            case 'M':  result = result + 39;
                                break OUTER;
                            case 'N':  result = result + 40;
                                break OUTER;
                            case 'O':  result = result + 41;
                                break OUTER;
                            case 'P':  result = result + 42;
                                break OUTER;
                            case 'Q':  result = result + 43;
                                break OUTER;
                            case 'R':  result = result + 44;
                                break OUTER;
                            case 'S':  result = result + 45;
                                break OUTER;
                            case 'T':  result = result + 46;
                                break OUTER;
                            case 'U':  result = result + 47;
                                break OUTER;
                            case 'V':  result = result + 48;
                                break OUTER;
                            case 'W':  result = result + 49;
                                break OUTER;
                            case 'X':  result = result + 50;
                                break OUTER;
                            case 'Y':  result = result + 51;
                                break OUTER;
                            case 'Z':  result = result + 52;
                                break OUTER;
                }
                        }
                }
            }
        }

        return result;
    };


    /**
     * Day 2_2: Rock Paper Scissors Puzzle
     */
    public static Function<String,Integer> solveDay2_2 = (path) -> {
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
    };

    /**
     * Day 2: Rock Paper Scissors Puzzle
     */
    public static Function<String, Integer> solveDay2 = (path) -> {
        List<String> input = Util.readFile(path);
        int result = 0;

        for (String line : input){
            String[] lineInArray = line.split(" ");

            if (lineInArray[1].equals("X")){
                result = result + 1;

                if (lineInArray[0].equals("A")){
                    result = result + 3;
                } else if (lineInArray[0].equals("C")){
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
    };

    /**
     * Day 1: Get the highest sum / total of highest 3 sums
     */
    public static Function<String, List<Integer>> solveDay1 = (path) -> {
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
    };
}