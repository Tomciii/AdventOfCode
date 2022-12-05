package com;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Util {

    private static BufferedReader getBufferedReader(String path){
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(path);
        return new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
    }

    public static List<String> readFile(String path) {
        try (BufferedReader bufferedReader = Util.getBufferedReader(path)) {
            String line;

            List<String> result = new ArrayList<>();
            while ((line = bufferedReader.readLine()) != null) {
                result.add(line);
            }

            return result;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        return null;
    }
}