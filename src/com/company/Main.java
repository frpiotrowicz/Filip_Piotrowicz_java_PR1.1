package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

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

        Application app1 = new Application("dejsbug", 1.1, 500.0);
        Application app2 = new Application("bkejp", 3.1, 0.0);
        Application app3 = new Application("ctmuzik", 15.4, 25.0);
        Application app4 = new Application("aetfix", 5.1, 0.0);
        Application app5 = new Application("apka", 1.0, 12.0);

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

        lg.installNewApp(me, app1);
        lg.installNewApp(me, app2);
        lg.installNewApp(me, app3);
        lg.installNewApp(me, app4);
        lg.isItInstalled(app2);
        lg.isItInstalled(app5);
        lg.isItInstalled("appka");
        lg.isItInstalled("skejp");
        lg.freeApps();
        System.out.println("value of your apps is " + lg.appsValue());
        lg.sortAlphabetically();
        lg.appsByValue();


    }
}
