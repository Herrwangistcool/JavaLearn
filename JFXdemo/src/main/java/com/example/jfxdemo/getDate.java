package com.example.jfxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class getDate {
    @FXML
    private Button myButton;

    @FXML
    private TextField myTextField;

    public void showDateTime(ActionEvent actionEvent) {
        System.out.println("Button clicked!");
        Date now=new Date();
        DateFormat df=new SimpleDateFormat("yyyy-dd-MM HH:mm:ss");
        String dateTimeString = df.format(now);
        myTextField.setText(dateTimeString);
    }
}
