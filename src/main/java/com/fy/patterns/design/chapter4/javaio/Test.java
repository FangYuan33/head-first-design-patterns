package com.fy.patterns.design.chapter4.javaio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {

        try (InputStream in =
                     new LowerCaseInputStream(
                             new BufferedInputStream(
                                     Files.newInputStream(Paths.get("/Users/GitHub/head-first-design-patterns/src/main/resources/javaio.txt"))))) {

            int c;
            while ((c = in.read()) >= 0) {
                System.out.printf(String.valueOf((char) c));
            }
        }
    }
}
