package com.company;

public class Animal {
    String name;
    final String species;
    private Double weight;
    static final Double defDogweight = 30.0;
    static final Double defCatweight = 5.0;
    static final Double defRabbitweight = 1.0;


    public Animal(String species1, String name1) {
        this.name = name1;
        this.species = species1;
        if (species1 == "dog") {
            this.weight = defDogweight;
        } else if (species1 == "cat") {
            this.weight = defCatweight;
        } else if (species1 == "rabbit") {
            this.weight = defRabbitweight;
        } else {
            System.out.println("w8, that's illegal");
        }
    }
}
