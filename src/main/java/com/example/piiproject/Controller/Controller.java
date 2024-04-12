package com.example.piiproject.Controller;

import com.example.piiproject.Fat_Misc.Fat_Misc;
import com.example.piiproject.Fat_Misc.JunkFood;
import com.example.piiproject.Fat_Misc.Misc;
import com.example.piiproject.Food;
import com.example.piiproject.carbs.Carb;
import com.example.piiproject.carbs.HealthyCarb;
import com.example.piiproject.carbs.UnhealthyCarb;
import com.example.piiproject.protein.Dairy;
import com.example.piiproject.protein.Meat;
import com.example.piiproject.protein.Plant;
import com.example.piiproject.protein.Protein;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.FileWriter;
import java.io.IOException;

public class Controller {
    private final FileWriter writer = new FileWriter("src/main/java/com/example/piiproject/progress.txt", true);

    public Text fcarbs;
    public Text fprotein;
    public Text fkcals;
    public Text ffat;
    public Text savedText;
    public Button saveButton;
    public TextField date;
    Carb riceCake = new HealthyCarb(50, 7);
    Carb banana = new HealthyCarb(110, 28);
    Carb bagRice = new HealthyCarb(306, 66);
    Carb rigVodka = new UnhealthyCarb(700, 80);
    Carb heroBread = new UnhealthyCarb(260, 48);
    Protein yogurt = new Dairy(90,15);
    Protein groundTurkey = new Meat(340, 42);
    Protein steak = new Meat(650, 100);
    Protein grilledChxCut = new Meat(140, 26);
    Protein proteinShake = new Plant(130, 48);
    Fat_Misc pizza = new JunkFood(300, 12);
    Fat_Misc salad = new Misc(70,0);

    public Controller() throws IOException {
    }

    @FXML
    private void addRiceCake(){
        riceCake.addCarbs();
        riceCake.addKcals();
    }
    @FXML
    private void addBanana(){
        banana.addCarbs();
        banana.addKcals();
    }
    @FXML
    private void addBagRice(){
        bagRice.addCarbs();
        bagRice.addKcals();
    }
    @FXML
    private void addRigVodka(){
        rigVodka.addCarbs();
        rigVodka.addKcals();
    }
    @FXML
    private void addHeroBread(){
        heroBread.addCarbs();
        heroBread.addKcals();
    }
    @FXML
    private void addYogurt(){
        yogurt.addProtein();
        yogurt.addKcals();
    }
    @FXML
    private void addGroundTurkey(){
        groundTurkey.addProtein();
        groundTurkey.addKcals();
    }
    @FXML
    private void addSteak(){
        steak.addProtein();
        steak.addKcals();
    }
    @FXML
    private void addGrilledChx(){
        grilledChxCut.addProtein();
        grilledChxCut.addKcals();
    }
    @FXML
    private void addProteinShake(){
        proteinShake.addProtein();
        proteinShake.addKcals();
    }
    @FXML
    private void addPizza(){
        pizza.addFat();
        pizza.addKcals();
    }
    @FXML
    private void addMixedSalad(){
        salad.addFat();
        salad.addKcals();
    }
    @FXML
    private void Calculate(){
        fcarbs.setText(String.valueOf(Food.getTotalCarbs()));
        fkcals.setText(String.valueOf(Food.getTotalkcals()));
        fprotein.setText(String.valueOf(Food.getTotalProteins()));
        ffat.setText(String.valueOf(Food.getTotalFats()));
    }
    @FXML
    private void Save() throws IOException {
        if(!savedText.getText().equals("Saved")) {
            writer.append(date.getText() + ":\nKcals: " + Food.getTotalkcals() + " Carbs: " + Food.getTotalCarbs() + " Protein: " + Food.getTotalProteins() + " Fat: " + Food.getTotalFats() + "\n");
            writer.close();
            savedText.setText("Saved");
        }

    }




   // @FXML
   // protected void onHelloButtonClick() {
    //    welcomeText.setText("Welcome to JavaFX Application!");
   // }
}