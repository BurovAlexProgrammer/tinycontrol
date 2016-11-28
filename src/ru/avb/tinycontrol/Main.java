package ru.avb.tinycontrol;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Alex on 27.11.2016.
 */
public class Main extends Application{
    public static void main(String[] args)  throws InterruptedException{
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent panel = FXMLLoader.load(getClass().getResource("sample.fxml"));

        System.out.print("Start");
        //BorderPane pane = new BorderPane();
        Scene scene = new Scene(panel,500,300);

        primaryStage.setTitle("JavaFX Test");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
