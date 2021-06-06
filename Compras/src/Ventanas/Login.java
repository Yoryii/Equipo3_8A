package Ventanas;

import Coexion.Conexion;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        lblImagen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txfEmail = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfPass = new javax.swing.JPasswordField();
        lblIcono = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        txfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfEmailActionPerformed(evt);
            }
        });

        btnEntrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntrar.setText("Iniciar Sesión");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(btnEntrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txfEmail)
                            .addComponent(txfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblIcono, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfEmailActionPerformed

    }//GEN-LAST:event_txfEmailActionPerformed

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed

        //****************************************Código de Jo**********************************
        /*
        String usuario = txfEmail.getText();
        String passw = txfPass.getText();

        Principal pr = new Principal();
        

        PreparedStatement ps;
        ResultSet rs;
        

        try {
            Connection con = Conexion.getConexion();

            ps = con.prepareStatement("SELECT email, pass, nombre, apellidoPaterno, apellidoMaterno FROM Empleados where idEmpleado=1");
            rs = ps.executeQuery();
           
           
            
            //Comparacion en login 
            if (usuario.isEmpty() || passw.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llena todos los campos!");

            } else {
                
                
                rs.next();
            String email = rs.getString("email");
            
            String pass = rs.getString("pass");
            
            String nombre = rs.getString("nombre");
            
            String apP = rs.getString("apellidoPaterno");
            
            String apM = rs.getString("apellidoMaterno");
            
           
                if (usuario.equals(email) && passw.equals(pass)) {
                    JOptionPane.showMessageDialog(null, "Bienvenido");
                   
                    pr.setVisible(true);
                    pr.lblNombre.setText(nombre+" "+apP+" "+apM);
                    this.setVisible(false);
                    
                } 
                else {
                    
                    JOptionPane.showMessageDialog(null, "Su usuario o contraseña es incorrecto!");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        
        
        
      
         */
        //************************Código de JO******************************************//
        if (txfEmail.getText().isEmpty() || txfPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor rellena todos los campos");
        } else {
            Principal pr = new Principal();
            String email = txfEmail.getText();
            String passwordT = txfPass.getText();
            String pass = "";
            String n = "";
            String p = "";
            String m = "";
            String nombre;
            int bandera = 0;
            try {
                PreparedStatement ps;
                ResultSet rs;
                Connection con = Conexion.getConexion();
                ps = con.prepareStatement("SELECT COUNT(*) AS total FROM Empleados WHERE email=?");
                ps.setString(1, email);
                rs = ps.executeQuery();
                while (rs.next()) {
                    bandera = rs.getInt("total");
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
            if (bandera == 0) {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            } else {//El usuario si existe en la BD
                try {
                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT pass, nombre, apellidoPaterno, apellidoMaterno FROM Empleados WHERE email=?");
                    ps.setString(1, email);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        pass = rs.getString("pass");
                        n = rs.getString("nombre");
                        p = rs.getString("apellidoPaterno");
                        m = rs.getString("apellidoMaterno");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
                if (!passwordT.equals(pass)) {
                    JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                } else {
                    nombre = n + " " + p + " " + m;
                    pr.setVisible(true);
                    pr.lblNombre.setText(nombre);
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private void lblImagen() {
        ImageIcon login = new ImageIcon("src/Img/login.jpg");
        lblIcono.setIcon(new ImageIcon(login.getImage().getScaledInstance(lblIcono.getWidth(), lblIcono.getHeight(), Image.SCALE_SMOOTH)));        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIcono;
    private javax.swing.JTextField txfEmail;
    private javax.swing.JPasswordField txfPass;
    // End of variables declaration//GEN-END:variables
}
