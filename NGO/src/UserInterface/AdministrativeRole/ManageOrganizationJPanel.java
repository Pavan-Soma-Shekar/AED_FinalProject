/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.DistributorOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import Business.Organization.QualityOrganization;
import Business.Organization.ShelterOrganization;
import Business.Organization.SupplierOrganization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavansomshekar
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrganizationJPanel
     */
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDirectory;
    private Enterprise enterprise;

    public ManageOrganizationJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.enterprise = enterprise;
        populateTable();
        populateComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrganizations = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddOrganization = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
<<<<<<< HEAD
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
=======

        setBackground(new java.awt.Color(255, 255, 255));
>>>>>>> priyanka

        tblOrganizations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrganizations);
        if (tblOrganizations.getColumnModel().getColumnCount() > 0) {
            tblOrganizations.getColumnModel().getColumn(0).setResizable(false);
            tblOrganizations.getColumnModel().getColumn(1).setResizable(false);
        }

<<<<<<< HEAD
        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 95, 505, 110));

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Organization Type");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 98, -1, -1));
=======
        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Organization Type");
>>>>>>> priyanka

        btnBack.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(102, 102, 102));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 26, 117, -1));
=======
>>>>>>> priyanka

        btnAddOrganization.setBackground(new java.awt.Color(247, 183, 13));
        btnAddOrganization.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnAddOrganization.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrganization.setText("Add Organization");
        btnAddOrganization.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAddOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrganizationActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(btnAddOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 232, 169, 35));
=======
>>>>>>> priyanka

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
<<<<<<< HEAD
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 95, 81, -1));
=======
>>>>>>> priyanka

        jLabel4.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(127, 180, 50));
        jLabel4.setText("List Of Organizations");
<<<<<<< HEAD
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 26, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Union1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 550, -1));
=======

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(395, 395, 395)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(btnBack))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnAddOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
>>>>>>> priyanka
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrganizationActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();
        organizationDirectory.createOrganization(type);
        populateTable();
        
        JOptionPane.showMessageDialog(null, "Organization added successfully!");
    }//GEN-LAST:event_btnAddOrganizationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);


    }//GEN-LAST:event_btnBackActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
        /*    
        organizationJComboBox.removeAllItems();
   
        for(Organization.Type type: Organization.Type.values())
        {
            
            if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType1.NGO.getValue()))
            {
               if(type.getValue().equals(Organization.Type.NgoFoodOrganization.getValue()))
               {
                   organizationJComboBox.addItem(type); 
               }
            }
            
            else if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType2.Shelter.getValue()))
                    {
                     if(type.getValue().equals(Organization.Type.ShelterFoodOrganization.getValue()))
               {
                   organizationJComboBox.addItem(type); 
               }   
                    }
            
            else if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType3.Distributor.getValue()))
                    {
                     if(type.getValue().equals(Organization.Type.DistributorFoodOrganization.getValue()))
               {
                   organizationJComboBox.addItem(type); 
               }   
                    }
            
            else if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType4.QualityCheck.getValue()))
                    {
                     if(type.getValue().equals(Organization.Type.QualityCheckFoodOrganization.getValue()))
               {
                   organizationJComboBox.addItem(type); 
               }   
                    }
            
            else if(enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType5.Supplier.getValue()))
                    {
                     if(type.getValue().equals(Organization.Type.SupplierFoodOrganization.getValue()))
               {
                   organizationJComboBox.addItem(type); 
               }   
                    }

      
        }
         */
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblOrganizations.getModel();

        model.setRowCount(0);

        for (Organization organization : organizationDirectory.getOrganizationList()) {
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();

            model.addRow(row);
        }

    }

    private void populateComboBox() {

//        organizationJComboBox.removeAllItems();
//        for (Type type : Organization.Type.values()){
//            if (!type.getValue().equals(Type.Admin.getValue()))
//                organizationJComboBox.addItem(type);
//        } 
        /*for (Type type : Organization.Type.values()){
        System.out.println(type);
             System.out.println(Enterprise.EnterpriseType.Rehabilitation);
        if((!type.getValue().equals(Type.Admin.getValue())) && (enterprise.getEnterpriseType().equals("NGO"))){
            organizationJComboBox.addItem(type);
        }
        else if ((!type.getValue().equals(Type.Admin.getValue()))&&(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.Pharmacy))) {
            organizationJComboBox.addItem(type);
        }
        else if ((!type.getValue().equals(Type.Admin.getValue()))&&(enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.DrugSupplier))) {
            organizationJComboBox.addItem(type);
        }
         */
        organizationJComboBox.removeAllItems();

//        for (Organization.Type type : Organization.Type.values()) {
//
//            if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType1.NGO.getValue())) {
//                if (type.getValue().equals(Organization.Type.NgoFoodOrganization.getValue())) {
//                    organizationJComboBox.addItem(type);
//                }
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType2.Shelter.getValue())) {
//                if (type.getValue().equals(Organization.Type.ShelterFoodOrganization.getValue())) {
//                    organizationJComboBox.addItem(type);
//                }
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType3.Distributor.getValue())) {
//                if (type.getValue().equals(Organization.Type.DistributorFoodOrganization.getValue())) {
//                    organizationJComboBox.addItem(type);
//                }
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType4.QualityCheck.getValue())) {
//                if (type.getValue().equals(Organization.Type.QualityCheckFoodOrganization.getValue())) {
//                    organizationJComboBox.addItem(type);
//                }
//            } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType5.Supplier.getValue())) {
//                if (type.getValue().equals(Organization.Type.SupplierFoodOrganization.getValue())) {
//                    organizationJComboBox.addItem(type);
//                }
//            }
//
//        }
//        
//         System.out.println(enterprise.getEnterpriseType().toString()==(Enterprise.EnterpriseType.Shelter)+"check");
//        if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.NGO) {
//         
//            organizationJComboBox.addItem(Organization.Type.NgoFoodOrganization);
//           
//        } else if (enterprise.getEnterpriseType()== Enterprise.EnterpriseType.Distributor) {
//            organizationJComboBox.addItem(Organization.Type.DistributorFoodOrganization);
//        } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.QualityCheck) {
//            organizationJComboBox.addItem(Organization.Type.QualityCheckFoodOrganization);
//        } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Shelter) {
//               System.out.println("Shelter check");
//            organizationJComboBox.addItem(Organization.Type.ShelterFoodOrganization);
//        } else if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.Supplier) {
//          
//            organizationJComboBox.addItem(Organization.Type.SupplierFoodOrganization);
//            
//        }
        System.out.println("yegdc" + enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType1.NGO.getValue()));
         System.out.println("yecfghgdc" + enterprise.getEnterpriseType().getValue());
        
          System.out.println("yfrtdrecfggvegdc" + Enterprise.EnumType1.NGO.getValue());
        
        
        if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType1.NGO.getValue())) {
            organizationJComboBox.addItem(Organization.Type.NgoFoodOrganization);
        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType2.Shelter.getValue())) {
            organizationJComboBox.addItem(Organization.Type.ShelterFoodOrganization);
        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType3.Distributor.getValue())) {
            organizationJComboBox.addItem(Organization.Type.DistributorFoodOrganization);
        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType4.QualityCheck.getValue())) {
            organizationJComboBox.addItem(Organization.Type.QualityCheckFoodOrganization);
        } else if (enterprise.getEnterpriseType().getValue().equals(Enterprise.EnumType5.Supplier.getValue())) {
            organizationJComboBox.addItem(Organization.Type.SupplierFoodOrganization);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddOrganization;
    private javax.swing.JButton btnBack;
<<<<<<< HEAD
    private javax.swing.JLabel jLabel1;
=======
>>>>>>> priyanka
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable tblOrganizations;
    // End of variables declaration//GEN-END:variables

}
