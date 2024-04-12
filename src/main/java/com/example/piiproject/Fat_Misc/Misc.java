package com.example.piiproject.Fat_Misc;

import com.example.piiproject.Fat_Misc.Fat_Misc;

public class Misc extends Fat_Misc {
    public Misc(int kcals, int fat){
        this.kcals = kcals;
        this.fat = fat;
    }
    @Override
    public void addFat() {
        totalFats+=fat;

    }

    @Override
    public int getFat() {
        return fat;
    }
}
