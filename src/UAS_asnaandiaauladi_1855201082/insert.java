/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_asnaandiaauladi_1855201082;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andi
 */
public class insert {
     koneksi konek = new koneksi();

    public void insert(int nm, String nama, String alamat, String jk, int ang) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "insert into datasantri values('" + nm + "','" + nama + "','"+alamat + "','"  + jk  + "','" + ang + "');";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
