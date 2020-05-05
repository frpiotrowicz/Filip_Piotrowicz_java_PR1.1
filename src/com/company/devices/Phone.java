package com.company.devices;

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
    public void sell() {
        System.out.println("sold");
    }
}
