/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenPenjualan;

/**
 *
 * @author Nia
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class koneksi {
//    public static Connection con;
//    public static Statement stm;
//    public static void main(String args[]){
//    try {
//        String url="jdbc:mysql://localhost/db_penjualan";
//        String user="root";
//        String pass="";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        con =(Connection)
//        DriverManager.getConnection(url,user,pass);
//        stm = con.createStatement();
//        System.out.println("koneksi berhasil;");
//    } catch (Exception e) {
//        System.err.println("koneksi gagal"+e.getMessage());
//    }
//    }
    
    
    public static Connection con;
    public static Statement stm;
    public static Connection configDB()throws SQLException{
    try {
        String url="jdbc:mysql://localhost/db_penjualan";
        String user="root";
        String pass="";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con =(Connection)
        DriverManager.getConnection(url,user,pass);
        stm = con.createStatement();
        System.out.println("koneksi berhasil;");
    } catch (Exception e) {
        System.err.println("koneksi gagal"+e.getMessage());
    }
    return con;
    }
}
