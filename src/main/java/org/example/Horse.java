package org.example;

public class Horse extends Animal{
private int age;

  
    public Horse(String name) {
        super(name);
    }


    @Override
    public String toString() {
        return "Horse [name=" + getName() + "]";
    }

    public Horse(String name, int age) {
        super(name);
        this.age = age;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
