package com.example.homeguitest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class openingLessons extends BorderPane {

    public openingLessons(){

        Button london = new Button("London System");
        london.setMaxSize(300, 150);
        london.setFont(Font.font("Cambria", 30));

        VBox openings = new VBox(london);
        this.setCenter(openings);

        Button back = new Button("Back");
        back.setMaxSize(75, 50);
        this.setTop(back);

        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                home homePage = new home();
                Stage s = (Stage) openingLessons.this.getScene().getWindow();
                Scene homeScene = new Scene(homePage, s.getWidth(), s.getHeight());
                s.setScene(homeScene);
                s.setTitle("Home");
            }
        });

    }
}
