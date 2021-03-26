package Coexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConexion(){
        

        //String url = "jdbc:sqlserver://localho:1433;" + "database=Compras;" + "user=sa;" + "password=123;";

        //String url = "jdbc:sqlserver://localhost:1433;" + "database=ERP;" + "user=sa;" + "password=sa;";
        
        //LAPTOP JO
        //String url ="jdbc:sqlserver://LAPTOP-JGEMDCST\\MSSQLSERVER:1433;databaseName=ERP;user=sa;password=sa;";
        
        //LAPTOP JORGE
//Updated upstream
       String url = "jdbc:sqlserver://localhost:1433;" + "database=ERP;" + "user=sa;" + "password=sa;";

        //String url ="jdbc:sqlserver://LAPTOP-TC4H4NLT\\MSSQLSERVER:1433;databaseName=ERP;user=sa;password=sa;";Stashed changes
        //\\
        try {
            Connection con = DriverManager.getConnection(url);
            return con;
        } catch(SQLException e) {
            System.out.println(e.toString());
            return null;
        }   
    }
}
