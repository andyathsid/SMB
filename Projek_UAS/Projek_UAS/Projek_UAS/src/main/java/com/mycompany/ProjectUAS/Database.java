/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ProjectUAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Kelua
 */
public class Database {
    public static Connection koneksi;
    public static Connection konfig()throws SQLException{
        try{
            String url="jdbc:mysql://localhost:3307/db_harf";
            String user="root";
            String pass="";
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            koneksi = DriverManager.getConnection(url, user, pass);
            //JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        }catch(SQLException e){
            //JOptionPane.showMessageDialog(null, "Gagal Koneksi");
            System.err.println("Koneksi gagal: " + e.getMessage());
        }   

        return koneksi;
    }
    
    /*
    
     public static void main(String[] args) throws SQLException {
        Connection C = (Connection)KoneksiDB.konfig();
    }
*/

    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
