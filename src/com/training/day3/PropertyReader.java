package com.training.day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class PropertyReader {
    public static void main(String... args) throws IOException {
        FileReader reader = new FileReader("db.properties");
        Properties props = new Properties();

        props.load(reader);

        System.out.println(props.getProperty("username"));

        Locale loc = Locale.ENGLISH;
        System.out.println(loc);

        Locale loc2 = Locale.getDefault();// accessing code from en_IN i.e india
        System.out.println(loc2);
    }
}
