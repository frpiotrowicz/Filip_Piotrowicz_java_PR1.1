package com.company;

public class Phone {
    String producer;
    String model;
    Double screenSize;
    String osystem;

    public Phone(String producer, String model, Double screenSize, String osystem) {
        this.producer = producer;
        this.model = model;
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
}
