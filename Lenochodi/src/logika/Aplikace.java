package logika;

import java.util.HashMap;
import java.sql.*;

public class Aplikace {

    private HashMap evidenceZakazniku;

    private HashMap evidencePruvodcu;

    private HashMap evidenceObjednavek;

    private HashMap evidenceVychazek;

    private Zakaznik zakaznik;

    private Pruvodce pruvodce;

    private Objednavka objednavka;

    private Vychazka vychazka;

    public Void zalozVse() {
        //musí se vytvořit připojení ('C') do databáze!
        return null;
    }

    public Void zalozPruvodce() {
        /*
        PreparedStatement pstmt = C.prepareStatement("INSERT INTO 'pruvodci'
        (id,jmeno,prijmeni,email,telefon,jazyky) VALUE 
        (?,?,?,?,?,?)");
         pstmt.setString(1, Lenochodi.uzivatelskeRozhrani.OknoZalozitPruvodce.idInput.getText());
         pstmt.setString(2, Lenochodi.uzivatelskeRozhrani.OknoZalozitPruvodce.jmenoInput.getText());
         pstmt.setString(3, Lenochodi.uzivatelskeRozhrani.OknoZalozitPruvodce.prijmeniInput.getText());
         pstmt.setString(4, Lenochodi.uzivatelskeRozhrani.OknoZalozitPruvodce.emailInput.getText());
         pstmt.setInt(5, Lenochodi.uzivatelskeRozhrani.OknoZalozitPruvodce.telefonInput.getText());
         pstmt.setString(6,  Lenochodi.uzivatelskeRozhrani.OknoZalozitPruvodce.jazykyInput.getSelectionModel().toString());
         pstmt.execute();
         */
        return null;
    }

    public Void upravPruvodce() throws SQLException {
    Connection con = null;
    PreparedStatement pstmt = null;
//    ResultSet rs = null;

    
        try {
        con = Databaze.getConnection();
        String query = "UPDATE 'pruvodci' SET (id,jmeno,prijmeni,email,telefon,jazyky) VALUE (?,?,?,?,?,?) WHERE ID = ?";
        pstmt = con.prepareStatement(query);
       /* pstmt.setString(
                1, uzivatelskeRozhrani.OknoZalozitPruvodce.idInput.getText());
        pstmt.setString(
                2, uzivatelskeRozhrani.OknoZalozitPruvodce.jmenoInput.getText());
        pstmt.setString(
                3, uzivatelskeRozhrani.OknoZalozitPruvodce.prijmeniInput.getText());
        pstmt.setString(
                4, uzivatelskeRozhrani.OknoZalozitPruvodce.emailInput.getText());
        pstmt.setInt(
                5, uzivatelskeRozhrani.OknoZalozitPruvodce.telefonInput.getText());
        pstmt.setString(
                6, uzivatelskeRozhrani.OknoZalozitPruvodce.jazykyInput.getSelectionModel().toString());
        pstmt.setString(
                7, uzivatelskeRozhrani.OknoZalozitPruvodce.idInput.getText());
        pstmt.execute();*/
    }
    catch (Exception e

    
        ) {
			e.printStackTrace();
    }

    
        finally {
			try {
//          resultSet.close();
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


return null;
    }

    public Void getKonkretniRPruvodce() {
        //Statement KSPruvodce = C.creatStatement();
        //KSPruvodce.execute("SELECT * FROM 'pruvodci' WHERE prjmeni LIKE '% " + prijmeni.getText() + " %' "); --zjistit prijmeni
        //ResultSet KRPruvodce = KSPruvodce.getResultSet(); 
        //return KRPruvodce;
        return null;
    }

    public Void getSeznamPruvodcu() {
        //Statement SPruvodce = C.creatStatement();
        //SPruvodce.execute("SELECT * FROM 'pruvodci' ORDER BY prijmeni");
        //ResultSet RPruvodce = SPruvodce.getResultSet(); 
        //return RPruvodce;       
        return null;
    }

}
