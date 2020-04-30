package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.fName = "Filip";
        me.lName = "Piotrowicz";

        
        me.pet =  new Animal("rabbit", "krol");
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();







    }
}
