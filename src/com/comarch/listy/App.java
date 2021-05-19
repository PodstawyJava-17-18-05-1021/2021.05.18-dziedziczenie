package com.comarch.listy;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Mateusz");
        list.add("Janusz");
        list.add("Karol");

        System.out.println(list);

        list.remove(0);

        System.out.println(list);

        System.out.println(list.get(0));

        System.out.println(list.size());

        System.out.println(list.contains("Jan"));
    }
}
