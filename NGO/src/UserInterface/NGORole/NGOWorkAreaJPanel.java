/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NGORole;

import Business.EcoSystem;
import Business.Enterprise.DistributorEnterprise;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.NGO;
import Business.Network.Network;
import Business.Organization.DistributorOrganization;
import Business.Organization.NGOAdminOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.Type.NgoFoodOrganization;
import Business.Organization.ShelterOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.FoodRequirementRequest;
import Business.WorkQueue.Products;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pavansomashekar
 */
public class NGOWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NGOWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private NGOAdminOrganization ngoOrganization;

    public NGOWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.business = business;
        this.enterprise = enterprise;
        this.ngoOrganization = (NGOAdminOrganization) organization;

        populateTable();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : ngoOrganization.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();

            model.addRow(row);
        }
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        btnSendtoDistributor = new javax.swing.JButton();
        showProductBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 97, 573, 255));

        assignJButton.setBackground(new java.awt.Color(247, 183, 13));
        assignJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(255, 255, 255));
        assignJButton.setText("Assign Work Request");
        assignJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 358, -1, 32));

        processJButton.setBackground(new java.awt.Color(247, 183, 13));
        processJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        processJButton.setForeground(new java.awt.Color(255, 255, 255));
        processJButton.setText("Process Work Request");
        processJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 358, 173, 32));

        refreshJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(102, 102, 102));
        refreshJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled design (2).png"))); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 130, 40));

        btnSendtoDistributor.setBackground(new java.awt.Color(247, 183, 13));
        btnSendtoDistributor.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnSendtoDistributor.setForeground(new java.awt.Color(255, 255, 255));
        btnSendtoDistributor.setText("Send to Distributor");
        btnSendtoDistributor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSendtoDistributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendtoDistributorActionPerformed(evt);
            }
        });
        add(btnSendtoDistributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(341, 358, -1, 32));

        showProductBtn.setBackground(new java.awt.Color(247, 183, 13));
        showProductBtn.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        showProductBtn.setForeground(new java.awt.Color(255, 255, 255));
        showProductBtn.setText("Display Product");
        showProductBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        showProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showProductBtnActionPerformed(evt);
            }
        });
        add(showProductBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 358, -1, 32));

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
        jScrollPane2.setViewportView(tblProducts);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 97, 294, 255));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 180, 50));
        jLabel1.setText("Work Request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 46, 157, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Union1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -40, 550, 420));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent")) {
            request.setReceiver(userAccount);
            request.setStatus("Pending");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Request cannot be assigned by " + userAccount, "Warning", JOptionPane.WARNING_MESSAGE);

        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        FoodRequirementRequest request = (FoodRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (request.getStatus().equalsIgnoreCase("Sent")) {
            JOptionPane.showMessageDialog(null, "Please assign the request", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (request.getReceiver().equals(userAccount) && (request.getStatus().equalsIgnoreCase("Pending") || request.getStatus().equalsIgnoreCase("Processing"))) {

            request.setStatus("Processing");
            ProcessNWorkRequestJPanel processWorkRequestJPanel = new ProcessNWorkRequestJPanel(userProcessContainer, request);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        } else {
            JOptionPane.showMessageDialog(null, "Request cannot be processed as it is " + request.getStatus(), "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_processJButtonActionPerformed

    private void btnSendtoDistributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendtoDistributorActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }

        FoodRequirementRequest distrequest = (FoodRequirementRequest) workRequestJTable.getValueAt(selectedRow, 0);

        if (distrequest.getStatus().equalsIgnoreCase("Rejected")) {

            JOptionPane.showMessageDialog(null, "Request has been rejected!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!(distrequest.getStatus().equalsIgnoreCase("Completed"))) {
            JOptionPane.showMessageDialog(null, "Request yet to be approved");
            return;
        }

        // }
        //String message = messageJTextField.getText();
        //FoodRequirementRequest request = new FoodRequirementRequest();
        distrequest.setMessage(distrequest.getMessage());
        distrequest.setSender(userAccount);
        distrequest.setStatus("Sent to Distributor");
        
        
        
        if(distrequest.getReceiver()==userAccount){
            distrequest.setReceiver(null);
            
        }
        JOptionPane.showMessageDialog(null, "Request Sent to Distributor Successfully!");
        
        for (Network n : business.getNetworkList()) {

            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {

                // e.setEnterpriseType(Enterprise.EnterpriseType.Distributor);
                if (e instanceof DistributorEnterprise) {

                    Organization org = null;
                    for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
                        if (organization instanceof DistributorOrganization) { //changed from shlter to ngo organization
                            org = organization;
                            break;
                        }
                    }
                    if (org != null) {

                        org.getWorkQueue().getWorkRequestList().add(distrequest);
                        userAccount.getWorkQueue().getWorkRequestList().add(distrequest);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSendtoDistributorActionPerformed

    private void showProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showProductBtnActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();
        model.setRowCount(0);
        model.setRowCount(0);

        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        ArrayList<Products> productList = ((FoodRequirementRequest) request).getProductList();
        if (productList != null) {
            for (Products p : productList) {
                Object row[] = new Object[3];
                row[0] = p;
                row[1] = p.getProductName();
                row[2] = p.getQuantity();
                model.addRow(row);

            }
        }

    }//GEN-LAST:event_showProductBtnActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
        JOptionPane.showMessageDialog(null, "Requests Updated!");
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton btnSendtoDistributor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton showProductBtn;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}