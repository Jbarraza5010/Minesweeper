package com.example.minesweeper;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import java.util.Timer;
import java.util.TimerTask;

public class HelloController {

    @FXML
    private GridPane Grid;

    @FXML
    private Label Title;

    @FXML
    private Button btnDummy;

    @FXML
    private Button btnExpert;

    @FXML
    private TextField fldMine;

    @FXML
    private HBox fldTime;

    @FXML
    private Label txtMine;

    @FXML
    private Label txtTime;

    int del = 0;
    Timer tm = new java.util.Timer();

    @FXML
    void clickDummy(ActionEvent event) {

    }

    @FXML
    void clickExpert(ActionEvent event) {

    }

}




