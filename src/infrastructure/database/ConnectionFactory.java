/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author gustavo
 */
public class ConnectionFactory { 
    private static final String BD_DRIVER = "com.mysql.jdbc.Driver";
    private static final String BD_NAME = "espacoFit";
    private static final String BD_URL = "jdbc:mysql://localhost:3306/" + BD_NAME;
    private static final String BD_USER = "root";
    private static final String BD_PASSWORD = "mysql";
    
    
    public static Connection getConnection(){

        try {
            return DriverManager.getConnection(BD_URL + "?verifyServerCertificate=false"
                    + "&useSSL=false"
                    + "&requireSSL=false"
                    + "&USER=" + BD_USER + "&password=" + BD_PASSWORD + "&serverTimezone=UTC"
            );
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static void closeConnection(Connection connection){
         try {
            connection.close();
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }
    
      public static void closeConnection(Connection connection, PreparedStatement psmt){
         try {
             psmt.close();
             connection.close();
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }
      
      public static void closeConnection(Connection connection, PreparedStatement psmt,ResultSet rst){
         try {
             if(psmt != null)
                psmt.close();
             if(rst != null)
                rst.close();
             connection.close();
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
            return;
        }
    }


    
    
}
