package Coexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DataBase {
    
    protected Connection getConnection(){
        Connection cn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "database=ERP;" + "user=sa;" + "password=sa;"); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return cn;
    }
    
}
