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

        Car car = new Car("ford", "mustang", 1969);
        Car car1 = new Car("ford", "mustang", 1969);

        System.out.println(car == car1);
        System.out.println(car.equals(car1));

        Car x = car;
        System.out.println(car.equals(x));
        System.out.println(car == x);
        System.out.println(new Car("ford", "mustang", 1969).equals( new Car("ford", "mustang", 1969)));
 /*
        car.value = 120.0;
        me.setCar(car);
        me.getCar().plates = "123456";
        me.getCar().colour = "black";
        me.getCar().showMyCar();
*/
        System.out.println(car);
        System.out.println(car1);

    }
}
