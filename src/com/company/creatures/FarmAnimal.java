package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species1) {
        super(species1);
    }

    @Override
    public void beEaten() {
        this.weight = 0.0;
        System.out.println("animal have been eaten");
    }
}
