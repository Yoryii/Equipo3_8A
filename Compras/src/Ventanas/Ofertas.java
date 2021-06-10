package Ventanas;

import Coexion.Conexion;
import Coexion.HelperPresentacionesProducto;
import java.awt.Image;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ofertas extends javax.swing.JFrame {

    public Ofertas() {
        initComponents();
        txtId.setVisible(false);
        botonImagen();
        HelperPresentacionesProducto hpPresentaciones = new HelperPresentacionesProducto();
        cmbPresentacion.setModel(hpPresentaciones.getValues());
        cargarTabla();
        desactivarBotones();
        btnAnterior.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPorDescuento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMinima = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cmbPresentacion = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jdcFechaInicio = new com.toedter.calendar.JDateChooser();
        jdcFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOfertas = new javax.swing.JTable();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ofertas");

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Descripción");

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Porcentaje de descuento");

        txtPorDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPorDescuentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorDescuentoKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de inicio");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Fecha de finalización");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Cantidad mínima de producto");

        txtMinima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMinimaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMinimaKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Presentación");

        cmbPresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPresentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPresentacionActionPerformed(evt);
            }
        });

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

        jdcFechaInicio.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaInicioPropertyChange(evt);
            }
        });

        jdcFechaFin.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcFechaFinPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombre)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDescripcion)
                    .addComponent(txtPorDescuento)
                    .addComponent(txtMinima)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(cmbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jdcFechaFin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(jdcFechaInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtPorDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jdcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jdcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtMinima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(cmbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Ofertas");

        tblOfertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción", "% Descuento", "Inicio", "Fin", "Cant. Mínima", "Presentación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblOfertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblOfertasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblOfertas);

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
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguiente)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(371, 371, 371))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnterior)
                            .addComponent(btnSiguiente))
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbPresentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPresentacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPresentacionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        Principal pr = new Principal();
        pr.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        if (editando) {//editar
            if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPorDescuento.getText().isEmpty() || txtMinima.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int id = Integer.parseInt(txtId.getText());
                String nombre = txtNombre.getText();
                String descripcion = txtDescripcion.getText();
                String descuento = txtPorDescuento.getText();
                Calendar fi = jdcFechaInicio.getCalendar();
                String finicio = fi.get(Calendar.YEAR) + "-" + fi.get(Calendar.MONTH) + "-" + fi.get(Calendar.DATE);
                Calendar ff = jdcFechaFin.getCalendar();
                String ffin = ff.get(Calendar.YEAR) + "-" + ff.get(Calendar.MONTH) + "-" + ff.get(Calendar.DATE);
                String minima = txtMinima.getText();
                String estatus = "A";
                //Sacar idPresentacion inicio
                int idPresentacion = 1;
                String presentacion = (String) cmbPresentacion.getSelectedItem();

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
                //Sacar idPresentacion fin
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE Ofertas SET nombre=?, descripcion=?, porDescuento=?, fechaInicio=?, fechaFin=?, canMinProductos=?, estatus=?, idPresentacion=? WHERE idOferta=?");
                    ps.setString(1, nombre);
                    ps.setString(2, descripcion);
                    ps.setString(3, descuento);
                    ps.setString(4, finicio);
                    ps.setString(5, ffin);
                    ps.setString(6, minima);
                    ps.setString(7, estatus);
                    ps.setInt(8, idPresentacion);
                    ps.setInt(9, id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro modificado con exito");
                    Limpiar();
                    cargarTabla();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }
            }
        } else {//guardar
            if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPorDescuento.getText().isEmpty() || txtMinima.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                String nombre = txtNombre.getText();
                String descripcion = txtDescripcion.getText();
                String descuento = txtPorDescuento.getText();
                Calendar fi = jdcFechaInicio.getCalendar();
                String finicio = fi.get(Calendar.YEAR) + "-" + fi.get(Calendar.MONTH) + "-" + fi.get(Calendar.DATE);
                Calendar ff = jdcFechaFin.getCalendar();
                String ffin = ff.get(Calendar.YEAR) + "-" + ff.get(Calendar.MONTH) + "-" + ff.get(Calendar.DATE);
                String minima = txtMinima.getText();
                String estatus = "A";
                //Sacar idPresentacion inicio
                int idPresentacion = 1;
                String presentacion = (String) cmbPresentacion.getSelectedItem();

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
                //Sacar idPresentacion fin
                //inicio
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Ofertas "
                            + "(nombre, descripcion, porDescuento, fechaInicio, fechaFin, canMinProductos, estatus, idPresentacion) VALUES (?,?,?,?,?,?,?,?)");
                    ps.setString(1, nombre);
                    ps.setString(2, descripcion);
                    ps.setString(3, descuento);
                    ps.setString(4, finicio);
                    ps.setString(5, ffin);
                    ps.setString(6, minima);
                    ps.setString(7, estatus);
                    ps.setInt(8, idPresentacion);
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

    private void tblOfertasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblOfertasMouseClicked
        try {

            int fila = tblOfertas.getSelectedRow();
            int id = Integer.parseInt(tblOfertas.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();
            editando = true;
            activarBotones();
            ps = con.prepareStatement("SELECT O.nombre, O.descripcion, O.porDescuento, O.fechaInicio, O.fechaFin, O.canMinProductos, P.nombre AS Presentacion FROM Ofertas AS O JOIN PresentacionesProducto AS P ON O.idPresentacion = P.idPresentacion WHERE idOferta=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(String.valueOf(id));
                txtNombre.setText(rs.getString("nombre"));
                txtDescripcion.setText(rs.getString("descripcion"));
                txtPorDescuento.setText(rs.getString("porDescuento"));
                //txtInicio.setText(rs.getString("fechaInicio"));
                Date fechaInicio = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fechaInicio"));
                jdcFechaInicio.setDate(fechaInicio);
                //txtFin.setText(rs.getString("fechaFin"));
                Date fechaFin = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString("fechaFin"));
                jdcFechaFin.setDate(fechaFin);
                txtMinima.setText(rs.getString("canMinProductos"));
                cmbPresentacion.setSelectedItem(rs.getString("Presentacion"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        } catch (ParseException ex) {
            Logger.getLogger(Ofertas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblOfertasMouseClicked

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
                PreparedStatement ps = con.prepareStatement("UPDATE Ofertas SET estatus = 'I' WHERE idOferta = ?");
                ps.setInt(1, id);
                ps.executeUpdate();
                Limpiar();
                cargarTabla();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtDescripcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtDescripcionKeyReleased

    private void txtPorDescuentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorDescuentoKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtPorDescuentoKeyReleased

    private void txtMinimaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinimaKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtMinimaKeyReleased

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

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() == 50) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (txtDescripcion.getText().length() == 100) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtPorDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorDescuentoKeyTyped
        char c = evt.getKeyChar();

        boolean hayPunto = false;
        String cadena = txtPorDescuento.getText();
        for (int i = 0; i < cadena.length(); i++) {
            if (".".charAt(0) == cadena.charAt(i)) {
                hayPunto = true;
            }
        }

        if (hayPunto) {
            if ((c < '0' || c > '9')) {//solo acepta digitos
                evt.consume();
            }
        } else {
            if ((c < '0' || c > '9') && c != '.') {//acepta digitos y puntos
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtPorDescuentoKeyTyped

    private void txtMinimaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMinimaKeyTyped
        char c = evt.getKeyChar();
        if ((c < '0' || c > '9')) {//solo acepta digitos
            evt.consume();
        }
    }//GEN-LAST:event_txtMinimaKeyTyped

    private void jdcFechaInicioPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaInicioPropertyChange
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_jdcFechaInicioPropertyChange

    private void jdcFechaFinPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcFechaFinPropertyChange
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_jdcFechaFinPropertyChange

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
            java.util.logging.Logger.getLogger(Ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ofertas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ofertas().setVisible(true);
            }
        });
    }

    private void botonImagen() {
        //ImageIcon guardar = new ImageIcon("src/Img/saveIcon.png");
        ImageIcon guardar = new ImageIcon(getClass().getResource("/Img/saveIcon.png"));
        btnGuardar.setIcon(new ImageIcon(guardar.getImage().getScaledInstance(btnGuardar.getWidth(), btnGuardar.getHeight(), Image.SCALE_SMOOTH)));
        
        //ImageIcon eliminar = new ImageIcon("src/Img/Delete.png");
        ImageIcon eliminar = new ImageIcon(getClass().getResource("/Img/Delete.png"));
        btnEliminar.setIcon(new ImageIcon(eliminar.getImage().getScaledInstance(btnEliminar.getWidth(), btnEliminar.getHeight(), Image.SCALE_SMOOTH)));
        
        //ImageIcon regresar = new ImageIcon("src/Img/arrow.png");
        ImageIcon regresar = new ImageIcon(getClass().getResource("/Img/arrow.png"));
        btnRegresar.setIcon(new ImageIcon(regresar.getImage().getScaledInstance(btnRegresar.getWidth(), btnRegresar.getHeight(), Image.SCALE_SMOOTH)));
        
        //ImageIcon cancelar = new ImageIcon("src/Img/deleteIcon.png");
        ImageIcon cancelar = new ImageIcon(getClass().getResource("/Img/deleteIcon.png"));
        btnCancelar.setIcon(new ImageIcon(cancelar.getImage().getScaledInstance(btnCancelar.getWidth(), btnCancelar.getHeight(), Image.SCALE_SMOOTH)));
    }

    private void Limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtPorDescuento.setText("");
        //txtInicio.setText("");
        jdcFechaInicio.setCalendar(null);
        jdcFechaFin.setCalendar(null);
        txtMinima.setText("");
        cmbPresentacion.setSelectedIndex(0);
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
            ps = con.prepareStatement("SELECT COUNT(*) AS total FROM Ofertas WHERE estatus='A'");
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
        DefaultTableModel modeloTabla = (DefaultTableModel) tblOfertas.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] ancho = {15, 100, 150, 70, 80, 80, 70, 150};
        for (int i = 0; i < tblOfertas.getColumnCount(); i++) {
            tblOfertas.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT O.idOferta, O.nombre, O.descripcion, O.porDescuento, O.fechaInicio, O.fechaFin, O.canMinProductos, PP.nombre AS Presentacion FROM Ofertas AS O JOIN PresentacionesProducto PP ON O.idPresentacion = PP.idPresentacion WHERE O.estatus = 'A' ORDER BY idOferta ASC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
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
        n = txtNombre.getText().length() != 0;
        d = txtDescripcion.getText().length() != 0;
        p = txtPorDescuento.getText().length() != 0;
        //i = txtInicio.getText().length() != 0;
        //f = txtFin.getText().length() != 0;
        m = txtMinima.getText().length() != 0;
        x = n && d && p && m && validarDescuento() && validarFecha();
        return x;
    }

    private boolean validarCampoNoVacio() {
        boolean y;
        n = txtNombre.getText().length() != 0;
        d = txtDescripcion.getText().length() != 0;
        p = txtPorDescuento.getText().length() != 0;
        //i = txtInicio.getText().length() != 0;
        //f = txtFin.getText().length() != 0;
        m = txtMinima.getText().length() != 0;
        y = n || d || p || m;
        return y;
    }

    private boolean validarDescuento() {
        String sDescuento = txtPorDescuento.getText();
        Float descuento = Float.parseFloat(sDescuento);
        return (descuento > 0.0 && descuento <= 100.0);
    }
    
    private boolean validarFecha(){
        fechaI = jdcFechaInicio.getCalendar();
        fechaF = jdcFechaFin.getCalendar();
        if (fechaI == null || fechaF == null) {
            return false;
        } else {
            return fechaI.before(fechaF);
        }
    }

    //Validaciones de campos
    boolean n = false;
    boolean d = false;
    boolean p = false;
    //boolean i = false;
    boolean f = false;
    boolean m = false;

    //Variables
    Calendar fechaI;
    Calendar fechaF;
    int total;
    int cantidad = 5;
    int numeroPaginas;
    int pagina = 1;
    int rango = ((pagina - 1) * cantidad);
    boolean editando = false;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JComboBox<String> cmbPresentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaFin;
    private com.toedter.calendar.JDateChooser jdcFechaInicio;
    private javax.swing.JTable tblOfertas;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMinima;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPorDescuento;
    // End of variables declaration//GEN-END:variables
}
