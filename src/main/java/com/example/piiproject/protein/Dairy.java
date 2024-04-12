package com.example.piiproject.protein;

import com.example.piiproject.protein.Protein;

public class Dairy extends Protein {
    public Dairy(int kcals, int protein){
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
