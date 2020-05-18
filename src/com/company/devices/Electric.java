package com.company.devices;

public class Electric extends Car {

    static final String fuelType = "Electricity";

    public Electric(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("you have refueld your car with " + fuelType);
    }
}
