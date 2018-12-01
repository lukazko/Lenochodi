/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzivatelskeRozhrani;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author barton
 */
public class OknoHlavni implements Initializable {

@FXML
    private MenuItem zakazniciItem;

    @FXML
    private Button zakazniciButton;

    @FXML
    private MenuItem pruvodciItem;

    @FXML
    private MenuItem objednavkyItem;

    @FXML
    private Button objednavkyButton;

    @FXML
    private Button pruvodciButton;

    @FXML
    private Menu menu;

    @FXML
    private Button vychazkyButton;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu napoveda;

    @FXML
    private MenuItem oProgramuItem;

    @FXML
    private ImageView pozadi;

    @FXML
    private MenuItem vychazkyItem;

    @FXML
    private MenuItem napovedaItem;
    
    /*@FXML
    private void loadVychazky(ActionEvent event) throws IOException {
        VBox vbox = FXMLLoader.load(getClass().getResource("/zdroje/OknoVychazka.fxml"));
    }*/

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
