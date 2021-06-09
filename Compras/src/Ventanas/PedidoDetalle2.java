package Ventanas;

import Coexion.Conexion;
import Coexion.HelperPedidos;
import Coexion.HelperPresentacionesProducto;
import Coexion.HelperProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PedidoDetalle2 extends javax.swing.JFrame {

    int noPed = TablaPedidos.noPedido;

    public PedidoDetalle2() {

        initComponents();

        setLocationRelativeTo(null);
        this.setResizable(false);
        txfCantidad.setEnabled(false);
        //btnAceptar.setEnabled(false);
        txfPrecio.setEditable(false);
        //txfSubtotal.setEditable(false);
        txfPedido.setText("" + noPed);

        //HelperPresentacionesProducto hpPresent = new HelperPresentacionesProducto();
        //cmbPresentacion.setModel(hpPresent.getValues());
        

        HelperProductos hpProductos = new HelperProductos();
        cmbProducto.setModel(hpProductos.getValues());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfCantidad = new javax.swing.JTextField();
        txfPrecio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txfSubtotal = new javax.swing.JTextField();
        cmbPresentacion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbProducto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txfPedido = new javax.swing.JTextField();
        txfPrueba = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad");

        jLabel2.setText("Precio");

        txfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfCantidadActionPerformed(evt);
            }
        });
        txfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCantidadKeyReleased(evt);
            }
        });

        txfPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfPrecioKeyReleased(evt);
            }
        });

        jLabel3.setText("Subtotal");

        cmbPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPresentacionActionPerformed(evt);
            }
        });

        jLabel5.setText("Presentación");

        btnAceptar.setText("Guardar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbProducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProductoItemStateChanged(evt);
            }
        });
        cmbProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProductoActionPerformed(evt);
            }
        });

        jLabel6.setText("Producto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cmbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(cmbProducto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(txfPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(cmbProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txfPrueba, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(83, 83, 83))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfCantidadActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        TablaPedidos ped = new TablaPedidos();
        ped.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        TablaPedidos ped = new TablaPedidos();

        ped.setVisible(true);
        this.setVisible(false);

        int cantidad = Integer.parseInt(txfCantidad.getText());
        Float precio = Float.parseFloat(txfPrecio.getText());
        Float subtotal = Float.parseFloat(txfSubtotal.getText());

        int idPedido = 1;
        int idPresentacion = 1;

      
        String presentacion = (String) cmbPresentacion.getSelectedItem();

        

        //Presentacion
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT idPresentacion FROM PresentacionesProducto WHERE nombre=?");
            ps.setString(1, presentacion);
            rs = ps.executeQuery();
            while (rs.next()) {
                idPresentacion = rs.getInt("idPresentacion");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        try {

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO PedidoDetalle (cantPedida, precioCompra, subTotal, cantRecibida, cantRechazada, cantAceptada, idPedido, idPresentacion) VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1, cantidad);
            ps.setFloat(2, precio);
            ps.setFloat(3, subtotal);
            ps.setInt(4, 0);
            ps.setInt(5, 0);
            ps.setInt(6, 0);
            ps.setInt(7, noPed);
            ps.setInt(8, idPresentacion);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado.");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txfPrecioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfPrecioKeyReleased
        
    }//GEN-LAST:event_txfPrecioKeyReleased

    private void txfCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadKeyReleased
        int limite = 1;

        if (txfPrecio.getText().length() > 0) {
            int cantidad = Integer.parseInt(txfCantidad.getText());
            float precio = Float.parseFloat(txfPrecio.getText());
            float mult = cantidad * precio;
            txfSubtotal.setText("" + mult);
        } else {
            txfSubtotal.setText("");
        }
    }//GEN-LAST:event_txfCantidadKeyReleased

    private void cmbPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPresentacionActionPerformed
    txfCantidad.setEnabled(true);
        
        String nombre = (String) cmbPresentacion.getSelectedItem();
        float precio = 0;
        int numProducto = (cmbProducto.getSelectedIndex());
        txfPrueba.setText(nombre+"  "+numProducto);
        
        try {
            PreparedStatement ps;
            ResultSet rs;
            Connection cn = Conexion.getConexion();
            ps = cn.prepareStatement("SELECT precioCompra FROM PresentacionesProducto WHERE nombre=? and idProducto=?");
            
            ps.setString(1, nombre);
            ps.setInt(2, numProducto);
            rs = ps.executeQuery();
            while (rs.next()) {
                precio = rs.getFloat("precioCompra");
            }
            
           // ps.setInt(2, numProducto);
            
            
            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        txfPrecio.setText("" + precio);
        
    }//GEN-LAST:event_cmbPresentacionActionPerformed

    private void cmbProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProductoActionPerformed
        
        int numProducto = cmbProducto.getSelectedIndex();
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            PreparedStatement ps;
            ResultSet rs;
            Connection cn = Conexion.getConexion();
            ps = cn.prepareStatement("SELECT nombre FROM PresentacionesProducto WHERE idProducto=?");
            //Statement st = cn.createStatement();

            ps.setInt(1, numProducto);
            rs = ps.executeQuery();
            while (rs.next()) {
                modelo.addElement(rs.getString(1));
            }
            cn.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        cmbPresentacion.setModel(modelo);


    }//GEN-LAST:event_cmbProductoActionPerformed

    private void cmbProductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProductoItemStateChanged

     }//GEN-LAST:event_cmbProductoItemStateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PedidoDetalle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoDetalle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoDetalle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoDetalle2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoDetalle2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cmbPresentacion;
    private javax.swing.JComboBox<String> cmbProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JTextField txfPedido;
    private javax.swing.JTextField txfPrecio;
    private javax.swing.JTextField txfPrueba;
    private javax.swing.JTextField txfSubtotal;
    // End of variables declaration//GEN-END:variables
}
