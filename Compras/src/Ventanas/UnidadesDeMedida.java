package Ventanas;

import Coexion.Conexion;
import java.awt.Image;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import DAO.SQLServer.UnidadesSQLServerDAO;

import javax.swing.JFrame;

public class UnidadesDeMedida extends javax.swing.JFrame {

    public UnidadesDeMedida() {
        initComponents();
        setDefaultCloseOperation(0);
        setLocationRelativeTo(null);
        this.setResizable(false);
        txfEstatus.setVisible(false);
        txfId.setVisible(false);

        cargarTabla();
        botonImagen();
        desactivarBotones();
        

        //Notas en botones
        btnGuardar.setToolTipText("(?) Pulsa para guardar registro.");
        btnEliminar.setToolTipText("(?) Pulsa para eliminar registro.");
        btnCancelar.setToolTipText("(?) Cancelar modificación de registro.");

        //Desactivados
        txfSiglas.setEditable(false);
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);

    }

    boolean editando = false;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUnidades = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfNombre = new javax.swing.JTextField();
        txfSiglas = new javax.swing.JTextField();
        txfEstatus = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txfId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unidades de Medida");

        tblUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Siglas", "Estatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUnidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUnidades);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setToolTipText("");

        jLabel1.setText("Nombre");

        jLabel2.setText("Siglas");

        txfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfNombreActionPerformed(evt);
            }
        });
        txfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfNombreKeyReleased(evt);
            }
        });

        txfSiglas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfSiglasKeyReleased(evt);
            }
        });

        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txfNombre)
                    .addComponent(txfSiglas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfEstatus, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(txfSiglas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        jLabel4.setText("Unidades de Medida");

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAnterior)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSiguiente))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnterior)
                            .addComponent(btnSiguiente))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int cantidad = 5;
    int pagina = 1;
    int rango = ((pagina - 1) * cantidad);
    int total;
    int numeroPaginas;
    private void txfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfNombreActionPerformed

    }//GEN-LAST:event_txfNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        if (editando) {
            if (txfNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos!");
            } else {

                int id = Integer.parseInt(txfId.getText());
                String nombre = txfNombre.getText();
                String siglas = txfSiglas.getText();

                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE UnidadesMedida SET nombre=?, siglas=?, estatus='A' WHERE IdUnidad=?");

                    ps.setString(1, nombre);
                    ps.setString(2, siglas);
                    ps.setInt(3, id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro modificado.");
                    limpiar();
                    cargarTabla();
                    //AQUI CREO QUE DEBEMOS PONERLO EN FALSE 
                    //editando=false;
                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }

            }
        } else {//guardar
            if (txfNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos!");
            } else {
                String nombre = txfNombre.getText();
                String siglas = txfSiglas.getText();
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO UnidadesMedida (nombre, siglas, estatus) VALUES (?,?,'A')");
                    ps.setString(1, nombre);
                    ps.setString(2, siglas);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro guardado.");
                    limpiar();
                    cargarTabla();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }
            }
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(false);
        editando = false;
        limpiar();
        cargarTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblUnidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUnidadesMouseClicked
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        try {
            int fila = tblUnidades.getSelectedRow();
            int id = Integer.parseInt(tblUnidades.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            editando = true;
            activarBotones();
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT nombre, siglas FROM UnidadesMedida WHERE idUnidad=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txfId.setText(String.valueOf(id));
                txfNombre.setText(rs.getString("nombre"));
                txfSiglas.setText(rs.getString("siglas"));
                //txfEstatus.setText(rs.getString("estatus"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblUnidadesMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);

        int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de eliminar el registro?");
        if (confirmacion != 0) {
            limpiar();
        } else {
            int id = Integer.parseInt(txfId.getText());
            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE UnidadesMedida SET estatus = 'I' WHERE idUnidad = ?");
                ps.setInt(1, id);
                ps.executeUpdate();
                limpiar();
                cargarTabla();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        
        }    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Principal pr = new Principal();
        pr.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    
    boolean n = false;
    boolean s = false;
    
     private boolean validarCamposVacios() {
        boolean x;
        n = txfNombre.getText().length() != 0;
        s = txfSiglas.getText().length() != 0;
        x = n && s;
        return x;
    }
    
    private boolean validarCampoNoVacio(){
        boolean y;
        n = txfNombre.getText().length() != 0;
        s = txfSiglas.getText().length() != 0;
        y = n || s;
        return y;
    }
    
    private void txfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNombreKeyReleased

        txfSiglas.setEditable(txfNombre.getText().length() != 0);
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);

    }//GEN-LAST:event_txfNombreKeyReleased

    private void txfSiglasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSiglasKeyReleased
        btnGuardar.setEnabled(txfSiglas.getText().length() != 0);
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txfSiglasKeyReleased

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
         pagina--;
        rango = ((pagina - 1) * cantidad);
        cargarTabla();
        calcularNumeroPaginas();
        if (pagina == 1) {
            btnAnterior.setEnabled(false);
        } else {
            btnAnterior.setEnabled(true);
        }
        if (numeroPaginas == pagina) {
            btnSiguiente.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        pagina++;
        btnAnterior.setEnabled(true);
        rango = ((pagina - 1) * cantidad);
        cargarTabla();
        calcularNumeroPaginas();
        if (pagina == 1) {
            btnAnterior.setEnabled(false);
        } else {
            btnAnterior.setEnabled(true);
        }
        if (numeroPaginas == pagina) {
            btnSiguiente.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
        }
    }//GEN-LAST:event_btnSiguienteActionPerformed

    public String getNombre() {
        String nombre = txfNombre.getText();
        return nombre;
    }

    public String getSiglas() {
        String siglas = txfSiglas.getText();
        return siglas;
    }

    private void limpiar() {
        txfId.setText("");
        txfNombre.setText("");
        txfSiglas.setText("");
        txfEstatus.setText("");
        desactivarBotones();
        editando = false;
       

        editando = false;

    }

    private void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblUnidades.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();

            ps = con.prepareStatement("SELECT idUnidad, nombre, siglas, estatus FROM UnidadesMedida WHERE estatus = 'A' ORDER BY idUnidad ASC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
            ps.setInt(1, rango);
            ps.setInt(2, cantidad);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        calcularNumeroPaginas();
        if (pagina == 1) {
            btnAnterior.setEnabled(false);
        } else {
            btnAnterior.setEnabled(true);
        }
        if (numeroPaginas == pagina) {
            btnSiguiente.setEnabled(false);
        } else {
            btnSiguiente.setEnabled(true);
        }

    }

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
            java.util.logging.Logger.getLogger(UnidadesDeMedida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnidadesDeMedida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnidadesDeMedida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnidadesDeMedida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnidadesDeMedida().setVisible(true);
            }
        });
    }

    private void botonImagen() {

       ImageIcon guardar = new ImageIcon("src/Img/saveIcon.png");
        btnGuardar.setIcon(new ImageIcon(guardar.getImage().getScaledInstance(btnGuardar.getWidth(), btnGuardar.getHeight(), Image.SCALE_SMOOTH)));
        
        ImageIcon eliminar = new ImageIcon("src/Img/Delete.png");
        btnEliminar.setIcon(new ImageIcon(eliminar.getImage().getScaledInstance(btnEliminar.getWidth(), btnEliminar.getHeight(), Image.SCALE_SMOOTH)));
        
        ImageIcon regresar = new ImageIcon("src/Img/arrow.png");
        btnRegresar.setIcon(new ImageIcon(regresar.getImage().getScaledInstance(btnRegresar.getWidth(), btnRegresar.getHeight(), Image.SCALE_SMOOTH)));
        
        ImageIcon cancelar = new ImageIcon("src/Img/deleteIcon.png");
        btnCancelar.setIcon(new ImageIcon(cancelar.getImage().getScaledInstance(btnCancelar.getWidth(), btnCancelar.getHeight(), Image.SCALE_SMOOTH)));
       

    }
     private void desactivarBotones(){
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }
    

    private void activarBotones(){
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }
     private void sacarTotal() {
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT COUNT(*) AS total FROM UnidadesMedida WHERE estatus='A'");
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
     private void calcularNumeroPaginas() {
        sacarTotal();
        float totalf;
        float cantidadf;
        totalf = (float) total;
        cantidadf = (float) cantidad;
        float x = (totalf / cantidadf);
        numeroPaginas = (int) Math.ceil(x);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUnidades;
    public static javax.swing.JTextField txfEstatus;
    public static javax.swing.JTextField txfId;
    public static javax.swing.JTextField txfNombre;
    public static javax.swing.JTextField txfSiglas;
    // End of variables declaration//GEN-END:variables
}
