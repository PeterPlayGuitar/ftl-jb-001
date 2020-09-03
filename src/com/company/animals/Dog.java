package com.company.animals;

import java.util.ArrayList;
import java.util.List;

public class Dog extends Animal {
    public Dog(String name, AnimalWeight weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);
    }

    public static List<Dog> randomArray() {
        List<Dog> dogs = new ArrayList<>();

        dogs.add(Dog.of("Sharick", new AnimalWeight(3, AnimalWeight.WeightType.GR)));
        dogs.add(Dog.of("Bubble", new AnimalWeight(1, AnimalWeight.WeightType.GR)));
        dogs.add(Dog.of("Tusick", new AnimalWeight(5, AnimalWeight.WeightType.GR)));

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

    public static Dog of(String name, AnimalWeight weight) {
        return new Dog(name, weight);
    }

    public static Dog ofHomeless(AnimalWeight weight) {
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
