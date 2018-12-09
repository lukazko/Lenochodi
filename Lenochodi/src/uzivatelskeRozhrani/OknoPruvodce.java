/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uzivatelskeRozhrani;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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

/**
 * FXML Controller class
 *
 * @author barton
 */
public class OknoPruvodce implements Initializable {

  @FXML
    private MenuItem pruvodciItem1;

    @FXML
    private MenuItem oProgramuItem;

    @FXML
    private MenuItem zakazniciItem1;

    @FXML
    private Button zalozitPruvodceButton;

    @FXML
    private VBox rootPane;

    @FXML
    private MenuBar menuBar1;

    @FXML
    private Menu napoveda1;

    @FXML
    private MenuItem napovedaItem;

    @FXML
    private ListView<String> pruvodciListView;

    @FXML
    private Menu menu1;

    @FXML
    private MenuItem objednavkyItem1;

    @FXML
    private MenuItem vychazkyItem1;
    
    public String pruvodce;
    
    public void detail(MouseEvent event) throws IOException {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoDetailPruvodce.fxml"));
        rootPane.getChildren().setAll(pane);
        pruvodce = pruvodciListView.getSelectionModel().getSelectedItem();

    }
    
    public String getZvolenehoPruvodce() {
         return pruvodce;
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
    public void zalozitPruvodce(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoZalozitPruvodce.fxml"));
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
        pruvodciListView.getItems().addAll("Průvodce #1","Průvodce #2", "Průvodce #3");    
       // pruvodciListView.getItems().addAll(logika.Aplikace.class.getEvidencePruvodcu());
    }
}

