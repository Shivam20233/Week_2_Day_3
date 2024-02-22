package com.training.day3;

import java.io.Serializable;

public class Dog implements Serializable {
    private String name;
    private String breed;
    transient int legs; // when obj gets serialized then this will not serialized

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
