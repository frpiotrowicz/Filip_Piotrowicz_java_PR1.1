package com.company.creatures;

public abstract class Animal implements Saleable, Feedable {
    public final String species;
    public String name;
    protected Double weight;
    static final Double defFoodWeight = 0.3;
    static final Double defDogweight = 30.0;
    static final Double defCatweight = 5.0;
    static final Double defRabbitweight = 1.0;
    static final Double foodWeight = 1.0;

    public Animal(String species1) {
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


    public void feed(Double foodWeight) {
        if (weight <= 0) {
            System.out.println("too late, dead shall not eat");
        } else {
            weight += foodWeight;
            System.out.println("its about time, now im " + weight + "kg");

        }

    }

    public void feed() {
        feed(defFoodWeight);
    }

    public void takeForAWalk() {
        if (weight <= 0) {
            System.out.println("dead shall not walk");
        } else {
            weight--;
            System.out.println("now im " + weight + "kg... FEED MEEE!!");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (this instanceof Human)
        {
            throw new Exception("slavery doesnt work like this anymore");
        }
        else {
            if (buyer.getCash() > price)
            {
                if (seller.pet.equals(this))
                {
                    buyer.pet = this;
                    seller.pet = null;
                    seller.setCash(seller.getCash()+price);
                    buyer.setCash(buyer.getCash()-price);
                    System.out.println("allright you bought " + this + "for " + price);
                }
                else
                {
                    System.out.println("seller do not own this pet");
                }
            }
            else
            {
                System.out.println("buyer do not have enough money");
            }
            }
    }

}
