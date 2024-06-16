/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
 import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Lenovo
 */
public class signUp {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void signData(String name, String userName, String email, String password){
        
        con = DBConnection.getConnection();
        
        try {
            String sqlquery = "INSERT INTO signup(name, userName, email, password) VALUES (?, ?, ?, ?)";
            pst = con.prepareStatement(sqlquery);
            pst.setString(1, name);
            pst.setString(2, userName);
            pst.setString(3, email);
            pst.setString(4, password);    
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Insert SUCCESSFULY");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
}
