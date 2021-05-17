package Ventanas;

import Coexion.Conexion;
import Coexion.HelperCiudades;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sucursales extends javax.swing.JFrame {

    public Sucursales() {
        initComponents();
        txtId.setVisible(false);
        botonImagen();
        HelperCiudades hpCiudades = new HelperCiudades();
        cmbCiudad.setModel(hpCiudades.getValues());
        cargarTabla();
        desactivarBotones();
        btnAnterior.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPresupuesto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbCiudad = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSucursales = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sucursales");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Teléfono");

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Dirección");

        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDireccionKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Colonia");

        txtColonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColoniaKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Código postal");

        txtCP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCPKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Presupuesto");

        txtPresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPresupuestoKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Ciudad");

        cmbCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion)
                            .addComponent(txtColonia)
                            .addComponent(txtCP)
                            .addComponent(txtPresupuesto))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(txtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtPresupuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(cmbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        tblSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Teléfono", "Dirección", "Colonia", "Código postal", "Presupuesto", "Ciudad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSucursales.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSucursalesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSucursales);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Sucursales");

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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1051, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAnterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSiguiente)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(405, 405, 405))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnterior)
                            .addComponent(btnSiguiente))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (editando) {//editar
            if (txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtColonia.getText().isEmpty() || txtCP.getText().isEmpty() || txtPresupuesto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int id = Integer.parseInt(txtId.getText());
                String nombre = txtNombre.getText();
                String telefono = txtTelefono.getText();
                String direccion = txtDireccion.getText();
                String colonia = txtColonia.getText();
                String CP = txtCP.getText();
                float presupuesto = Float.parseFloat(txtPresupuesto.getText());
                String estatus = "A";
                //Sacar idCiudad inicio
                int idCiudad = 1;
                String ciudad = (String) cmbCiudad.getSelectedItem();

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idCiudad FROM Ciudades WHERE nombre=?");
                    ps.setString(1, ciudad);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idCiudad = rs.getInt("idCiudad");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
                //Sacar idCiudad fin
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE Sucursales SET nombre=?, telefono=?, direccion=?, colonia=?, codigoPostal=?, presupuesto=?, estatus=?, idCiudad=? WHERE idSucursal=?");
                    ps.setString(1, nombre);
                    ps.setString(2, telefono);
                    ps.setString(3, direccion);
                    ps.setString(4, colonia);
                    ps.setString(5, CP);
                    ps.setFloat(6, presupuesto);
                    ps.setString(7, estatus);
                    ps.setInt(8, idCiudad);
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
            if (txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtColonia.getText().isEmpty() || txtCP.getText().isEmpty() || txtPresupuesto.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                String nombre = txtNombre.getText();
                String telefono = txtTelefono.getText();
                String direccion = txtDireccion.getText();
                String colonia = txtColonia.getText();
                String CP = txtCP.getText();
                float presupuesto = Float.parseFloat(txtPresupuesto.getText());
                String estatus = "A";
                //Sacar idCiudad inicio
                int idCiudad = 1;
                String ciudad = (String) cmbCiudad.getSelectedItem();

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idCiudad FROM Ciudades WHERE nombre=?");
                    ps.setString(1, ciudad);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idCiudad = rs.getInt("idCiudad");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
                //Sacar idCiudad fin
                //inicio
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Sucursales "
                            + "(nombre, telefono, direccion, colonia, codigoPostal, presupuesto, estatus, idCiudad) VALUES (?,?,?,?,?,?,?,?)");
                    ps.setString(1, nombre);
                    ps.setString(2, telefono);
                    ps.setString(3, direccion);
                    ps.setString(4, colonia);
                    ps.setString(5, CP);
                    ps.setFloat(6, presupuesto);
                    ps.setString(7, estatus);
                    ps.setInt(8, idCiudad);
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

    private void tblSucursalesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSucursalesMouseClicked
        try {

            int fila = tblSucursales.getSelectedRow();
            int id = Integer.parseInt(tblSucursales.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();
            editando = true;
            activarBotones();
            ps = con.prepareStatement("SELECT S.nombre, S.telefono, S.direccion, S.colonia, S.codigoPostal, S.presupuesto, C.nombre AS Ciudad FROM Sucursales AS S JOIN Ciudades AS C ON S.idCiudad = C.idCiudad WHERE idSucursal=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(String.valueOf(id));
                txtNombre.setText(rs.getString("nombre"));
                txtTelefono.setText(rs.getString("telefono"));
                txtDireccion.setText(rs.getString("direccion"));
                txtColonia.setText(rs.getString("colonia"));
                txtCP.setText(rs.getString("codigoPostal"));
                txtPresupuesto.setText(rs.getString("presupuesto"));
                cmbCiudad.setSelectedItem(rs.getString("Ciudad"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblSucursalesMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de eliminar el registro?");
        if (confirmacion != 0) {
            Limpiar();
        } else {
            int id = Integer.parseInt(txtId.getText());
            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE Sucursales SET estatus = 'I' WHERE idSucursal = ?");
                ps.setInt(1, id);
                ps.executeUpdate();
                Limpiar();
                cargarTabla();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
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

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtTelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtTelefonoKeyReleased

    private void txtDireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtDireccionKeyReleased

    private void txtColoniaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColoniaKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtColoniaKeyReleased

    private void txtCPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtCPKeyReleased

    private void txtPresupuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPresupuestoKeyReleased
        boolean x = validarCamposVacios();
        btnGuardar.setEnabled(x);
        boolean y = validarCampoNoVacio();
        btnCancelar.setEnabled(y);
    }//GEN-LAST:event_txtPresupuestoKeyReleased

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

    boolean editando = false;
    int cantidad = 5;
    int pagina = 1;
    int rango = ((pagina - 1) * cantidad);
    int total;
    int numeroPaginas;
    
    //Validación de campos vacios
    
    boolean n = false;
    boolean t = false;
    boolean d = false;
    boolean c = false;
    boolean cp = false;
    boolean p = false;
    
    private boolean validarCamposVacios() {
        boolean x;
        n = txtNombre.getText().length() != 0;
        t = txtTelefono.getText().length() == 10;
        d = txtDireccion.getText().length() != 0;
        c = txtColonia.getText().length() != 0;
        cp = txtCP.getText().length() == 5;
        p = txtPresupuesto.getText().length() != 0;
        x = n && t && d && c && cp && p;
        return x;
    }
    
    private boolean validarCampoNoVacio(){
        boolean y;
        n = txtNombre.getText().length() != 0;
        t = txtTelefono.getText().length() != 0;
        d = txtDireccion.getText().length() != 0;
        c = txtColonia.getText().length() != 0;
        cp = txtCP.getText().length() != 0;
        p = txtPresupuesto.getText().length() != 0;
        y = n || t || d || c || cp || p;
        return y;
    }


    private void Limpiar() {
        txtId.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtColonia.setText("");
        txtCP.setText("");
        txtPresupuesto.setText("");
        cmbCiudad.setSelectedIndex(0);
        desactivarBotones();
        cargarTabla();

    }

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblSucursales.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] ancho = {15, 100, 100, 100, 100, 100, 100, 100};
        for (int i = 0; i < tblSucursales.getColumnCount(); i++) {
            tblSucursales.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT S.idSucursal, S.nombre, S.telefono, S.direccion, S.colonia, S.codigoPostal, S.presupuesto, C.nombre FROM Sucursales AS S INNER JOIN Ciudades AS C ON S.idCiudad = S.idCiudad WHERE S.estatus = 'A' ORDER BY idSucursal ASC OFFSET ? ROWS FETCH NEXT ? ROWS ONLY");
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
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sucursales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sucursales().setVisible(true);
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
            ps = con.prepareStatement("SELECT COUNT(*) AS total FROM Sucursales WHERE estatus='A'");
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
    private javax.swing.JComboBox<String> cmbCiudad;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblSucursales;
    private javax.swing.JTextField txtCP;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
