package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.fName = "Filip";
        me.lName = "Piotrowicz";

        Animal dog = new Animal("dosdg", "loki");
        System.out.println(dog.name);


    }
}
