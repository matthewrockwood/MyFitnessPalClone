package com.example.piiproject;

public abstract class Food {
    protected int kcals;
    protected static int totalkcals = 0;
    protected static int totalProteins = 0;
    protected static int totalFats = 0;
    protected static int totalCarbs = 0;

    public static int getTotalCarbs() {
        return totalCarbs;
    }
    public static int getTotalkcals(){
        return totalkcals;
    }
    public static int getTotalProteins(){
        return totalProteins;
    }

    public static int getTotalFats() {
        return totalFats;
    }
    public void addKcals(){
        totalkcals+=kcals;
    }
}
