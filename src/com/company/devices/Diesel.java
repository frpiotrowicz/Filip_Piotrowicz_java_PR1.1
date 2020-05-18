package com.company.devices;

public class Diesel extends Car {
    static final String fuelType = "Diesel";

    public Diesel(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("you have refueld your car with " + fuelType);
    }

}
