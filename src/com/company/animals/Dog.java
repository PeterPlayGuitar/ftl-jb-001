package com.company.animals;

public class Dog extends Animal {
    public Dog(String name, Integer weight) {
        super(name, weight);
    }

    public Dog() {
    }

    /**
     * Идём до палки. Чтобы дойти расщитываем разницу и прибывляем к тек. положению пса
     * @param stickPosition - позиция палки
     * */
    public void goToStick(Integer stickPosition){
        Integer delta = stickPosition - currentPosition;
        this.runForward(delta);
    }

    public void whereTheDog(){
        System.out.println(currentPosition);
    }

    public static Dog of(String name, Integer weight){
        return new Dog(name, weight);
    }

    public static Dog ofHomeless(Integer weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }
}
