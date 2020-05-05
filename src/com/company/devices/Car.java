package com.company.devices;

public class Car {
    public String colour;
    public String plates;
    public Double value;
    final String producent;
    final String model;
    final int yearOfProduction;


    public Car(String producent, String model, int yearOfProduction) {
        this.producent = producent;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "producent='" + producent + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", colour='" + colour + '\'' +
                ", plates='" + plates + '\'' +
                ", value=" + value +
                '}';
    }

}


