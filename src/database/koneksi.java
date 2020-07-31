/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Andi
 */
public class koneksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koneksi teskoneksi = new koneksi();
        teskoneksi.koneksi();
    }
    Connection con=null;
     String koneksis;
    public void koneksi()
    {
        try
        {
           
            String connectionURL = "jdbc:mysql://localhost/santri";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(connectionURL, username, password);
           // JOptionPane.showMessageDialog(null,"semoga sukses");
            koneksis="berhasil";
        }

        catch(Exception e)
        {
        //JOptionPane.showMessageDialog(null, e);
        koneksis ="gagal";
        //System.exit(0);
        }
    }
}
