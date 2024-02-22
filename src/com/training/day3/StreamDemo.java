package com.training.day3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.System.out;

public class StreamDemo {
    public static void main(String... args) {
        List<Integer> numberList = Arrays.asList(12,11,21,14,16,19);

        numberList.stream().filter(n->n%2==0).map(x->x*x).sorted()
                           .forEach(t-> System.out.println(t)); // forEach(out::println) -> can use this obj::method_name
        List<Integer>newList = numberList.stream().filter(n->n%2==0).map(x->x*x).sorted()
                           .collect(Collectors.toList()); // saving into another list

        out.println(numberList);

        int maxValue = numberList.stream().max(Integer::compare).get();
        out.println("Max Value: "+maxValue);

        Employee emp1 = new Employee("101", "abc",1200);
        Employee emp2 = new Employee("102", "def",1300);
        Employee emp3 = new Employee("103", "ghi",1000);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        Employee employeeWithMaxSalary = employees.stream()
                .max(Comparator.comparingDouble(Employee::getEmpSalary)).orElse(null);
        out.println(employeeWithMaxSalary);

        Employee employeeWithSecondMaxSal = employees.stream()
                      .sorted(Comparator.comparingDouble(Employee::getEmpSalary).reversed())
                      .skip(1).findFirst().orElse(null);
        out.println(employeeWithSecondMaxSal);


        Map<String, Integer> empMap = new HashMap<>();
        empMap.put("Anil",1000);
        empMap.put("James",1400);
        empMap.put("Bond",1800);

        /*Optional<Map.Entry<String, Integer>> highestSalaryEntry = empMap.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        highestSalaryEntry.ifPresent(entry -> System.out.println("Employee with highest salary: " +
                entry.getKey() + " (Salary: " + entry.getValue() + ")"));
*/
        Map.Entry<String, Integer> finalResult =empMap.entrySet()
                .stream()
                .sorted(Comparator.comparing(entry -> -entry.getValue()))
                .collect(Collectors.toList()).get(0);

        out.println(finalResult);

        // FlatMap

        List<Integer> numberList1 = Arrays.asList(12,11,21);

        List<Integer> numberList2 = Arrays.asList(14,16,19);

        List<Integer> numberList3 = Arrays.asList(56,76,23);

        List<List<Integer>> listOfLists = Arrays.asList(numberList1, numberList2, numberList3);
        out.println(listOfLists);

        List<Integer> listOfAllInt = listOfLists.stream()
                                   .flatMap(x->x.stream())
                                   .collect(Collectors.toList());

        out.println(listOfAllInt);


        // NumericStream = Int/Double and many more
        IntStream.rangeClosed(0, 5).forEach(out::println); // exclude last number
        int[] intArray = IntStream.of(1,5,6,7).toArray();


        //UUID
        UUID uniqueId = UUID.randomUUID();
        out.println("Unique ID: "+uniqueId);

    }
}

//Intermediate Operations
//oper1: filter the even numbers
//oper2: square the even numbers
//oper3: sort the number

// forEach() terminate operation

//Ques:: create an Employee class with empid, empName, salary
// create collection of employees and display details of emp with max salary
// using stream api