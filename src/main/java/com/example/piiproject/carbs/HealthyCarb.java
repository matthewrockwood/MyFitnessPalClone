package com.example.piiproject.carbs;

public class HealthyCarb extends Carb{

    HealthyCarb(){

    }

    public HealthyCarb(int kcals, int carbs){
        this.kcals = kcals;
        this.carbs = carbs;

    }

    @Override
    public void addCarbs() {
        totalCarbs+=carbs;
    }

    @Override
    public int getCarbs() {
        return 0;
    }

}
