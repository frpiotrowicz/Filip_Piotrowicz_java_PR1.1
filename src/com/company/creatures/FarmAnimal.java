package com.company.creatures;

public class FarmAnimal extends Animal implements Edible, Feedable {
    public FarmAnimal(String species1) {
        super(species1);
    }

    static final Double defFoodWeight = 0.3;

    @Override
    public void beEaten() {
        this.weight = 0.0;
        System.out.println("animal have been eaten");
    }

    public void feed() {
        feed(defFoodWeight);
    }

}
