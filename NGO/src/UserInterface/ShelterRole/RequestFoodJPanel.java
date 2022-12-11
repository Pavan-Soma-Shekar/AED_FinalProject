/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ShelterRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.NGOEnterprise;
import Business.Network.Network;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRequirementRequest;
import Business.WorkQueue.Products;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alisha Khan
 */
public class RequestFoodJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestFoodJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private EcoSystem business;
   

    public RequestFoodJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.business = business;
        valueLabel.setText(enterprise.getName());

        comboBakeryProducts.setEnabled(false);
        comboCerealsProducts.setEnabled(false);
        comboDairyProducts.setEnabled(false);
        comboMeatProducts.setEnabled(false);
        comboVegetablesProducts.setEnabled(false);
        comboFruitsProducts.setEnabled(false);
        
        quantBakery.setEnabled(false);
        quantCereals.setEnabled(false);
        quantDairy.setEnabled(false);
        quantFruits.setEnabled(false);
        quantMeat.setEnabled(false);
        quantVegetables.setEnabled(false);
        
        //btnReset.setEnabled(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requestTestJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        comboBakeryProducts = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        checkBakery = new javax.swing.JCheckBox();
        checkDairy = new javax.swing.JCheckBox();
        checkMeat = new javax.swing.JCheckBox();
        checkCereals = new javax.swing.JCheckBox();
        checkVegetables = new javax.swing.JCheckBox();
        checkFruits = new javax.swing.JCheckBox();
        quantBakery = new javax.swing.JSpinner();
        comboDairyProducts = new javax.swing.JComboBox<>();
        comboMeatProducts = new javax.swing.JComboBox<>();
        comboCerealsProducts = new javax.swing.JComboBox<>();
        comboVegetablesProducts = new javax.swing.JComboBox<>();
        comboFruitsProducts = new javax.swing.JComboBox<>();
        quantDairy = new javax.swing.JSpinner();
        quantMeat = new javax.swing.JSpinner();
        quantFruits = new javax.swing.JSpinner();
        quantVegetables = new javax.swing.JSpinner();
        quantCereals = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        backJButton1 = new javax.swing.JButton();
        enterpriseLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        requestTestJButton.setBackground(new java.awt.Color(247, 183, 13));
        requestTestJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        requestTestJButton.setForeground(new java.awt.Color(255, 255, 255));
        requestTestJButton.setText("Submit Request");
        requestTestJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Quantity:");

        btnReset.setBackground(new java.awt.Color(247, 183, 13));
        btnReset.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset Options");
        btnReset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        valueLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        valueLabel.setForeground(new java.awt.Color(127, 180, 50));
        valueLabel.setText("<value>");

        enterpriseLabel.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(51, 51, 51));
        enterpriseLabel.setText("Summarize Items:");

        comboBakeryProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bread", "Muffin", "Cakes" }));

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Food Type:");

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Product:");

        checkBakery.setText("Bakery Products");
        checkBakery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBakeryActionPerformed(evt);
            }
        });

        checkDairy.setText("Dairy Products");
        checkDairy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDairyActionPerformed(evt);
            }
        });

        checkMeat.setText("Meat Products");
        checkMeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMeatActionPerformed(evt);
            }
        });

        checkCereals.setText("Cereals");
        checkCereals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCerealsActionPerformed(evt);
            }
        });

        checkVegetables.setText("Vegetables");
        checkVegetables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVegetablesActionPerformed(evt);
            }
        });

        checkFruits.setText("Fruits");
        checkFruits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFruitsActionPerformed(evt);
            }
        });

        quantBakery.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        comboDairyProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milk", "Eggs", "Butter" }));

        comboMeatProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chicken", "Turkey", "Ham" }));

        comboCerealsProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wheat", "Rice", "Oats" }));

        comboVegetablesProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tomatoes", "Potatoes", "Capsicum" }));

        comboFruitsProducts.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Banana", "Orange", "Apple" }));

        quantDairy.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        quantMeat.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        quantFruits.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        quantVegetables.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        quantCereals.setModel(new javax.swing.SpinnerNumberModel(0, 0, 500, 1));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Comment Message:");

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Type", "Product", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        backJButton1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        backJButton1.setForeground(new java.awt.Color(102, 102, 102));
        backJButton1.setText("Back");
        backJButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        enterpriseLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        enterpriseLabel1.setForeground(new java.awt.Color(127, 180, 50));
        enterpriseLabel1.setText("EnterPrise :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel5)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addGap(140, 140, 140)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBakery)
                                .addGap(39, 39, 39)
                                .addComponent(comboBakeryProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(quantBakery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkDairy)
                                .addGap(46, 46, 46)
                                .addComponent(comboDairyProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(quantDairy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkMeat)
                                .addGap(47, 47, 47)
                                .addComponent(comboMeatProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(quantMeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkCereals)
                                .addGap(85, 85, 85)
                                .addComponent(comboCerealsProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(quantCereals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkVegetables)
                                .addGap(64, 64, 64)
                                .addComponent(comboVegetablesProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(quantVegetables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkFruits)
                                .addGap(95, 95, 95)
                                .addComponent(comboFruitsProducts, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(quantFruits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)
                                .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(132, 132, 132)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkBakery)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBakeryProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantBakery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkDairy)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboDairyProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantDairy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkMeat)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboMeatProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantMeat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkCereals)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboCerealsProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantCereals, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkVegetables)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboVegetablesProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantVegetables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkFruits)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboFruitsProducts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quantFruits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel2))
                            .addComponent(messageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(requestTestJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        //******************* Validation *********************
        
         if(!(checkBakery.isSelected()) && !(checkDairy.isSelected()) && !(checkMeat.isSelected()) && !(checkCereals.isSelected()) && !(checkVegetables.isSelected())){
            
            JOptionPane.showMessageDialog(null, "Please Select Products!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
         String mess = messageJTextField.getText();
         if (mess.equalsIgnoreCase("")) {

            JOptionPane.showMessageDialog(null, "Please add comments", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
         
        //**************************************

         int check=0;
       
         String message = messageJTextField.getText();
       
        ArrayList<Products> productList = new ArrayList<>();
        
        if (checkBakery.isSelected()) {
            
            if(quantBakery.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
           
            Products p = new Products();
            p.setProductName(String.valueOf(comboBakeryProducts.getSelectedItem()));
            p.setProductType("BAKERY");
            p.setQuantity((Integer) quantBakery.getValue());
            productList.add(p);
            populateData(productList);
        }
        if (checkFruits.isSelected()) {
            
            if(quantFruits.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboFruitsProducts.getSelectedItem()));
            p.setProductType("FRUITS");
            p.setQuantity((Integer) quantFruits.getValue());
             productList.add(p);
             populateData(productList);
        }
        if (checkVegetables.isSelected()) {
            
            if(quantVegetables.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboVegetablesProducts.getSelectedItem()));
            p.setProductType("VEGETABLES");
            p.setQuantity((Integer) quantVegetables.getValue());
             productList.add(p);
             populateData(productList);
        }
        if (checkCereals.isSelected()) {
            
            if(quantCereals.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboCerealsProducts.getSelectedItem()));
            p.setProductType("CEREALS");
            p.setQuantity((Integer) quantCereals.getValue());
            productList.add(p);
            populateData(productList);
        }
        if (checkMeat.isSelected()) {
            
            if(quantMeat.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboMeatProducts.getSelectedItem()));
            p.setProductType("MEAT");
            p.setQuantity((Integer) quantMeat.getValue());
             productList.add(p);
             populateData(productList);
        }
        if (checkDairy.isSelected()) {
            
            if(quantDairy.getValue().equals(check)){
                
                JOptionPane.showMessageDialog(null, "Please Add Quantity!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            Products p = new Products();
            p.setProductName(String.valueOf(comboDairyProducts.getSelectedItem()));
            p.setProductType("DAIRY");
            p.setQuantity((Integer) quantDairy.getValue());
            productList.add(p);
            populateData(productList);
        }
        
       
       
        FoodRequirementRequest request = new FoodRequirementRequest();
        request.setMessage(message);
        request.setSender(userAccount);
        request.setStatus("Sent");
        request.setProductList(productList);
        
        

        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                   e.setEnterpriseType(Enterprise.EnterpriseType.NGO);
                   //below changes are made for twice appearance of request on Shelter screen
                   //if (e.getEnterpriseType().getValue().equals("NGO"))
                 if (e instanceof NGOEnterprise) {

                    System.out.println(e.getEnterpriseType().getValue().equals("NGO") + "Chal ra hai");

                    Organization org = null;
                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof NGOAdminOrganization) { //changed from shlter to ngo organization
                            org = organization;
                            break;
                        }
                    }
                    if (org != null) {

                        org.getWorkQueue().getWorkRequestList().add(request);
                        userAccount.getWorkQueue().getWorkRequestList().add(request);
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Request Initiated Successfully!");
        
        //Clearing the selected options
        
       checkBakery.setSelected(false);
       checkCereals.setSelected(false);
       checkDairy.setSelected(false);
       checkFruits.setSelected(false);
       checkMeat.setSelected(false);
       checkVegetables.setSelected(false);
       
        comboBakeryProducts.setEnabled(false);
        comboCerealsProducts.setEnabled(false);
        comboDairyProducts.setEnabled(false);
        comboMeatProducts.setEnabled(false);
        comboVegetablesProducts.setEnabled(false);
        comboFruitsProducts.setEnabled(false);
        
        quantBakery.setEnabled(false);
        quantCereals.setEnabled(false);
        quantDairy.setEnabled(false);
        quantFruits.setEnabled(false);
        quantMeat.setEnabled(false);
        quantVegetables.setEnabled(false);
        
        btnReset.setEnabled(false);
        messageJTextField.setText("");
        
    }//GEN-LAST:event_requestTestJButtonActionPerformed

        public void populateData(ArrayList<Products> productList) {

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        model.setRowCount(0);

            for (Products p : productList) {
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getProductName();
                row[2] = p.getQuantity();
                ((DefaultTableModel) tblProducts.getModel()).addRow(row);  
        }
    }
        
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

       checkBakery.setSelected(false);
       checkCereals.setSelected(false);
       checkDairy.setSelected(false);
       checkFruits.setSelected(false);
       checkMeat.setSelected(false);
       checkVegetables.setSelected(false);
       
        comboBakeryProducts.setEnabled(false);
        comboCerealsProducts.setEnabled(false);
        comboDairyProducts.setEnabled(false);
        comboMeatProducts.setEnabled(false);
        comboVegetablesProducts.setEnabled(false);
        comboFruitsProducts.setEnabled(false);
        
        quantBakery.setEnabled(false);
        quantCereals.setEnabled(false);
        quantDairy.setEnabled(false);
        quantFruits.setEnabled(false);
        quantMeat.setEnabled(false);
        quantVegetables.setEnabled(false);


    }//GEN-LAST:event_btnResetActionPerformed

    private void checkBakeryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBakeryActionPerformed
        comboBakeryProducts.setEnabled(true);
        quantBakery.setEnabled(true);
        
        //*************** added recent ***********
    }//GEN-LAST:event_checkBakeryActionPerformed

    private void checkDairyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDairyActionPerformed
        comboDairyProducts.setEnabled(true);
        quantDairy.setEnabled(true);
    }//GEN-LAST:event_checkDairyActionPerformed

    private void checkMeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMeatActionPerformed
        comboMeatProducts.setEnabled(true);
        quantMeat.setEnabled(true);
    }//GEN-LAST:event_checkMeatActionPerformed

    private void checkCerealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCerealsActionPerformed
        comboCerealsProducts.setEnabled(true);
        quantCereals.setEnabled(true);
    }//GEN-LAST:event_checkCerealsActionPerformed

    private void checkVegetablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVegetablesActionPerformed
        comboVegetablesProducts.setEnabled(true);
        quantVegetables.setEnabled(true);
    }//GEN-LAST:event_checkVegetablesActionPerformed

    private void checkFruitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkFruitsActionPerformed
        comboFruitsProducts.setEnabled(true);
        quantFruits.setEnabled(true);
    }//GEN-LAST:event_checkFruitsActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed
        
         userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ShelterWorkAreaJPanel dwjp = (ShelterWorkAreaJPanel) component;
        dwjp.populateRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox checkBakery;
    private javax.swing.JCheckBox checkCereals;
    private javax.swing.JCheckBox checkDairy;
    private javax.swing.JCheckBox checkFruits;
    private javax.swing.JCheckBox checkMeat;
    private javax.swing.JCheckBox checkVegetables;
    private javax.swing.JComboBox<String> comboBakeryProducts;
    private javax.swing.JComboBox<String> comboCerealsProducts;
    private javax.swing.JComboBox<String> comboDairyProducts;
    private javax.swing.JComboBox<String> comboFruitsProducts;
    private javax.swing.JComboBox<String> comboMeatProducts;
    private javax.swing.JComboBox<String> comboVegetablesProducts;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel enterpriseLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JSpinner quantBakery;
    private javax.swing.JSpinner quantCereals;
    private javax.swing.JSpinner quantDairy;
    private javax.swing.JSpinner quantFruits;
    private javax.swing.JSpinner quantMeat;
    private javax.swing.JSpinner quantVegetables;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JTable tblProducts;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
