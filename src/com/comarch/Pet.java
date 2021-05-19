package com.comarch;

public class Pet extends Mammal {
    private int age;
    private String name;
    private String race;

    public void merdajOgonem() {
        System.out.println("Merdam !!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
