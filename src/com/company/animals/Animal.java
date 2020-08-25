package com.company.animals;

class Animal {

    protected String name;
    protected Integer weight;
    protected Integer currentPosition = 0;
    protected Boolean canFly = false;

    public Animal(String name, Integer weight){
        this.name = name;
        this.weight = weight;
        canFly = false;
    }

    public Animal(){
        canFly = false;
    }

    public void voice(){
        System.out.println("Voice!!!");
    }

    protected void runForward(Integer length){
        currentPosition += length;
    }
}
