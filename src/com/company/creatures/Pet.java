package com.company.creatures;

public class Pet extends Animal implements Feedable {
    public Pet(String species1) {
        super(species1);
    }

    public void feed() {
        feed(0.2);
    }

}
