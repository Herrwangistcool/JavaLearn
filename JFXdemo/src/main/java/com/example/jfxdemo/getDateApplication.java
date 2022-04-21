package com.example.jfxdemo;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class getDateApplication extends Application {
    public static void main(String args[]){
        launch();
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader=new FXMLLoader(getDateApplication.class.getResource("getDate.fxml"));
        Scene scene=new Scene(fxmlLoader.load(),640,240);
        stage.setTitle("getDate");
        stage.setScene(scene);
        stage.show();
    }
}
