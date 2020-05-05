package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Human me = new Human();
        me.lName = "Piotrowicz";

        Car car = new Car("ford", "mustang", 1969);
        Animal dog = new Animal("dog");
        Phone lg = new Phone("LG","V",2012, 6.0,"android" );

        car.value = 120.0;
        me.setCar(car);
        me.getCar().plates = "123456";
        me.getCar().colour = "black";

        System.out.println(me instanceof Animal);
        System.out.println(me instanceof Human);
    }
}
