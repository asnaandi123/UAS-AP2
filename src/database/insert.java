/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Andi
 */
public class insert {

    koneksi konek = new koneksi();

    public void insert(int nim, String nama, String alamat, String jkelamin) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "insert into identitas values('" + nim + "','" + nama + "','" + alamat + "','" + jkelamin + "');";

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

}
