/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzivatelskeRozhrani;

import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author barton
 */
public class OknoPruvodce implements Initializable {

        @FXML
    private MenuBar menuBar;

    @FXML
    private Menu napoveda;

    @FXML
    private MenuItem oProgramuItem;

    @FXML
    private MenuItem zakazniciItem;

    @FXML
    private MenuItem pruvodciItem;

    @FXML
    private Button potvrditButton;

    @FXML
    private MenuItem vychazkyItem;

    @FXML
    private MenuItem objednavkyItem;

    @FXML
    private MenuItem napovedaItem;

    @FXML
    private Menu menu;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
