package com.example.homeguitest;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.Font;
public class home extends BorderPane {
    public home(){

        BorderPane bp = new BorderPane();

        Button boardBtn = new Button("Board");
        boardBtn.setMaxSize(300,100);

        Button openingLessonBtn = new Button("Opening Lessons");
        openingLessonBtn.setMaxSize(300, 100);

        Button defenseLessonBtn = new Button("Defense Lessons");
        defenseLessonBtn.setMaxSize(300, 100);

        VBox centerBtns = new VBox(boardBtn, openingLessonBtn, defenseLessonBtn);
        centerBtns.setAlignment(Pos.CENTER);
        centerBtns.setSpacing(20);
        this.setCenter(centerBtns);


        Text homeText = new Text("Home Page");
        homeText.setFont(Font.font("Cambria", FontWeight.BOLD, 30));
        DropShadow ds = new DropShadow();
        ds.setOffsetY(3.0f);
        ds.setColor(Color.color(0.4f, 0.4f, 0.4f));
        homeText.setEffect(ds);
        homeText.setCache(true);
        homeText.setFill(Color.DARKGREEN);

        HBox title = new HBox(homeText);
        title.setAlignment(Pos.CENTER);
        title.setPadding(new Insets(30));
        this.setTop(title);
        title.setSpacing(20);


        boardBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Board Board = new Board();
                Stage s = (Stage) home.this.getScene().getWindow();
                Scene scene = new Scene(Board, s.getWidth(), s.getHeight());
                s.setScene(scene);
                s.setTitle("Board");
            }
        });

        openingLessonBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage s = (Stage) home.this.getScene().getWindow();
                openingLessons openings = new openingLessons();
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
                Scene scene = new Scene(openings, s.getWidth(), s.getHeight());
                s.setScene(scene);
                s.setTitle("Opening Lessons");
            }
        });

        defenseLessonBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Stage s = (Stage) home.this.getScene().getWindow();
                defenseLessons defenses = new defenseLessons();
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("hello-view.fxml"));
                Scene scene = new Scene(defenses, s.getWidth(), s.getHeight());
                s.setScene(scene);
                s.setTitle("defense Lessons");
            }
        });


    }
}
