package com.company.devices;

public class Diesel extends Car {
    static final String fuelType = "Diesel";

    public Diesel(String producer,
                  String model,
                  int yearOfProduction,
                  Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("you have refueld your car with " + fuelType);
    }

}
