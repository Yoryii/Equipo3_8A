package Ventanas;

import Coexion.Conexion;
import Coexion.HelperEmpaques;
import Coexion.HelperProductos;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PresentacionesProducto extends javax.swing.JFrame {

    public PresentacionesProducto() {
        initComponents();
        txtId.setVisible(false);
        botonImagen();
        HelperProductos hpProductos = new HelperProductos();
        HelperEmpaques hpEmpaques = new HelperEmpaques();
        cmbProducto.setModel(hpProductos.getValues());
        cmbEmpaque.setModel(hpEmpaques.getValues());
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPrecioCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPuntoReorden = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cmbProducto = new javax.swing.JComboBox<>();
        cmbEmpaque = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPresentacionesProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Presentaciones de producto");

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setText("Precio de compra");

        jLabel2.setText("Precio de venta");

        jLabel3.setText("Punto de reorden");

        jLabel4.setText("Producto");

        jLabel5.setText("Empaque");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cmbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnGuardar)))
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPuntoReorden)
                            .addComponent(txtPrecioVenta)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPrecioCompra)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(cmbEmpaque, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecioCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtPuntoReorden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(cmbEmpaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Presentaciones de productos");

        tblPresentacionesProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Precio de compra", "Precio de venta", "Punto de reorden", "Producto", "Empaque"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPresentacionesProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPresentacionesProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPresentacionesProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean editando = false;
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (editando) {//editar
            if (txtPrecioCompra.getText().isEmpty() || txtPrecioVenta.getText().isEmpty() || txtPuntoReorden.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int id = Integer.parseInt(txtId.getText());
                float precioCompra = Float.parseFloat(txtPrecioCompra.getText());
                float precioVenta = Float.parseFloat(txtPrecioVenta.getText());
                float puntoReorden = Float.parseFloat(txtPuntoReorden.getText());
                String estatus = "A";
                //Sacar idProducto e idEmpaque inicio
                int idProducto = 1;
                int idEmpaque = 1;
                String producto = (String) cmbProducto.getSelectedItem();
                String empaque = (String) cmbEmpaque.getSelectedItem();

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idProducto FROM Productos WHERE nombre=?");
                    ps.setString(1, producto);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idProducto = rs.getInt("idProducto");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idEmpaque FROM Empaques WHERE nombre=?");
                    ps.setString(1, empaque);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idEmpaque = rs.getInt("idEmpaque");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                //Sacar idProducto e idEmpaque fin
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE PresentacionesProducto SET precioCompra=?, precioVenta=?, puntoReorden=?, idProducto=?, idEmpaque=?, estatus=? WHERE idPresentacion=?");
                    ps.setFloat(1, precioCompra);
                    ps.setFloat(2, precioVenta);
                    ps.setFloat(3, puntoReorden);
                    ps.setInt(4, idProducto);
                    ps.setInt(5, idEmpaque);
                    ps.setString(6, estatus);
                    ps.setInt(7, id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro modificado con exito");
                    Limpiar();
                    cargarTabla();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }
            }
        } else {//guardar
            if (txtPrecioCompra.getText().isEmpty() || txtPrecioVenta.getText().isEmpty() || txtPuntoReorden.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                float precioCompra = Float.parseFloat(txtPrecioCompra.getText());
                float precioVenta = Float.parseFloat(txtPrecioVenta.getText());
                float puntoReorden = Float.parseFloat(txtPuntoReorden.getText());
                String estatus = "A";
                //Sacar idProducto e idEmpaque inicio
                int idProducto = 1;
                int idEmpaque = 1;
                String producto = (String) cmbProducto.getSelectedItem();
                String empaque = (String) cmbEmpaque.getSelectedItem();

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idProducto FROM Productos WHERE nombre=?");
                    ps.setString(1, producto);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idProducto = rs.getInt("idProducto");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idEmpaque FROM Empaques WHERE nombre=?");
                    ps.setString(1, empaque);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idEmpaque = rs.getInt("idEmpaque");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                //Sacar idProducto e idEmpaque fin
                //inicio
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO PresentacionesProducto "
                            + "(precioCompra, precioVenta, puntoReorden, idProducto, idEmpaque, estatus) VALUES (?,?,?,?,?,?)");
                    ps.setFloat(1, precioCompra);
                    ps.setFloat(2, precioVenta);
                    ps.setFloat(3, puntoReorden);
                    ps.setInt(4, idProducto);
                    ps.setInt(5, idEmpaque);
                    ps.setString(6, estatus);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro guardado con exito");
                    Limpiar();
                    cargarTabla();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }
                //fin
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblPresentacionesProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPresentacionesProductosMouseClicked
        try {

            int fila = tblPresentacionesProductos.getSelectedRow();
            int id = Integer.parseInt(tblPresentacionesProductos.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();
            editando = true;
            ps = con.prepareStatement("SELECT PP.precioCompra, PP.precioVenta, PP.puntoReorden, P.nombre AS Producto, E.nombre AS Empaque FROM PresentacionesProducto AS PP INNER JOIN Productos AS P ON PP.idProducto = P.idProducto INNER JOIN Empaques AS E ON PP.idEmpaque = e.idEmpaque WHERE PP.idPresentacion = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(String.valueOf(id));
                txtPrecioCompra.setText(rs.getString("precioCompra"));
                txtPrecioVenta.setText(rs.getString("precioVenta"));
                txtPuntoReorden.setText(rs.getString("puntoReorden"));
                cmbEmpaque.setSelectedItem(rs.getString("Empaque"));
                cmbProducto.setSelectedItem(rs.getString("Producto"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblPresentacionesProductosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE PresentacionesProducto SET estatus = 'I' WHERE idPresentacion = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            Limpiar();
            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        editando = false;
        Limpiar();
        cargarTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Principal pr = new Principal();
        pr.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void Limpiar() {
        txtId.setText("");
        txtPrecioCompra.setText("");
        txtPrecioVenta.setText("");
        txtPuntoReorden.setText("");
        cmbEmpaque.setSelectedIndex(0);
        cmbProducto.setSelectedIndex(0);
    }

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblPresentacionesProductos.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] ancho = {5, 100, 100, 100, 100, 100};
        for (int i = 0; i < tblPresentacionesProductos.getColumnCount(); i++) {
            tblPresentacionesProductos.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT PP.idPresentacion, PP.precioCompra, PP.precioVenta, PP.puntoReorden, P.nombre, E.nombre FROM PresentacionesProducto AS PP INNER JOIN Productos AS P ON PP.idProducto = P.idProducto INNER JOIN Empaques AS E ON PP.idEmpaque = e.idEmpaque WHERE PP.estatus = 'A'");
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
            java.util.logging.Logger.getLogger(PresentacionesProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresentacionesProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresentacionesProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresentacionesProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PresentacionesProducto().setVisible(true);
            }
        });
    }
    
    private void botonImagen(){
        ImageIcon guardar = new ImageIcon("src/Img/saveIcon.png");
        btnGuardar.setIcon(new ImageIcon(guardar.getImage().getScaledInstance(btnGuardar.getWidth(), btnGuardar.getHeight(), Image.SCALE_SMOOTH)));
        
        ImageIcon eliminar = new ImageIcon("src/Img/Delete.png");
        btnEliminar.setIcon(new ImageIcon(eliminar.getImage().getScaledInstance(btnEliminar.getWidth(), btnEliminar.getHeight(), Image.SCALE_SMOOTH)));
        
        ImageIcon regresar = new ImageIcon("src/Img/arrow.png");
        btnRegresar.setIcon(new ImageIcon(regresar.getImage().getScaledInstance(btnRegresar.getWidth(), btnRegresar.getHeight(), Image.SCALE_SMOOTH)));
        
        ImageIcon cancelar = new ImageIcon("src/Img/deleteIcon.png");
        btnCancelar.setIcon(new ImageIcon(cancelar.getImage().getScaledInstance(btnCancelar.getWidth(), btnCancelar.getHeight(), Image.SCALE_SMOOTH)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbEmpaque;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPresentacionesProductos;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecioCompra;
    private javax.swing.JTextField txtPrecioVenta;
    private javax.swing.JTextField txtPuntoReorden;
    // End of variables declaration//GEN-END:variables
}
