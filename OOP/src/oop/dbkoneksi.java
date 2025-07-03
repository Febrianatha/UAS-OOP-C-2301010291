package oop;
 
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Febrianatha
 */
public class dbkoneksi {
   public static Connection koneksi() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/keuangan", 
                    "root", 
                    ""
            );
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Gagal koneksi ke DBMS MYSQL");
            return null;
        }
    } 
    
}
