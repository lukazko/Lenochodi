/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzivatelskeRozhrani;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class OknoZalozitVychazku implements Initializable {

    @FXML
    private VBox rootPane;
        
    @FXML
    private Label vychazkaLabel;

    @FXML
    private TextField datumInput;

    @FXML
    private MenuItem pruvodciItem;

    @FXML
    private Label vychazkaLabel311;

    @FXML
    private Label vychazkaLabel312;

    @FXML
    private TextField kapacitaInput;

    @FXML
    private Label vychazkaLabel32;

    @FXML
    private TextField cenaInput;

    @FXML
    private Label vychazkaLabel31;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Label vychazkaLabel1;

    @FXML
    private MenuItem oProgramuItem;

    @FXML
    private Label vychazkaLabel2;

    @FXML
    private Label vychazkaLabel3;

    @FXML
    private TextField jazykInput;

    @FXML
    private TextField casZacatkuInput;

    @FXML
    private MenuItem vychazkyItem;

    @FXML
    private MenuItem napovedaItem;

    @FXML
    private MenuItem zakazniciItem;

    @FXML
    private TextField idInput;

    @FXML
    private TextField nazevInput;

    @FXML
    private MenuItem objednavkyItem;

    @FXML
    private TextField mistoInput;

    @FXML
    private Menu menu;

    @FXML
    private Menu napoveda;

    @FXML
    private VBox vychazky;

    @FXML
    private Button PotvrditButton;
    
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
