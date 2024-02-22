package com.training.day3;

import java.io.*;

public class SerializeTester {
    public static void main(String... args) throws IOException, ClassNotFoundException {
        Dog dog1 = new Dog("Tyson", "Lab");

        // Serializing
        FileOutputStream output = new FileOutputStream("file1.txt");
        ObjectOutputStream objOutput = new ObjectOutputStream(output);
        objOutput.writeObject(dog1);

        //Read the object: Deserializing

        FileInputStream input = new FileInputStream("file1.txt");
        ObjectInputStream objInput = new ObjectInputStream(input);
        Dog newObj = (Dog)objInput.readObject();

        System.out.println("Name: "+newObj.getName()+"Breed: "+newObj.getBreed());
    }
}
