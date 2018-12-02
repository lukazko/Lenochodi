/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzivatelskeRozhrani;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author barton
 */
public class OknoZakaznik implements Initializable {

    @FXML
    private MenuItem zakazniciItem;
        
    @FXML
    private VBox rootPane;

    @FXML
    private Label vychazkaLabel;

    @FXML
    private MenuItem pruvodciItem;

    @FXML
    private MenuItem objednavkyItem;

    @FXML
    private Menu menu;

    @FXML
    private TextArea vychazkaTextArea;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu napoveda;

    @FXML
    private MenuItem oProgramuItem;

    @FXML
    private Button detailButton;

    @FXML
    private MenuItem vychazkyItem;

    @FXML
    private MenuItem napovedaItem;

    @FXML
    private Button zalozitZakaznikaButton;
    
        @FXML public void loadVychazky (ActionEvent event) throws Exception{
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoVychazka.fxml"));
	rootPane.getChildren().setAll(pane);	
    }
        
    @FXML public void loadObjednavky (ActionEvent event) throws Exception{
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoObjednavka.fxml"));
	rootPane.getChildren().setAll(pane);	
    }
            
    @FXML public void loadPruvodci (ActionEvent event) throws Exception{
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoPruvodce.fxml"));
	rootPane.getChildren().setAll(pane);	
    }   
        
    @FXML public void loadZakaznici (ActionEvent event) throws Exception{
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoZakaznik.fxml"));
	rootPane.getChildren().setAll(pane);	
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
