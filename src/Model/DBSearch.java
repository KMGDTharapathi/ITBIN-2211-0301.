/*package Model;
import Controller.LoginController;
import com.sun.jdi.connect.spi.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import java.sql.PreparedStatement;

public class DBSearch {
    

  

    Statement stmt;
    ResultSet rs;

    public DBSearch() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet searchLogin(String usName) {
        try {
            stmt = DBConnection.getStatementConnection();
            String name = usName;
//Execute the Query 
            rs = stmt.executeQuery("SELECT * FROM log where username='" + name + "'");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public ResultSet searchLogin(JLabel name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
}
    */

/*package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBSearch {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public DBSearch() {
        // Initialize the DBSearch object
        connection = DBConnection.getConnection();
    }*/

   /* public ResultSet searchLogin(String usName) {
        try {
            String sql = "SELECT * FROM log WHERE username = ?";
            pst = connection.prepareStatement(sql);
            pst.setString(1, usName);
            rs = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}

 */   
