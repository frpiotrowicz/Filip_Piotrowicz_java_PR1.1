package com.company.devices;

import com.company.creatures.Saleable;

public abstract class Device implements Saleable, Comparable<Device> {
    final String producer;
    final String model;
    final int yearOfProduction;
    public String colour;
    public Double value;

    public Device(String producer,
                  String model,
                  int yearOfProduction,
                  Double value) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }


    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    public abstract void turnOn();


    @Override
    public int compareTo(Device o) {
        return this.yearOfProduction - o.yearOfProduction;
    }
}
