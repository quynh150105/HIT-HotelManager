
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCUtil {
    public static Connection getConnection(){
        Connection c = null;
        try {
            
            
            String url = "jdbc:mysql://127.0.0.1:3306/hithotelmanager";
            String username = "root";
            String password = "";
            
            c =DriverManager.getConnection(url,username,password);

          
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        } 
          return c;
    }
      
    public static void closeConnection(Connection c){
        try{
            if(c!= null){
                c.close();
            }
        }
        catch(SQLException e){
            	e.printStackTrace();
        }
    }
        
    
}
