package com.example.piiproject.protein;

public class Plant extends Protein {
    public Plant(int kcals, int protein){
        this.kcals = kcals;
        this.protein = protein;
    }
    @Override
    public void addProtein() {
        totalProteins+=protein;
    }

    @Override
    public int getProtein() {
        return protein;
    }
}
