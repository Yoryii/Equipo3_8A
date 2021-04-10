package Ventanas;

import Coexion.Conexion;
import Coexion.HelperCategorias;
import Coexion.HelperLaboratorios;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {

    public Productos() {
        initComponents();
        txtId.setVisible(false);
        botonImagen();
        HelperLaboratorios hpLaboratorios = new HelperLaboratorios();
        HelperCategorias hpCategorias = new HelperCategorias();
        cmbCategoria.setModel(hpCategorias.getValues());
        cmbLaboratorio.setModel(hpLaboratorios.getValues());
        cargarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtIngredienteActivo = new javax.swing.JTextField();
        txtBandaToxicologica = new javax.swing.JTextField();
        txtAplicacion = new javax.swing.JTextField();
        txtUso = new javax.swing.JTextField();
        cmbLaboratorio = new javax.swing.JComboBox<>();
        cmbCategoria = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Productos");

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción", "Ingrediente activo", "Banda toxicologica", "Aplicación", "Uso", "Laboratorio", "Categoría"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProductos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 14))); // NOI18N

        jLabel2.setText("Nombre");

        jLabel3.setText("Descripción");

        jLabel4.setText("Ingrediiente activo");

        jLabel5.setText("Banda toxicologica");

        jLabel6.setText("Aplicación");

        jLabel7.setText("Uso");

        jLabel8.setText("Laboratorio");

        jLabel9.setText("Categoría");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
                    .addComponent(txtIngredienteActivo)
                    .addComponent(txtBandaToxicologica)
                    .addComponent(txtAplicacion)
                    .addComponent(txtUso)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cmbCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 133, Short.MAX_VALUE)
                                .addComponent(cmbLaboratorio, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIngredienteActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBandaToxicologica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(txtAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(9, 9, 9)
                .addComponent(txtUso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
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
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    boolean editando = false;
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (editando) {//editar
            if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtIngredienteActivo.getText().isEmpty() || txtBandaToxicologica.getText().isEmpty()
                    || txtAplicacion.getText().isEmpty() || txtUso.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                int id = Integer.parseInt(txtId.getText());
                String nombre = txtNombre.getText();
                String descripcion = txtDescripcion.getText();
                String ingredienteActivo = txtIngredienteActivo.getText();
                String bandaToxicologica = txtBandaToxicologica.getText();
                String aplicacion = txtAplicacion.getText();
                String uso = txtUso.getText();
                String estatus = "A";
                //Sacar id categoria e id laboratorio inicio
                int idLaboratorio = 1;
                int idCategoria = 1;
                String categoria = (String) cmbCategoria.getSelectedItem();
                String laboratorio = (String) cmbLaboratorio.getSelectedItem();

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idCategoria FROM Categorias WHERE nombre=?");
                    ps.setString(1, categoria);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idCategoria = rs.getInt("idCategoria");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idLaboratorio FROM Laboratorios WHERE nombre=?");
                    ps.setString(1, laboratorio);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idLaboratorio = rs.getInt("idLaboratorio");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                //Sacar id categoria e id laboratorio fin
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("UPDATE Productos SET nombre=?, descripcion=?, ingredienteActivo=?, bandaToxicologica=?, aplicacion=?,"
                            + "uso=?, estatus=?, idLaboratorio=?, idCategoria=?  WHERE idProducto=?");
                    ps.setString(1, nombre);
                    ps.setString(2, descripcion);
                    ps.setString(3, ingredienteActivo);
                    ps.setString(4, bandaToxicologica);
                    ps.setString(5, aplicacion);
                    ps.setString(6, uso);
                    ps.setString(7, estatus);
                    ps.setInt(8, idLaboratorio);
                    ps.setInt(9, idCategoria);
                    ps.setInt(10, id);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro modificado con exito");
                    Limpiar();
                    cargarTabla();

                } catch (SQLException e) {

                    JOptionPane.showMessageDialog(null, e.toString());

                }
            }
        } else {//guardar
            if (txtNombre.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtIngredienteActivo.getText().isEmpty() || txtBandaToxicologica.getText().isEmpty()
                    || txtAplicacion.getText().isEmpty() || txtUso.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos");
            } else {
                String nombre = txtNombre.getText();
                String descripcion = txtDescripcion.getText();
                String ingredienteActivo = txtIngredienteActivo.getText();
                String bandaToxicologica = txtBandaToxicologica.getText();
                String aplicacion = txtAplicacion.getText();
                String uso = txtUso.getText();
                String estatus = "A";
                //Sacar id categoria e id laboratorio inicio
                int idLaboratorio = 1;
                int idCategoria = 1;
                String categoria = (String) cmbCategoria.getSelectedItem();
                String laboratorio = (String) cmbLaboratorio.getSelectedItem();
                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idCategoria FROM Categorias WHERE nombre=?");
                    ps.setString(1, categoria);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idCategoria = rs.getInt("idCategoria");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                try {

                    PreparedStatement ps;
                    ResultSet rs;
                    Connection con = Conexion.getConexion();
                    ps = con.prepareStatement("SELECT idLaboratorio FROM Laboratorios WHERE nombre=?");
                    ps.setString(1, laboratorio);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        idLaboratorio = rs.getInt("idLaboratorio");
                    }

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }

                //Sacar id categoria e id laboratorio fin
                //inicio
                try {

                    Connection con = Conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Productos (nombre, descripcion, ingredienteActivo, bandaToxicologica, aplicacion, uso, estatus, idLaboratorio, idCategoria) VALUES (?,?,?,?,?,?,?,?,?)");
                    ps.setString(1, nombre);
                    ps.setString(2, descripcion);
                    ps.setString(3, ingredienteActivo);
                    ps.setString(4, bandaToxicologica);
                    ps.setString(5, aplicacion);
                    ps.setString(6, uso);
                    ps.setString(7, estatus);
                    ps.setInt(8, idLaboratorio);
                    ps.setInt(9, idCategoria);
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

    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        try {

            int fila = tblProductos.getSelectedRow();
            int id = Integer.parseInt(tblProductos.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;

            Connection con = Conexion.getConexion();
            editando = true;
            ps = con.prepareStatement("SELECT P.nombre, P.descripcion, P.ingredienteActivo, P.bandaToxicologica, P.aplicacion, P.uso, L.nombre AS laboratorio, C.nombre AS categoria FROM Productos AS P INNER JOIN Laboratorios AS L ON P.idLaboratorio = L.idLaboratorio INNER JOIN Categorias AS C ON P.idCategoria = C.idCategoria WHERE P.idProducto=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtId.setText(String.valueOf(id));
                txtNombre.setText(rs.getString("nombre"));
                txtDescripcion.setText(rs.getString("descripcion"));
                txtIngredienteActivo.setText(rs.getString("ingredienteActivo"));
                txtBandaToxicologica.setText(rs.getString("bandaToxicologica"));
                txtAplicacion.setText(rs.getString("aplicacion"));
                txtUso.setText(rs.getString("uso"));
                cmbLaboratorio.setSelectedItem(rs.getString("laboratorio"));
                cmbCategoria.setSelectedItem(rs.getString("categoria"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE Productos SET estatus = 'I' WHERE idProducto = ?");
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
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtIngredienteActivo.setText("");
        txtBandaToxicologica.setText("");
        txtAplicacion.setText("");
        txtUso.setText("");
        cmbCategoria.setSelectedIndex(0);
        cmbLaboratorio.setSelectedIndex(0);
    }

    private void cargarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblProductos.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        int[] ancho = {5, 70, 150, 150, 150, 150, 150, 85, 70};
        for (int i = 0; i < tblProductos.getColumnCount(); i++) {
            tblProductos.getColumnModel().getColumn(i).setPreferredWidth(ancho[i]);
        }

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT P.idProducto, P.nombre, P.descripcion, P.ingredienteActivo, P.bandaToxicologica, P.aplicacion, P.uso, L.nombre, C.nombre FROM Productos AS P INNER JOIN Laboratorios AS L on P.idLaboratorio = L.idLaboratorio INNER JOIN Categorias AS C on P.idCategoria = C.idCategoria WHERE P.estatus = 'A'");
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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
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
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbLaboratorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtAplicacion;
    private javax.swing.JTextField txtBandaToxicologica;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIngredienteActivo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUso;
    // End of variables declaration//GEN-END:variables
}
