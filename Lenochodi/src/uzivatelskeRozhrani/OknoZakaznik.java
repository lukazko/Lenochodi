/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzivatelskeRozhrani;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import logika.Aplikace;

/**
 * FXML Controller class
 *
 * @author barton
 */
public class OknoZakaznik implements Initializable {

    @FXML
    private MenuItem pruvodciItem1;

    @FXML
    private MenuItem oProgramuItem;

    @FXML
    private ListView<String> zakazniciListView;

    @FXML
    private MenuItem zakazniciItem1;

    @FXML
    private VBox rootPane;

    @FXML
    private MenuBar menuBar1;

    @FXML
    private Menu napoveda1;

    @FXML
    private MenuItem napovedaItem;

    @FXML
    private Button zalozitZakaznikaButton;

    @FXML
    private Menu menu1;
    
    private Aplikace aplikace = new Aplikace();

    @FXML
    private MenuItem objednavkyItem1;

    @FXML
    private MenuItem vychazkyItem1;
    
            public void detail(MouseEvent event) throws IOException {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoDetailZakaznik.fxml"));
        rootPane.getChildren().setAll(pane);

    }
    
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
    
        @FXML
    public void zalozitZakaznika(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoZalozitZakaznika.fxml"));
        rootPane.getChildren().setAll(pane);
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
      try {
            zakazniciListView.getItems().addAll(aplikace.getSeznamZakazniku());
        } catch (SQLException ex) {
            Logger.getLogger(OknoPruvodce.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
