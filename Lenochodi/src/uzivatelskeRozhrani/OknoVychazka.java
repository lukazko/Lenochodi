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
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author barton
 */
public class OknoVychazka implements Initializable {

    @FXML
    private MenuItem zakazniciItem;

    @FXML
    private Label vychazkaLabel;

    @FXML
    private VBox rootPane;

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
    private Button zalozitVychazkuButton;

    @FXML public void zalozitVychazku (ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoZalozitVychazku.fxml"));
	rootPane.getChildren().setAll(pane);	
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
