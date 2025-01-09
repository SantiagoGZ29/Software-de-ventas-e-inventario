/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.pgy.ui;
        
import com.pgy.business.Producto;
import javax.swing.JOptionPane;

/**
 *
 * @author sgall
 */
public class Venta extends javax.swing.JFrame {
    private String rut;

    public Venta(String rut) {
        this.rut = rut;
        initComponents();
    }
    

    /**
     * Creates new form Venta
     */
    public Venta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_ventas = new javax.swing.JTable();
        txt_sku = new javax.swing.JTextField();
        btn_imprimirBoleta = new javax.swing.JButton();
        btn_efectivo = new javax.swing.JButton();
        btn_tarjeta = new javax.swing.JButton();
        btn_registrarCliente = new javax.swing.JButton();
        btn_devolucion = new javax.swing.JButton();
        btn_cerrarSesion = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        txt_totalPagar = new javax.swing.JTextField();
        lbl_total_pagar = new javax.swing.JLabel();
        txt_devolver = new javax.swing.JTextField();
        lbl_monto = new javax.swing.JLabel();
        CheckB_debito = new javax.swing.JCheckBox();
        CheckB_credito = new javax.swing.JCheckBox();
        lbl_codigoA = new javax.swing.JLabel();
        txt_codigoAutorizacion = new javax.swing.JTextField();
        lbl_sku = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_buscarSku = new javax.swing.JButton();
        lbl_devolver = new javax.swing.JLabel();
        txt_precioPdcto = new javax.swing.JTextField();
        lbl_cantidadpdcto = new javax.swing.JLabel();
        lbl_categoriapdcto = new javax.swing.JLabel();
        lbl_nombrepdcto = new javax.swing.JLabel();
        lbl_preciopdcto = new javax.swing.JLabel();
        txt_nombrePdcto = new javax.swing.JTextField();
        btn_agregarpdcto = new javax.swing.JButton();
        txt_categoriaPdcto = new javax.swing.JTextField();
        txt_monto = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tb_ventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Categoría", "Cantidad", "Precio unitario", "Total"
            }
        ));
        jScrollPane2.setViewportView(tb_ventas);

        txt_sku.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        txt_sku.setText("2000040098");

        btn_imprimirBoleta.setBackground(new java.awt.Color(204, 255, 204));
        btn_imprimirBoleta.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btn_imprimirBoleta.setText("IMPRIMIR BOLETA");
        btn_imprimirBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirBoletaActionPerformed(evt);
            }
        });

        btn_efectivo.setText("EFECTIVO");

        btn_tarjeta.setText("TARJETA");
        btn_tarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tarjetaActionPerformed(evt);
            }
        });

        btn_registrarCliente.setText("REGISTRAR CLIENTE");

        btn_devolucion.setText("DEVOLUCIÓN");

        btn_cerrarSesion.setBackground(new java.awt.Color(255, 204, 204));
        btn_cerrarSesion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_cerrarSesion.setText("CERRAR SESIÓN");
        btn_cerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarSesionActionPerformed(evt);
            }
        });

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lbl_titulo.setText("SISTEMA DE VENTAS ");

        txt_totalPagar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        txt_totalPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalPagarActionPerformed(evt);
            }
        });

        lbl_total_pagar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lbl_total_pagar.setText("TOTAL A PAGAR");

        lbl_monto.setText("MONTO");

        CheckB_debito.setText("DÉBITO");
        CheckB_debito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckB_debitoActionPerformed(evt);
            }
        });

        CheckB_credito.setText("CRÉDITO");
        CheckB_credito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckB_creditoActionPerformed(evt);
            }
        });

        lbl_codigoA.setText("Código de autorización");

        lbl_sku.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lbl_sku.setText("SKU");

        btn_buscarSku.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btn_buscarSku.setText("BUSCAR");
        btn_buscarSku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarSkuActionPerformed(evt);
            }
        });

        lbl_devolver.setText("DEVOLVER");

        txt_precioPdcto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        lbl_cantidadpdcto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbl_cantidadpdcto.setText("CANTIDAD");

        lbl_categoriapdcto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbl_categoriapdcto.setText("CATEGORÍA");

        lbl_nombrepdcto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbl_nombrepdcto.setText("NOMBRE");

        lbl_preciopdcto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        lbl_preciopdcto.setText("PRECIO");

        txt_nombrePdcto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        btn_agregarpdcto.setBackground(new java.awt.Color(204, 255, 204));
        btn_agregarpdcto.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        btn_agregarpdcto.setText("AGREGAR");
        btn_agregarpdcto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarpdctoActionPerformed(evt);
            }
        });

        txt_categoriaPdcto.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_sku, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_sku, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(lbl_nombrepdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbl_categoriapdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_categoriaPdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_nombrePdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lbl_cantidadpdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_buscarSku, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lbl_preciopdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_precioPdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_total_pagar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btn_agregarpdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_titulo)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btn_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_registrarCliente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btn_devolucion)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btn_cerrarSesion)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lbl_codigoA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txt_codigoAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn_tarjeta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(CheckB_debito, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CheckB_credito)
                                                .addGap(16, 16, 16))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(txt_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_imprimirBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_cerrarSesion)
                            .addComponent(btn_registrarCliente)
                            .addComponent(btn_devolucion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_efectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_devolver, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(lbl_titulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_sku, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_sku, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btn_buscarSku, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_cantidadpdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nombrePdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_nombrepdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_categoriapdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_preciopdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_categoriaPdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_precioPdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)))
                        .addComponent(btn_agregarpdcto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btn_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckB_debito)
                            .addComponent(CheckB_credito))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_codigoAutorizacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_codigoA))
                        .addGap(71, 71, 71)
                        .addComponent(btn_imprimirBoleta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_total_pagar)
                            .addComponent(txt_totalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_totalPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalPagarActionPerformed

    private void btn_imprimirBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirBoletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imprimirBoletaActionPerformed

    private void btn_tarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_tarjetaActionPerformed

    private void CheckB_debitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckB_debitoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckB_debitoActionPerformed

    private void CheckB_creditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckB_creditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckB_creditoActionPerformed

    private void btn_buscarSkuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarSkuActionPerformed
        
    // Validar que el campo SKU no esté vacío
    if (txt_sku.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un SKU", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si el campo está vacío
    }  

    int sku;
    try {
        // Validar que el SKU sea un número entero
        sku = Integer.parseInt(txt_sku.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "El SKU ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return; // Salir del método si el SKU no es un número válido
    }

    // Buscar el producto utilizando el SKU
    Producto producto = new Producto().obtener(sku); 
    
    if (producto != null) {
        // Mostrar los datos del producto si se encuentra
        txt_nombrePdcto.setText(producto.getNombre());
        txt_precioPdcto.setText(String.valueOf(producto.getPrecio()));
        txt_categoriaPdcto.setText(producto.getCategoria());
    } else {
        // Mostrar mensaje si no se encuentra el producto
        JOptionPane.showMessageDialog(null, "Producto no encontrado.", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Formatear el campo de cantidad
    jSpinner1.setValue(1);
        
    }//GEN-LAST:event_btn_buscarSkuActionPerformed

    private void btn_cerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarSesionActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cerrarSesionActionPerformed

    private void btn_agregarpdctoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarpdctoActionPerformed

        // Validar que los campos no estén vacíos
        if (txt_sku.getText().trim().isEmpty() || txt_nombrePdcto.getText().trim().isEmpty() || txt_categoriaPdcto.getText().trim().isEmpty() || txt_precioPdcto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay ningun producto, buscar producto primero", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si hay campos vacíos
        }

        //Obtener los valores de los campos
        String nombre = txt_nombrePdcto.getText().trim();
        String categoria = txt_categoriaPdcto.getText().trim();
        int cantidad = (int) jSpinner1.getValue();
        double precio = Double.parseDouble(txt_precioPdcto.getText().trim());
        double total = cantidad * precio;

        //Obtener el modelo de la tabla
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) tb_ventas.getModel();
        
        // Verificar que la cantidad sea de minimo 1
        if (cantidad < 1) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Salir del método si la cantidad es menor a 1
        }
        // Bandera para verificar si el producto ya existe en la tabla
        boolean productoEncontrado = false;

        // Iterar en la tabla buscando si ya existe el producto
        for (int i = 0; i < tb_ventas.getRowCount(); i++) {
            if (tb_ventas.getValueAt(i, 0).equals(nombre)) { // Comparar por nombre del producto
                // Actualizar la cantidad y el total
                int cantidadActual = (int) tb_ventas.getValueAt(i, 2);
                double totalActual = (double) tb_ventas.getValueAt(i, 4);
                tb_ventas.setValueAt(cantidadActual + cantidad, i, 2); // Actualizar cantidad
                tb_ventas.setValueAt(totalActual + total, i, 4); // Actualizar total
                productoEncontrado = true;
                break; // Salir del bucle si se encontró el producto
            }
        }

        // Si el producto no se encontró, agregarlo a la tabla
        if (!productoEncontrado) {
            model.addRow(new Object[]{nombre, categoria, cantidad, precio, total});
        }




        // Calcular el total a pagar
        double totalPagar = 0;
        for (int i = 0; i < tb_ventas.getRowCount(); i++) {
            totalPagar += (double) tb_ventas.getValueAt(i, 4);
        }
        txt_totalPagar.setText(String.valueOf(totalPagar));
        

        
        



    }//GEN-LAST:event_btn_agregarpdctoActionPerformed

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
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Venta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Venta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckB_credito;
    private javax.swing.JCheckBox CheckB_debito;
    private javax.swing.JButton btn_agregarpdcto;
    private javax.swing.JButton btn_buscarSku;
    private javax.swing.JButton btn_cerrarSesion;
    private javax.swing.JButton btn_devolucion;
    private javax.swing.JButton btn_efectivo;
    private javax.swing.JButton btn_imprimirBoleta;
    private javax.swing.JButton btn_registrarCliente;
    private javax.swing.JButton btn_tarjeta;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lbl_cantidadpdcto;
    private javax.swing.JLabel lbl_categoriapdcto;
    private javax.swing.JLabel lbl_codigoA;
    private javax.swing.JLabel lbl_devolver;
    private javax.swing.JLabel lbl_monto;
    private javax.swing.JLabel lbl_nombrepdcto;
    private javax.swing.JLabel lbl_preciopdcto;
    private javax.swing.JLabel lbl_sku;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_total_pagar;
    private javax.swing.JTable tb_ventas;
    private javax.swing.JTextField txt_categoriaPdcto;
    private javax.swing.JTextField txt_codigoAutorizacion;
    private javax.swing.JTextField txt_devolver;
    private javax.swing.JTextField txt_monto;
    private javax.swing.JTextField txt_nombrePdcto;
    private javax.swing.JTextField txt_precioPdcto;
    private javax.swing.JTextField txt_sku;
    private javax.swing.JTextField txt_totalPagar;
    // End of variables declaration//GEN-END:variables
}
