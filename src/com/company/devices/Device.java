package com.company.devices;

import com.company.Human;
import com.company.Saleable;

public abstract class Device implements Saleable {
    final String producer;
    final String model;
    final int yearOfProduction;
    public String colour;
    public Double value;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }


    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
    public abstract void turnOn();


}
