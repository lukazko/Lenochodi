package uzivatelskeRozhrani;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import logika.Aplikace;
import logika.Pruvodce;

/**
 * OknoEditovatDetailPrůvodce
 *
 * Třída, která slouží jako FXML controller pro okno s editací průvodce.
 *
 * @author Lukáš, Pavel, Simona
 * @created ZS 2018/2019
 */
public class OknoEditovatDetailPruvodce implements Initializable {

    @FXML
    private MenuItem pruvodciItem1;

    @FXML
    public TextField telefonInput;

    @FXML
    public TextField prijmeniInput;

    @FXML
    private VBox rootPane;

    @FXML
    private Label vychazkaLabel311;

    @FXML
    private MenuBar menuBar1;

    @FXML
    private Button ulozitButton;

    @FXML
    private Label vychazkaLabel21;

    @FXML
    private Label vychazkaLabel32;

    @FXML
    private Label vychazkaLabel11;

    @FXML
    private MenuItem objednavkyItem1;

    @FXML
    private Label vychazkaLabel31;

    @FXML
    public TextField emailInput;

    @FXML
    private Label vychazkaLabel1;

    @FXML
    private MenuItem oProgramuItem;

    @FXML
    private MenuItem zakazniciItem1;

    @FXML
    public TextField jmenoInput;

    @FXML
    private Button zpetButton;

    @FXML
    private Menu napoveda1;

    @FXML
    public ChoiceBox<String> jazykyInput;

    @FXML
    private MenuItem napovedaItem;

    @FXML
    private Menu menu1;

    @FXML
    public TextField idInput;

    @FXML
    private MenuItem vychazkyItem1;

    private Aplikace aplikace = new Aplikace();

    private Pruvodce pruvodce;

    private Integer index;

    /**
     * Metoda naplňující grafické prvky daty z databáze při vytvoření scény.
     *
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        index = aplikace.getPomIndex();
        try {
            pruvodce = new Pruvodce(aplikace.getPruvodce(index).getId(), aplikace.getPruvodce(index).getJmeno(), aplikace.getPruvodce(index).getPrijmeni(), aplikace.getPruvodce(index).getEmail(), aplikace.getPruvodce(index).getTelefon(), aplikace.getPruvodce(index).getJazyk());
        } catch (SQLException ex) {
            Logger.getLogger(OknoEditovatDetailPruvodce.class.getName()).log(Level.SEVERE, null, ex);
        }
        idInput.setText(Integer.toString(pruvodce.getId()));
        idInput.setEditable(false);
        jmenoInput.setText(pruvodce.getJmeno());
        prijmeniInput.setText(pruvodce.getPrijmeni());
        emailInput.setText(pruvodce.getEmail());
        telefonInput.setText(pruvodce.getTelefon());
        jazykyInput.setItems(FXCollections.observableArrayList("CZ", "EN", "DE"));
        jazykyInput.setValue(pruvodce.getJazyk());
    }

    /**
     * Metoda, která po zavolání vykreslí scénu s výpisem všech vycházek.
     *
     * @param ActionEvent event
     * @throws Exception
     */
    @FXML
    public void loadVychazky(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoVychazka.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    /**
     * Metoda, která po zavolání vykreslí scénu s výpisem všech objednávek.
     *
     * @param ActionEvent event
     * @throws Exception
     */
    @FXML
    public void loadObjednavky(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoObjednavka.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    /**
     * Metoda, která po zavolání vykreslí scénu s výpisem všech průvodců.
     *
     * @param ActionEvent event
     * @throws Exception
     */
    @FXML
    public void loadPruvodci(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoPruvodce.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    /**
     * Metoda, která po zavolání vykreslí scénu s výpisem všech zákazníků.
     *
     * @param ActionEvent event
     * @throws Exception
     */
    @FXML
    public void loadZakaznici(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoZakaznik.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    /**
     * Metoda, která po zavolání vrátí uživatele o krok zpět, tedy na detail
     * zvoleného průvodce.
     *
     * @param ActionEvent event
     * @throws Exception
     */
    public void detail(ActionEvent event) throws Exception {
        VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoDetailPruvodce.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    /**
     * Metoda při kliknutí na příslušnou položku zobrazí modální okno s
     * informacemi o programu.
     *
     * @param ActionEvent t
     */
    @FXML
    public void zobrazInfo(ActionEvent t) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Vycházky by LenochodiSoft");
        alert.setHeaderText("JavaFX grafická aplikace pro správu vycházek");
        alert.setContentText("Vytvořil tým Lenochodi v rámci předmětu 4IT115.\n"
                + "Aktuální verze 1.0");

        alert.showAndWait();
    }

    /**
     * Metoda při kliknutí na příslušnou položku zobrazí nové okno s html
     * nápovědou.
     *
     * @param ActionEvent t
     */
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

    /**
     * Metoda kontroluje, zda je hodnota v příslušeném poli typu integer.
     *
     * @param TextField t
     */
    public static boolean isInteger(TextField t) {
        int x;
        try {
            x = Integer.parseInt(t.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Metoda voláná před ukládáním dat do databáze. Kontroluje vstupy, zda
     * splňují podmínky pro uložení, zobrazuje modální okna s informacemi o
     * průběhu ukládání.
     *
     * @param ActionEvent event
     * @throws Exception
     */
    @FXML
    public void ulozitPruvodce(ActionEvent event) throws Exception {
        if (isInteger(idInput)) {
            if (jmenoInput.getText().trim().equals("") || prijmeniInput.getText().trim().equals("") || telefonInput.getText().trim().equals("") || emailInput.getText().trim().equals("")) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Chyba");
                alert.setHeaderText(null);
                alert.setContentText("Neočekávaná chyba ve vstupních datech");
                alert.showAndWait();
            } else {
                aplikace.upravPruvodce(idInput.getText(), jmenoInput.getText(), prijmeniInput.getText(), emailInput.getText(), telefonInput.getText(), jazykyInput.getValue());
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Průvodce uložen");
                alert.setHeaderText(null);
                alert.setContentText("Změny byly úspěšně uloženy");
                alert.showAndWait();
                VBox pane = FXMLLoader.load(getClass().getResource("/zdroje/OknoDetailPruvodce.fxml"));
                rootPane.getChildren().setAll(pane);

            }
        } else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Chyba");
            alert.setHeaderText(null);
            alert.setContentText("Neočekávaná chyba ve vstupních datech");
            alert.showAndWait();
        }
    }

}
