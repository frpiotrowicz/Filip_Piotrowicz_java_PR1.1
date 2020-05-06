package com.company.devices;

import com.company.Human;

public class Phone extends Device {
    Double screenSize;
    String osystem;

    public Phone(String producer, String model, int yearOfProduction, Double screenSize, String osystem) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
        this.osystem = osystem;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", osystem='" + osystem + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("turn the power on");

    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (buyer.getCash() > price)
        {
            if (seller.phone.equals(this))
            {
                buyer.phone = this;
                seller.phone = null;
                seller.setCash(seller.getCash()+price);
                buyer.setCash(buyer.getCash()-price);
                System.out.println("allright you bought " + this + "for " + price);
            }
            else
            {
                System.out.println("seller do not own this phone");
            }
        }
        else
        {
            System.out.println("buyer do not have enough money");
        }

    }
}
