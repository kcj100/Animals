package org.example;

public class Pig {
    String sound;
    int age;

    public Pig(String sound, int age) {
        this.sound = sound;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("oink oink");
    }

    @Override
    public String toString() {
        return "Pig{" +
                "sound='" + sound + '\'' +
                ", age=" + age +
                '}';
    }
}
