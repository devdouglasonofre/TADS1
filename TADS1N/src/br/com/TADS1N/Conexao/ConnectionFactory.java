
package br.com.TADS1N.Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MelquiDba
 */
public class ConnectionFactory {
 
 
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/systemmovel";
    private static final String USER = "root";
    private static final String PASSWORD = "2010";

    public static Connection getConnection() {

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException erro) {
            throw new RuntimeException();
        }

    }

    public static void closeConnection(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e.getMessage());
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement pst) {
        closeConnection(conn);
        try {

            if (pst != null) {
                pst.close();
            }
        } catch (Exception e) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, e.getMessage());
        }
    }

    public static void closeConnection(Connection conn, PreparedStatement pst, ResultSet rs) {
        closeConnection(conn, pst);
        try {

            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

    }    
}
