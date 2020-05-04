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
        System.out.println("and now it is " + salary + "\n");
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary>0)
        {
            System.out.println("new salary was set and send to system database." + "\n"
                    + "pls make sure to give your employee new papers to sign." + "\n"
                    + "you can run but you cant hide, US already know, so pay your tax" + "\n");
            this.salary = salary;
        }
        else
        {
            System.out.println("your employee will not pay you for his work. salary must be above 0$$." + "\n");
        }
    }
}
