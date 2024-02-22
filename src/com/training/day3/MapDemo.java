package com.training.day3;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String... args) {
        Map<Integer, String> myMap = new HashMap<>(10, 0.75f); // load factor -> when 75% full then resizing happen
        
        myMap.put(1, "One");
        myMap.put(2, "Two");
        myMap.put(3, "Three");
        myMap.put(4, "Four");

        //updating map values
        myMap.put(2, "Second"); // override existing entry
        System.out.println(myMap);

        //removing element
        myMap.remove(1);
        System.out.println(myMap);



        for(Map.Entry<Integer, String> entry: myMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" : "+value);
        }
    }
}
