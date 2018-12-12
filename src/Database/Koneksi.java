package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    public Connection connection;
    final private String url = "jdbc:mysql://localhost/karyawan";
    final private String username = "root";
    final private String password = "";
    public Connection getKoneksi() throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    url, username, password);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return connection;
    }
}
