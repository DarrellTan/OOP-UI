package com.example.firstprogram;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Stage stage = new Stage();
            BorderPane root = new BorderPane();
            Scene scene = new Scene(root, 400, 400);

            // Scene Background Color
            scene.setFill(Color.web("#F9F6F9"));

            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
