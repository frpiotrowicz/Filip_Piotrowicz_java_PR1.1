package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;

public class Human extends Animal implements Feedable {
    private static final Integer defGarageSize = 3;
    String name;
    String lName;
    public Animal farmAnimal;
    public Animal pet;
    public Car car;
    public Phone phone;
    public Car[] cars;

    private Double cash = 100.0;
    private Double salary = 100.0;
    private LocalDateTime date;
    private Double prevSalary;

    public Human() {
        super("Homo Sapiens");
        this.weight = 85.0;
        this.cars = new Car[defGarageSize];
    }

    public Human(Integer garageSize) {
        super("Homo Sapiens");
        this.weight = 85.0;
        this.cars = new Car[garageSize];
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
       this.car = car;
    }

    public Double getCash()
    {
        return cash;
    }


    public void setCash(Double cash)
    {
        this.cash = cash;
    }
    @Override
    public String toString() {
        return "Human{" +
                "fName='" + name + '\'' +
                ", lName='" + lName + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                ", chash=" + cash +
                '}';
    }

    @Override
    public void feed() {
        super.feed(foodWeight);
    }

    public void carsvalue() {
        Double sum = 0.0;
        for (int i = 0; i < this.cars.length; i++) {
            sum += this.cars[i].value;
        }
        System.out.println("value of your garage content is " + sum);
    }

}
