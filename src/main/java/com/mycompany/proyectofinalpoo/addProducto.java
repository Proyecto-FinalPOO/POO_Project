package com.mycompany.proyectofinalpoo;

import javax.swing.JOptionPane;

public class addProducto extends javax.swing.JFrame {

 
    public addProducto() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nombre_negocio = new javax.swing.JLabel();
        img_1 = new javax.swing.JLabel();
        img_2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreNuevoProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidadNuevoProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtValorNuevoProducto = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btt_añadir = new javax.swing.JButton();
        btt_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));

        jLabel7.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("AÑADIR PRODUCTO");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 540, -1));

        nombre_negocio.setFont(new java.awt.Font("AR CENA", 1, 30)); // NOI18N
        nombre_negocio.setText("PLACITA EL MONO");
        jPanel1.add(nombre_negocio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, 40));
        jPanel1.add(img_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));
        jPanel1.add(img_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(3, 2));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel4.setText("Nombre del producto");
        jPanel2.add(jLabel4);
        jPanel2.add(txtNombreNuevoProducto);

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("Cantidad del producto");
        jPanel2.add(jLabel3);
        jPanel2.add(txtCantidadNuevoProducto);

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setText("Valor unitario del producto");
        jPanel2.add(jLabel1);

        txtValorNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorNuevoProductoActionPerformed(evt);
            }
        });
        jPanel2.add(txtValorNuevoProducto);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 490, 190));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Botones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 14))); // NOI18N
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btt_añadir.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        btt_añadir.setText("Añadir");
        btt_añadir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt_añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_añadirActionPerformed(evt);
            }
        });
        jPanel3.add(btt_añadir);

        btt_cancelar.setFont(new java.awt.Font("Roboto", 3, 14)); // NOI18N
        btt_cancelar.setText("Cancelar");
        btt_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_cancelarActionPerformed(evt);
            }
        });
        jPanel3.add(btt_cancelar);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 490, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtValorNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorNuevoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorNuevoProductoActionPerformed

    private void btt_añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_añadirActionPerformed
        PrincipalGI conexPrincipal = new PrincipalGI();
        
        String nombreNuevoProducto;       
        int valorNuevoProducto = 0, cantidadNuevoProducto = 0;
        
        if(!txtCantidadNuevoProducto.getText().equals("") && !txtNombreNuevoProducto.getText().equals("") && !txtValorNuevoProducto.getText().equals(""))
        {
            nombreNuevoProducto=txtNombreNuevoProducto.getText();
            cantidadNuevoProducto=Integer.parseInt(txtCantidadNuevoProducto.getText());
            valorNuevoProducto=Integer.parseInt(txtValorNuevoProducto.getText());
            
            if (cantidadNuevoProducto < 0)
            {
                JOptionPane.showMessageDialog(rootPane, "La cantidad no puede ser menor a 0", "ERROR!", JOptionPane.WARNING_MESSAGE);
                txtCantidadNuevoProducto.setText("");
            }
            else if (valorNuevoProducto <= 0)
            {
                JOptionPane.showMessageDialog(rootPane, "El valor del producto no puede ser 0 o menor.", "ERROR!", JOptionPane.WARNING_MESSAGE);
                txtValorNuevoProducto.setText("");
            }
            else if (conexPrincipal.verificaProductoDuplicado(nombreNuevoProducto))
            {
                JOptionPane.showMessageDialog(rootPane, "El producto ya existe.", "ERROR!", JOptionPane.WARNING_MESSAGE);
                txtNombreNuevoProducto.setText("");
            }
            else
            {
                Producto ProductoNuevo = new Producto(conexPrincipal.retornaIDProducto(),nombreNuevoProducto,cantidadNuevoProducto,valorNuevoProducto,true);
                conexPrincipal.listaProductosDic.put(ProductoNuevo.getIDProducto(), ProductoNuevo);
                Object[] nuevoProducto  = {ProductoNuevo.getIDProducto(),ProductoNuevo.getNombre(),ProductoNuevo.getCantidad(),ProductoNuevo.getPrecio(), conexPrincipal.retornarDisponibilidadProducto(ProductoNuevo.isEstado())};
                JOptionPane.showMessageDialog(rootPane, "Se agrego correctamente el producto","Informacion",JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
            }   
                        
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Verifique que los campos requeridos esten correctos", "ERROR!", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btt_añadirActionPerformed

    private void btt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_cancelarActionPerformed
        this.setRootPane(null);
        this.dispose();
    }//GEN-LAST:event_btt_cancelarActionPerformed

    
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
            java.util.logging.Logger.getLogger(addProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btt_añadir;
    private javax.swing.JButton btt_cancelar;
    private javax.swing.JLabel img_1;
    private javax.swing.JLabel img_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel nombre_negocio;
    public javax.swing.JTextField txtCantidadNuevoProducto;
    public javax.swing.JTextField txtNombreNuevoProducto;
    public javax.swing.JTextField txtValorNuevoProducto;
    // End of variables declaration//GEN-END:variables
}
