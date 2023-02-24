
package interfaces;

import javax.swing.JOptionPane;
public class PedidoNuevo extends javax.swing.JFrame {

    /**
     * Creates new form NewOrderPage
     */
    public PedidoNuevo() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * Returns invTextField
     *
     * @return javax.swing.JTextArea
     */
    public javax.swing.JTextArea getInvTextField() {
        return this.invTextField;
    }

    /**
     * Returns storageComboBox
     *
     * @return javax.swing.JComboBox
     */
    public javax.swing.JComboBox<String> getStorageComboBox() {
        return this.storageComboBox;
    }

    /**
     * Returns productComboBoc
     *
     * @return javax.swing.JComboBox
     */
    public javax.swing.JComboBox<String> getProductComboBox() {
        return this.productComboBox;
    }

    /**
     * Returns productQtyTextField
     *
     * @return javax.swing.JComboBox
     */
    public javax.swing.JTextField getProductQtyTextField() {
        return this.productQtyTextField;
    }

    public javax.swing.JTextArea getOrderTextArea() {
        return this.orderTextArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        invTextField = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        storageComboBox = new javax.swing.JComboBox<>();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        orderTextArea = new javax.swing.JTextArea();
        jLabel40 = new javax.swing.JLabel();
        productComboBox = new javax.swing.JComboBox<>();
        jLabel42 = new javax.swing.JLabel();
        productQtyTextField = new javax.swing.JTextField();
        addProductButton = new javax.swing.JButton();
        completeOrderButton = new javax.swing.JButton();
        restartOrderButton = new javax.swing.JButton();
        backToMenuButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        jPanel8.setBackground(new java.awt.Color(247, 209, 109));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 153, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("DFS Recorrido de profundidad");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("DFS Recorrido de profundidad");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 40));

        jPanel10.setBackground(new java.awt.Color(255, 153, 102));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("DFS Recorrido de profundidad");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("DFS Recorrido de profundidad");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jPanel11.setBackground(new java.awt.Color(255, 153, 102));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("DFS Recorrido de profundidad");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("DFS Recorrido de profundidad");
        jPanel11.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 40));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 40));

        jPanel13.setBackground(new java.awt.Color(255, 153, 102));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("DFS Recorrido de profundidad");
        jPanel13.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        jPanel14.setBackground(new java.awt.Color(255, 153, 102));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("DFS Recorrido de profundidad");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jLabel18.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("DFS Recorrido de profundidad");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 40));

        jPanel15.setBackground(new java.awt.Color(255, 153, 102));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("DFS Recorrido de profundidad");
        jPanel15.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jLabel20.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("DFS Recorrido de profundidad");
        jPanel15.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jPanel16.setBackground(new java.awt.Color(255, 153, 102));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("DFS Recorrido de profundidad");
        jPanel16.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jLabel22.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("DFS Recorrido de profundidad");
        jPanel16.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 40));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 40));

        jPanel13.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 260, 40));

        jPanel8.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 240, 220));

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("DFS Recorrido en profundidad");
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 220, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        invTextField.setEditable(false);
        invTextField.setBackground(new java.awt.Color(255, 255, 255));
        invTextField.setColumns(20);
        invTextField.setForeground(new java.awt.Color(0, 0, 0));
        invTextField.setLineWrap(true);
        invTextField.setRows(5);
        jScrollPane4.setViewportView(invTextField);

        jPanel24.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 500));

        getContentPane().add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 530));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Cantidad:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 20));

        storageComboBox.setBackground(new java.awt.Color(255, 255, 255));
        storageComboBox.setForeground(new java.awt.Color(0, 0, 0));
        storageComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                storageComboBoxItemStateChanged(evt);
            }
        });
        storageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                storageComboBoxActionPerformed(evt);
            }
        });
        jPanel1.add(storageComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 280, 30));

        jLabel39.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Pedido a realizar");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 140, 30));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        orderTextArea.setEditable(false);
        orderTextArea.setBackground(new java.awt.Color(255, 255, 255));
        orderTextArea.setColumns(20);
        orderTextArea.setForeground(new java.awt.Color(0, 0, 0));
        orderTextArea.setLineWrap(true);
        orderTextArea.setRows(5);
        jScrollPane5.setViewportView(orderTextArea);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 190, 90));

        jLabel40.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Almacén");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 60, 30));

        productComboBox.setBackground(new java.awt.Color(255, 255, 255));
        productComboBox.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(productComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 180, -1));

        jLabel42.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Producto:");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, 30));

        productQtyTextField.setBackground(new java.awt.Color(255, 255, 255));
        productQtyTextField.setForeground(new java.awt.Color(0, 0, 0));
        productQtyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productQtyTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(productQtyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 90, -1));

        addProductButton.setBackground(new java.awt.Color(255, 153, 0));
        addProductButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        addProductButton.setForeground(new java.awt.Color(0, 0, 0));
        addProductButton.setText("Agregar");
        addProductButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 70, 30));

        completeOrderButton.setBackground(new java.awt.Color(255, 153, 0));
        completeOrderButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        completeOrderButton.setForeground(new java.awt.Color(0, 0, 0));
        completeOrderButton.setText("Completar Pedido");
        completeOrderButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        completeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(completeOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 190, 30));

        restartOrderButton.setBackground(new java.awt.Color(255, 153, 0));
        restartOrderButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        restartOrderButton.setForeground(new java.awt.Color(0, 0, 0));
        restartOrderButton.setText("Reiniciar pedido");
        restartOrderButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        restartOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartOrderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(restartOrderButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 190, 30));

        backToMenuButton.setBackground(new java.awt.Color(0, 0, 0));
        backToMenuButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        backToMenuButton.setForeground(new java.awt.Color(255, 153, 0));
        backToMenuButton.setText("<Menu");
        backToMenuButton.setBorder(null);
        backToMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMenuButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backToMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 370, 530));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMenuButtonActionPerformed
        Code.getBackToMainPage();
//        getStorageComboBox().removeAllItems();

    }//GEN-LAST:event_backToMenuButtonActionPerformed

    private void storageComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_storageComboBoxItemStateChanged
        InterfaceFunctions.setAvailableProducts(getStorageComboBox().getSelectedItem().toString());

    }//GEN-LAST:event_storageComboBoxItemStateChanged

    private void restartOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartOrderButtonActionPerformed
        InterfaceFunctions.resetOrder();
    }//GEN-LAST:event_restartOrderButtonActionPerformed

    private void productQtyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productQtyTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productQtyTextFieldActionPerformed

    private void addProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductButtonActionPerformed

        if ((getProductComboBox().getSelectedItem() != null)) {
            if (InterfaceFunctions.isANumber(getProductQtyTextField().getText())) {
                if (Integer.parseInt(getProductQtyTextField().getText()) > 0) {
                    InterfaceFunctions.updateOrderDisplay(getOrderTextArea().getText());
                    getStorageComboBox().setEnabled(false);
                    getProductComboBox().removeItem(getProductComboBox().getSelectedItem());
                } else {
                    JOptionPane.showMessageDialog(null, "Alerta, la cantidad de producto no puede ser 0 o menor");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Número de cantidad inválido, por favor intente de nuevo");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Alerta, ya se agregaron todos los productos del almacén");
        }


    }//GEN-LAST:event_addProductButtonActionPerformed

    private void completeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderButtonActionPerformed
       if (!getOrderTextArea().getText().isEmpty()) {
            InterfaceFunctions.completeOrder(getOrderTextArea().getText(), getStorageComboBox().getSelectedItem().toString());
       } else {
           JOptionPane.showMessageDialog(null, "No se han agregado productos a la orden");
       }
       
    }//GEN-LAST:event_completeOrderButtonActionPerformed

    private void storageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_storageComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_storageComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(PedidoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidoNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidoNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductButton;
    private javax.swing.JButton backToMenuButton;
    private javax.swing.JButton completeOrderButton;
    private javax.swing.JTextArea invTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea orderTextArea;
    private javax.swing.JComboBox<String> productComboBox;
    private javax.swing.JTextField productQtyTextField;
    private javax.swing.JButton restartOrderButton;
    private javax.swing.JComboBox<String> storageComboBox;
    // End of variables declaration//GEN-END:variables
}
