package com.company.devices;

import com.company.Human;

public class Car extends Device {
    public String plates;

    public Car(String producer, String model, int yearOfProduction) {

        super(producer, model, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producent='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", colour='" + colour + '\'' +
                ", plates='" + plates + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("turn the engine on");

    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if(buyer.getCash() > price)
        {
            if (seller.getCar().equals(this))
            {
                buyer.setCar(this);
                seller.setCar(null);
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
            }
            else {
                System.out.println("this seller do not own this car");
            }
        }
        else {
            System.out.println("buyer do not have enough money");
        }
    }
}


