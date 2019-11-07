package com.example.recyclerview.data;

public class Pokemon {

    private String name;
    private int id;
    private int baseExperience;
    private int weight;
    private int height;

    public Pokemon(String name, int id, int baseExperience, int weight, int height) {
        this.name = name;
        this.id = id;
        this.baseExperience = baseExperience;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getBaseExperience() {
        return baseExperience;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }






}
