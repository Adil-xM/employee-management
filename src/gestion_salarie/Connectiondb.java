/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_salarie;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connectiondb {
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
