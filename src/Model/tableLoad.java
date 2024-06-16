/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

//import com.sun.jdi.connect.spi.Connection;
//import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class tableLoad {
    
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public ResultSet fetchTableData() {
        con = DBConnection.getConnection();
        try {
            String sql = "SELECT id, name, address, birthday, gender FROM student";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return rs;
    }
    
    public ResultSet searchData(String stId){
      con = DBConnection.getConnection();
        try {
            String sql = "SELECT * FROM student WHERE id LIKE '%"+stId+"%'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs; 
    }
}
