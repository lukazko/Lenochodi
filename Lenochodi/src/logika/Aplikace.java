package logika;

import java.sql.*;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author Simona
 */
public class Aplikace {

    private ObservableList<Zakaznik> evidenceZakazniku;

    private ObservableList<Pruvodce> evidencePruvodcu;

    private ObservableList<Objednavka> evidenceObjednavek;

    private ObservableList<Vychazka> evidenceVychazek;

    private ArrayList<String> seznamPruvodcu;

    private ArrayList<String> seznamZakazniku;

    private ArrayList<String> seznamVychazek;

    private ArrayList<String> seznamObjednavek;

    private Zakaznik zak1;

    private Zakaznik zak2;

    private Zakaznik zakaznik;

    private Pruvodce pruvodce;

    private Pruvodce pruvodce1;
    private Pruvodce pruvodce2;

    private Objednavka objednavka;

    private Vychazka vychazka;

    Databaze databaze = new Databaze();

    //Random proměnná v Aplikaci
    private String zkouska = "zkouška";
    public static Aplikace aplikace = new Aplikace(); //btw chybí ti tu konstruktor pro Aplikaci :D

    public Aplikace() {

        evidenceObjednavek = FXCollections.observableArrayList();
        evidencePruvodcu = FXCollections.observableArrayList();
        evidenceVychazek = FXCollections.observableArrayList();
        evidenceZakazniku = FXCollections.observableArrayList();
        seznamObjednavek = new ArrayList<>();
        seznamPruvodcu = new ArrayList<>();
        seznamVychazek = new ArrayList<>();
        seznamZakazniku = new ArrayList<>();

    }

    //Metoda pro získání proměnné zkouska
    public String getZkouska() {
        return zkouska;
    }

    public void zalozPruvodce(String id, String jmeno, String prijmeni, String email, String telefon, String jazyk) throws SQLException {
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            connection = databaze.getConnection();
            statement = connection.createStatement();
            String query = "INSERT INTO `pruvodci` (`id`,`jmeno`,`prijmeni`,`email`,`telefon`, `jazyk`) VALUES ('"
                    + id + "', '" + jmeno + "', '" + prijmeni + "', '" + email + "', '" + telefon + "', '" + jazyk + "')";
            statement.executeUpdate(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void upravPruvodce(String id, String jmeno, String prijmeni, String email, String telefon, String jazyk) throws SQLException {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = databaze.getConnection();
            String query = "UPDATE `pruvodci` SET (`id`,`jmeno`,`prijmeni`,`email`,`telefon`, `jazyk`) VALUES ('"
                    + id + "', '" + jmeno + "', '" + prijmeni + "', '" + email + "', '" + telefon + "', '" + jazyk + "') WHERE id = \"" + id + "\"";
            statement.executeUpdate(query);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    public ObservableList<Pruvodce> getEvidencePruvodcu() throws SQLException {
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            String query = "SELECT * FROM `pruvodci`";
            connection = databaze.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                Pruvodce pruvodce = new Pruvodce(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
                evidencePruvodcu.add(pruvodce);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return evidencePruvodcu;
    }

    public Pruvodce getPruvodce(int index) throws SQLException {
        evidencePruvodcu = getEvidencePruvodcu();
        pruvodce = evidencePruvodcu.get(index);
        return pruvodce;
    }

    public ArrayList<String> getSeznamPruvodcu() throws SQLException {
        /*pruvodce1 = new Pruvodce(0, "Anna", "Nováková", "email", "telefon", "CZ");
        pruvodce2 = new Pruvodce(1, "Petr", "Čáp", "email_2", "telefon_2", "DE");
        evidencePruvodcu.addAll(pruvodce1, pruvodce2);*/
        evidencePruvodcu = getEvidencePruvodcu();
        for (Pruvodce pom : evidencePruvodcu) {
            seznamPruvodcu.add(pom.getCeleJmeno());
        }
        return seznamPruvodcu;
    }

    public ObservableList<Zakaznik> getEvidenceZakazniku() throws SQLException {
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            String query = "SELECT * FROM `zakaznici`";
            connection = databaze.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                Zakaznik zakaznik = new Zakaznik(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
                evidenceZakazniku.add(zakaznik);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return evidenceZakazniku;
    }

    public Zakaznik getZakaznika(int index) throws SQLException {
        evidenceZakazniku = getEvidenceZakazniku();
        zakaznik = evidenceZakazniku.get(index);
        return zakaznik;
    }

    public ArrayList<String> getSeznamZakazniku() throws SQLException {
        /*pruvodce1 = new Pruvodce(0, "Anna", "Nováková", "email", "telefon", "CZ");
        pruvodce2 = new Pruvodce(1, "Petr", "Čáp", "email_2", "telefon_2", "DE");
        evidencePruvodcu.addAll(pruvodce1, pruvodce2);*/
        evidenceZakazniku = getEvidenceZakazniku();
        for (Zakaznik pom : evidenceZakazniku) {
            seznamZakazniku.add(pom.getCeleJmeno());
        }
        return seznamZakazniku;
    }

    public ObservableList<Vychazka> getEvidenceVychazek() throws SQLException {
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            String query = "SELECT * FROM `vychazky`";
            connection = databaze.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                // Vychazka vychazka = new Vychazka(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3), resultSet.getDate(4), resultSet.getString(5), resultSet.getString(6), resultSet.getInt(7), resultSet.getFloat(8), resultSet.getString(9));
                evidenceVychazek.add(vychazka);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return evidenceVychazek;
    }
}
