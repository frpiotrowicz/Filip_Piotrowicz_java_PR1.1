package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {

    public String plates;

    public Car(String producer,
               String model,
               int yearOfProduction,
               Double value) {

        super(producer, model, yearOfProduction, value);
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
            if (seller.hasCar(this) == true) {
                if (buyer.freeSpace() == true) {
                    for (int i = 0; i < buyer.getCars().length; i++) {
                        if (buyer.getCar(i) == null) {
                            buyer.setCar(this, i);
                            break;
                        }
                    }
                    for (int i = 0; i < seller.getCars().length; i++) {
                        if (seller.getCar(i) == this) {
                            seller.setCar(null, i);
                        }
                    }
                    seller.setCash(seller.getCash() + price);
                    buyer.setCash(buyer.getCash() - price);
                    System.out.println("allright you bought " + this + "for " + price);
                } else {
                    throw new Exception("buyer do not have place in his garrage");
                }
            } else {
                throw new Exception("this seller do not own this car");
            }
        } else {
            throw new Exception("buyer do not have enough money");
        }
    }

    public abstract void refuel();
}


