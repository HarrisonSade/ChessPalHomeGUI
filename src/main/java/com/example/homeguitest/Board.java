package com.example.homeguitest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Board extends BorderPane {

    public Board(){

        Button backBtn = new Button("Back");
        backBtn.setMaxSize(75, 50);
        this.setTop(backBtn);

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                home homePage = new home();
                Stage s = (Stage) Board.this.getScene().getWindow();
                Scene homeScene = new Scene(homePage, 900, 900);
                s.setScene(homeScene);
                s.setTitle("Home");
            }
        });


    }

}
