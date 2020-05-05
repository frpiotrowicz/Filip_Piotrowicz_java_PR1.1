package com.company;

public class Car {
    final String producent;
    final String model;
    final int yearOfProduction;
    String colour;
    String plates;
    Double value;


    public Car(String producent, String model, int yearOfProduction) {
        this.producent = producent;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    void showMyCar()
    {
        System.out.println(model + " "+ producent + " " + yearOfProduction + " " + plates + " " + colour);
    }
}


