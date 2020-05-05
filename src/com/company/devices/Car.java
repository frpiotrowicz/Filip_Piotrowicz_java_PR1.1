package com.company.devices;

public class Car extends Device {
    public String plates;

    public Car(String producer, String model, int yearOfProduction) {

        super(producer, model, yearOfProduction);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producent='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", colour='" + colour + '\'' +
                ", plates='" + plates + '\'' +
                ", value=" + value +
                '}';
    }

}


