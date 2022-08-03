package test.Animals;

import test.Animal;

public class Cat extends Animal {
    int age;
    private int weight;
    private String name;

    public Cat(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;

        System.out.println("Hi, I am Cat's constructor!");
    }

    @Override
    public void makeNoises() {
        System.out.println("Miyau!");
    }

    @Override
    public void walk() {
        if (weight < 20) {
            System.out.println("I can walk!");
        } else System.out.println("I can't walk :,(");
    }

    public void lickPaws() {
        System.out.println("Licking paws, do not disturb!");
    }

}
