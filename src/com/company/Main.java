package com.company;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Human me = new Human();
        me.fName = "Filip";
        me.lName = "Piotrowicz";
/*
        me.car = new Car("ford", "mustang", 1969);
        me.car.plates = "123456";
        me.car.colour = "black";
        me.car.showMyCar();
*/
        me.getSalary();
        //tu sprawdzam tylko czy dziala
        me.setSalary(120.0);
        SECONDS.sleep(10);
        me.getSalary();
        me.setSalary(-120.0);
        SECONDS.sleep(10);
        me.getSalary();



    }
}
