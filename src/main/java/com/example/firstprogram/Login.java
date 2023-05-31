package com.example.firstprogram;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login extends Application {

    // Declaring the variables needed for login
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    // Event Handler which performs a method to get Login Details into Strings
    @FXML
    private void buttonEventHandler() {
        String username = usernameField.getText();
        String password = passwordField.getText();
        System.out.println(username + password);
    }

    public void start(Stage stage) throws IOException {
        //Gets UI from XML File
        FXMLLoader fxmlLoader = new FXMLLoader(Login.class.getResource("Login.fxml"));
        fxmlLoader.setLocation(getClass().getResource("Login.fxml"));

        // Creates Scene for JavaFX Program
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // Gets CSS file for Styling
        scene.getStylesheets().add(getClass().getResource("CSS/Login.css").toExternalForm());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}