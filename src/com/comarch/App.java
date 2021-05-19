package com.comarch;

public class App {
    public static void main(String[] args) {
        Pet pet = new Pet();

        pet.setAge(2);
        pet.ssij();
        pet.merdajOgonem();

        Dog dog = new Dog();
        dog.ssij();
        dog.merdajOgonem();

        dog.setAge(3);

        Cat cat = new Cat();
        cat.setAge(4);
        cat.merdajOgonem();

        System.out.println(pet.getAge());
        System.out.println(dog.getAge());
        System.out.println(cat.getAge());

        Snake snake = new Snake();
        snake.merdajOgonem();

        Pet p = new Cat();

        Pet[] tab = new Pet[10];

        tab[0] = new Cat();
        tab[1] = new Dog();
        tab[2] = new Snake();

        Mammal mammal = new Cat();

        cat.eat();
        dog.eat();
        snake.eat();

        Object o = new Snake();
    }
}
