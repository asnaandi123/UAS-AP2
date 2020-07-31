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
public class delete {
        koneksi konek = new koneksi();

    public void delete(int nim) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "delete from identitas where nim = '" + nim + "'" ;

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil di hapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
