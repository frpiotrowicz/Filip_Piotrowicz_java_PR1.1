package com.company;

public class Animal {
    String name;
    final String species;
    private Double weight;

    public Animal(String species1) {
        this.species = species1;
        if (species1 == "dog") {
            this.weight = 30.0;
        } else if (species1 == "cat") {
            this.weight = 5.0;
        } else if (species1 == "rabbit") {
            this.weight = 1.0;
        } else {
            System.out.println("w8, that's illegal");
        }
    }
}
