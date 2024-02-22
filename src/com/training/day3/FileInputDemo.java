package com.training.day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputDemo {
    public static void main(String... args) throws IOException {
        InputStream input = new FileInputStream("input.txt");
        byte[] array = new byte[20];
        //input.read(array); // to read 20 bytes from the file input.txt
        int i= input.read();
        while(i!=-1) { // read file char by char
            //String data = new String(array);
            System.out.print((char)i);
            i = input.read();
        }
        input.close();// close input stream
    }
}
