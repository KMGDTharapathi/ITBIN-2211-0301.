/*package Model;

import com.mysql.jdbc.*; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement; 
 
public class DBConnection { 
    static Connection conn; 
    static Statement stat = null; 
     
    public static Statement getStatementConnection() { 
         try { 
//Establish the connection 
         String url = "jdbc:mysql://localhost:3306/studentdatabase"; 
         conn = DriverManager.getConnection(url, "root", ""); 
//Create the connection 
            stat = conn.createStatement(); 
        
        } catch (Exception e) { 
            e.printStackTrace();          
        } 
           return stat; 
        } 
    //Close the connection 
public static void closeCon() throws SQLException { 
        conn.close(); 
    } 
  } */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() {
        
            try {
            String url = "jdbc:mysql://localhost:3306/studentdatabase";
            String user = "root";
            String password = ""; // fixed spelling
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    
    }

    
}
