package com.example.homeguitest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class home extends BorderPane {
    public home(){

        BorderPane bp = new BorderPane();

        Button boardBtn = new Button("Board");
        boardBtn.setMaxSize(50,50);
        this.setCenter(boardBtn);

        boardBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage s = (Stage) home.this.getScene().getWindow();
                Board Board = new Board();
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
                Scene scene = new Scene(Board, s.getWidth(),s.getHeight());
                s.setScene(scene);
                s.setTitle("Board");
            }
        });

    }
}
