package com.example.piiproject.carbs;

public class UnhealthyCarb extends Carb {


    public UnhealthyCarb(int kcals, int carbs){
        this.kcals = kcals;
        this.carbs = carbs;

    }
    @Override
    public void addCarbs() { // this is used when the button is pressed. Add the input to static global carbs.
        totalCarbs+=carbs;
    }

    @Override
    public int getCarbs() { // use this in the above method as the input
        return carbs;
    }
}
