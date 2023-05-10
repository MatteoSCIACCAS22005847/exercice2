package com.example.exercice2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

        //Image image = new Image("Croix.png");
        //Label.setGraphic(image);

        //Grille
        GridPane gridpane = new GridPane();
        gridpane.add(new Label("1"), 1, 0); // column=1 row=0
        gridpane.add(new Label("2"), 2, 0);  // column=2 row=0
        gridpane.add(new Label("3"), 3, 0);  // column=3 row=0
        gridpane.add(new Label("4"), 1, 1); // column=1 row=1
        gridpane.add(new Label("5"), 2, 1);  // column=2 row=1
        gridpane.add(new Label("6"), 3, 1);  // column=3 row=1
        gridpane.add(new Label("7"), 1, 2); // column=1 row=2
        gridpane.add(new Label("8"), 2, 2);  // column=2 row=2
        gridpane.add(new Label("9"), 3, 2);  // column=3 row=2

    }

    public static void main(String[] args) {
        launch();
    }
}