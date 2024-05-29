package GUI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author DEv
 */
public class dbConnection {
    public static Connection con(){
          Connection con = null;
          try{
             Class.forName("com.mysql.jdbc.Driver") ;
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
                          JOptionPane.showMessageDialog(null, "Connected!");

          }catch (ClassNotFoundException e){
             JOptionPane.showMessageDialog(null, e);
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null, e);
        }
        return con;
    }

//    static dbConnection con() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
