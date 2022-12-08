package com.puzzleSolver;

import com.utils.Util;

import java.util.List;
import java.util.function.Function;

public class PuzzleSolver2021 {

    public static Function<String, Integer> solveDay1 = (path) -> {
      Integer result = 0;

        List<String> input = Util.readFile(path);

        for (int i = 1; i < input.size(); i++){
            if (Integer.valueOf(input.get(i)) > Integer.valueOf(input.get(i - 1))){
                result++;
            }
        }

      return result;
    };
}
