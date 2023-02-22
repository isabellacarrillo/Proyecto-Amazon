package Interface;

import javax.swing.JOptionPane;
import grafos.Grafos;

public class NewAlmacen extends javax.swing.JFrame {

    public static Grafos g1 = new Grafos();
    String nombre = "";
    String desde = "";
    String hasta = "";
    String direccionDesde = "";
    String direccionHasta = "";
    String direccion = "";
    int contadorTransmisor = 0;
    /**
     * 
     */
    public NewAlmacen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }
    /**
     * Get the default values of the page
     */
    public void defaultValues() {

        nameField.setEnabled(true);
        selectStorageNameButton.setEnabled(true);
        transmitterComboBox.setEnabled(false);
        transmitterCostField.setEnabled(false);
        selectTransmitterStorageButton.setEnabled(false);
        transmitterRutesTextArea.setText("");
        applyTransmitterStorageButton.setEnabled(false);
        receiverComboBox.setEnabled(false);
        receiverCostField.setEnabled(false);
        selectReceiverStorageButton.setEnabled(false);
        ReceiverRutesTextArea.setText("");
        applyTransmitterStorageButton1.setEnabled(false);
        createStorageButton.setEnabled(false);
        nombre = "";
        desde = "";
        hasta = "";
        direccionDesde = "";
        direccionHasta = "";
        direccion = "";
        contadorTransmisor = 0;
        nameField.setText("");
        transmitterComboBox.removeAllItems();
        receiverComboBox.removeAllItems();
    }
    
    /**
     * fill the transmitter chooser storage
     * @param g1 
     */

    public void fillTransmitterChooserCombo(Grafos g1) {

//        System.out.println(direccion);
        transmitterComboBox.removeAllItems();
        String[] storage = g1.warehousestring();
        String[] arrayAux = InterfaceFunctions.fromTexttoArray(direccion);
        System.out.println(arrayAux.length);
        System.out.println(storage.length);

        for (int i = 0; i < storage.length; i++) {

            if (!storage[i].equalsIgnoreCase(desde)) {
                boolean validator = true;
                for (int j = 0; j < arrayAux.length; j++) {
                    String[] aux = arrayAux[j].split(",");
                    if (aux[0].equalsIgnoreCase(storage[i])) {
                        validator = false;

                    }
                }
                if (validator) {
                    transmitterComboBox.addItem(storage[i]);

                }
            }
        }

    }
    
    /**
     * fill the receiver chooser storage
     * @param g1 
     */

    public void fillReceiverChooserCombo(Grafos g1) {

        receiverComboBox.removeAllItems();
        String[] storage = g1.warehousestring();
        String[] arrayAux = InterfaceFunctions.fromTexttoArray(direccion);
        for (int i = 0; i < storage.length; i++) {
            if (!storage[i].equalsIgnoreCase(hasta)) {
                boolean validator = true;
                for (int j = 0; j < arrayAux.length; j++) {
                    String[] aux = arrayAux[j].split(",");
                    if (aux[0].equalsIgnoreCase(storage[i])) {
                        validator = false;

                    }
                }
                if (validator) {
                    receiverComboBox.addItem(storage[i]);

                }
            }
        }

    }
    
    /**
     * fill the transmitter chooser storage
     * @param g1 
     */

    public void fillTransmitterCombo(Grafos g1) {
        transmitterComboBox.removeAllItems();
        String[] storage = g1.warehousestring();
        for (int i = 0; i < storage.length; i++) {
            transmitterComboBox.addItem(storage[i]);
        }
    }
    
    /**
     * fill the receiver chooser storage
     * @param g1 
     */

    public void fillReceiverCombo(Grafos g1) {
        receiverComboBox.removeAllItems();
        String[] storage = g1.warehousestring();
        for (int i = 0; i < storage.length; i++) {
            receiverComboBox.addItem(storage[i]);
        }
    }
    /**
     * get the graph information desde Code
     * @param graph 
     */
    public void createGprah(Grafos graph) {
        g1 = graph;
        transmitterRutesTextArea.setEditable(false);
        ReceiverRutesTextArea.setEditable(false);
        defaultValues();

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
        background = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        selectReceiverStorageButton = new javax.swing.JButton();
        applyTransmitterStorageButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ReceiverRutesTextArea = new javax.swing.JTextArea();
        createStorageButton1 = new javax.swing.JToggleButton();
        applyTransmitterStorageButton = new javax.swing.JButton();
        selectTransmitterStorageButton = new javax.swing.JButton();
        receiverCostLabel = new javax.swing.JLabel();
        writeNameLabel = new javax.swing.JLabel();
        chooseTransmitterLabel = new javax.swing.JLabel();
        transmitterCostLabel = new javax.swing.JLabel();
        chooseReceiverLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transmitterRutesTextArea = new javax.swing.JTextArea();
        nameField = new javax.swing.JTextField();
        transmitterComboBox = new javax.swing.JComboBox<>();
        receiverCostField = new javax.swing.JTextField();
        receiverComboBox = new javax.swing.JComboBox<>();
        transmitterCostField = new javax.swing.JTextField();
        createStorageButton = new javax.swing.JToggleButton();
        BackToTheMenuButton = new javax.swing.JToggleButton();
        selectStorageNameButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(21, 110, 180));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Assets/output-onlinepngtools.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        selectReceiverStorageButton.setBackground(new java.awt.Color(255, 153, 0));
        selectReceiverStorageButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        selectReceiverStorageButton.setForeground(new java.awt.Color(0, 0, 0));
        selectReceiverStorageButton.setText("Ok");
        selectReceiverStorageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectReceiverStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectReceiverStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(selectReceiverStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 230, -1));

        applyTransmitterStorageButton1.setBackground(new java.awt.Color(255, 153, 0));
        applyTransmitterStorageButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        applyTransmitterStorageButton1.setForeground(new java.awt.Color(0, 0, 0));
        applyTransmitterStorageButton1.setText("Aplicar");
        applyTransmitterStorageButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        applyTransmitterStorageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyTransmitterStorageButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(applyTransmitterStorageButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 630, 360, 30));

        ReceiverRutesTextArea.setBackground(new java.awt.Color(255, 255, 255));
        ReceiverRutesTextArea.setColumns(20);
        ReceiverRutesTextArea.setForeground(new java.awt.Color(0, 0, 0));
        ReceiverRutesTextArea.setRows(5);
        jScrollPane2.setViewportView(ReceiverRutesTextArea);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 210, 80));

        createStorageButton1.setBackground(new java.awt.Color(255, 153, 0));
        createStorageButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        createStorageButton1.setForeground(new java.awt.Color(0, 0, 0));
        createStorageButton1.setText("Borrar");
        createStorageButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createStorageButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStorageButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(createStorageButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 710, 360, 30));

        applyTransmitterStorageButton.setBackground(new java.awt.Color(255, 153, 0));
        applyTransmitterStorageButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        applyTransmitterStorageButton.setForeground(new java.awt.Color(0, 0, 0));
        applyTransmitterStorageButton.setText("Ok");
        applyTransmitterStorageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        applyTransmitterStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyTransmitterStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(applyTransmitterStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 230, -1));

        selectTransmitterStorageButton.setBackground(new java.awt.Color(255, 153, 0));
        selectTransmitterStorageButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        selectTransmitterStorageButton.setForeground(new java.awt.Color(0, 0, 0));
        selectTransmitterStorageButton.setText("Ok");
        selectTransmitterStorageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectTransmitterStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectTransmitterStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(selectTransmitterStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 230, -1));

        receiverCostLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        receiverCostLabel.setForeground(new java.awt.Color(255, 255, 255));
        receiverCostLabel.setText("Distancia(Km):");
        jPanel2.add(receiverCostLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        writeNameLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        writeNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        writeNameLabel.setText("Almacen:");
        jPanel2.add(writeNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        chooseTransmitterLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        chooseTransmitterLabel.setForeground(new java.awt.Color(255, 255, 255));
        chooseTransmitterLabel.setText("Almacen que envia:");
        jPanel2.add(chooseTransmitterLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        transmitterCostLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        transmitterCostLabel.setForeground(new java.awt.Color(255, 255, 255));
        transmitterCostLabel.setText("Distancia(Km):");
        jPanel2.add(transmitterCostLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        chooseReceiverLabel.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        chooseReceiverLabel.setForeground(new java.awt.Color(255, 255, 255));
        chooseReceiverLabel.setText("Almacen que recibe:");
        jPanel2.add(chooseReceiverLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, -1, -1));

        transmitterRutesTextArea.setBackground(new java.awt.Color(255, 255, 255));
        transmitterRutesTextArea.setColumns(20);
        transmitterRutesTextArea.setForeground(new java.awt.Color(0, 0, 0));
        transmitterRutesTextArea.setRows(5);
        jScrollPane1.setViewportView(transmitterRutesTextArea);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 210, 80));

        nameField.setBackground(new java.awt.Color(255, 255, 255));
        nameField.setForeground(new java.awt.Color(0, 0, 0));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });
        jPanel2.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 220, 30));

        transmitterComboBox.setBackground(new java.awt.Color(255, 255, 255));
        transmitterComboBox.setForeground(new java.awt.Color(0, 0, 0));
        transmitterComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transmitterComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(transmitterComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 230, 30));

        receiverCostField.setBackground(new java.awt.Color(255, 255, 255));
        receiverCostField.setForeground(new java.awt.Color(0, 0, 0));
        receiverCostField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receiverCostFieldActionPerformed(evt);
            }
        });
        jPanel2.add(receiverCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 230, 30));

        receiverComboBox.setBackground(new java.awt.Color(255, 255, 255));
        receiverComboBox.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(receiverComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 230, 30));

        transmitterCostField.setBackground(new java.awt.Color(255, 255, 255));
        transmitterCostField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(transmitterCostField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 230, 30));

        createStorageButton.setBackground(new java.awt.Color(255, 153, 0));
        createStorageButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        createStorageButton.setForeground(new java.awt.Color(0, 0, 0));
        createStorageButton.setText("Crear");
        createStorageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createStorageButtonActionPerformed(evt);
            }
        });
        jPanel2.add(createStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 670, 360, 30));

        BackToTheMenuButton.setBackground(new java.awt.Color(0, 0, 0));
        BackToTheMenuButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        BackToTheMenuButton.setForeground(new java.awt.Color(255, 153, 0));
        BackToTheMenuButton.setText("<Menu");
        BackToTheMenuButton.setBorder(null);
        BackToTheMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToTheMenuButtonActionPerformed(evt);
            }
        });
        jPanel2.add(BackToTheMenuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        selectStorageNameButton.setBackground(new java.awt.Color(255, 153, 0));
        selectStorageNameButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        selectStorageNameButton.setForeground(new java.awt.Color(0, 0, 0));
        selectStorageNameButton.setText("Ok");
        selectStorageNameButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectStorageNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStorageNameButtonActionPerformed(evt);
            }
        });
        jPanel2.add(selectStorageNameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 230, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStorageButtonActionPerformed
        InterfaceFunctions.createNewStorage(nombre, direccionHasta, direccionDesde);
        JOptionPane.showMessageDialog(null, "Almacén creado con éxito");
        defaultValues();

    }//GEN-LAST:event_createStorageButtonActionPerformed

    private void BackToTheMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToTheMenuButtonActionPerformed
        Code.getBackToMainPage();
    }//GEN-LAST:event_BackToTheMenuButtonActionPerformed

    private void transmitterComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transmitterComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transmitterComboBoxActionPerformed

    private void selectStorageNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStorageNameButtonActionPerformed
        nombre = nameField.getText().toUpperCase();
        nombre = nombre.replace("ALMACEN", "");
        nombre = nombre.replace("ALMACÉN", "");
        nombre = nombre.replace(" ", "");
        nombre = nombre.replace(",", "");
        nombre = nombre.replace(";", "");
        nombre = nombre.replace(":", "");
        
        if(!nombre.contains("ALMACEN")){
            nombre = "Almacen "+ nombre;

        if (InterfaceFunctions.selectStorageName(nombre)) {
            transmitterComboBox.setEnabled(true);
            transmitterCostField.setEnabled(true);
            selectTransmitterStorageButton.setEnabled(true);
            nameField.setEnabled(false);
            selectStorageNameButton.setEnabled(false);
            fillTransmitterCombo(g1);

        }
        }else{
            JOptionPane.showMessageDialog(null, "Error al introducir el nombre del almacen. Recuerde utilizar los espacios.");
        }
        
        


    }//GEN-LAST:event_selectStorageNameButtonActionPerformed

    private void selectTransmitterStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectTransmitterStorageButtonActionPerformed
        applyTransmitterStorageButton.setEnabled(true);
        if (transmitterComboBox.getSelectedItem() != null && contadorTransmisor + 1 < Code.getGraph().getSize()) {
            String cost = transmitterCostField.getText();
            String storage = transmitterComboBox.getSelectedItem().toString();
            System.out.println(storage);
            if (InterfaceFunctions.isANumber(cost)) {
                int distance = Integer.parseInt(cost);
                String output = "";
                direccionDesde += storage + "," + distance + "  ";
                direccion += storage + "," + distance + "  ";
                fillTransmitterChooserCombo(Code.getGraph());
                transmitterRutesTextArea.setText("");
                String[] directionArray = direccionDesde.split("  ");
                for (int i = 0; i < directionArray.length; i++) {
                    output += directionArray[i] + "\n";

                }
                transmitterRutesTextArea.setText(output);

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un numero válido en la distancia");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe quedar al menos un almacén disponible como receptor");
            transmitterComboBox.setEnabled(false);
            transmitterCostField.setEnabled(false);
            selectTransmitterStorageButton.setEnabled(false);

        }
        contadorTransmisor++;
        transmitterCostField.setText("");


    }//GEN-LAST:event_selectTransmitterStorageButtonActionPerformed

    private void applyTransmitterStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyTransmitterStorageButtonActionPerformed
        fillReceiverChooserCombo(Code.getGraph());
        transmitterComboBox.setEnabled(false);
        transmitterCostField.setEnabled(false);
        selectTransmitterStorageButton.setEnabled(false);
        applyTransmitterStorageButton.setEnabled(false);
        receiverComboBox.setEnabled(true);

        receiverCostField.setEnabled(true);
        selectReceiverStorageButton.setEnabled(true);
        

    }//GEN-LAST:event_applyTransmitterStorageButtonActionPerformed

    private void selectReceiverStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectReceiverStorageButtonActionPerformed

        if (receiverComboBox.getSelectedItem() != null) {
            String cost = receiverCostField.getText();
            String storage = receiverComboBox.getSelectedItem().toString();
            System.out.println(storage);
            if (InterfaceFunctions.isANumber(cost)) {
                int distance = Integer.parseInt(cost);
                String output = "";
                direccionHasta += storage + "," + distance + "  ";
                direccion += storage + "," + distance + "  ";
                fillReceiverChooserCombo(Code.getGraph());
                ReceiverRutesTextArea.setText("");
                String[] directionArray = direccionHasta.split("  ");
                for (int i = 0; i < directionArray.length; i++) {
                    output += directionArray[i] + "\n";
                }
                ReceiverRutesTextArea.setText(output);
                applyTransmitterStorageButton1.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Ingrese un numero válido en la distancia");
            }
        } else {
            receiverComboBox.setEnabled(false);
            receiverCostField.setEnabled(false);
            selectReceiverStorageButton.setEnabled(false);
        }
        receiverCostField.setText("");
    }//GEN-LAST:event_selectReceiverStorageButtonActionPerformed

    private void applyTransmitterStorageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyTransmitterStorageButton1ActionPerformed
        receiverComboBox.setEnabled(false);
        receiverCostField.setEnabled(false);
        selectReceiverStorageButton.setEnabled(false);
        applyTransmitterStorageButton1.setEnabled(false);
        createStorageButton.setEnabled(true);

    }//GEN-LAST:event_applyTransmitterStorageButton1ActionPerformed

    private void receiverCostFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receiverCostFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receiverCostFieldActionPerformed

    private void createStorageButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createStorageButton1ActionPerformed
        defaultValues();
    }//GEN-LAST:event_createStorageButton1ActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(NewAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAlmacen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAlmacen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton BackToTheMenuButton;
    private javax.swing.JTextArea ReceiverRutesTextArea;
    private javax.swing.JButton applyTransmitterStorageButton;
    private javax.swing.JButton applyTransmitterStorageButton1;
    private javax.swing.JLabel background;
    private javax.swing.JLabel chooseReceiverLabel;
    private javax.swing.JLabel chooseTransmitterLabel;
    private javax.swing.JToggleButton createStorageButton;
    private javax.swing.JToggleButton createStorageButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> receiverComboBox;
    private javax.swing.JTextField receiverCostField;
    private javax.swing.JLabel receiverCostLabel;
    private javax.swing.JButton selectReceiverStorageButton;
    private javax.swing.JButton selectStorageNameButton;
    private javax.swing.JButton selectTransmitterStorageButton;
    private javax.swing.JComboBox<String> transmitterComboBox;
    private javax.swing.JTextField transmitterCostField;
    private javax.swing.JLabel transmitterCostLabel;
    private javax.swing.JTextArea transmitterRutesTextArea;
    private javax.swing.JLabel writeNameLabel;
    // End of variables declaration//GEN-END:variables
}
