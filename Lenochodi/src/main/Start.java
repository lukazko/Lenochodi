/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. zzzz
 */
package main;

<<<<<<< HEAD
import javafx.application.Application;
import uzivatelskeRozhrani.OknoHlavni;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
=======
import ClassModel.uzivatelskeRozhrani.OknoHlavni;
import static javafx.application.Application.launch;
>>>>>>> origin/master
import logika.Aplikace;

/**
 *
 * @author Lukáš, Pavel, Simona, Marko, Kateřina
 */
<<<<<<< HEAD
public class Start extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/zdroje/OknoHlavni.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }
=======
public class Start {
>>>>>>> origin/master

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
    public static void main(String[] args) {
        launch(args);
    }
=======
    public static void main(String[] args)
    {        
        Aplikace aplikace = new Aplikace();
        OknoHlavni oknoHlavni = new OknoHlavni();
    }
    
    private Start(){}
    
>>>>>>> origin/master
}
