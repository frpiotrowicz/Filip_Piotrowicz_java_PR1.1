package com.company;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        Human someone = new Human();


        Car car = new Car("ford", "mustang", 1969);
        Animal dog = new Animal("dog");
        Phone lg = new Phone("LG","V",2012, 6.0,"android" );

        car.value = 120.0;
        me.setCar(car);
        me.phone = lg;


        someone.setCash(140.0);
        car.sell(me, someone, 120.0);

        System.out.println(me.getCar());
        System.out.println(someone.getCar());
        System.out.println(me.getCash());
        System.out.println(someone.getCash());




    }
}
