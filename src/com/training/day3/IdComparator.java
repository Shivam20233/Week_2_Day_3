package com.training.day3;

import java.util.Comparator;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudId() - o2.getStudId();
    }
}
