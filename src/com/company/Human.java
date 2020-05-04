package com.company;

import java.time.LocalDateTime;
import java.util.Date;

public class Human {
    String fName;
    String lName;
    Animal pet;
    Car car;

    private Double salary = 100.0;
    private LocalDateTime date;
    private Double prevSalary;


    public Double getSalary() {
        System.out.println("last opened " + date);
        System.out.println("salary at that time was equal to " + prevSalary);
        prevSalary = salary;
        date = LocalDateTime.now();
        System.out.println("and now it is " + salary);
        System.out.println();
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
