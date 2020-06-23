package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.YearOfProductionComparator;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Human extends Animal implements Feedable {
    private static final Integer defGarageSize = 3;
    String name;
    String lName;
    public Animal farmAnimal;
    public Animal pet;
    public Car car;
    public Phone phone;
    private Car[] garage;

    private Double cash = 3000.0;
    private Double salary = 100.0;
    private LocalDateTime date;
    private Double prevSalary;

    public Human() {
        super("Homo Sapiens");
        this.weight = 85.0;
        this.garage = new Car[defGarageSize];
    }

    public Human(Integer garageSize) {
        super("Homo Sapiens");
        this.weight = 85.0;
        this.garage = new Car[garageSize];
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

    public Car getCar(int i) {
        return garage[i];
    }

    public Car[] getCars() {
        return garage;
    }

    public void setCar(Car car, int i) {
        this.garage[i] = car;
    }

    public Double getCash() {
        return cash;
    }


    public void setCash(Double cash) {
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
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                sum += this.garage[i].value;
            }
        }
        System.out.println("value of your garage content is " + sum);
    }

    public void sortGarage() {
        Arrays.sort(this.getCars(), new YearOfProductionComparator());
    }

    public boolean hasCar(Car ownCar) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == ownCar) {
                return true;
            }
        }
        return false;
    }

    public boolean freeSpace() {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                return true;
            }
        }
        return false;
    }

}
