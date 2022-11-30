package com;

import java.io.*;
import java.util.function.Consumer;

public class Main {

    private static String folder = "C:\\Users\\Tomcii\\Desktop\\";

    public static void main(String[] args) {

        doWork("Hello.txt", System.out::println);


    }

    private static void doWork(String path, Consumer<String> consumer) {
        try{
            File file = new File(folder + path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

            String line;

                while ((line = bufferedReader.readLine()) != null){
                    consumer.accept(line);
                }

            bufferedReader.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
