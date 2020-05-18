package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.LPG;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human();
        Human someone = new Human();

        FarmAnimal rabbit = new FarmAnimal("rabbit");
        LPG car = new LPG("ford", "mustang", 1969);
        Pet dog = new Pet("dog");
        Phone lg = new Phone("LG", "V", 2012, 6.0, "android");

        car.value = 120.0;
        me.setCar(car);
        me.phone = lg;
        me.pet = dog;
        me.farmAnimal = rabbit;

        me.car.refuel();
    }
}
