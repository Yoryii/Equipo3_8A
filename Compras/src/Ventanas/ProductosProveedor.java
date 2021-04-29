
package Ventanas;

import Coexion.Conexion;
import Coexion.HelperPresentacionesProducto;
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

/**
 *
 * @author luisa
 */
public class ProductosProveedor extends javax.swing.JFrame {

    
    public ProductosProveedor() {
        initComponents();
        setDefaultCloseOperation(0);
        setLocationRelativeTo(null);
        this.setResizable(false);
        txtId.setVisible(false);
        botonImagen();
        HelperProveedores hpProveedores= new HelperProveedores();
        cmbProveedor.setModel(hpProveedores.getValues());
        HelperPresentacionesProducto hpPresentacionesProducto= new HelperPresentacionesProducto();
        cmbPresentacion.setModel(hpPresentacionesProducto.getValues());
        cargarTabla();
        desactivarBotones();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtDiasRetardo = new javax.swing.JTextField();
        txtPrecioEstandar = new javax.swing.JTextField();
        txtPrecioUltimaCompra = new javax.swing.JTextField();
        txtCantMinPedir = new javax.swing.JTextField();
        txtCantMaxPedir = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbProveedor = new javax.swing.JComboBox<>();
        cmbPresentacion = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductosProveedor = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos Proveedor");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Dias De Retardo");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Precio Estandar");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Precio de Ultima Compra");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Cantifdad Minima a Pedir");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad Maxima a Pedir");

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtDiasRetardo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasRetardoActionPerformed(evt);
            }
        });
        txtDiasRetardo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiasRetardoKeyReleased(evt);
            }
        });

        txtPrecioEstandar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioEstandarActionPerformed(evt);
            }
        });
        txtPrecioEstandar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioEstandarKeyReleased(evt);
            }
        });

        txtPrecioUltimaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioUltimaCompraActionPerformed(evt);
            }
        });
        txtPrecioUltimaCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPrecioUltimaCompraKeyReleased(evt);
            }
        });

        txtCantMinPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantMinPedirActionPerformed(evt);
            }
        });
        txtCantMinPedir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantMinPedirKeyReleased(evt);
            }
        });

        txtCantMaxPedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantMaxPedirActionPerformed(evt);
            }
        });
        txtCantMaxPedir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCantMaxPedirKeyReleased(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Proveedor");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Presentacion");

        cmbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProveedorActionPerformed(evt);
            }
        });

        cmbPresentacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCantMinPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbPresentacion, javax.swing.GroupLayout.Alignment.LEADING, 0, 168, Short.MAX_VALUE)
                                    .addComponent(txtDiasRetardo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioEstandar, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecioUltimaCompra, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(69, 69, 69)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnGuardar)
                                    .addGap(37, 37, 37)
                                    .addComponent(btnCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtCantMaxPedir, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbPresentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDiasRetardo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecioEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecioUltimaCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtCantMinPedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCantMaxPedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblProductosProveedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proveedor", "Presentacion", "Dias Retardo", "Precio Estandar", "Precio Ultima Compra", "Cantidad Minima Pedir", "Cantidad Maxima Pedir"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductosProveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosProveedorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductosProveedor);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Productos Proveedores");

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnAnterior.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSiguiente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAnterior)
                                        .addGap(727, 727, 727)
                                        .addComponent(btnSiguiente)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(btnAnterior))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean editando = false;
    int cantidad = 5;
    int pagina = 1;
    int rango = ((pagina - 1) * cantidad);
    int total;
    int numeroPaginas;
    private void tblProductosProveedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosProveedorMouseClicked
       try {

            int fila = tblProductosProveedor.getSelectedRow();
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();
            editando = true;
            activarBotones();
            ps = con.prepareStatement("SELECT PP.diasRetardo, PP.precioEstandar, PP.precioUltimaCompra, PP.cantMinPedir, PP.cantMaxPedir, Pro.nombre AS proveedor, Pre.nombre AS presentacion FROM ProductosProveedor AS PP INNER JOIN Proveedores AS Pro ON PP.idProveedor = Pro.idProveedor INNER JOIN PresentacionesProducto AS Pre ON PP.idPresentacion = Pre.idPresentacion");
            rs = ps.executeQuery();
            while (rs.next()) {
                txtDiasRetardo.setText(rs.getString("diasRetardo"));
                txtPrecioEstandar.setText(rs.getString("precioEstandar"));
                txtPrecioUltimaCompra.setText(rs.getString("precioUltimaCompra"));
                txtCantMinPedir.setText(rs.getString("cantMinpedir"));
                txtCantMaxPedir.setText(rs.getString("cantMaxPedir"));
                cmbProveedor.setSelectedItem(rs.getString("proveedor"));
                cmbPresentacion.setSelectedItem(rs.getString("presentacion"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        
        
        
        
       /* try {

            int fila = tblProductosProveedor.getSelectedRow();
            int id = Integer.parseInt(tblProductosProveedor.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();
            editando = true;
            ps = con.prepareStatement("SELECT PP.diasRetardo, PP.precioEstndar, PP.precioUltimaCompra, PP.cantMinPedir, PP.cantMaxPedir, Pro.nombre AS proveedor, Pre.nombre AS presentacion FROM ProductosProveedor AS PP INNER JOIN Proveedores AS Pro ON PP.idProveedor = Pro.idProveedor INNER JOIN PresentacionesProducto AS Pre ON PP.idPresentacion = Pre.idPresentacion WHERE PP.idProductoProveedor=? ");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(String.valueOf(id));
                txtDiasRetardo.setText(rs.getString("diasRetadrdo"));
                txtPrecioEstandar.setText(rs.getString("precioEstandar"));
                txtPrecioUltimaCompra.setText(rs.getString("precioUltimaCompra"));
                txtCantMinPedir.setText(rs.getString("cantMinpedir"));
                txtCantMaxPedir.setText(rs.getString("cantMaxPedir"));
                cmbProveedor.setSelectedItem(rs.getString("proveedor"));
                cmbPresentacion.setSelectedItem(rs.getString("presentacion"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }*/
        
    }//GEN-LAST:event_tblProductosProveedorMouseClicked

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPrecioUltimaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioUltimaCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioUltimaCompraActionPerformed

    private void txtPrecioEstandarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioEstandarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioEstandarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE ProductosProveedor SET estatus = 'I'");
            ps.executeUpdate();
            Limpiar();
            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        
        
        
        
        
        
        
        
        /*int id = Integer.parseInt(txtId.getText());
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE ProductosProveedor SET estatus = 'I' WHERE idProductoProveedor=? ");
            ps.setInt(1, id);
            ps.executeUpdate();
            Limpiar();
            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }*/
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        editando = false;
        Limpiar();
        cargarTabla();

    }//GEN-LAST:event_btnCancelarActionPerformed
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       if (editando) {//editar
            if (txtDiasRetardo.getText().isEmpty() || txtPrecioEstandar.getText().isEmpty() || txtPrecioEstandar.getText().isEmpty() || txtPrecioUltimaCompra.getText().isEmpty() || txtCantMinPedir.getText().isEmpty()
                    || txtCantMaxPedir.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int diasRetardo = Integer.parseInt(txtDiasRetardo.getText());
                float precioEstandar = Float.parseFloat(txtPrecioEstandar.getText());
                float precioUltimaCompra = Float.parseFloat(txtPrecioUltimaCompra.getText());
                int cantMinPedir = Integer.parseInt(txtCantMinPedir.getText());
                int cantMaxPedir = Integer.parseInt(txtCantMaxPedir.getText());
                String estatus = "A";
                //Sacar id Proveedor e id Presentacion inicio
                int idProveedor = 1;
                int idPresentacion = 1;
                String proveedor = (String) cmbProveedor.getSelectedItem();
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

                //Sacar id Proveedor e id Presentacion fin
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE ProductosProveedor SET diasRetardo=?, precioEstandar=?, precioUltimaCompra=?, cantMinPedir=?, cantMaxPedir=?,"
                            + "estatus=?, idProveedor=?, idPresentacion=?");
                    ps.setInt(1, diasRetardo);
                    ps.setFloat(2, precioEstandar);
                    ps.setFloat(3, precioUltimaCompra);
                    ps.setInt(4, cantMinPedir);
                    ps.setInt(5, cantMaxPedir);
                    ps.setString(6, estatus);
                    ps.setInt(7, idProveedor);
                    ps.setInt(8, idPresentacion);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro modificado con exito");
                    Limpiar();
                    cargarTabla();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }
            }
        } else {//guardar
            if (txtDiasRetardo.getText().isEmpty() || txtPrecioEstandar.getText().isEmpty() || txtPrecioUltimaCompra.getText().isEmpty() || txtCantMinPedir.getText().isEmpty()
                    || txtCantMaxPedir.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int diasRetardo = Integer.parseInt(txtDiasRetardo.getText());
                float precioEstandar = Float.parseFloat(txtPrecioEstandar.getText());
                float precioUltimaCompra = Float.parseFloat(txtPrecioUltimaCompra.getText());
                int cantMinPedir = Integer.parseInt(txtCantMinPedir.getText());
                int cantMaxPedir = Integer.parseInt(txtCantMaxPedir.getText());
                String estatus = "A";
                //Sacar id Proveedor e id Presentacion inicio
                int idProveedor = 1;
                int idPresentacion = 1;
                String proveedor = (String) cmbProveedor.getSelectedItem();
                String presentacion = (String) cmbPresentacion.getSelectedItem();
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

                //Sacar id Proveedor e id Presentacion fin
                //inicio
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO ProductosProveedor (diasRetardo, precioEstandar, precioUltimaCompra, cantMinPedir, cantMaxPedir, estatus, idProveedor, idPresentacion) VALUES (?,?,?,?,?,?,?,?)");
                    ps.setInt(1, diasRetardo);
                    ps.setFloat(2, precioEstandar);
                    ps.setFloat(3, precioUltimaCompra);
                    ps.setInt(4, cantMinPedir);
                    ps.setInt(5, cantMaxPedir);
                    ps.setString(6, estatus);
                    ps.setInt(7, idProveedor);
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
        
        
        
        
        
        
        
        
        
        
        
       /* if (editando) {//editar
            if (txtDiasRetardo.getText().isEmpty() || txtPrecioEstandar.getText().isEmpty() || txtPrecioEstandar.getText().isEmpty() || txtPrecioUltimaCompra.getText().isEmpty() || txtCantMinPedir.getText().isEmpty()
                    || txtCantMaxPedir.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int id = Integer.parseInt(txtId.getText());
                int diasRetardo = Integer.parseInt(txtDiasRetardo.getText());
                float precioEstandar = Float.parseFloat(txtPrecioEstandar.getText());
                float precioUltimaCompra = Float.parseFloat(txtPrecioUltimaCompra.getText());
                int cantMinPedir = Integer.parseInt(txtCantMinPedir.getText());
                int cantMaxPedir = Integer.parseInt(txtCantMaxPedir.getText());
                String estatus = "A";
                //Sacar id Proveedor e id Presentacion inicio
                int idProveedor = 1;
                int idPresentacion = 1;
                String proveedor = (String) cmbProveedor.getSelectedItem();
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

                //Sacar id Proveedor e id Presentacion fin
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE ProductosProveedor SET diasRetardo=?, precioEstandar=?, precioUltimaCompra=?, cantMinPedir=?, cantMaxPedir=?,"
                            + "estatus=?, idProveedor=?, idPresentacion=?  WHERE idProductoProveedor=? ");
                    ps.setInt(1, diasRetardo);
                    ps.setFloat(2, precioEstandar);
                    ps.setFloat(3, precioUltimaCompra);
                    ps.setInt(4, cantMinPedir);
                    ps.setInt(5, cantMaxPedir);
                    ps.setString(6, estatus);
                    ps.setInt(7, idProveedor);
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
            if (txtDiasRetardo.getText().isEmpty() || txtPrecioEstandar.getText().isEmpty() || txtPrecioUltimaCompra.getText().isEmpty() || txtCantMinPedir.getText().isEmpty()
                    || txtCantMaxPedir.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int diasRetardo = Integer.parseInt(txtDiasRetardo.getText());
                float precioEstandar = Float.parseFloat(txtPrecioEstandar.getText());
                float precioUltimaCompra = Float.parseFloat(txtPrecioUltimaCompra.getText());
                int cantMinPedir = Integer.parseInt(txtCantMinPedir.getText());
                int cantMaxPedir = Integer.parseInt(txtCantMaxPedir.getText());
                String estatus = "A";
                //Sacar id Proveedor e id Presentacion inicio
                int idProveedor = 1;
                int idPresentacion = 1;
                String proveedor = (String) cmbProveedor.getSelectedItem();
                String presentacion = (String) cmbPresentacion.getSelectedItem();
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

                //Sacar id Proveedor e id Presentacion fin
                //inicio
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO ProductosProveedor (diasRetardo, precioEstandar, precioUltimaCompra, cantMinPedir, cantMaxPedir, estatus, idProveedor, idPresentacion) VALUES (?,?,?,?,?,?,?,?)");
                    ps.setInt(1, diasRetardo);
                    ps.setFloat(2, precioEstandar);
                    ps.setFloat(3, precioUltimaCompra);
                    ps.setInt(4, cantMinPedir);
                    ps.setInt(5, cantMaxPedir);
                    ps.setString(6, estatus);
                    ps.setInt(7, idProveedor);
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
        }*/
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCantMaxPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantMaxPedirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantMaxPedirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
         dispose();
        Principal pr = new Principal();
        pr.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cmbProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProveedorActionPerformed
    boolean dR = false;
    boolean pE = false;
    boolean pUC = false;
    boolean cMi = false;
    boolean cMa = false;
    private void txtDiasRetardoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasRetardoKeyReleased
        dR = txtDiasRetardo.getText().length() != 0;
        boolean x = dR && pE && pUC && cMi && cMa;
        btnGuardar.setEnabled(x);
        btnCancelar.setEnabled(x);
        activarBotones();
    }//GEN-LAST:event_txtDiasRetardoKeyReleased

    private void txtPrecioEstandarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioEstandarKeyReleased
        pE = txtPrecioEstandar.getText().length() != 0;
        boolean x = dR && pE && pUC && cMi && cMa;
        btnGuardar.setEnabled(x);
        btnCancelar.setEnabled(x);
        activarBotones();
    }//GEN-LAST:event_txtPrecioEstandarKeyReleased

    private void txtPrecioUltimaCompraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioUltimaCompraKeyReleased
        pUC = txtPrecioUltimaCompra.getText().length() != 0;
        boolean x = dR && pE && pUC && cMi && cMa;
        btnGuardar.setEnabled(x);
        btnCancelar.setEnabled(x);
        activarBotones();
    }//GEN-LAST:event_txtPrecioUltimaCompraKeyReleased

    private void txtCantMinPedirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantMinPedirKeyReleased
        cMi = txtCantMinPedir.getText().length() != 0;
        boolean x = dR && pE && pUC && cMi && cMa;
        btnGuardar.setEnabled(x);
        btnCancelar.setEnabled(x);
        activarBotones();
    }//GEN-LAST:event_txtCantMinPedirKeyReleased

    private void txtCantMaxPedirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantMaxPedirKeyReleased
        cMa = txtCantMaxPedir.getText().length() != 0;
        boolean x = dR && pE && pUC && cMi && cMa;
        btnGuardar.setEnabled(x);
        btnCancelar.setEnabled(x);
        activarBotones();
    }//GEN-LAST:event_txtCantMaxPedirKeyReleased

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

    private void txtDiasRetardoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasRetardoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiasRetardoActionPerformed

    private void txtCantMinPedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantMinPedirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantMinPedirActionPerformed

    private void Limpiar(){
        txtDiasRetardo.setText("");
        txtPrecioEstandar.setText("");
        txtPrecioUltimaCompra.setText("");
        txtCantMinPedir.setText("");
        txtCantMaxPedir.setText("");
        cmbProveedor.setSelectedIndex(0);
        cmbPresentacion.setSelectedIndex(0);
        desactivarBotones();
 
        
        
        
        /*txtId.setText("");
        txtDiasRetardo.setText("");
        txtPrecioEstandar.setText("");
        txtPrecioUltimaCompra.setText("");
        txtCantMinPedir.setText("");
        txtCantMaxPedir.setText("");
        cmbProveedor.setSelectedIndex(0);
        cmbPresentacion.setSelectedIndex(0);*/
 
    }
    private void cargarTabla() {
       DefaultTableModel modeloTabla = (DefaultTableModel) tblProductosProveedor.getModel();
        modeloTabla.setRowCount(0);
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] ancho = {5, 5, 150, 150, 150, 150, 150, 150};
        for (int i = 0; i < tblProductosProveedor.getColumnCount(); i++) {
            tblProductosProveedor.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT PP.diasRetardo, PP.precioEstandar, PP.precioUltimaCompra, PP.cantMinPedir, PP.cantMaxPedir, Pro.nombre, Pre.nombre FROM ProductosProveedor AS PP INNER JOIN Proveedores AS Pro on PP.idProveedor = Pro.idProveedor INNER JOIN PresentacionesProducto AS Pre on PP.idPresentacion = Pre.idPresentacion WHERE PP.estatus = 'A' ");
            //ORDER BY idProveedor ASC OFFSET ? ROWS FETCH NEXT ? ROWS ONL
            //ps.setInt(1, rango);
            //ps.setInt(2, cantidad);
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
        
        
        
        
        
        
        
        
        
        
        /*DefaultTableModel modeloTabla = (DefaultTableModel) tblProductosProveedor.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] ancho = {5, 5, 150, 150, 150, 150, 150, 150};
        for (int i = 0; i < tblProductosProveedor.getColumnCount(); i++) {
            tblProductosProveedor.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT PP.idProductoProveedor, PP.diasRetardo, PP.precioEstandar, PP.precioUltimaCompra, PP.cantMinPedir, PP.cantMaxPedir, Pro.nombre, Pre.nombre FROM ProductosProveedor AS PP INNER JOIN Proveedores AS Pro on PP.idProveedor = Pro.idProveedor INNER JOIN PresentacionesProducto AS Pre on PP.idPresentacion = Pre.idPresentacion WHERE PP.estatus = 'A'");
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
        }*/
        

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
            java.util.logging.Logger.getLogger(ProductosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductosProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductosProveedor().setVisible(true);
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
            ps = con.prepareStatement("SELECT COUNT(*) AS total FROM ProductosProveedor WHERE estatus='A'");
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
    private javax.swing.JComboBox<String> cmbPresentacion;
    private javax.swing.JComboBox<String> cmbProveedor;
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
    private javax.swing.JTable tblProductosProveedor;
    private javax.swing.JTextField txtCantMaxPedir;
    private javax.swing.JTextField txtCantMinPedir;
    private javax.swing.JTextField txtDiasRetardo;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrecioEstandar;
    private javax.swing.JTextField txtPrecioUltimaCompra;
    // End of variables declaration//GEN-END:variables
}
