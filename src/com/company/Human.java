package com.company;

import com.company.devices.Car;

import java.time.LocalDateTime;

public class Human extends Animal {
    String name;
    String lName;
    Animal pet;
    private Car car;

    private Double salary = 100.0;
    private LocalDateTime date;
    private Double prevSalary;

    public Human() {
        super("Homo Sapiens");
    }


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

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (car.value < this.salary)
        {
            this.car = car;
            System.out.println("you bought a car for " + car.value + "$$");
        }
        else if (car.value < this.salary*12)
        {
            this.car = car;
            System.out.println("you kinda bought a car for " + car.value + "$$, buuut it is stil not yours for like another year");
        }
        else {
            System.out.println("nope, find cheaper car or better job. Just remember, walking is healthy");
        }

    }

    @Override
    public String toString() {
        return "Human{" +
                "fName='" + name + '\'' +
                ", lName='" + lName + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}
