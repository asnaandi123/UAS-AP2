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
public class delete {
     koneksi konek = new koneksi();

    public void delete(int nomorsantri) {

        try {
            konek.koneksi();
            Statement statement = konek.con.createStatement();

            String sql = "delete from datasantri where nomorsantri = '" + nomorsantri + "'" ;

            statement.executeUpdate(sql);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
