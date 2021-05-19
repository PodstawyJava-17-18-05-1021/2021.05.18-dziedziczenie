package com.comarch;

public class Cat extends Pet implements Jadacz, Kopacz {

    @Override
    public void eat() {
        System.out.println("Jem dostojnie !!");
    }
}
