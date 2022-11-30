package com;

import java.io.*;
import java.util.function.Consumer;

public class Main {


    public static void main(String[] args) {

        doWork("file1.txt", System.out::println);
    }

    private static void doWork(String path, Consumer<String> consumer) {
        try (BufferedReader bufferedReader = Util.getBufferedReader(path)) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                consumer.accept(line);
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
