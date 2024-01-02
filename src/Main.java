package com.example.swimmingteammanagement;

public class Main {
    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer("Anna", 20);
        Coach coach = new Coach("John", "Team A");

        System.out.println(swimmer.getName() + " is " + swimmer.getAge() + " years old.");
        System.out.println(coach.getName() + " is the coach of " + coach.getTeam());
    }
}
