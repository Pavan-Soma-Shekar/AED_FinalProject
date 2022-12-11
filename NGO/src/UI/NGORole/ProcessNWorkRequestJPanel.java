<<<<<<< Updated upstream:NGO/src/UserInterface/NGORole/ProcessNWorkRequestJPanel.java
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NGORole;

import Business.WorkQueue.FoodRequirementRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pavansomashekar
 */
public class ProcessNWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessNWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private FoodRequirementRequest request;
    
    public ProcessNWorkRequestJPanel(JPanel userProcessContainer, FoodRequirementRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        groupButton();
    }

    private void groupButton( ) {

    ButtonGroup bg1 = new ButtonGroup( );
    bg1.add(radioApproved);
    bg1.add(radioRejected);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        radioRejected = new javax.swing.JRadioButton();
        radioApproved = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));

        submitJButton.setBackground(new java.awt.Color(247, 183, 13));
        submitJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Result");
        submitJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Result:");

        backJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 102, 102));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(127, 180, 50));
        jLabel2.setText("Processing Request");

        radioRejected.setForeground(new java.awt.Color(51, 51, 51));
        radioRejected.setText("Rejected");

        radioApproved.setForeground(new java.awt.Color(51, 51, 51));
        radioApproved.setText("Approved");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addComponent(radioApproved))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(radioRejected))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(621, 621, 621))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(radioApproved))
                .addGap(12, 12, 12)
                .addComponent(radioRejected)
                .addGap(26, 26, 26)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
         
        if(radioApproved.isSelected()){   
           // request.setRequestResult("Approved");
            request.setStatus("Completed");
             JOptionPane.showMessageDialog(null, "Request Approved!");
            
         }
        else if(radioRejected.isSelected()){
           // request.setRequestResult("Rejected");
            request.setStatus("Rejected");
            JOptionPane.showMessageDialog(null, "Request Rejected!");
        }
        else if(!(radioApproved.isSelected()) && !(radioRejected.isSelected())){
            
            JOptionPane.showMessageDialog(null, "Please select a result!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NGOWorkAreaJPanel dwjp = (NGOWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton radioApproved;
    private javax.swing.JRadioButton radioRejected;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.NGORole;

import Model.WorkQueue.FoodRequirementRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author pavansomashekar
 */
public class ProcessNWorkRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessNWorkRequestJPanel
     */
    private JPanel userProcessContainer;
    private FoodRequirementRequest request;
    
    public ProcessNWorkRequestJPanel(JPanel userProcessContainer, FoodRequirementRequest request) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        groupButton();
    }

    private void groupButton( ) {

    ButtonGroup bg1 = new ButtonGroup( );
    bg1.add(radioApproved);
    bg1.add(radioRejected);

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        submitJButton = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        lblProcessingRequest = new javax.swing.JLabel();
        radioRejected = new javax.swing.JRadioButton();
        radioApproved = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        submitJButton.setBackground(new java.awt.Color(247, 183, 13));
        submitJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit Result");
        submitJButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        lblResult.setFont(new java.awt.Font("Bodoni MT", 1, 18)); // NOI18N
        lblResult.setForeground(new java.awt.Color(153, 153, 153));
        lblResult.setText("Result:");

        backJButton.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(102, 102, 102));
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        lblProcessingRequest.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        lblProcessingRequest.setForeground(new java.awt.Color(127, 180, 50));
        lblProcessingRequest.setText("Processing Request");

        radioRejected.setForeground(new java.awt.Color(51, 51, 51));
        radioRejected.setText("Rejected");

        radioApproved.setForeground(new java.awt.Color(51, 51, 51));
        radioApproved.setText("Approved");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/proces.PNG"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/Union1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProcessingRequest)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblResult)
                        .addGap(12, 12, 12)
                        .addComponent(radioApproved))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(radioRejected))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblProcessingRequest)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResult)
                    .addComponent(radioApproved))
                .addGap(12, 12, 12)
                .addComponent(radioRejected)
                .addGap(26, 26, 26)
                .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
         
        if(radioApproved.isSelected()){   
            request.setStatus("Completed");
             JOptionPane.showMessageDialog(null, "Request Approved!");
            
         }
        else if(radioRejected.isSelected()){
            request.setStatus("Rejected");
            JOptionPane.showMessageDialog(null, "Request Rejected!");
        }
        else if(!(radioApproved.isSelected()) && !(radioRejected.isSelected())){
            
            JOptionPane.showMessageDialog(null, "Please select a result!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NGOWorkAreaJPanel dwjp = (NGOWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblProcessingRequest;
    private javax.swing.JLabel lblResult;
    private javax.swing.JRadioButton radioApproved;
    private javax.swing.JRadioButton radioRejected;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> Stashed changes:NGO/src/UI/NGORole/ProcessNWorkRequestJPanel.java
