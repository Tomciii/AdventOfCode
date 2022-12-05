package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class PuzzleSolver {

    public static Function<String, String> solveDay5 = (path) -> {
        List<String> input = Util.readFile(path);

        List<List<Character>> lists = new ArrayList<>();
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());
        lists.add(new ArrayList<>());

        fillStacks_day5(input, lists);
        removeInputLines_Day5(input, 10);

        for (String line : input){
            String[] inputStrings = line.split(" ");
            int[] inputs = {Integer.valueOf(inputStrings[1]),Integer.valueOf(inputStrings[3]),Integer.valueOf(inputStrings[5])};

           for (int i = 0; i < inputs[0]; i++){
              Character character = lists.get(inputs[1] - 1).get(0);
              lists.get(inputs[1]  - 1).remove(0);
              lists.get(inputs[2]  - 1).add(0, character);
           }
        }

        StringBuilder builder = new StringBuilder();

        for (List<Character> list : lists){
            builder.append(list.get(0));
        }

        return builder.toString();
    };

    private static void fillStacks_day5(List<String> input, List<List<Character>> list) {
        for (String line : input){
            if (line.charAt(1) != '1'){
                addItemToList_Day5(list.get(0), line, 1);
                addItemToList_Day5(list.get(1), line, 5);
                addItemToList_Day5(list.get(2), line, 9);
                addItemToList_Day5(list.get(3), line, 13);
                addItemToList_Day5(list.get(4), line, 17);
                addItemToList_Day5(list.get(5), line, 21);
                addItemToList_Day5(list.get(6), line, 25);
                addItemToList_Day5(list.get(7), line, 29);
                addItemToList_Day5(list.get(8), line, 33);
            } else {
                break;
            }
        }
    }

    private static void removeInputLines_Day5(List<String> input, int index) {
        for (int i = 0; i < index; i++){
            input.remove(0);
        }
    }

    private static void addItemToList_Day5(List<Character> list, String line, int index) {
        if (line.length() >= index){
            if (line.charAt(index) != ' '){
                list.add(line.charAt(index));
            }
        }
    }

    /**
     * Check if list contains other list
     */
    public static Function<String,Integer> solveDay4 = (path) -> {
      Integer result = 0;
      List<String> input = Util.readFile(path);

      for (String line : input){
          List<Integer> leftInput = convertLineToIntList(convertInputToIntArray(line,0));
          List<Integer> rightInput = convertLineToIntList(convertInputToIntArray(line,1));

          // leftInput.containsAll(rightInput) or vice versa for first puzzle


       LOOP:   for (int i = 0; i < leftInput.size(); i++){
                if (rightInput.contains(leftInput.get(i))){
                    result++;
                    break LOOP;
                }
          }
      }

      return result;
    };

    private static List<Integer> convertLineToIntList(int[] array){

        List<Integer> result = new ArrayList<>();
        for (int i = array[0]; i < array[1]; i++){
            result.add(i);
        }

        result.add(array[1]);

        return result;
    }

    private static int[] convertInputToIntArray(String line, int index) {
        String[] splitLine = line.split(",");
        return Arrays.stream(splitLine[index].split("-")).mapToInt(Integer::parseInt).toArray();
    }

    /**
     * Find the matching characters and return sum
     */
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

    /**
     * Find the matching characters and return sum
     */
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