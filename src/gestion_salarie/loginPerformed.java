
package gestion_salarie;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class loginPerformed {
    // Connection to database to verify the user informations
     public Connection connectdb(){
         
         Connection connection=null;
         MysqlDataSource con=new MysqlDataSource();
         con.setServerName("localhost");
         con.setPortNumber(3306);
         con.setDatabaseName("gestion_salaries");
         con.setUser("root");
         con.setPassword("");
         try {
             connection =con.getConnection();
         } catch (SQLException ex) {
             Logger.getLogger(loginPerformed.class.getName()).log(Level.SEVERE, null, ex);
         }
         return connection;
         
     }
}
