package com.company.devices;

public class LPG extends Car {

    static final String fuelType = "LPG";

    public LPG(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("you have refueld your car with " + fuelType);
    }
}
