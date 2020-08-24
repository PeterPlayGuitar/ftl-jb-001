package com.company;

import com.company.animals.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       //HelloWorld.run();
       //POJO.run();


       //Cat catVar = new Cat();
       //catVar.voice();
       //Cat barsick = new Cat();

       //com.company.L004.Cat catL004 = new com.company.L004.Cat();
       //catL004.voice();

       Cat cat = new Cat("Barsick", 20);
       System.out.println(cat.jumpHeight());
       cat.voice();

       Dog dog = new Dog();

       dog.goToStick(14);
       dog.whereTheDog();

       dog.goToStick(20);
       dog.whereTheDog();

       dog.goToStick(5);
       dog.whereTheDog();

       dog.voice();

       Dog homelessDog = Dog.ofHomeless(100);

       Duck duck = new Duck();
       duck.voice();

       duck.takeOff();
       duck.isTheBirdFlying();
       duck.showSpeed();

       duck.landing();
       duck.isTheBirdFlying();
       duck.showSpeed();

       List<Dog> homelessDogs = Arrays.asList( new Dog[] {
            Dog.ofHomeless(2),
            Dog.ofHomeless(3),
            Dog.ofHomeless(5),
       });

       System.out.println(homelessDogs.size());
       System.out.println(homelessDogs.get(0));
       System.out.println(homelessDogs.get(1));
       System.out.println(homelessDogs.get(2));

       List<Dog> dogs = Dog.randomArray();
       System.out.println(dogs.get(0));
       System.out.println(dogs.get(1));
       System.out.println(dogs.get(2));
    }
}
