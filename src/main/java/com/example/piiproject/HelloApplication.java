package com.example.piiproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("myfitnesspalfrontend.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 600);

        stage.setTitle("MyFitnessPal-Free!");
        stage.setScene(scene);
        Image icon = new Image(getClass().getResourceAsStream("myfitnesspal-logo.png"));

        // Set the icon for the stage
        stage.getIcons().add(icon);
        String css = Objects.requireNonNull(this.getClass().getResource("application.css")).toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
        stage.setResizable(false);


    }

    public static void main(String[] args) {
        launch();

    }
}