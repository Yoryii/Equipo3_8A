package Ventanas;

import Coexion.Conexion;
import Coexion.HelperProveedores;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CuentasProveedor extends javax.swing.JFrame {

    public CuentasProveedor() {
        initComponents();
        txtId.setVisible(false);
        botonImagen();
        HelperProveedores hpProveedores = new HelperProveedores();
        cmbProveedor.setModel(hpProveedores.getValues());
        cargarTabla();
        desactivarBotones();
        btnAnterior.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNoCuenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBanco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtReferencia = new javax.swing.JTextField();
        cmbProveedor = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCuentasProveedor = new javax.swing.JTable();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuentas Proveedor");

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Número de cuenta");

        txtNoCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNoCuentaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoCuentaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Banco");

        txtBanco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBancoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBancoKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Referencia bancaria");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Proveedor");

        txtReferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReferenciaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReferenciaKeyTyped(evt);
            }
        });

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNoCuenta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtBanco)
                    .addComponent(txtReferencia))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtNoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Cuentas Proveedor");

        tblCuentasProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "No. Cuenta", "Banco", "Referencia", "Proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCuentasProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCuentasProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCuentasProveedor);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguiente)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(198, 198, 198))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnterior)
                            .addComponent(btnSiguiente)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Principal pr = new Principal();
        pr.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (editando) {//editar
            if (txtNoCuenta.getText().isEmpty() || txtBanco.getText().isEmpty() || txtReferencia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int id = Integer.parseInt(txtId.getText());
                String noCuenta = txtNoCuenta.getText();
                String banco = txtBanco.getText();
                String referencia = txtReferencia.getText();
                String estatus = "A";
                //Sacar idProveedor inicio
                int idProveedor = 1;
                String proveedor = (String) cmbProveedor.getSelectedItem();

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idProveedor FROM Proveedores WHERE nombre=?");
                    ps.setString(1, proveedor);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idProveedor = rs.getInt("idProveedor");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
                //Sacar idProveedor fin
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE CuentasProveedor SET noCuenta=?, banco=?, referenciaBancaria=?, estatus=?, idProveedor=? WHERE idCuentaProveedor=?");
                    ps.setString(1, noCuenta);
                    ps.setString(2, banco);
                    ps.setString(3, referencia);
                    ps.setString(4, estatus);
                    ps.setInt(5, idProveedor);
                    ps.setInt(6, id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro modificado con exito");
                    Limpiar();
                    cargarTabla();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }
            }
        } else {//guardar
            if (txtNoCuenta.getText().isEmpty() || txtBanco.getText().isEmpty() || txtReferencia.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                String noCuenta = txtNoCuenta.getText();
                String banco = txtBanco.getText();
                String referencia = txtReferencia.getText();
                String estatus = "A";
                //Sacar idProveedor inicio
                int idProveedor = 1;
                String proveedor = (String) cmbProveedor.getSelectedItem();

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idProveedor FROM Proveedores WHERE nombre=?");
                    ps.setString(1, proveedor);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idProveedor = rs.getInt("idProveedor");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
                //Sacar idProveedor fin
                //inicio
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO CuentasProveedor "
                            + "(noCuenta, banco, referenciaBancaria, estatus, idProveedor) VALUES (?,?,?,?,?)");
                    ps.setString(1, noCuenta);
                    ps.setString(2, banco);
                    ps.setString(3, referencia);
                    ps.setString(4, estatus);
                    ps.setInt(5, idProveedor);
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

    private void tblCuentasProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCuentasProveedorMouseClicked
        try {

            int fila = tblCuentasProveedor.getSelectedRow();
            int id = Integer.parseInt(tblCuentasProveedor.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();
            editando = true;
            activarBotones();
            ps = con.prepareStatement("SELECT C.noCuenta, C.banco, C.referenciaBancaria, P.nombre AS Proveedor FROM CuentasProveedor AS C JOIN Proveedores AS P ON C.idProveedor = P.idProveedor WHERE idCuentaProveedor=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(String.valueOf(id));
                txtNoCuenta.setText(rs.getString("noCuenta"));
                txtBanco.setText(rs.getString("banco"));
                txtReferencia.setText(rs.getString("referenciaBancaria"));
                cmbProveedor.setSelectedItem(rs.getString("Proveedor"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblCuentasProveedorMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        editando = false;
        Limpiar();
        cargarTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de eliminar el registro?");
        if (confirmacion != 0) {
            Limpiar();
        } else {
            int id = Integer.parseInt(txtId.getText());
            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE CuentasProveedor SET estatus = 'I' WHERE idCuentaProveedor = ?");
                ps.setInt(1, id);
                ps.executeUpdate();
                Limpiar();
                cargarTabla();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNoCuentaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCuentaKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtNoCuentaKeyReleased

    private void txtBancoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBancoKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtBancoKeyReleased

    private void txtReferenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReferenciaKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtReferenciaKeyReleased

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

    private void txtNoCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCuentaKeyTyped
        if (txtNoCuenta.getText().length() == 10) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {//solo acepta digitos
            evt.consume();
        }
    }//GEN-LAST:event_txtNoCuentaKeyTyped

    private void txtReferenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReferenciaKeyTyped
        if (txtReferencia.getText().length() == 20) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9' && c < 'a' || c > 'z')) {//solo acepta digitos y letras
            evt.consume();
        }
    }//GEN-LAST:event_txtReferenciaKeyTyped

    private void txtBancoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBancoKeyTyped
        if (txtBanco.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBancoKeyTyped

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
            java.util.logging.Logger.getLogger(CuentasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuentasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuentasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuentasProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuentasProveedor().setVisible(true);
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

    private void Limpiar() {
        txtId.setText("");
        txtNoCuenta.setText("");
        txtBanco.setText("");
        txtReferencia.setText("");
        cmbProveedor.setSelectedIndex(0);
        desactivarBotones();
        cargarTabla();
        editando = false;

    }

    private void desactivarBotones() {
        btnGuardar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    private void activarBotones() {
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    private void sacarTotal() {
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT COUNT(*) AS total FROM CuentasProveedor WHERE estatus='A'");
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

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblCuentasProveedor.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] ancho = {15, 70, 100, 130, 100};
        for (int i = 0; i < tblCuentasProveedor.getColumnCount(); i++) {
            tblCuentasProveedor.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT C.idCuentaProveedor, C.noCuenta, C.banco, C.referenciaBancaria, P.nombre AS Proveedor FROM CuentasProveedor AS C JOIN Proveedores AS P ON C.idProveedor = P.idProveedor WHERE C.estatus = 'A' ORDER BY idCuentaProveedor ASC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
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

    private boolean validarCamposVacios() {
        boolean x;
        n = txtNoCuenta.getText().length() == 10;
        b = txtBanco.getText().length() != 0;
        r = txtReferencia.getText().length() == 20;
        x = n && b && r;
        return x;
    }

    private boolean validarCampoNoVacio() {
        boolean y;
        n = txtNoCuenta.getText().length() != 0;
        b = txtBanco.getText().length() != 0;
        r = txtReferencia.getText().length() != 0;
        y = n || b || r;
        return y;
    }

    //Validaciones de campos
    boolean n = false;
    boolean b = false;
    boolean r = false;

    //Variables
    boolean editando = false;
    int total;
    int cantidad = 5;
    int numeroPaginas;
    int pagina = 1;
    int rango = ((pagina - 1) * cantidad);
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCuentasProveedor;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNoCuenta;
    private javax.swing.JTextField txtReferencia;
    // End of variables declaration//GEN-END:variables
}
