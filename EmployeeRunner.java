package com.xworkz.abstraction;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee e1 = new Developer(); Employee e2 = new Tester();
        e1.work();
        e1.getSalary();
        e2.work();
        e2.getSalary();
        System.out.println("---------------");
    }
}
