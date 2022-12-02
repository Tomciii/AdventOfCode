package com;

import java.util.function.Function;

public class PuzzleResultPrinter {
    public static void printResult(Function<String, ?> function, String path){
        System.out.println(function.apply(path));
    }
}
