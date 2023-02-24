
package interfaces;

import javax.swing.JOptionPane;
import grafos.Grafos;
import primitivas.Products;
import primitivas.Node;

public class gestionStock extends javax.swing.JFrame {

    String storage = "";
    Products[] inv;
    Grafos g1;
    String product = "";
    int quantity = 0;

    /**
     * Creates new form stockManagementPage
     */
    public gestionStock() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        defaultValues();

    }
    /**
     * Reboot all the page
     */
    private void defaultValues() {
        storageChooserCombo.setEnabled(true);
        selectStorageButton.setEnabled(true);
        productChooserCombo1.setEnabled(false);
        selectProductButton.setEnabled(false);
        unitsExistingProductTextField.setEnabled(false);
        selectUnitsButton.setEnabled(false);
        addQuantityButton.setEnabled(false);
        newProductNameTextField.setEnabled(false);
        selectNewProductNameButton.setEnabled(false);
        unitsNewProductTextField.setEnabled(false);
        selectNewUnitsButton.setEnabled(false);
        addQuantityNewProductButton.setEnabled(false);
        productChooserCombo1.removeAllItems();
        unitsExistingProductTextField.setText("");
        actualQuantityLabel.setText("");
        newQuantityLabel.setText("");
        unitsNewProductTextField.setText("");
        newProductNameTextField.setText("");
        newQuantityNumberTitleLabel.setText((""));
        storage = "";
        inv = null;
        product = "";
        quantity = 0;

    }
    
    /**
     * Fill products combo with names
     */

    public void fillProductsCombo() {
        productChooserCombo1.removeAllItems();
        inv = g1.searchWarehouse(storage).getProductStringArray();
        for (int i = 0; i < inv.length; i++) {
            productChooserCombo1.addItem(inv[i].getName());

        }

    }
    
    /**
     * fill TransmitterChooserCombo with the information
     * @param  g1
     */

    public void fillTransmitterChooserCombo(Grafos g1) {
        storageChooserCombo.removeAllItems();
        String[] storages = g1.warehousestring();
        for (int i = 0; i < storages.length; i++) {
            storageChooserCombo.addItem(storages[i]);
        }
    }
    
    /**
     * Graph Constructor
     * @param  graph
     */

    public void setGraph(Grafos graph) {
        g1 = graph;
        fillTransmitterChooserCombo(g1);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        babkToTheMain = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        addQuantityNewProductButton = new javax.swing.JButton();
        newQuantityNumberTitleLabel = new javax.swing.JLabel();
        newQuantityProductTitleLabel = new javax.swing.JLabel();
        newQuantityTitleLabel = new javax.swing.JLabel();
        newQuantityLabel = new javax.swing.JLabel();
        productChooserCombo1 = new javax.swing.JComboBox<>();
        unitsExistingProductTextField = new javax.swing.JTextField();
        addQuantityButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        actualQuantityTitleLabel = new javax.swing.JLabel();
        actualQuantityLabel = new javax.swing.JLabel();
        selectQuantityTitleLabel = new javax.swing.JLabel();
        selectProductQuantityLabel = new javax.swing.JLabel();
        selectProductName = new javax.swing.JLabel();
        selectNewProductNameLabel = new javax.swing.JLabel();
        selectNewProductNameButton = new javax.swing.JButton();
        newProductNameTextField = new javax.swing.JTextField();
        backGround = new javax.swing.JLabel();
        selectProductQuantityLabel3 = new javax.swing.JLabel();
        selectProductButton = new javax.swing.JButton();
        selectQuantityTitleLabel1 = new javax.swing.JLabel();
        unitsNewProductTextField = new javax.swing.JTextField();
        selectNewUnitsButton = new javax.swing.JButton();
        selectUnitsButton = new javax.swing.JButton();
        selectStorageTitleLabel = new javax.swing.JLabel();
        selectStorageButton = new javax.swing.JButton();
        storageChooserCombo = new javax.swing.JComboBox<>();

        jPanel5.setBackground(new java.awt.Color(21, 110, 180));

        jPanel3.setBackground(new java.awt.Color(21, 110, 180));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        babkToTheMain.setBackground(new java.awt.Color(0, 0, 0));
        babkToTheMain.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        babkToTheMain.setForeground(new java.awt.Color(255, 153, 0));
        babkToTheMain.setText("<Menu");
        babkToTheMain.setBorder(null);
        babkToTheMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                babkToTheMainActionPerformed(evt);
            }
        });
        jPanel1.add(babkToTheMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        deleteButton1.setBackground(new java.awt.Color(255, 153, 0));
        deleteButton1.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        deleteButton1.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton1.setText("Borrar");
        deleteButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 90, 40));

        addQuantityNewProductButton.setBackground(new java.awt.Color(255, 153, 0));
        addQuantityNewProductButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        addQuantityNewProductButton.setForeground(new java.awt.Color(0, 0, 0));
        addQuantityNewProductButton.setText("Agregar");
        addQuantityNewProductButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addQuantityNewProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuantityNewProductButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addQuantityNewProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 90, 40));

        newQuantityNumberTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newQuantityNumberTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(newQuantityNumberTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 120, -1));

        newQuantityProductTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newQuantityProductTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        newQuantityProductTitleLabel.setText("Cantidad:");
        jPanel1.add(newQuantityProductTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        newQuantityTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        newQuantityTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        newQuantityTitleLabel.setText("Cantidad nueva:");
        jPanel1.add(newQuantityTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        newQuantityLabel.setBackground(new java.awt.Color(255, 255, 255));
        newQuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(newQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 80, -1));

        productChooserCombo1.setBackground(new java.awt.Color(255, 255, 255));
        productChooserCombo1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(productChooserCombo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 220, 30));

        unitsExistingProductTextField.setBackground(new java.awt.Color(255, 255, 255));
        unitsExistingProductTextField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(unitsExistingProductTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 220, 30));

        addQuantityButton.setBackground(new java.awt.Color(255, 153, 0));
        addQuantityButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        addQuantityButton.setForeground(new java.awt.Color(0, 0, 0));
        addQuantityButton.setText("Agregar");
        addQuantityButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addQuantityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addQuantityButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addQuantityButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, 90, 40));

        deleteButton.setBackground(new java.awt.Color(255, 153, 0));
        deleteButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(0, 0, 0));
        deleteButton.setText("Borrar");
        deleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 90, 40));

        actualQuantityTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        actualQuantityTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        actualQuantityTitleLabel.setText("Cantidad actual:");
        jPanel1.add(actualQuantityTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        actualQuantityLabel.setBackground(new java.awt.Color(255, 255, 255));
        actualQuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel1.add(actualQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 80, -1));

        selectQuantityTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectQuantityTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectQuantityTitleLabel.setText("Indique la cantidad:");
        jPanel1.add(selectQuantityTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        selectProductQuantityLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectProductQuantityLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectProductQuantityLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectProductQuantityLabel.setText("Agregar cantidad al stock");
        jPanel1.add(selectProductQuantityLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 380, -1));

        selectProductName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectProductName.setForeground(new java.awt.Color(255, 255, 255));
        selectProductName.setText("Producto:");
        jPanel1.add(selectProductName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        selectNewProductNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectNewProductNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectNewProductNameLabel.setText("Producto:");
        jPanel1.add(selectNewProductNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, 30));

        selectNewProductNameButton.setBackground(new java.awt.Color(255, 153, 0));
        selectNewProductNameButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        selectNewProductNameButton.setForeground(new java.awt.Color(0, 0, 0));
        selectNewProductNameButton.setText("Ok");
        selectNewProductNameButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectNewProductNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNewProductNameButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectNewProductNameButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 220, -1));

        newProductNameTextField.setBackground(new java.awt.Color(255, 255, 255));
        newProductNameTextField.setForeground(new java.awt.Color(0, 0, 0));
        newProductNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProductNameTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(newProductNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, 220, 30));

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/Assets/output-onlinepngtools.png"))); // NOI18N
        jPanel1.add(backGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        selectProductQuantityLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectProductQuantityLabel3.setForeground(new java.awt.Color(255, 255, 255));
        selectProductQuantityLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectProductQuantityLabel3.setText("Agregar nuevo producto al inventario");
        jPanel1.add(selectProductQuantityLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 400, 30));

        selectProductButton.setBackground(new java.awt.Color(255, 153, 0));
        selectProductButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        selectProductButton.setForeground(new java.awt.Color(0, 0, 0));
        selectProductButton.setText("Ok");
        selectProductButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectProductButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectProductButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectProductButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 220, -1));

        selectQuantityTitleLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectQuantityTitleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        selectQuantityTitleLabel1.setText("Seleccione cantidad:");
        jPanel1.add(selectQuantityTitleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));

        unitsNewProductTextField.setBackground(new java.awt.Color(255, 255, 255));
        unitsNewProductTextField.setForeground(new java.awt.Color(0, 0, 0));
        unitsNewProductTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsNewProductTextFieldActionPerformed(evt);
            }
        });
        jPanel1.add(unitsNewProductTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 220, 30));

        selectNewUnitsButton.setBackground(new java.awt.Color(255, 153, 0));
        selectNewUnitsButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        selectNewUnitsButton.setForeground(new java.awt.Color(0, 0, 0));
        selectNewUnitsButton.setText("Ok");
        selectNewUnitsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectNewUnitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectNewUnitsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectNewUnitsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 220, -1));

        selectUnitsButton.setBackground(new java.awt.Color(255, 153, 0));
        selectUnitsButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        selectUnitsButton.setForeground(new java.awt.Color(0, 0, 0));
        selectUnitsButton.setText("Ok");
        selectUnitsButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectUnitsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectUnitsButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectUnitsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 220, -1));

        selectStorageTitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        selectStorageTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectStorageTitleLabel.setText("Seleccione el almacén");
        jPanel1.add(selectStorageTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 170, -1));

        selectStorageButton.setBackground(new java.awt.Color(255, 153, 0));
        selectStorageButton.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        selectStorageButton.setForeground(new java.awt.Color(0, 0, 0));
        selectStorageButton.setText("Ok");
        selectStorageButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        selectStorageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectStorageButtonActionPerformed(evt);
            }
        });
        jPanel1.add(selectStorageButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 280, -1));

        storageChooserCombo.setBackground(new java.awt.Color(255, 255, 255));
        storageChooserCombo.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(storageChooserCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 280, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectStorageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectStorageButtonActionPerformed
        storage = storageChooserCombo.getSelectedItem().toString();
        fillProductsCombo();
        productChooserCombo1.setEnabled(true);
        selectProductButton.setEnabled(true);
        

        newProductNameTextField.setEnabled(true);
        selectNewProductNameButton.setEnabled(true);
        


    }//GEN-LAST:event_selectStorageButtonActionPerformed

    private void selectProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectProductButtonActionPerformed
        product = productChooserCombo1.getSelectedItem().toString();
        quantity = g1.searchWarehouse(storage).searchProduct(product).getAmount();
        actualQuantityLabel.setText(String.valueOf(quantity));
        newQuantityLabel.setText(String.valueOf(quantity));
        newProductNameTextField.setEnabled(false);
        selectNewProductNameButton.setEnabled(false);
        unitsNewProductTextField.setEnabled(false);
        selectNewUnitsButton.setEnabled(false);
        storageChooserCombo.setEnabled(false);
        selectStorageButton.setEnabled(false);
        unitsExistingProductTextField.setEnabled(true);
        selectUnitsButton.setEnabled(true);


    }//GEN-LAST:event_selectProductButtonActionPerformed

    private void selectUnitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectUnitsButtonActionPerformed
        String stQuantity = unitsExistingProductTextField.getText();

        if (InterfaceFunctions.isANumber(stQuantity)) {
            int quant = Integer.parseInt(stQuantity);
            if (quant > 0) {
                quantity += quant;
                newQuantityLabel.setText(String.valueOf(quantity));

                addQuantityButton.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
                unitsExistingProductTextField.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida");
            unitsExistingProductTextField.setText("");
        }
    }//GEN-LAST:event_selectUnitsButtonActionPerformed

    private void addQuantityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuantityButtonActionPerformed
        
       g1.searchWarehouse(storage).searchProduct(product).getAmount();
        Code.setGraph(g1);
        defaultValues();

    }//GEN-LAST:event_addQuantityButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        defaultValues();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void selectNewProductNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNewProductNameButtonActionPerformed
        product = newProductNameTextField.getText();
        product = product.replace(" ", "");
        product = product.replace(";", "");
        product = product.replace(":", "");
        product = product.replace(",", "");
        boolean aux = true;

        for (int i = 0; i < inv.length; i++) {
            if (inv[i].getName().equals(product)) {
                aux = false;
                JOptionPane.showMessageDialog(null, "El producto ya existe");
            }

        }

        if (product.equals("")) {
            aux = false;
            JOptionPane.showMessageDialog(null, "El producto no es válido");
        }

        if (aux) {
            unitsNewProductTextField.setEnabled(true);
            selectNewUnitsButton.setEnabled(true);
            productChooserCombo1.setEnabled(false);
            newProductNameTextField.setEnabled(false);
            selectNewProductNameButton.setEnabled(false);
            selectProductButton.setEnabled(false);
            unitsExistingProductTextField.setEnabled(false);
            unitsExistingProductTextField.setEnabled(false);
            unitsExistingProductTextField.setEnabled(false);
            selectUnitsButton.setEnabled(false);
            storageChooserCombo.setEnabled(false);
            selectStorageButton.setEnabled(false);

        }


    }//GEN-LAST:event_selectNewProductNameButtonActionPerformed

    private void selectNewUnitsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectNewUnitsButtonActionPerformed
        String quant = unitsNewProductTextField.getText();
        if (InterfaceFunctions.isANumber(quant)) {
            if (Integer.parseInt(quant) > 0) {
                quantity = Integer.parseInt(quant);
                newQuantityNumberTitleLabel.setText(quant);
                addQuantityNewProductButton.setEnabled(true);

            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un numero valido");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un numero valido");
        }
    }//GEN-LAST:event_selectNewUnitsButtonActionPerformed

    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        defaultValues();
    }//GEN-LAST:event_deleteButton1ActionPerformed

    private void addQuantityNewProductButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addQuantityNewProductButtonActionPerformed
        Products newProducts = new Products(product,quantity);
        Node<Products> newProductN = new Node<>(newProducts);
        g1.searchWarehouse(storage).getProducts().addAtTheEnd(newProductN);
        Code.setGraph(g1);
        defaultValues();
    }//GEN-LAST:event_addQuantityNewProductButtonActionPerformed

    private void babkToTheMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_babkToTheMainActionPerformed
        Code.getBackToMainPage();
    }//GEN-LAST:event_babkToTheMainActionPerformed

    private void unitsNewProductTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsNewProductTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsNewProductTextFieldActionPerformed

    private void newProductNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProductNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newProductNameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(gestionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestionStock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestionStock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel actualQuantityLabel;
    private javax.swing.JLabel actualQuantityTitleLabel;
    private javax.swing.JButton addQuantityButton;
    private javax.swing.JButton addQuantityNewProductButton;
    private javax.swing.JButton babkToTheMain;
    private javax.swing.JLabel backGround;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField newProductNameTextField;
    private javax.swing.JLabel newQuantityLabel;
    private javax.swing.JLabel newQuantityNumberTitleLabel;
    private javax.swing.JLabel newQuantityProductTitleLabel;
    private javax.swing.JLabel newQuantityTitleLabel;
    private javax.swing.JComboBox<String> productChooserCombo1;
    private javax.swing.JButton selectNewProductNameButton;
    private javax.swing.JLabel selectNewProductNameLabel;
    private javax.swing.JButton selectNewUnitsButton;
    private javax.swing.JButton selectProductButton;
    private javax.swing.JLabel selectProductName;
    private javax.swing.JLabel selectProductQuantityLabel;
    private javax.swing.JLabel selectProductQuantityLabel3;
    private javax.swing.JLabel selectQuantityTitleLabel;
    private javax.swing.JLabel selectQuantityTitleLabel1;
    private javax.swing.JButton selectStorageButton;
    private javax.swing.JLabel selectStorageTitleLabel;
    private javax.swing.JButton selectUnitsButton;
    private javax.swing.JComboBox<String> storageChooserCombo;
    private javax.swing.JTextField unitsExistingProductTextField;
    private javax.swing.JTextField unitsNewProductTextField;
    // End of variables declaration//GEN-END:variables
}
