package com.puzzleSolver;

import com.Util;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.function.Function;

public class PuzzleSolver2015 {

    public static Function<String, Integer> solveDay1 = (path) -> {
        int result = 0;
        List<String> input = Util.readFile(path);

        result = result + StringUtils.countOccurrencesOf(input.get(0),"(");
        result = result - StringUtils.countOccurrencesOf(input.get(0),")");

        return result;
    };


}
