package test;

import test.Animals.Cat;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();
        animal.makeNoises();
        animal.sleep();

        Animal simpleCat = new Cat(1,20, "Pushok");
        simpleCat.makeNoises();
        simpleCat.sleep();
        simpleCat.walk();

        Cat betterCat = new Cat(1, 20, "Pushok2");
        betterCat.lickPaws();

    }
}

