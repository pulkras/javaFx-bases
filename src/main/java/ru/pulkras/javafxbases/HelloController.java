package ru.pulkras.javafxbases;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {

    @FXML
    protected void printHelloWorld(MouseEvent event) {
        System.out.println("Welcome to JavaFX Application!");
    }
}