package com.company;

import com.company.L019.StringExample;
import com.company.animals.*;
import com.company.L013.*;

import java.security.DigestInputStream;
import java.util.*;

public class main {

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

        List<Dog> dogs = Dog.randomArray();
        for(int i = 0; i < dogs.size(); i++){
            System.out.println(dogs.get(i));
        }

       List<Dog> homelessDogs = Arrays.asList( new Dog[] {
            Dog.ofHomeless(2),
            Dog.ofHomeless(3),
            Dog.ofHomeless(5),
       });

       System.out.println(homelessDogs.size());
       for(Dog dogItem : homelessDogs){
            System.out.println(dogItem);
            dogItem.setName(String.valueOf((new Random()).nextLong()));
            System.out.println(dogItem.getName());
       }

       List<Dog> dogsLinkedList = new LinkedList<>();
       dogsLinkedList.add(Dog.ofHomeless(10));
       dogsLinkedList.add(Dog.ofHomeless(10));
       dogsLinkedList.add(Dog.ofHomeless(10));
       dogsLinkedList.add(Dog.ofHomeless(10));
       dogsLinkedList.add(Dog.ofHomeless(10));

        int indexLikedList = 0;
        while(indexLikedList < dogsLinkedList.size()){
            System.out.println(dogsLinkedList.get(indexLikedList));
            indexLikedList++;
        }

        for(int i = 0; i < 100; i++){
            // SwitchExample.run();
        }

        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType().getValue());

        if(dog.getMoveType() == MoveType.WALK){
            System.out.println("Can walk");
        }

        StringExample.run();
    }
}
