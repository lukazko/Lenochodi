package logika;

import java.util.HashMap;
import java.sql.*;
import java.util.Map;

public class Aplikace {

    public Map<String, Zakaznik> evidenceZakazniku;

    public Map<String, Pruvodce> evidencePruvodcu;

    public Map<String, Objednavka> evidenceObjednavek;

    public Map<String, Vychazka> evidenceVychazek;

    private Zakaznik zakaznik;

    private Pruvodce pruvodce;

    private Objednavka objednavka;

    private Vychazka vychazka;
    
    private String zkouska = "zkouška";

    public Void zalozVse() {
        evidenceZakazniku = new HashMap<>();
        evidencePruvodcu = new HashMap<>();
        evidenceObjednavek = new HashMap<>();
        evidenceVychazek = new HashMap<>();

        return null;
    }
    
    public String getZkouska(){
     return zkouska;
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
            /*pstmt.setString(
                1, uzivatelskeRozhrani.OknoEditovatDetailPruvodce.idInput.getText());
        pstmt.setString(
                2, uzivatelskeRozhrani.OknoEditovatDetailPruvodce.jmenoInput.getText());
        pstmt.setString(
                3, uzivatelskeRozhrani.OknoEditovatDetailPruvodce.prijmeniInput.getText());
        pstmt.setString(
                4, uzivatelskeRozhrani.OknoEditovatDetailPruvodce.emailInput.getText());
        pstmt.setInt(
                5, uzivatelskeRozhrani.OknoEditovatDetailPruvodce.telefonInput.getText());
        pstmt.setString(
                6, uzivatelskeRozhrani.OknoEditovatDetailPruvodce.jazykyInput.getSelectionModel().getSelectedItem());
        pstmt.setString(
                7, uzivatelskeRozhrani.OknoEditovatDetailPruvodce.idInput.getText());
        pstmt.execute();*/
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
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

    public Void getKonkretniPruvodce() {
        //Statement KSPruvodce = C.creatStatement();
        //KSPruvodce.execute("SELECT * FROM 'pruvodci' WHERE prjmeni LIKE '% " + uzivatelskeRozhrani.OknoPruvodce.getZvolenehoPruvodce() + " %' "); --zjistit prijmeni
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

    public Map getEvidencePruvodcu() {
        return evidencePruvodcu;
    }

}
