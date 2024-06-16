
package Model;


import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class updateData {
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(String idd, String namee, String addresss, String birthdayy) {
    con = DBConnection.getConnection();
    
    try {
        String sqlquery = "UPDATE student SET name = ?, address = ?, birthday = ? WHERE id = ?";
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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
}


    /*
    
    Connection con = null;
    PreparedStatement pst = null;
    
    public void update(String idd, String namee, String addresss, String birthdayy){
        
        con = DBConnection.getConnection();
        
        try {
            String sqlquery = "UPDATE student SET name = '"+namee+"', address = '"+addresss+", birthday = '"+birthdayy+"' WHERE id = '"+idd+"'";
            pst = con.prepareStatement(sqlquery);
            pst.execute();
            JOptionPane.showMessageDialog(null, "UPDATE SUCCESSFULY");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }*/




