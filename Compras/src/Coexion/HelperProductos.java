package Coexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class HelperProductos extends DataBase{
    
    public DefaultComboBoxModel getValues(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            Connection cn = this.getConnection();
            String consulta = "SELECT nombre FROM Productos WHERE estatus = 'A'";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {                
                modelo.addElement(rs.getString(1));
            }
            cn.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return modelo;
    }
    
}
