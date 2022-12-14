/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.DB4OUtil.DB4OUtil;
import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Network.Network;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author priyanka
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public MainJFrame() {
        initComponents();
        disableWarning();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        upperContainer = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtPasswordField = new javax.swing.JPasswordField();
        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userProcessContainer = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        upperContainer.setBackground(new java.awt.Color(255, 255, 255));
        upperContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        upperContainer.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 104, -1));

        txtPassword.setUI(null);
        upperContainer.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 37, 3, 0));

        btnLogin.setBackground(new java.awt.Color(247, 183, 13));
        btnLogin.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        upperContainer.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 104, 20));

        usernameLabel.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(153, 153, 153));
        usernameLabel.setText("Username");
        upperContainer.add(usernameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        passwordLabel.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(153, 153, 153));
        passwordLabel.setText("Password");
        upperContainer.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        btnLogout.setBackground(new java.awt.Color(247, 183, 13));
        btnLogout.setFont(new java.awt.Font("Bodoni MT", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        upperContainer.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 20));
        upperContainer.add(txtPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 104, -1));

        enterpriseLabel.setFont(new java.awt.Font("Bodoni MT", 1, 36)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(127, 180, 50));
        enterpriseLabel.setText("NGO MANAGEMENT SYSTEM");
        upperContainer.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 500, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/logo.PNG"))); // NOI18N
        upperContainer.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 100, 90));

        jSplitPane.setTopComponent(upperContainer);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/background.png"))); // NOI18N
        userProcessContainer.add(jLabel4, "card2");

        jSplitPane.setRightComponent(userProcessContainer);

        getContentPane().add(jSplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed

        btnLogout.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPasswordField.setEnabled(true);
        btnLogin.setEnabled(true);

        txtUsername.setText("");
        txtPasswordField.setText("");

        userProcessContainer.removeAll();
        JPanel blankJP = new JPanel();
        userProcessContainer.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_btnLogoutActionPerformed

    public static void disableWarning() {
        System.err.close();
        System.setErr(System.out);
    }

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        String uname = txtUsername.getText();
        char[] password1 = txtPasswordField.getPassword();

        if(uname.equalsIgnoreCase("") || password1.equals("") || (uname.equalsIgnoreCase("") && password1.equals(""))){

            JOptionPane.showMessageDialog(null, "Fields Cannot Be Empty!", "Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Get user name
        String userName = txtUsername.getText();
        // Get Password
        char[] passwordCharArray = txtPasswordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise=null;
        Organization inOrganization=null;

        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:system.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                        //Step 3:check against each organization for each enterprise
                        for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if(userAccount!=null){
                                inEnterprise=enterprise;
                                inOrganization=organization;
                                break;
                            }
                        }

                    }
                    else{
                        inEnterprise=enterprise;
                        break;
                    }
                    if(inOrganization!=null){
                        break;
                    }
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }

        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            userProcessContainer.add("workArea",userAccount.getRole().createWorkArea(userProcessContainer, userAccount, inOrganization, inEnterprise, system));
            layout.next(userProcessContainer);
        }

        btnLogin.setEnabled(false);
        btnLogout.setEnabled(true);
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JPasswordField txtPasswordField;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JPanel upperContainer;
    private javax.swing.JPanel userProcessContainer;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
