/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Tharapathi
 */
public class addModel {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void addDetails(String id, String name,String address,String birthday,String gender){
        con = DBConnection.getConnection();
        
        try{
           String sql = "INSERT INTO student(id ,name,address,birthday,gender)VALUES(?, ?, ?, ?, ?)"; 
           pst = con.prepareStatement(sql);
           pst.setString(1, id);
           pst.setString(2, name);
           pst.setString(3, address);
           pst.setString(4, birthday);
           pst.setString(5, gender);
           pst.execute();
           JOptionPane.showMessageDialog(null, "DATA INSERT SUCCESSFULL");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
