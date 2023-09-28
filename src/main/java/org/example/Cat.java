package org.example;

public class Cat extends Animal{

    private  int noOfWhiskers;
    public int getNoOfWhiskers() {
        return noOfWhiskers;
    }

    public void setNoOfWhiskers(int noOfWhiskers) {
        this.noOfWhiskers = noOfWhiskers;
    }


    public Cat(String name) {
        super(name);
    }
}
