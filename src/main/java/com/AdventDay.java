package com;

import java.io.BufferedReader;
import java.util.function.Consumer;

public class AdventDay {

    public static void doWork(String path, Consumer<String> consumer) {
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
