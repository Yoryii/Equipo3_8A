package Ventanas;

import Coexion.Conexion;
import static Ventanas.TablaPedidos.control;
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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.DriverManager;


public class RegistroPedidos extends javax.swing.JFrame {

    int contro = TablaPedidos.control;
    int fila;
    int noPed = TablaPedidos.noPedido;
    int confirm = TablaPedidos.confirmado;
    float totalPag = TablaPedidos.totalPagar;
    float cantPag = TablaPedidos.cantPagada;
    String fechaReg = TablaPedidos.fechaRegist;
    String estat = TablaPedidos.estatus;
    int bandCantidades = 0;

    public RegistroPedidos() {
        initComponents();
        cargarTabla();

        setLocationRelativeTo(null);
        this.setResizable(false);
        txfId.setVisible(false);
        txfId2.setVisible(false);
        txfAceptada.setEnabled(false);
        txfRecibida.setEnabled(false);
        txfRechazada.setEnabled(false);
        btnRegistrar.setEnabled(false);
        txfFechaRecepcion.setText("" + contro);

        if (confirm == 1) {
            btnGuardar.setEnabled(false);
            btnModificar.setEnabled(false);
            btnConfirmar.setEnabled(false);
            btnPedidosDetalle.setEnabled(false);
            tblDetallePedido.setDefaultEditor(Object.class, null);
            txfFechaR.setText(fechaReg);
            txfCantidad.setText(String.valueOf(cantPag));
            txfTotal.setText(String.valueOf(totalPag));
            txfEstatus.setText(estat);
            lblPedido.setText("  PEDIDO #" + noPed);

        } else {

            if (contro == 1) {
                txfFechaR.setText(fechaReg);
                txfCantidad.setText(String.valueOf(cantPag));
                txfTotal.setText(String.valueOf(totalPag));
                txfEstatus.setText(estat);
                btnConfirmar.setEnabled(true);
                float totalPag = Float.parseFloat(txfTotal.getText());
                lblPedido.setText("  PEDIDO #" + noPed);

            } else {
                lblPedido.setText("REALIZAR PEDIDO");
                //FECHA PEDIDO

                btnPedidosDetalle.setEnabled(false);
                Calendar calendario = Calendar.getInstance();
                int hora, minutos, segundos;
                int dia, mes, annio;
                dia = calendario.get(Calendar.DATE);
                mes = calendario.get(Calendar.MONTH);
                annio = calendario.get(Calendar.YEAR);
                txfFechaR.setText(dia + "-" + (mes + 1) + "-" + annio + "\n");

                //Valores default
                txfEstatus.setText("P");

            }
        }

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

        //Combos Box
        HelperProveedores hpProveedores = new HelperProveedores();
        cmbProveedor.setModel(hpProveedores.getValues());

        HelperSucursales hpSuc = new HelperSucursales();
        cmbSucursales.setModel(hpSuc.getValues());

        HelperEmpleados hpEmpleados = new HelperEmpleados();
        cmbEmpleado.setModel(hpEmpleados.getValues());

        if (txfTotal.getText().equals("")) {

            btnConfirmar.setEnabled(false);
        } else {

            float deuda = Float.parseFloat(txfTotal.getText());
            if (deuda > 0) {
                btnConfirmar.setEnabled(true);
            } else {
                btnConfirmar.setEnabled(false);
            }
        }

        if (txfEstatus.getText().equals("S")) {
            bandCantidades = 1;
            btnImprimir.setEnabled(true);
        }

    }

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
        btnGuardar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        btnXML = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbProveedor = new javax.swing.JComboBox<>();
        cmbSucursales = new javax.swing.JComboBox<>();
        cmbEmpleado = new javax.swing.JComboBox<>();
        txfFechaR = new javax.swing.JTextField();
        txfFechaRecepcion = new javax.swing.JTextField();
        txfTotal = new javax.swing.JTextField();
        txfCantidad = new javax.swing.JTextField();
        txfEstatus = new javax.swing.JTextField();
        txfId = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnPedidosDetalle = new javax.swing.JButton();
        btnRemoverP = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetallePedido = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txfRecibida = new javax.swing.JTextField();
        txfAceptada = new javax.swing.JTextField();
        txfRechazada = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        txfId2 = new javax.swing.JTextField();
        lblPedido = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos"));

        jLabel1.setText("Fecha de registro");

        jLabel2.setText("Fecha de recepción");

        jLabel3.setText("Total a pagar");

        jLabel4.setText("Cantidad pagada");

        jLabel5.setText("Estatus");

        jLabel6.setText("Proveedor");

        jLabel7.setText("Sucursales");

        jLabel8.setText("Empleado");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnConfirmar.setText("Pagar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        btnXML.setText("XML");

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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(btnXML, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txfEstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addComponent(txfCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfFechaR, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfFechaRecepcion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txfTotal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cmbProveedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(cmbSucursales, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbEmpleado, 0, 102, Short.MAX_VALUE))
                            .addComponent(txfId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFechaR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfFechaRecepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txfEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(btnImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXML, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle Pedido"));

        btnPedidosDetalle.setText("Agregar Producto");
        btnPedidosDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosDetalleActionPerformed(evt);
            }
        });

        btnRemoverP.setText("Remover Producto");
        btnRemoverP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPActionPerformed(evt);
            }
        });

        tblDetallePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdPedidoDetalle", "cantPedida", "precioCompra", "subTotal", "cantRecibida", "cantRechazada", "cantAceptada", "idPedido", "idPresentacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetallePedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetallePedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetallePedido);

        jLabel9.setText("Cantidad Recibida");

        jLabel10.setText("Cantidad Aceptada");

        jLabel11.setText("Cantidad Rechazada");

        btnRegistrar.setText("Registrar Cantidades");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnPedidosDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemoverP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(txfId2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel9))
                            .addComponent(txfRecibida, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(65, 65, 65))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txfAceptada, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(txfRechazada, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfRecibida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfAceptada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfRechazada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemoverP, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPedidosDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txfId2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        lblPedido.setFont(new java.awt.Font("Tahoma", 3, 28)); // NOI18N
        lblPedido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnRegresar.setText("Regresar");
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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(319, 319, 319)
                        .addComponent(lblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar)
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPedidosDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosDetalleActionPerformed
        PedidoDetalle2 det = new PedidoDetalle2();
        det.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPedidosDetalleActionPerformed

    private void btnRemoverPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPActionPerformed
        //int confirmacion = JOptionPane.showConfirmDialog(null, "Estás seguro de eliminar el registro?");

        int fila2 = tblDetallePedido.getSelectedRow();
        int id2 = Integer.parseInt(tblDetallePedido.getValueAt(fila2, 0).toString());

        int fila = tblDetallePedido.getSelectedRow();
        float subtotal = Float.parseFloat(tblDetallePedido.getValueAt(fila, 3).toString());

        float resta = totalPag - subtotal;
        txfTotal.setText("" + resta);
        try {

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("UPDATE Pedidos SET totalPagar = ? WHERE idPedido = ? ");
            ps.setFloat(1, resta);
            ps.setInt(2, noPed);

            ps.executeUpdate();
            //JOptionPane.showMessageDialog(null, "Registro Modificado.");
            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

        try {

            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement("DELETE FROM PedidoDetalle WHERE idPedidoDetalle=? ");

            ps.setInt(1, id2);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Eliminado.");

            cargarTabla();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }

    }//GEN-LAST:event_btnRemoverPActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        if (txfEstatus.getText().equals("C")) {
            Pagos2 pag = new Pagos2();
            pag.setVisible(true);
            this.setVisible(false);
        } else {

            int confirmacion = JOptionPane.showConfirmDialog(null, "Su pedido será confirmado, ¿Desea continuar?");
            if (confirmacion != 0) {

            } else {
                Pagos2 pag = new Pagos2();
                pag.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

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

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        /*
        this.setVisible(false);
        TablaUnidadesMedida uniM = new TablaUnidadesMedida();
        uniM.setVisible(true);
        btnGuardar.setEnabled(false);
         */
        btnPedidosDetalle.setEnabled(true);

        btnModificar.setEnabled(true);
        //btnConfirmar.setEnabled(true);
        btnGuardar.setEnabled(false);

        txfFechaR.setEnabled(false);
        txfFechaRecepcion.setEnabled(false);
        txfEstatus.setEnabled(false);
        txfTotal.setEnabled(false);
        txfCantidad.setEnabled(false);

        //GUARDAR----------------------------------------------------
        if (control == 0) {

            //Valores default
            txfCantidad.setText("0");
            txfTotal.setText("0");
            txfEstatus.setText("P");

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
                contro = 1;
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro guardado.");

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, e.toString());

            }

            TablaPedidos ped = new TablaPedidos();
            ped.setVisible(true);
            this.setVisible(false);
        } //UPDATE--------------------------------------------------------------------------------------------------------------------------------
        else {

            int idProveedor = 1;
            int idSucursal = 1;
            int idEmpleado = 1;
            btnConfirmar.setEnabled(true);
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

            //MOFICACION------------------------------------------
            try {

                Connection con = Conexion.getConexion();

                PreparedStatement ps = con.prepareStatement("UPDATE Pedidos SET idProveedor=?, idSucursal=?, idEmpleado=? WHERE idPedido=?");

                ps.setInt(1, idProveedor);
                ps.setInt(2, idSucursal);
                ps.setInt(3, idEmpleado);
                ps.setInt(4, noPed);

                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Modificado.");

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, e.toString());

            }

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(false);
        //editando = 0;
        // limpiar();
        // cargarTabla();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblDetallePedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetallePedidoMouseClicked
        if (bandCantidades == 1) {
            fila = tblDetallePedido.getSelectedRow();
            txfAceptada.setEnabled(true);
            txfRecibida.setEnabled(true);
            txfRechazada.setEnabled(true);
            btnRegistrar.setEnabled(true);
        }
        if (txfEstatus.getText().equals("P")) {
            btnRemoverP.setEnabled(true);
        }


    }//GEN-LAST:event_tblDetallePedidoMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        bandCantidades = 0;
        int aceptada = Integer.parseInt(txfAceptada.getText());
        int recibida = Integer.parseInt(txfRecibida.getText());
        int rechazada = Integer.parseInt(txfRechazada.getText());

        try {
            int fila = tblDetallePedido.getSelectedRow();
            int id = Integer.parseInt(tblDetallePedido.getValueAt(fila, 0).toString());
            Connection con = Conexion.getConexion();

            PreparedStatement ps = con.prepareStatement("UPDATE PedidoDetalle SET cantRecibida=?, cantAceptada=?, cantRechazada=? WHERE idPedidoDetalle=?");

            ps.setInt(1, recibida);
            ps.setInt(2, aceptada);
            ps.setInt(3, rechazada);
            ps.setInt(4, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado.");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        dispose();
        TablaPedidos tbl = new TablaPedidos();
        tbl.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        Document documento = new Document();
        try {
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Escritorio/OrdenCompra.pdf"));
            documento.open();

            //Tabla Pedido
            
            PdfPTable tabla = new PdfPTable(10);
            tabla.addCell("Pedido");
            tabla.addCell("Nombre");
            tabla.addCell("Fecha de Registro");
            tabla.addCell("Fecha de Recepcion");
            tabla.addCell("Total a pagar");
            tabla.addCell("Cantidad pagada");
            tabla.addCell("Estatus");
            tabla.addCell("idProveedor");
            tabla.addCell("idSucursal");
            tabla.addCell("idEmpleado");

            try {
                PreparedStatement ps;
                ResultSet rs;
                Connection con = Conexion.getConexion();
                ps = con.prepareStatement("SELECT * FROM Pedidos where idPedido=?");
                ps.setInt(1, noPed);
                rs = ps.executeQuery();
                documento.addHeader("Reporte del Pedido", "Aquí se muestran los detalles del  pedido, así como los pagos que se realizaron.");
                if (rs.next()) {
                    do {
                        tabla.addCell(rs.getString(1));
                        tabla.addCell(rs.getString(2));
                        tabla.addCell(rs.getString(3));
                        tabla.addCell(rs.getString(4));
                        tabla.addCell(rs.getString(5));
                        tabla.addCell(rs.getString(6));
                        tabla.addCell(rs.getString(7));
                        tabla.addCell(rs.getString(8));
                        tabla.addCell(rs.getString(9));
                        tabla.addCell(rs.getString(10));
                    } while (rs.next());
                   
                    documento.add(tabla);
                }

            } catch (Exception e) {
            }

            //Tabla Pagos
            PdfPTable tabla2 = new PdfPTable(6);
            tabla2.addCell("NumPago");
            tabla2.addCell("Fecha");
            tabla2.addCell("Importe");
            tabla2.addCell("Estatus");
            tabla2.addCell("Pedido");
            tabla2.addCell("Forma de Pago");

            try {
                PreparedStatement ps;
                ResultSet rs;
                Connection con = Conexion.getConexion();
                ps = con.prepareStatement("SELECT * FROM Pagos where idPedido=?");
                ps.setInt(1, noPed);
                rs = ps.executeQuery();
                if (rs.next()) {
                    do {
                        tabla2.addCell(rs.getString(1));
                        tabla2.addCell(rs.getString(2));
                        tabla2.addCell(rs.getString(3));
                        tabla2.addCell(rs.getString(4));
                        tabla2.addCell(rs.getString(5));
                        tabla2.addCell(rs.getString(6));
                        
                    } while (rs.next());
                    
                    documento.add(tabla2);

                }

            } catch (Exception e) {
            }
            documento.close();
            JOptionPane.showMessageDialog(null, "Reporte creado");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnImprimirActionPerformed

    public void cargarTabla() {

        DefaultTableModel modeloTabla = (DefaultTableModel) tblDetallePedido.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();

            ps = con.prepareStatement("SELECT idPedidoDetalle, cantPedida, precioCompra, subTotal, cantRecibida, cantRechazada, cantAceptada, idPedido, idPresentacion FROM PedidoDetalle WHERE idPedido=?");
            ps.setInt(1, noPed);
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
            java.util.logging.Logger.getLogger(RegistroPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPedidos().setVisible(true);
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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnRemoverP;
    private javax.swing.JButton btnXML;
    private javax.swing.JComboBox<String> cmbEmpleado;
    private javax.swing.JComboBox<String> cmbProveedor;
    private javax.swing.JComboBox<String> cmbSucursales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPedido;
    private javax.swing.JTable tblDetallePedido;
    private javax.swing.JTextField txfAceptada;
    private javax.swing.JTextField txfCantidad;
    private javax.swing.JTextField txfEstatus;
    private javax.swing.JTextField txfFechaR;
    private javax.swing.JTextField txfFechaRecepcion;
    private javax.swing.JTextField txfId;
    private javax.swing.JTextField txfId2;
    private javax.swing.JTextField txfRechazada;
    private javax.swing.JTextField txfRecibida;
    private javax.swing.JTextField txfTotal;
    // End of variables declaration//GEN-END:variables
}
