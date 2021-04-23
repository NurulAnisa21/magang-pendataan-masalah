
package kantor;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Nurul AD
 */
public class koneksi {
     java.sql.Connection con;
    ResultSet rs;
    Statement st;
    String db;
    
    Connection conn= null;
    public static Connection koneksi(){
        String driver ="com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/beacukai";
        String user ="root";
        String password ="";
        
        try{
            Class.forName(driver);
            Connection conn = (Connection) DriverManager.getConnection(host,user,password);
            return conn;
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }

    void connect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
