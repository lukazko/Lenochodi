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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author barton
 */
public class OknoObjednavka implements Initializable {

    @FXML
    private MenuItem pruvodciItem1;

    @FXML
    private Label vychazkaLabel;

    @FXML
    private VBox rootPane;

    @FXML
    private MenuBar menuBar1;

    @FXML
    private TextArea vychazkaTextArea;

    @FXML
    private MenuItem objednavkyItem1;

    @FXML
    private MenuItem zakazniciItem1;

    @FXML
    private MenuItem napovedaItem1;

    @FXML
    private Button detailButton;

    @FXML
    private Button zalozitObjednavkuButton;

    @FXML
    private Menu napoveda1;

    @FXML
    private MenuItem oProgramuItem1;

    @FXML
    private Menu menu1;

    @FXML
    private MenuItem vychazkyItem1;

    @FXML
    public void zalozitObjednavku(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoZalozitObjednavku.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void loadVychazky(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoVychazka.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void loadObjednavky(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoObjednavka.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void loadPruvodci(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoPruvodce.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @FXML
    public void loadZakaznici(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoZakaznik.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
