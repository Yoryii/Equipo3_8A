/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coexion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class HelperPresentacionesProducto extends DataBase {
    public DefaultComboBoxModel getValues(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            Connection cn = this.getConnection();
            String consulta = "SELECT NOMBRE FROM PresentacionesProducto";
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
