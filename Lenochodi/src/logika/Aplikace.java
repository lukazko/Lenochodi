package logika;

import java.util.HashMap;
import java.sql.*;
import java.util.Map;

public class Aplikace {

    private Map<Integer, Zakaznik> evidenceZakazniku;

    private Map<Integer, Pruvodce> evidencePruvodcu;

    private Map<Integer, Objednavka> evidenceObjednavek;

    private Map<Integer, Vychazka> evidenceVychazek;

    private Zakaznik zakaznik;

    private Pruvodce pruvodce;

    private Objednavka objednavka;

    private Vychazka vychazka;
    
    Databaze databaze = new Databaze();

    //Random proměnná v Aplikaci
    private String zkouska = "zkouška";
    public static Aplikace appka = new Aplikace(); //btw chybí ti tu konstruktor pro Aplikaci :D

    //Metoda pro získání proměnné zkouska
    public String getZkouska() {
        return zkouska;
    }

    public void zalozPruvodce(int id, String jmeno, String prijmeni, String email, String telefon) throws SQLException {
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
//        int idPruvodce = 1;
        try {
			// výpočet proměnné, která se dosadí do podmínky
//			String query = "SELECT id FROM `pruvodci` ORDER BY id DESC LIMIT 1";
			connection = databaze.getConnection();
			statement = connection.createStatement();
//			resultSet = statement.executeQuery(query);
/*			while (resultSet.next()) {
				idPruvodce = resultSet.getInt(1);
				idPruvodce += 1;
			}*/
			String query = "INSERT INTO `pruvodci` (`id`,`jmeno`,`prijmeni`,`email`,`telefon`) VALUES ('"
					+ id + "', '" + jmeno + "', '" + prijmeni + "', '" + email + "', '"+ telefon +"')";
			statement.executeUpdate(query);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
    }

    public void upravPruvodce(int id, String jmeno, String prijmeni, String email, String telefon) throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = databaze.getConnection();
            String query = "UPDATE `pruvodci` SET (`id`,`jmeno`,`prijmeni`,`email`,`telefon`) VALUE (?,?,?,?,?) WHERE id = ?";
            pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, jmeno);
            pstmt.setString(3, prijmeni);
            pstmt.setString(4, email);
            pstmt.setString(5, telefon);
            pstmt.setInt(6, id);
            pstmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Map<Integer, Pruvodce> getEvidencePruvodcu() throws SQLException {
        evidencePruvodcu = new HashMap<>();
        Connection connection = null;
        ResultSet resultSet = null;
        Statement statement = null;
        try {
            String query = "SELECT * FROM `pruvodci`";
            connection = databaze.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                Pruvodce pruvodce = new Pruvodce(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5));
                evidencePruvodcu.put(resultSet.getInt(1), pruvodce);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return evidencePruvodcu;
    }

}
