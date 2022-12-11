<<<<<<< Updated upstream:NGO/src/UserInterface/AdministrativeRole/ManageUserAccountJPanel.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavansomashekar
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    public ManageUserAccountJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        popOrganizationComboBox();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        createUserJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Employee");

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Organization");

        createUserJButton.setBackground(new java.awt.Color(247, 183, 13));
        createUserJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(255, 255, 255));
        createUserJButton.setText("Create");
        createUserJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("User Name");

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Password");

        jLabel6.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(127, 180, 50));
        jLabel6.setText("Create Credentials For Role");

        jLabel7.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Role");

        jLabel4.setText("jLabel4");

        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6)
                .addGap(340, 340, 340)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel7)
                .addGap(81, 81, 81)
                .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(btnBack))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel5))
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel1))
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        
        //******************* Validation ********************
        
        String uName = nameJTextField.getText();
        String pass = passwordJTextField.getText();
        
        if(uName.equalsIgnoreCase("") || pass.equalsIgnoreCase("")){
            
            JOptionPane.showMessageDialog(null, "Fields Cannot Be Empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        //**************************************************
        
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();

        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        populateData();
        
        JOptionPane.showMessageDialog(null, "Credentials have been created");
        nameJTextField.setText("");
        passwordJTextField.setText("");
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed
    
    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdministrativeRole;

import Model.Employee.Employee;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.Role.Role;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavansomashekar
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    public ManageUserAccountJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        popOrganizationComboBox();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordJTextField = new javax.swing.JTextField();
        lblEmployee = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        lblOrg = new javax.swing.JLabel();
        createUserJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        nameJTextField = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        lblPassword = new javax.swing.JLabel();
        lblCreateCredentails = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(passwordJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 413, 146, -1));

        lblEmployee.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblEmployee.setForeground(new java.awt.Color(153, 153, 153));
        lblEmployee.setText("Employee");
        add(lblEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 308, -1, -1));

        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 305, 146, -1));

        btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 85, -1));

        lblOrg.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblOrg.setForeground(new java.awt.Color(153, 153, 153));
        lblOrg.setText("Organization");
        add(lblOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 277, -1, -1));

        createUserJButton.setBackground(new java.awt.Color(247, 183, 13));
        createUserJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        createUserJButton.setForeground(new java.awt.Color(255, 255, 255));
        createUserJButton.setText("Create");
        createUserJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });
        add(createUserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 452, 253, 34));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 277, 146, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 379, 146, -1));

        lblUsername.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(153, 153, 153));
        lblUsername.setText("User Name");
        add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 382, -1, -1));

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(roleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 339, 146, -1));

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, 820, 179));

        lblPassword.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(153, 153, 153));
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 416, -1, -1));

        lblCreateCredentails.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        lblCreateCredentails.setForeground(new java.awt.Color(127, 180, 50));
        lblCreateCredentails.setText("Create Credentials For Role");
        add(lblCreateCredentails, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 39, -1, -1));

        lblRole.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        lblRole.setForeground(new java.awt.Color(153, 153, 153));
        lblRole.setText("Role");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 342, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/pic1.PNG"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Union1.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        
        String uName = nameJTextField.getText();
        String pass = passwordJTextField.getText();
        
        if(uName.equalsIgnoreCase("") || pass.equalsIgnoreCase("")){
            
            JOptionPane.showMessageDialog(null, "Fields Cannot Be Empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();

        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        populateData();
        
        JOptionPane.showMessageDialog(null, "Credentials have been created");
        nameJTextField.setText("");
        passwordJTextField.setText("");
    }//GEN-LAST:event_createUserJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed
    
    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role);
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateCredentails;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> Stashed changes:NGO/src/UI/AdministrativeRole/ManageUserAccountJPanel.java
