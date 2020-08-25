package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, Integer weight) {
        super(name, weight,MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Sharick", 3));
        dogs.add(Dog.of("Bubble", 1));
        dogs.add(Dog.of("Tusick", 5));

        return dogs;
    }

    /**
     * Идём до палки. Чтобы дойти расщитываем разницу и прибывляем к тек. положению пса
     *
     * @param stickPosition - позиция палки
     */
    public void goToStick(Integer stickPosition) {
        Integer delta = stickPosition - currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog() {
        System.out.println(currentPosition);
    }

    public static Dog of(String name, Integer weight) {
        return new Dog(name, weight);
    }

    public static Dog ofHomeless(Integer weight) {
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    @Override
    public void voice() {
        System.out.println("Woof woof");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition=" + currentPosition +
                '}';
    }
}
