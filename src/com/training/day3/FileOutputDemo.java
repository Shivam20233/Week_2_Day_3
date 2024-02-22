package com.training.day3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class FileOutputDemo {
    public static void main(String... args) throws IOException {
        OutputStream output = new FileOutputStream("output.txt");
        String data = " Text written";
        output.write(data.getBytes());
        output.close();
    }
}
