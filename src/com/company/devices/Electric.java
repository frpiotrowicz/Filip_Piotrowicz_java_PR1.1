package com.company.devices;

public class Electric extends Car {

    static final String fuelType = "Electricity";

    public Electric(String producer,
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
