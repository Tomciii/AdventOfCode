package com.puzzleSolver;

import com.utils.Coordinate;
import com.utils.Node;
import com.utils.Util;

import java.util.*;
import java.util.function.Function;

public class PuzzleSolver2022 {


    public static Function<String, Integer> solveDay9 = (path) -> {
        List<String> input = Util.readFile(path);

        List<Coordinate> rope = new ArrayList<>();

        int[] positionH = {4, 0};
        int[] position1 = {4, 0};
        int[] position2 = {4, 0};
        int[] position3 = {4, 0};
        int[] position4 = {4, 0};
        int[] position5 = {4, 0};
        int[] position6 = {4, 0};
        int[] position7 = {4, 0};
        int[] position8 = {4, 0};
        int[] position9 = {4, 0};
        int[] position10 = {4, 0};

        Set<String> positions = new HashSet<>();
        positions.add(String.valueOf(position9[0]) + "," + String.valueOf(position9[1]));

        for (String line : input) {
            String[] coords = line.split(" ");
            int length = Integer.valueOf(coords[1]);
            String direction = coords[0];

            for (int i = 0; i < length; i++) {
                switch (direction) {
                    case "U":
                        positionH = new int[]{positionH[0] - 1, positionH[1]};
                        break;
                    case "R":
                        positionH = new int[]{positionH[0], positionH[1] + 1};
                        break;
                    case "L":
                        positionH = new int[]{positionH[0], positionH[1] - 1};
                        break;
                    case "D":
                        positionH = new int[]{positionH[0] + 1, positionH[1]};
                        break;
                }

                    position1 = movePositions_day9(positionH, position1, positions, length, direction, false, false);
                    position2 = movePositions_day9(position1, position2, positions, length, direction, false, false);
                    position3 = movePositions_day9(position2, position3, positions, length, direction, false, false);
                    position4 = movePositions_day9(position3, position4, positions, length, direction, false, false);
                    position5 = movePositions_day9(position4, position5, positions, length, direction, false, false);
                    position6 = movePositions_day9(position5, position6, positions, length, direction, false, false);
                    position7 = movePositions_day9(position6, position7, positions, length, direction, false, false);
                    position8 = movePositions_day9(position7, position8, positions, length, direction, false, false);
                    position9 = movePositions_day9(position8, position9, positions, length, direction, false, false);
                    position10 = movePositions_day9(position9, position10, positions, length, direction, true, true);
            }
        }

        return positions.size();
    };

    private static boolean isValidMove(Coordinate previous, Coordinate current){

        if (previous.getX() == current.getX() - 1 || previous.getX() == current.getX() || previous.getX() == current.getX() + 1){
            if (previous.getY() == current.getY()  -1 || previous.getY() == current.getY()  || previous.getY() == current.getY() + 1){
                return false;
            }
        }

        return true;
    }

    private static boolean isValidMove(int[]head, int[]tail){

        if (head[0] == tail[0] - 1 || head[0] == tail[0] || head[0] == tail[0] + 1){
            if (head[1] == tail[1] -1 || head[1] == tail[1] || head[1] == tail[1] + 1){
                return false;
            }
        }

        return true;
    }

    public static Function<String, Integer> solveDay8 = (path) -> {
        int[][] input = Util.readFileAs2DIntArray(path);
        Integer result = 0;


        OUTER:
        for (int i = 1; i < input.length - 1; i++) {
            INNER:
            for (int j = 1; j < input[i].length - 1; j++) {

                int totalView;
                int leftView = 0;
                int rightView = 0;
                int upView = 0;
                int downView = 0;

                VIEW:
                for (int k = j - 1; k >= 0; k--) {
                    leftView++;
                    if (input[i][k] >= input[i][j]) {
                        break VIEW;
                    }
                }

                VIEW:
                for (int k = j + 1; k < input[i].length; k++) {
                    rightView++;
                    if (input[i][k] >= input[i][j]) {
                        break VIEW;
                    }
                }

                VIEW:
                for (int k = i - 1; k >= 0; k--) {
                    upView++;
                    if (input[k][j] >= input[i][j]) {
                        break VIEW;
                    }
                }

                VIEW:
                for (int k = i + 1; k < input.length; k++) {
                    downView++;
                    if (input[k][j] >= input[i][j]) {
                        break VIEW;
                    }
                }

                totalView = leftView * upView * rightView * downView;
                if (result < totalView) {
                    result = totalView;
                }
            }
        }

        return result;
    };
    public static Function<String, Integer> solveDay7 = (path) -> {
        List<String> input = Util.readFile(path);

        Node currentNode = null;
        Node rootNode = null;

        for (String line : input) {
            String symbol = line.split(" ")[0];
            String command = line.split(" ")[1];

            if (command.equals("cd")) {
                String nodeName = line.split(" ")[2];

                if (nodeName.equals("..")) {
                    currentNode = currentNode.getParentNode();
                } else if (nodeName.equals("/")) {
                    Node node = new Node(currentNode, nodeName);
                    currentNode = node;
                    rootNode = currentNode;
                } else {
                    Node node = new Node(currentNode, nodeName);
                    currentNode = node;
                }
            }
            if (!symbol.equals("$") && !symbol.equals("dir")) {
                currentNode.setValue(currentNode.getValue() + Integer.valueOf(symbol));
            }
        }

        rootNode.addAllNodeValues();

        return rootNode.findSmallestNodeForDay7(new ArrayList<>()).getValue();
    };
    /**
     * Detect start of packet marker
     */
    public static Function<String, Integer> solveDay6 = (path) -> {
        List<String> input = Util.readFile(path);

        int distinctChars = 14;

        for (String line : input) {
            for (int i = 0; i < line.length(); i++) {
                String marker = line.substring(i, distinctChars + i);
                Set<Character> set = new HashSet<>();

                for (int j = 0; j < distinctChars; j++) {
                    set.add(marker.charAt(j));
                }

                if (set.size() == distinctChars) {
                    int result = i + distinctChars;
                    return result;
                }
            }
        }

        return 0;
    };
    /**
     * Moving Items from the stacks around
     */
    public static Function<String, String> solveDay5 = (path) -> {
        List<String> input = Util.readFile(path);

        List<List<Character>> lists = new ArrayList<>();
        int amountOfLists = 9;

        for (int i = 0; i < amountOfLists; i++) {
            lists.add(new ArrayList<>());
        }

        fillStacks_day5(input, lists, amountOfLists);
        removeHeaderFromInput(input, 10);

        for (String line : input) {
            String[] inputStrings = line.split(" ");
            int[] inputs = {Integer.valueOf(inputStrings[1]), Integer.valueOf(inputStrings[3]), Integer.valueOf(inputStrings[5])};

            if (inputs[0] == 1) {
                Character character = lists.get(inputs[1] - 1).get(0);
                lists.get(inputs[1] - 1).remove(0);
                lists.get(inputs[2] - 1).add(0, character);
            } else {
                List<Character> changingCharacters = new ArrayList<>();

                for (int i = 0; i < inputs[0]; i++) {
                    Character character = lists.get(inputs[1] - 1).get(0);
                    changingCharacters.add(character);
                    lists.get(inputs[1] - 1).remove(0);
                }

                Collections.reverse(changingCharacters);

                for (int i = 0; i < changingCharacters.size(); i++) {
                    lists.get(inputs[2] - 1).add(0, changingCharacters.get(i));
                }
            }
        }

        StringBuilder builder = new StringBuilder();

        for (List<Character> list : lists) {
            builder.append(list.get(0));
        }

        return builder.toString();
    };
    /**
     * Check if list contains other list
     */
    public static Function<String, Integer> solveDay4 = (path) -> {
        Integer result = 0;
        List<String> input = Util.readFile(path);

        for (String line : input) {
            List<Integer> leftInput = convertLineToIntList(convertInputToIntArray(line, 0));
            List<Integer> rightInput = convertLineToIntList(convertInputToIntArray(line, 1));
            // leftInput.containsAll(rightInput) or vice versa for first puzzle

            LOOP:
            for (int i = 0; i < leftInput.size(); i++) {
                if (rightInput.contains(leftInput.get(i))) {
                    result++;
                    break LOOP;
                }
            }
        }

        return result;
    };
    /**
     * Find the matching characters and return sum
     */
    public static Function<String, Integer> solveDay3_2 = (path) -> {
        Integer result = 0;
        List<String> input = Util.readFile(path);
        for (int k = 0; k < input.size(); k = k + 3) {
            char[] lineAsArray = input.get(k).toCharArray();
            char[] lineAsArray2 = input.get(k + 1).toCharArray();
            char[] lineAsArray3 = input.get(k + 2).toCharArray();

            OUTER:
            for (int i = 0; i < lineAsArray.length; i++) {
                for (int j = 0; j < lineAsArray2.length; j++) {
                    if (lineAsArray[i] == lineAsArray2[j]) {
                        for (int m = 0; m < lineAsArray3.length; m++) {
                            if (lineAsArray[i] == lineAsArray3[m]) {
                                switch (lineAsArray[i]) {
                                    case 'a':
                                        result = result + 1;
                                        break OUTER;
                                    case 'b':
                                        result = result + 2;
                                        break OUTER;
                                    case 'c':
                                        result = result + 3;
                                        break OUTER;
                                    case 'd':
                                        result = result + 4;
                                        break OUTER;
                                    case 'e':
                                        result = result + 5;
                                        break OUTER;
                                    case 'f':
                                        result = result + 6;
                                        break OUTER;
                                    case 'g':
                                        result = result + 7;
                                        break OUTER;
                                    case 'h':
                                        result = result + 8;
                                        break OUTER;
                                    case 'i':
                                        result = result + 9;
                                        break OUTER;
                                    case 'j':
                                        result = result + 10;
                                        break OUTER;
                                    case 'k':
                                        result = result + 11;
                                        break OUTER;
                                    case 'l':
                                        result = result + 12;
                                        break OUTER;
                                    case 'm':
                                        result = result + 13;
                                        break OUTER;
                                    case 'n':
                                        result = result + 14;
                                        break OUTER;
                                    case 'o':
                                        result = result + 15;
                                        break OUTER;
                                    case 'p':
                                        result = result + 16;
                                        break OUTER;
                                    case 'q':
                                        result = result + 17;
                                        break OUTER;
                                    case 'r':
                                        result = result + 18;
                                        break OUTER;
                                    case 's':
                                        result = result + 19;
                                        break OUTER;
                                    case 't':
                                        result = result + 20;
                                        break OUTER;
                                    case 'u':
                                        result = result + 21;
                                        break OUTER;
                                    case 'v':
                                        result = result + 22;
                                        break OUTER;
                                    case 'w':
                                        result = result + 23;
                                        break OUTER;
                                    case 'x':
                                        result = result + 24;
                                        break OUTER;
                                    case 'y':
                                        result = result + 25;
                                        break OUTER;
                                    case 'z':
                                        result = result + 26;
                                        break OUTER;
                                    case 'A':
                                        result = result + 27;
                                        break OUTER;
                                    case 'B':
                                        result = result + 28;
                                        break OUTER;
                                    case 'C':
                                        result = result + 29;
                                        break OUTER;
                                    case 'D':
                                        result = result + 30;
                                        break OUTER;
                                    case 'E':
                                        result = result + 31;
                                        break OUTER;
                                    case 'F':
                                        result = result + 32;
                                        break OUTER;
                                    case 'G':
                                        result = result + 33;
                                        break OUTER;
                                    case 'H':
                                        result = result + 34;
                                        break OUTER;
                                    case 'I':
                                        result = result + 35;
                                        break OUTER;
                                    case 'J':
                                        result = result + 36;
                                        break OUTER;
                                    case 'K':
                                        result = result + 37;
                                        break OUTER;
                                    case 'L':
                                        result = result + 38;
                                        break OUTER;
                                    case 'M':
                                        result = result + 39;
                                        break OUTER;
                                    case 'N':
                                        result = result + 40;
                                        break OUTER;
                                    case 'O':
                                        result = result + 41;
                                        break OUTER;
                                    case 'P':
                                        result = result + 42;
                                        break OUTER;
                                    case 'Q':
                                        result = result + 43;
                                        break OUTER;
                                    case 'R':
                                        result = result + 44;
                                        break OUTER;
                                    case 'S':
                                        result = result + 45;
                                        break OUTER;
                                    case 'T':
                                        result = result + 46;
                                        break OUTER;
                                    case 'U':
                                        result = result + 47;
                                        break OUTER;
                                    case 'V':
                                        result = result + 48;
                                        break OUTER;
                                    case 'W':
                                        result = result + 49;
                                        break OUTER;
                                    case 'X':
                                        result = result + 50;
                                        break OUTER;
                                    case 'Y':
                                        result = result + 51;
                                        break OUTER;
                                    case 'Z':
                                        result = result + 52;
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
        for (int k = 0; k < input.size(); k++) {
            char[] lineAsArray = input.get(k).toCharArray();

            OUTER:
            for (int i = 0; i < lineAsArray.length / 2; i++) {
                for (int j = lineAsArray.length / 2; j < lineAsArray.length; j++) {
                    if (lineAsArray[i] == lineAsArray[j]) {
                        switch (lineAsArray[i]) {
                            case 'a':
                                result = result + 1;
                                break OUTER;
                            case 'b':
                                result = result + 2;
                                break OUTER;
                            case 'c':
                                result = result + 3;
                                break OUTER;
                            case 'd':
                                result = result + 4;
                                break OUTER;
                            case 'e':
                                result = result + 5;
                                break OUTER;
                            case 'f':
                                result = result + 6;
                                break OUTER;
                            case 'g':
                                result = result + 7;
                                break OUTER;
                            case 'h':
                                result = result + 8;
                                break OUTER;
                            case 'i':
                                result = result + 9;
                                break OUTER;
                            case 'j':
                                result = result + 10;
                                break OUTER;
                            case 'k':
                                result = result + 11;
                                break OUTER;
                            case 'l':
                                result = result + 12;
                                break OUTER;
                            case 'm':
                                result = result + 13;
                                break OUTER;
                            case 'n':
                                result = result + 14;
                                break OUTER;
                            case 'o':
                                result = result + 15;
                                break OUTER;
                            case 'p':
                                result = result + 16;
                                break OUTER;
                            case 'q':
                                result = result + 17;
                                break OUTER;
                            case 'r':
                                result = result + 18;
                                break OUTER;
                            case 's':
                                result = result + 19;
                                break OUTER;
                            case 't':
                                result = result + 20;
                                break OUTER;
                            case 'u':
                                result = result + 21;
                                break OUTER;
                            case 'v':
                                result = result + 22;
                                break OUTER;
                            case 'w':
                                result = result + 23;
                                break OUTER;
                            case 'x':
                                result = result + 24;
                                break OUTER;
                            case 'y':
                                result = result + 25;
                                break OUTER;
                            case 'z':
                                result = result + 26;
                                break OUTER;
                            case 'A':
                                result = result + 27;
                                break OUTER;
                            case 'B':
                                result = result + 28;
                                break OUTER;
                            case 'C':
                                result = result + 29;
                                break OUTER;
                            case 'D':
                                result = result + 30;
                                break OUTER;
                            case 'E':
                                result = result + 31;
                                break OUTER;
                            case 'F':
                                result = result + 32;
                                break OUTER;
                            case 'G':
                                result = result + 33;
                                break OUTER;
                            case 'H':
                                result = result + 34;
                                break OUTER;
                            case 'I':
                                result = result + 35;
                                break OUTER;
                            case 'J':
                                result = result + 36;
                                break OUTER;
                            case 'K':
                                result = result + 37;
                                break OUTER;
                            case 'L':
                                result = result + 38;
                                break OUTER;
                            case 'M':
                                result = result + 39;
                                break OUTER;
                            case 'N':
                                result = result + 40;
                                break OUTER;
                            case 'O':
                                result = result + 41;
                                break OUTER;
                            case 'P':
                                result = result + 42;
                                break OUTER;
                            case 'Q':
                                result = result + 43;
                                break OUTER;
                            case 'R':
                                result = result + 44;
                                break OUTER;
                            case 'S':
                                result = result + 45;
                                break OUTER;
                            case 'T':
                                result = result + 46;
                                break OUTER;
                            case 'U':
                                result = result + 47;
                                break OUTER;
                            case 'V':
                                result = result + 48;
                                break OUTER;
                            case 'W':
                                result = result + 49;
                                break OUTER;
                            case 'X':
                                result = result + 50;
                                break OUTER;
                            case 'Y':
                                result = result + 51;
                                break OUTER;
                            case 'Z':
                                result = result + 52;
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
    public static Function<String, Integer> solveDay2_2 = (path) -> {
        List<String> input = Util.readFile(path);
        int result = 0;

        for (String line : input) {
            String[] lineInArray = line.split(" ");

            if (lineInArray[1].equals("X")) {
                if (lineInArray[0].equals("A")) {
                    result = result + 3;
                } else if (lineInArray[0].equals("B")) {
                    result = result + 1;
                } else if (lineInArray[0].equals("C")) {
                    result = result + 2;
                }
            } else if (lineInArray[1].equals("Y")) {
                result = result + 3;

                if (lineInArray[0].equals("A")) {
                    result = result + 1;
                } else if (lineInArray[0].equals("B")) {
                    result = result + 2;
                } else if (lineInArray[0].equals("C")) {
                    result = result + 3;
                }
            } else if (lineInArray[1].equals("Z")) {
                result = result + 6;

                if (lineInArray[0].equals("B")) {
                    result = result + 3;
                } else if (lineInArray[0].equals("C")) {
                    result = result + 1;
                } else if (lineInArray[0].equals("A")) {
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

        for (String line : input) {
            String[] lineInArray = line.split(" ");

            if (lineInArray[1].equals("X")) {
                result = result + 1;

                if (lineInArray[0].equals("A")) {
                    result = result + 3;
                } else if (lineInArray[0].equals("C")) {
                    result = result + 6;
                }
            } else if (lineInArray[1].equals("Y")) {
                result = result + 2;

                if (lineInArray[0].equals("A")) {
                    result = result + 6;
                } else if (lineInArray[0].equals("B")) {
                    result = result + 3;
                }
            } else if (lineInArray[1].equals("Z")) {
                result = result + 3;

                if (lineInArray[0].equals("B")) {
                    result = result + 6;
                } else if (lineInArray[0].equals("C")) {
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
        int biggestThreeSum = sorted.get(sorted.size() - 1) + sorted.get(sorted.size() - 2) + sorted.get(sorted.size() - 3);

        result.add(biggestSum);
        result.add(biggestThreeSum);

        return result;
    };

    public static int[] movePositions_day9(int[] positionH, int[] positionT, Set<String> positions, int length, String direction, boolean doAdd, boolean doLog) {

        if (!isValidMove(positionH, positionT)){
            return positionT;
        }

        if (positionH[0] == positionT[0] - 2){
            positionT[0]--;

            if (positionH[1] == positionT[1] - 1){
                positionT[1]--;
            }

            if (positionH[1] == positionT[1] + 1){
                positionT[1]++;
            }
        } else if (positionH[0] == positionT[0] + 2){
            positionT[0]++;

            if (positionH[1] == positionT[1] - 1){
                positionT[1]--;
            }

            if (positionH[1] == positionT[1] + 1){
                positionT[1]++;
            }
        } else if (positionH[1] == positionT[1] - 2){
            positionT[1]--;

            if (positionH[0] == positionT[0] - 1){
                positionT[0]--;
            }

            if (positionH[0] == positionT[0] + 1){
                positionT[0]++;
            }
        } else if (positionH[1] == positionT[1] + 2){
            positionT[1]++;

            if (positionH[0] == positionT[0] - 1){
                positionT[0]--;
            }

            if (positionH[0] == positionT[0] + 1){
                positionT[0]++;
            }
        }

        if (doLog)
            System.out.println("direction " + direction + " H: [" + positionH[0] + " " + positionH[1] + "] ,T: [" + positionT[0] + " " + positionT[1]+"]");

        if (doAdd){
            positions.add(String.valueOf(positionT[0]) + "," + String.valueOf(positionT[1]));
        }

        return positionT;
    }

    private static void fillStacks_day5(List<String> input, List<List<Character>> list, int amountOfLists) {
        for (String line : input) {
            if (line.charAt(1) != '1') {
                for (int i = 0; i < amountOfLists; i++) {
                    addItemToList_Day5(list.get(i), line, 1 + i * 4);
                }
            } else {
                break;
            }
        }
    }

    private static void removeHeaderFromInput(List<String> input, int index) {
        for (int i = 0; i < index; i++) {
            input.remove(0);
        }
    }

    private static void addItemToList_Day5(List<Character> list, String line, int index) {
        if (line.length() >= index) {
            if (line.charAt(index) != ' ') {
                list.add(line.charAt(index));
            }
        }
    }

    private static List<Integer> convertLineToIntList(int[] array) {

        List<Integer> result = new ArrayList<>();
        for (int i = array[0]; i < array[1]; i++) {
            result.add(i);
        }

        result.add(array[1]);

        return result;
    }

    private static int[] convertInputToIntArray(String line, int index) {
        String[] splitLine = line.split(",");
        return Arrays.stream(splitLine[index].split("-")).mapToInt(Integer::parseInt).toArray();
    }
}