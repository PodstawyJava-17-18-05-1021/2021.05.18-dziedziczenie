package com.comarch.zbiory;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Mateusz");
        set.add("Karol");
        set.add("Janusz");
        set.add("Piotr");
        set.add("Piotr");

        System.out.println(set);

        set.remove("Mateusz");

        System.out.println(set);

        for(String s : set) {
            System.out.println(s);
        }
    }
}
