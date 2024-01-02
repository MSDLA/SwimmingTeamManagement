package com.example.swimmingteammanagement;

public class Coach {
    private String name;
    private String team;

    public Coach(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }
}

