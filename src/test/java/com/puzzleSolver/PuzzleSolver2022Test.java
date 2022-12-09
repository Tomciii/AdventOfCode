package com.puzzleSolver;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;

public class PuzzleSolver2022Test {

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle1(String value){
        int[] positionH = new int[]{-1,-1};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle2(String value){
        int[] positionH = new int[]{-1,0};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle3(String value){
        int[] positionH = new int[]{-1,1};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle4(String value){
        int[] positionH = new int[]{-1,0};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle5(String value){
        int[] positionH = new int[]{0,0};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle6(String value){
        int[] positionH = new int[]{0,1};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle7(String value){
        int[] positionH = new int[]{1,-1};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle8(String value){
        int[] positionH = new int[]{1,0};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @ParameterizedTest
    @ValueSource(strings = {"U","L","D","R"})
    public void day9_testMovePosition_middle9(String value){
        int[] positionH = new int[]{1, 1};
        int[] positionT = new int[]{0,0};
        String direction = value;
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_U_1(){
        int[] positionH = new int[]{-2,-1};
        int[] positionT = new int[]{0,0};
        String direction = "U";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{-1,-1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_U_2(){
        int[] positionH = new int[]{-2,0};
        int[] positionT = new int[]{0,0};
        String direction = "U";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{-1,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_U_3(){
        int[] positionH = new int[]{-2,1};
        int[] positionT = new int[]{0,0};
        String direction = "U";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{-1,1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_D_1(){
        int[] positionH = new int[]{2,-1};
        int[] positionT = new int[]{0,0};
        String direction = "D";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{1,-1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_D_2(){
        int[] positionH = new int[]{2,0};
        int[] positionT = new int[]{0,0};
        String direction = "D";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{1,0};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_D_3(){
        int[] positionH = new int[]{2,1};
        int[] positionT = new int[]{0,0};
        String direction = "D";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{1,1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_L_1(){
        int[] positionH = new int[]{-1,-2};
        int[] positionT = new int[]{0,0};
        String direction = "L";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{-1,-1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_L_2(){
        int[] positionH = new int[]{0,-2};
        int[] positionT = new int[]{0,0};
        String direction = "L";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,-1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_L_3(){
        int[] positionH = new int[]{1,-2};
        int[] positionT = new int[]{0,0};
        String direction = "L";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{1,-1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_R_3(){
        int[] positionH = new int[]{-1,2};
        int[] positionT = new int[]{0,0};
        String direction = "R";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{-1,1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_R_2(){
        int[] positionH = new int[]{0,2};
        int[] positionT = new int[]{0,0};
        String direction = "R";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{0,1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }

    @Test
    public void day9_testMovePosition_R_1(){
        int[] positionH = new int[]{1,2};
        int[] positionT = new int[]{0,0};
        String direction = "R";
        int[] actual = PuzzleSolver2022.movePositions_day9(positionH,positionT,new HashSet<>(),1,direction,true,true);
        int[]expected = new int[]{1,1};
        Assertions.assertEquals(actual[0],expected[0]);
        Assertions.assertEquals(actual[1],expected[1]);
    }
}