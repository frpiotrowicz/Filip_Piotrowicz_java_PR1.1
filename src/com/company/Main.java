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
        Animal dog = new Animal("dog", "loki");
        Phone lg = new Phone("LG","V",6.0,"android" );

        car.value = 120.0;
        me.setCar(car);
        me.getCar().plates = "123456";
        me.getCar().colour = "black";
        System.out.println(car);
        System.out.println();
        System.out.println(me);
        System.out.println();
        System.out.println(dog);
        System.out.println();
        System.out.println(lg);

    }
}
