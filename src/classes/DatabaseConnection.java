/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DatabaseConnection {

       public static Connection getKoneksi(String host, String port, String username, String password, String db){
           String konString = "jbdc:mysql://" + host + ":" + port + "/" + db;
           
           Connection koneksi = null;
       
       
       try{
        Class.forName("com.mysql.jbdc.Driver");
        koneksi = DriverManager.getConnection(konString, username, password);
        
            System.out.println("Koneksi Berhasil");
}   catch (Exception ex){
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Koneksdi Database Error");
    koneksi = null;
    }
    return koneksi;
       }
}
    
