package com.example.homeguitest;

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class openingLessons extends BorderPane {

    public openingLessons(){

        Button london = new Button("London System");
        london.setMaxSize(300, 150);
        london.setFont(Font.font("Cambria", 30));

        VBox openings = new VBox(london);

        this.setCenter(openings);

    }
}
