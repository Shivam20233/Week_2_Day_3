package com.training.day3;

import java.util.*;

public class CollectionDemo {
    public static void main(String... args) {
        Set<String> names = new HashSet<>(); // Interface ref var hold hashset class obj
        names.add("David"); // .add("new String("str")) -> can use this one also
        names.add("Peter");
        names.add("34");

        Set<Integer> numbers = new HashSet<>();
        numbers.add(23); // autoboxing happen

        /*Iterator<String> it = names.iterator();

        while(it.hasNext()) {
            String temp = it.next();
            System.out.println(it.next());
        }*/

        /*for(String name:names) {
            System.out.println(name);
        }*/

        //Set<Student> stuSet = new HashSet<>();
//        Set<Student> stuSet = new TreeSet<>();
        //Set<Student> stuSet = new TreeSet<>(new IdComparator());
        /*Set<Student> stuSet = new TreeSet<>(new NameComparator());
        stuSet.add(new Student(101,"Rohan", 21, 'A'));
        stuSet.add(new Student(102,"Anu", 22, 'B'));
        stuSet.add(new Student(103,"Basanth", 21, 'A'));
        stuSet.add(new Student(101,"Rohan", 21, 'A')); // unique hash int value when create using new, if hash value same -> then only hashset will compare values

        for(Student stud: stuSet) {
            System.out.println(stud.getStudId()+" : "+stud.getStudName());
        }*/
// LINKED HASH SET DEMO
        /*Set<String> names2 = new LinkedHashSet<>(); // Interface ref var hold hashset class obj
        names2.add("David"); // .add("new String("str")) -> can use this one also
        names2.add("Peter");
        names2.add("34");

        for(String name:names2) {
            System.out.println(name);
        }*/

        // LIST
        /*List<Integer> numberList = new ArrayList<>(); // 1st way to create list
        numberList.add(23);
        numberList.add(24);
        numberList.add(21);*/

        List<Integer> numberList = Arrays.asList(21, 24, 18);// 2nd way to create list
        List<Student> studList = new ArrayList<>();
        studList.add(new Student(101,"Rohan", 21, 'A'));
        studList.add(new Student(102,"Anu", 22, 'B'));
        studList.add(new Student(103,"Basanth", 21, 'A'));
        studList.add(new Student(101,"Rohan", 21, 'A'));
        Collections.sort(numberList); // to sort Array
        Collections.sort(studList, new IdComparator());
        for(Student stud : studList) { // autoboxing
            System.out.println(stud);
        }
        //numberList.get(3); // get element at index 3



    }

}
