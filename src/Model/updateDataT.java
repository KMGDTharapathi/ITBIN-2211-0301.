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
 * @author Lenovo
 */
public class updateDataT {
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void updateTT(String idd, String namee, String addresss, String birthdayy) {
    con = DBConnection.getConnection();
    
    try {
        String sqlquery = "UPDATE teacher SET name = ?, address = ?, birthday = ? WHERE tid = ?";
        pst = con.prepareStatement(sqlquery);
        pst.setString(1, namee);
        pst.setString(2, addresss);
        pst.setString(3, birthdayy);
        pst.setString(4, idd);
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFUL");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, e);
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
    
}
