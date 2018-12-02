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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class OknoZalozitObjednavku implements Initializable {

    @FXML
    private MenuItem pruvodciItem1;

    @FXML
    private Label vychazkaLabel;

    @FXML
    private TextField datumInput;

    @FXML
    private TextField idInput;

    @FXML
    private VBox rootPane;

    @FXML
    private MenuBar menuBar1;

    @FXML
    private TextField nazevInput;

    @FXML
    private TextField mistoInput;

    @FXML
    private MenuItem objednavkyItem1;

    @FXML
    private Label vychazkaLabel1;

    @FXML
    private Label vychazkaLabel2;

    @FXML
    private Label vychazkaLabel3;

    @FXML
    private MenuItem zakazniciItem1;

    @FXML
    private MenuItem napovedaItem1;

    @FXML
    private Menu napoveda1;

    @FXML
    private MenuItem oProgramuItem1;

    @FXML
    private Menu menu1;

    @FXML
    private Button PotvrditButton;

    @FXML
    private MenuItem vychazkyItem1;

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

    public static boolean isInteger(TextField t) {
        int x;
        try {
            x = Integer.parseInt(t.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    @FXML
    public void potvrditObjednavku(ActionEvent event) throws Exception {

        if (isInteger(idInput)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Objednávka založena");
            alert.setHeaderText(null);
            alert.setContentText("Objednávka byla úspěšně založena");
            alert.showAndWait();
            VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoObjednavka.fxml"));
            rootPane.getChildren().setAll(pane);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Chyba");
            alert.setHeaderText(null);
            alert.setContentText("Neočekávaná chyba ve vstupních datech");
            alert.showAndWait();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
