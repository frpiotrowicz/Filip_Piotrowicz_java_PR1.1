package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Diesel;
import com.company.devices.Electric;
import com.company.devices.LPG;
import com.company.devices.Phone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        Human someone = new Human();

        FarmAnimal rabbit = new FarmAnimal("rabbit");
        LPG car = new LPG("ford", "mustang", 1969, 1000.0);
        Pet dog = new Pet("dog");
        Phone lg = new Phone("LG", "V", 2012, 150.0, 6.0, "android");

        car.value = 120.0;
        me.setCar(car);
        me.phone = lg;
        me.pet = dog;
        me.farmAnimal = rabbit;
        me.car.refuel();

        me.cars[0] = new LPG("fiat",
                "punto",
                1995,
                1500.0);
        me.cars[1] = new Electric("nissan",
                "leaf",
                2020,
                50300.0);
        me.cars[2] = new Diesel("ford",
                "mustang",
                1969,
                2250.0);
        System.out.println(Arrays.toString(me.cars));
        me.carsvalue();
        Arrays.sort(me.cars);
        System.out.println(Arrays.toString(me.cars));
    }
}
