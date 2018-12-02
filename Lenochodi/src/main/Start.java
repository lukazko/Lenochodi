/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. zzzz
 */
package main;

import javafx.application.Application;
import uzivatelskeRozhrani.OknoHlavni;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.stage.Stage;
import logika.Aplikace;

/**
 *
 * @author Lukáš, Pavel, Simona, Marko, Kateřina
 */
public class Start extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/zdroje/OknoHlavni.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Vycházky by LenochodiSoft");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}