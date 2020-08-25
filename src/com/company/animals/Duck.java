package com.company.animals;

public class Duck extends Bird{
    public Duck(){}

    @Override
    public void voice() {
        System.out.println("quack!");
    }

    public void showSpeed(){
        if(flyModeActive){
            System.out.println("40");
        } else{
            System.out.println("4");
        }
    }
}