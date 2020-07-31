/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_asnaandiaauladi_1855201082;

import javax.swing.JOptionPane;

/**
 *
 * @author Andi
 */
public class update {

        koneksi konek = new koneksi();

    public void update(int nm, String nama, String alamat, String jk, int ang) {

        try {
            konek.koneksi();
            java.sql.Statement statement = konek.con.createStatement();

            String sql_nama = "update datasantri set namasantri = '" + nama + "'where nomorsantri = '" + nm + "'";
            String sql_alamat = "update datasantri set alamat = '" + alamat + "'where nomorsantri = '" + nm + "'";
            String sql_jk = "update datasantri set jeniskelamin = '" + jk + "'where nomorsantri = '" + nm + "'";
            String sql_nim1 = "update datasantri set nomorsantri = '" + nm + "'where namasantri = '" + nama + "'";
            String sql_nim2 = "update datasantri set nomorsantri = '" + nm + "'where namasantri = '" + nama + "'";
            String sql_ang = "update datasantri set angkatan = '" + ang + "'where alamat = '" + alamat + "'";
            statement.executeUpdate(sql_nim1);
            statement.executeUpdate(sql_nim2);
            statement.executeUpdate(sql_nama);
            statement.executeUpdate(sql_alamat);
            statement.executeUpdate(sql_jk);
            statement.executeUpdate(sql_ang);
            statement.close();

            JOptionPane.showMessageDialog(null, "Berhasil Diubah");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
