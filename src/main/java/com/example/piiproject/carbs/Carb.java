package com.example.piiproject.carbs;

import com.example.piiproject.Food;

public abstract class Carb extends Food {

    protected int carbs;

    public abstract void addCarbs();
    public abstract int getCarbs();
}
