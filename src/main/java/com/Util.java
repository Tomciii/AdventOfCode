package com;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Util {

    public static BufferedReader getBufferedReader(String path){
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream is = classloader.getResourceAsStream(path);
        return new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));
    }
}
