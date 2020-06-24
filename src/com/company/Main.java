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
        Human someone = new Human(4);
        me.name = "Filip";
        someone.name = "Bozydar";

        FarmAnimal rabbit = new FarmAnimal("rabbit");
        LPG car = new LPG("ford", "mustang", 1969, 1000.0);
        Pet dog = new Pet("dog");
        Phone lg = new Phone("LG", "V", 2012, 150.0, 6.0, "android");

        car.value = 120.0;
        me.phone = lg;
        me.pet = dog;
        me.farmAnimal = rabbit;

        LPG car1 = new LPG("fiat",
                "punto",
                1995,
                1500.0);
        Electric car2 = new Electric("nissan",
                "leaf",
                2020,
                50300.0);
        Diesel car3 = new Diesel("ford",
                "mustang",
                1969,
                2250.0);

        me.setCar(car1, 0);
        me.setCar(car2, 1);
        me.setCar(car3, 2);

        someone.setCar(car, 2);
        me.carsvalue();
        car1.sell(me, someone, 2000.0);
        someone.sortGarage();
        me.sortGarage();
        me.carsvalue();
        System.out.println(Arrays.asList(car1.owners));
        car1.wasOwner(me);
        car3.wasOwner(someone);
        car1.didSell(me, someone);
        car1.didSell(someone, me);
        car3.didSell(me, someone);
        System.out.println(car3.numberOfTransactions());

    }
}
