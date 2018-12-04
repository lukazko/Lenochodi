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
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lukas
 */
public class OknoZalozitPruvodce implements Initializable {

        @FXML
    private MenuItem pruvodciItem1;

    @FXML
    private TextField telefonInput;

    @FXML
    private Label vychazkaLabel;

    @FXML
    private TextField idInput;

    @FXML
    private TextField prijmeniInput;

    @FXML
    private VBox rootPane;

    @FXML
    private Label vychazkaLabel311;

    @FXML
    private MenuBar menuBar1;

    @FXML
    private MenuItem objednavkyItem1;

    @FXML
    private Label vychazkaLabel31;

    @FXML
    private TextField emailInput;

    @FXML
    private Label vychazkaLabel1;

    @FXML
    private Label vychazkaLabel2;

    @FXML
    private Label vychazkaLabel3;

    @FXML
    private MenuItem zakazniciItem1;

    @FXML
    private MenuItem napovedaItem;

    @FXML
    private TextField jmenoInput;

    @FXML
    private Menu napoveda1;

    @FXML
    private ChoiceBox<?> jazykyInput;

    @FXML
    private MenuItem oProgramuItem;

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
    public void potvrditPruvodce(ActionEvent event) throws Exception {

        if (isInteger(idInput)) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Průvodce založen");
            alert.setHeaderText(null);
            alert.setContentText("Průvdoce byl úspěšně založen");
            alert.showAndWait();
            VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoPrůvodci.fxml"));
            rootPane.getChildren().setAll(pane);
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Chyba");
            alert.setHeaderText(null);
            alert.setContentText("Neočekávaná chyba ve vstupních datech");
            alert.showAndWait();
        }
    }
    
        @FXML
    public void zobrazInfo(ActionEvent t) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Vycházky by LenochodiSoft");
        alert.setHeaderText("JavaFX grafická aplikace pro správu vycházek");
        alert.setContentText("Vytvořil tým Lenochodi v rámci předmětu 4IT115.\n"
                + "Aktuální verze 1.0");

        alert.showAndWait();
    }

    @FXML
    public void zobrazNapovedu(ActionEvent t) {

        Stage stage = new Stage();
        stage.setTitle("Nápověda k aplikaci");
        WebView webview = new WebView();
        webview.getEngine().load(
                getClass().getResource("/zdroje/napoveda.html").toExternalForm()
        );
        stage.setScene(new Scene(webview, 500, 500));
        stage.show();

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}