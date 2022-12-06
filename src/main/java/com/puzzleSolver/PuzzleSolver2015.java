package com.puzzleSolver;

import com.Util;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.function.Function;

public class PuzzleSolver2015 {

    public static Function<String, Integer> solveDay1 = (path) -> {
        int result = 0;
        List<String> input = Util.readFile(path);

        for (int i = 0; i < input.get(0).length(); i++){
            if (input.get(0).charAt(i) == '('){
                result = result + 1;
            } else {
                result = result - 1;
                if (result == -1){
                    return i + 1;
                }
            }
        }

        return result;
    };


}
