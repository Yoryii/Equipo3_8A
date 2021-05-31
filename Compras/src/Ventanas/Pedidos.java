package Ventanas;

import Coexion.Conexion;
import Coexion.HelperEmpleados;
import Coexion.HelperProveedores;
import Coexion.HelperSucursales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jmadr
 */
public class Pedidos extends javax.swing.JFrame {

    public Pedidos() {
        initComponents();

        setLocationRelativeTo(null);
        this.setResizable(false);
        txfId.setVisible(false);
        cargarTabla();
        
        

        //FECHA PEDIDO
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        int dia, mes, annio;
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH);
        annio = calendario.get(Calendar.YEAR);
        txfFechaR.setText(dia + "-" + (mes + 1) + "-" + annio + "\n");

        //Validaciones
        btnRemoverP.setEnabled(false);
        btnConfirmar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnXML.setEnabled(false);
        btnModificar.setEnabled(false);
        btnImprimir.setEnabled(false);

        txfFechaR.setEditable(false);
        txfFechaRecepcion.setEditable(false);
        txfTotal.setEditable(false);
        txfCantidad.setEditable(false);
        txfEstatus.setEditable(false);

        

        //Valores default
        txfEstatus.setText("P");

        //Combos Box
        HelperProveedores hpProveedores = new HelperProveedores();
        cmbProveedor.setModel(hpProveedores.getValues());

        HelperSucursales hpSuc = new HelperSucursales();
        cmbSucursales.setModel(hpSuc.getValues());

        HelperEmpleados hpEmpleados = new HelperEmpleados();
        cmbEmpleado.setModel(hpEmpleados.getValues());

    }
    
    int control = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this me2
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txfFechaR = new javax.swing.JTextField();
        txfFechaRecepcion = new javax.swing.JTextField();
        txfTotal = new javax.swing.JTextField();
        txfCantidad = new javax.swing.JTextField();
        txfEstatus = new javax.swing.JTextField();
        cmbProveedor = new javax.swing.JComboBox<>();
        cmbSucursales = new javax.swing.JComboBox<>();
        cmbEmpleado = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnXML = new javax.swing.JButton();
        txfId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetallePedido = new javax.swing.JTable();
        btnPedidosDetalle = new javax.swing.JButton();
        btnRemoverP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos"));

        jLabel1.setText("Fecha de registro");

        jLabel2.setText("Fecha de recepcion");

        jLabel3.setText("Total a pagar");

        jLabel4.setText("Cantidad pagada");

        jLabel5.setText("Estatus");

        jLabel6.setText("Proveedor");

        jLabel7.setText("Sucursales");

        jLabel8.setText("Empleado");

        txfFechaR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfFechaRKeyReleased(evt);
            }
        });

        txfFechaRecepcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfFechaRecepcionKeyReleased(evt);
            }
        });

        txfTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTotalKeyReleased(evt);
            }
        });

        txfCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfCantidadKeyReleased(evt);
            }
        });

        txfEstatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfEstatusKeyReleased(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");

        btnXML.setText("XML");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                                        .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnXML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                                        .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(28, 28, 28))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txfFechaR, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                        .addComponent(txfFechaRecepcion)
                                                        .addComponent(txfTotal)
                                                        .addComponent(txfCantidad)
                                                        .addComponent(txfEstatus))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cmbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(cmbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(cmbSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel8))
                                                                .addGap(58, 58, 58))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(72, 72, 72))))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(13, 13, 13)
                                                .addComponent(txfFechaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txfFechaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(jLabel3)
                                                .addGap(8, 8, 8)
                                                .addComponent(txfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txfEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(13, 13, 13)
                                                .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cmbSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(45, 45, 45)
                                                .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXML, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Pedido"));

        tblDetallePedido.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "idPedidoDetalle", "cantPedida", "precioCompra", "subTotal", "cantRecibida", "cantRechazada", "cantAceptada", "idPedido", "idPresentacion"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tblDetallePedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetallePedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetallePedido);

        btnPedidosDetalle.setText("Agregar Producto");
        btnPedidosDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosDetalleActionPerformed(evt);
            }
        });

        btnRemoverP.setText("Remover Producto");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(btnPedidosDetalle)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 262, Short.MAX_VALUE)
                                .addComponent(btnRemoverP)
                                .addGap(141, 141, 141))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPedidosDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRemoverP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       control = 1;
        
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        btnConfirmar.setEnabled(false);
        
        txfFechaR.setEnabled(true);
        txfFechaRecepcion.setEnabled(true); 
        txfEstatus.setEnabled(true);
        txfTotal.setEnabled(true);
        txfCantidad.setEnabled(true);
        
        txfFechaR.setEditable(false);
        txfFechaRecepcion.setEditable(false);
        txfTotal.setEditable(false);
        txfCantidad.setEditable(false);
        txfEstatus.setEditable(false);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_btnGuardarActionPerformed
        /*
        this.setVisible(false);
        TablaUnidadesMedida uniM = new TablaUnidadesMedida();
        uniM.setVisible(true);
        btnGuardar.setEnabled(false);
         */
        
        
        
        
        btnModificar.setEnabled(true);
        btnConfirmar.setEnabled(true);
        btnGuardar.setEnabled(false);
        
        txfFechaR.setEnabled(false);
        txfFechaRecepcion.setEnabled(false); 
        txfEstatus.setEnabled(false);
        txfTotal.setEnabled(false);
        txfCantidad.setEnabled(false);

        //Valores default
        txfCantidad.setText("0");
        txfTotal.setText("0");
        txfEstatus.setText("P");

        
        //GUARDAR----------------------------------------------------
        if(control == 0){
             
        
        String fechaR = txfFechaR.getText();

        int idProveedor = 1;
        int idSucursal = 1;
        int idEmpleado = 1;

        String proveedor = (String) cmbProveedor.getSelectedItem();
        String sucursal = (String) cmbSucursales.getSelectedItem();
        String empleado = (String) cmbEmpleado.getSelectedItem();

        //Proveedor
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
        
        //Sucursales
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT idSucursal FROM Sucursales WHERE nombre=?");
            ps.setString(1, sucursal);
            rs = ps.executeQuery();
            while (rs.next()) {
                idSucursal = rs.getInt("idSucursal");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        //Empleados
        try {

            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT idEmpleado FROM Empleados WHERE nombre=?");
            ps.setString(1, empleado);
            rs = ps.executeQuery();
            while (rs.next()) {
                idEmpleado = rs.getInt("idEmpleado");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        
        
        //INSERCION------------------------------------------
        
        try {

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("INSERT INTO Pedidos (nombre, fechaRegistro, fechaRecepcion, totalPagar, cantidadPagada, estatus, idProveedor, idSucursal, idEmpleado) VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, "A");
            ps.setString(2, fechaR);
            ps.setString(3, "");
            ps.setFloat(4, 0);
            ps.setFloat(5, 0);
            ps.setString(6, "P");
            ps.setInt(7, idProveedor);
            ps.setInt(8, idSucursal);
            ps.setInt(9, idEmpleado);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro guardado.");
            

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }
        }
        
        //UPDATE----------------------------------------------------
        else{
            control = 0;
            
            
        }

        /*
        if (editando) {
            if (txfNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos!");
            } else {

                int id = Integer.parseInt(txfId.getText());
                String nombre = txfNombre.getText();
                String capacidad = txfCapacidad.getText();

                try {
                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE Empaques SET nombre=?, capacidad=? WHERE idEmpaque=?");

                    ps.setString(1, nombre);
                    ps.setString(2, capacidad);
                    ps.setInt(3, id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro modificado.");
                    limpiar();
                    cargarTabla();
                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }

            }
        } else {//guardar
            if (txfNombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llene todos los campos!");
            } else {
                String nombre = txfNombre.getText();
                String capacidad = txfCapacidad.getText();
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Empaques (nombre, capacidad, estatus, idUnidad) VALUES (?,?,'A',6)");
                    ps.setString(1, nombre);
                    ps.setString(2, capacidad);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro guardado.");
                    limpiar();
                    cargarTabla();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }
            }
        }*/
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        //editando = 0;
        // limpiar();
        // cargarTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPedidosDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosDetalleActionPerformed
        DetallePedido det = new DetallePedido();
        det.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPedidosDetalleActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void txfFechaRKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfFechaRKeyReleased
        // txfFechaRecepcion.setEditable(txfFechaR.getText().length() != 0);
    }//GEN-LAST:event_txfFechaRKeyReleased

    private void txfFechaRecepcionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfFechaRecepcionKeyReleased
        // txfTotal.setEditable(txfFechaRecepcion.getText().length() != 0);
    }//GEN-LAST:event_txfFechaRecepcionKeyReleased

    private void txfTotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTotalKeyReleased
        // txfCantidad.setEditable(txfTotal.getText().length() != 0);
    }//GEN-LAST:event_txfTotalKeyReleased

    private void txfCantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCantidadKeyReleased
        //  txfEstatus.setEditable(txfCantidad.getText().length() != 0);
    }//GEN-LAST:event_txfCantidadKeyReleased

    private void txfEstatusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfEstatusKeyReleased
        // btnGuardar.setEnabled(txfEstatus.getText().length() != 0);
    }//GEN-LAST:event_txfEstatusKeyReleased

    private void tblDetallePedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetallePedidoMouseClicked
        //btnGuardar.setEnabled(true);
        //btnEliminar.setEnabled(true);
        /* try {
            int fila = tblDetallePedido.getSelectedRow();
            int id = Integer.parseInt(tblDetallePedido.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            
            ps = con.prepareStatement("SELECT fechaRegistro, fechaRecepcion, totalPagar FROM Empaques WHERE idEmpaque=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                txfId.setText(String.valueOf(id));
                txfFechaR.setText(rs.getString("fe"));
                txfCapacidad.setText(rs.getString("capacidad"));

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
         */
    }//GEN-LAST:event_tblDetallePedidoMouseClicked

    public void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblDetallePedido.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();

            ps = con.prepareStatement("SELECT idPedidoDetalle, cantPedida, precioCompra, subTotal, cantRecibida, cantRechazada, cantAceptada, idPedido, idPresentacion FROM PedidoDetalle");
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
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPedidosDetalle;
    private javax.swing.JButton btnRemoverP;
    private javax.swing.JButton btnXML;
    private javax.swing.JComboBox<String> cmbEmpleado;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JComboBox<String> cmbSucursales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetallePedido;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JTextField txfEstatus;
    private javax.swing.JTextField txfFechaR;
    private javax.swing.JTextField txfFechaRecepcion;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfTotal;
    // End of variables declaration//GEN-END:variables
}
