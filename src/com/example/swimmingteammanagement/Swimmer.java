package com.example.swimmingteammanagement;

public class Swimmer {
    private String name;
    private int age;

    public Swimmer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
