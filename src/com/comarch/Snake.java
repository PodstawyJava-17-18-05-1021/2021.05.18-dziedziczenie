package com.comarch;

public class Snake extends Pet implements Jadacz {

    @Override
    public void merdajOgonem() {
        System.out.println("Ja nie umiem merdać !!");
    }

    public void pelzaj() {

    }

    public void eat() {
        System.out.println("Jem w całości !!");
    }


}
