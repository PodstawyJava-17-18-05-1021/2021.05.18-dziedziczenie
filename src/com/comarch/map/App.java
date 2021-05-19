package com.comarch.map;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Mateusz", 5);
        map.put("Janusz", 7);
        map.put("Karol", 10);

        System.out.println(map.get("Mateusz"));
    }
}
