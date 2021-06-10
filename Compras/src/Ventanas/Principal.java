/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.awt.Image;
import java.util.Calendar;
import javax.swing.ImageIcon;

/**
 *
 * @author jmadr
 */
public class Principal extends javax.swing.JFrame {
     
     
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        botonImagen();
        Calendar calendario = Calendar.getInstance();
        int hora, minutos, segundos;
        hora = calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        lblFecha.setText(hora + ":" + minutos + " hrs" + "\n");

        
        int dia, mes, annio;
        dia = calendario.get(Calendar.DATE);
        mes = calendario.get(Calendar.MONTH) + 1;
        annio = calendario.get(Calendar.YEAR);
        lblFecha2.setText(dia + "/" + mes + "/" + annio  + "\n");
        
       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        pnlBotones = new javax.swing.JPanel();
        btnLab = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        btnUnidades = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEmpaques = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnProductos = new javax.swing.JButton();
        btnPresentacionesProducto = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnProveedores = new javax.swing.JButton();
        btnProductosProveedor = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnImagenes = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnSucursales = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnPagos = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnOfertas = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        btnCuentasProveedor = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnContactosProveedor = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();
        lblFecha2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlBotones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));

        btnLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabActionPerformed(evt);
            }
        });

        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });

        btnUnidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnidadesActionPerformed(evt);
            }
        });

        jLabel1.setText("Laboratorios");

        jLabel2.setText("Unidades de Medida");

        jLabel3.setText("Categorias");

        btnEmpaques.setBorder(null);
        btnEmpaques.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpaquesActionPerformed(evt);
            }
        });

        jLabel4.setText("Empaques");

        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });

        btnPresentacionesProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPresentacionesProductoActionPerformed(evt);
            }
        });

        jLabel5.setText("Productos");

        jLabel6.setText("Presentaciones de productos");

        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });

        btnProductosProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosProveedorActionPerformed(evt);
            }
        });

        jLabel7.setText("Proveedor");

        jLabel8.setText("ProductosProveedor");

        btnImagenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagenesActionPerformed(evt);
            }
        });

        jLabel9.setText("Imagenes Productos");

        btnSucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSucursalesActionPerformed(evt);
            }
        });

        jLabel10.setText("Sucursales");

        btnPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagosActionPerformed(evt);
            }
        });

        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });

        jLabel11.setText("Pedidos");

        jLabel12.setText("Pagos");

        btnOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOfertasActionPerformed(evt);
            }
        });

        jLabel13.setText("Ofertas");

        btnCuentasProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasProveedorActionPerformed(evt);
            }
        });

        jLabel14.setText("Cuentas Proveedor");

        btnContactosProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactosProveedorActionPerformed(evt);
            }
        });

        jLabel15.setText("Contactos Proveedor");

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlBotonesLayout.createSequentialGroup()
                            .addGap(56, 56, 56)
                            .addComponent(jLabel1))
                        .addGroup(pnlBotonesLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLab, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)))
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9))
                                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                                .addComponent(btnUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(btnImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnEmpaques, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnPresentacionesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(43, 43, 43)
                                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnSucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel6)
                                        .addGap(58, 58, 58)
                                        .addComponent(jLabel12)))
                                .addGap(25, 25, 25))
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(68, 68, 68)))
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCuentasProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnContactosProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel14))
                                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel13))))
                            .addGroup(pnlBotonesLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel15)))
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnProductosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(81, 81, 81)
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImagenes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(btnLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOfertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSucursales, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(btnEmpaques, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCategorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPresentacionesProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(pnlBotonesLayout.createSequentialGroup()
                        .addComponent(btnCuentasProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(btnContactosProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)))
                .addGap(29, 29, 29)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(btnProductosProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11))
                .addGap(44, 44, 44))
        );

        lblNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Empleado:"));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Entrada:"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblFecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(11, 11, 11)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        Categorias cat = new Categorias();
        cat.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void btnUnidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidadesActionPerformed

        UnidadesDeMedida unidades = new UnidadesDeMedida();
        unidades.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnUnidadesActionPerformed

    private void btnLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabActionPerformed
        Laboratorios lab = new Laboratorios();
        lab.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLabActionPerformed

    private void btnEmpaquesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpaquesActionPerformed
        Empaques emp = new Empaques();
        emp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEmpaquesActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Productos p = new Productos();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnPresentacionesProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPresentacionesProductoActionPerformed
        PresentacionesProducto pp = new PresentacionesProducto();
        pp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPresentacionesProductoActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Proveedores p = new Proveedores();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnProductosProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosProveedorActionPerformed
        ProductosProveedor pp = new ProductosProveedor();
        pp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProductosProveedorActionPerformed

    private void btnImagenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagenesActionPerformed
        ImagenesProducto img = new ImagenesProducto();
        img.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnImagenesActionPerformed

    private void btnSucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSucursalesActionPerformed
        Sucursales suc = new Sucursales();
        suc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSucursalesActionPerformed

    private void btnPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagosActionPerformed
        Pagos pa = new Pagos();
        pa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPagosActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
      TablaPedidos pedido = new TablaPedidos();
        pedido.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOfertasActionPerformed
        Ofertas oferta = new Ofertas();
        oferta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOfertasActionPerformed

    private void btnCuentasProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasProveedorActionPerformed
        CuentasProveedor CP = new CuentasProveedor();
        CP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCuentasProveedorActionPerformed

    private void btnContactosProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactosProveedorActionPerformed
        ContactosProveedor C = new ContactosProveedor();
        C.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContactosProveedorActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void botonImagen() {
        //ImageIcon categoria = new ImageIcon("src/Img/catIcon.png");
        ImageIcon categoria = new ImageIcon(getClass().getResource("/Img/catIcon.png"));
        btnCategorias.setIcon(new ImageIcon(categoria.getImage().getScaledInstance(btnCategorias.getWidth(), btnCategorias.getHeight(), Image.SCALE_SMOOTH)));

        //ImageIcon laboratorio = new ImageIcon("src/Img/labIcon.png");
        ImageIcon laboratorio = new ImageIcon(getClass().getResource("/Img/labIcon.png"));
        btnLab.setIcon(new ImageIcon(laboratorio.getImage().getScaledInstance(btnLab.getWidth(), btnLab.getHeight(), Image.SCALE_SMOOTH)));

        //ImageIcon unidades = new ImageIcon("src/Img/uniIcon.png");
        ImageIcon unidades = new ImageIcon(getClass().getResource("/Img/uniIcon.png"));
        btnUnidades.setIcon(new ImageIcon(unidades.getImage().getScaledInstance(btnUnidades.getWidth(), btnUnidades.getHeight(), Image.SCALE_SMOOTH)));

        //ImageIcon empaques = new ImageIcon("src/Img/empIcon.png");
        ImageIcon empaques = new ImageIcon(getClass().getResource("/Img/empIcon.png"));
        btnEmpaques.setIcon(new ImageIcon(empaques.getImage().getScaledInstance(btnEmpaques.getWidth(), btnEmpaques.getHeight(), Image.SCALE_SMOOTH)));
        
        //ImageIcon productos = new ImageIcon("src/Img/Productos.png");
        ImageIcon productos = new ImageIcon(getClass().getResource("/Img/Productos.png"));
        btnProductos.setIcon(new ImageIcon(productos.getImage().getScaledInstance(btnProductos .getWidth(), btnProductos.getHeight(), Image.SCALE_SMOOTH)));
        
        //ImageIcon presentacionesProducto = new ImageIcon("src/Img/PresentacionesProducto.jpg");
        ImageIcon presentacionesProducto = new ImageIcon(getClass().getResource("/Img/PresentacionesProducto.jpg"));
        btnPresentacionesProducto.setIcon(new ImageIcon(presentacionesProducto.getImage().getScaledInstance(btnPresentacionesProducto.getWidth(), btnPresentacionesProducto.getHeight(), Image.SCALE_SMOOTH)));
        
        //ImageIcon Sucursales = new ImageIcon("src/Img/Sucursales.png");
        ImageIcon Sucursales = new ImageIcon(getClass().getResource("/Img/Sucursales.png"));
        btnSucursales.setIcon(new ImageIcon(Sucursales.getImage().getScaledInstance(btnSucursales.getWidth(), btnSucursales.getHeight(), Image.SCALE_SMOOTH)));
    
        //ImageIcon oferta = new ImageIcon("src/Img/Ofertas.jpg");
        ImageIcon oferta = new ImageIcon(getClass().getResource("/Img/Ofertas.jpg"));
        btnOfertas.setIcon(new ImageIcon(oferta.getImage().getScaledInstance(btnOfertas.getWidth(), btnOfertas.getHeight(), Image.SCALE_SMOOTH)));
        
        //ImageIcon cuenta = new ImageIcon("src/Img/Cuentas.png");
        ImageIcon cuenta = new ImageIcon(getClass().getResource("/Img/Cuentas.png"));
        btnCuentasProveedor.setIcon(new ImageIcon(cuenta.getImage().getScaledInstance(btnCuentasProveedor.getWidth(), btnCuentasProveedor.getHeight(), Image.SCALE_SMOOTH)));
        
        
        //ImageIcon contacto = new ImageIcon("src/Img/Contactos.png");
        ImageIcon contacto = new ImageIcon(getClass().getResource("/Img/Contactos.png"));
        btnContactosProveedor.setIcon(new ImageIcon(contacto.getImage().getScaledInstance(btnContactosProveedor.getWidth(), btnContactosProveedor.getHeight(), Image.SCALE_SMOOTH)));
        /*
        ImageIcon pedidos = new ImageIcon(getClass().getResource("/Img/pedidos.png"));
        btnPedidos.setIcon(new ImageIcon(pedidos.getImage().getScaledInstance(btnPedidos.getWidth(), btnPedidos.getHeight(), Image.SCALE_SMOOTH)));
        /*
        ImageIcon proveedores = new ImageIcon("src/Img/proveedor.png");
        //ImageIcon proveedores = new ImageIcon(getClass().getResource("/Img/proveedor.png"));
        btnProveedores.setIcon(new ImageIcon(proveedores.getImage().getScaledInstance(btnProveedores .getWidth(), btnProveedores.getHeight(), Image.SCALE_SMOOTH)));
                
        ImageIcon Pagos = new ImageIcon("src/Img/Pagos.png");
        //ImageIcon Pagos = new ImageIcon(getClass().getResource("/Img/Pagos.png"));
        btnPagos.setIcon(new ImageIcon(Pagos.getImage().getScaledInstance(btnPagos.getWidth(), btnPagos.getHeight(), Image.SCALE_SMOOTH)));
                
        ImageIcon productosProveedor = new ImageIcon("src/Img/ProductosProveedor.jpg");
        //ImageIcon productosProveedor = new ImageIcon(getClass().getResource("/Img/ProductosProveedor.jpg"));
        btnProductosProveedor.setIcon(new ImageIcon(empaques.getImage().getScaledInstance(btnProductosProveedor.getWidth(), btnProductosProveedor.getHeight(), Image.SCALE_SMOOTH)));
            
        //ImageIcon imagenesProductos = new ImageIcon("src/Img/imagen.png");
        ImageIcon imagenesProductos = new ImageIcon(getClass().getResource("/Img/imagen.png"));
        btnImagenes.setIcon(new ImageIcon(imagenesProductos.getImage().getScaledInstance(btnImagenes.getWidth(), btnImagenes.getHeight(), Image.SCALE_SMOOTH)));*/
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnContactosProveedor;
    private javax.swing.JButton btnCuentasProveedor;
    private javax.swing.JButton btnEmpaques;
    private javax.swing.JButton btnImagenes;
    private javax.swing.JButton btnLab;
    private javax.swing.JButton btnOfertas;
    private javax.swing.JButton btnPagos;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnPresentacionesProducto;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProductosProveedor;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnSucursales;
    private javax.swing.JButton btnUnidades;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblFecha2;
    public static javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlBotones;
    // End of variables declaration//GEN-END:variables
}
