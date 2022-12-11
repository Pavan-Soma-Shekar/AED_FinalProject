/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.NGOAdminOrganization;
import Model.Organization.Organization;
import Model.Organization.QualityOrganization;
import Model.UserAccount.UserAccount;
import UI.NGORole.NGOWorkAreaJPanel;
import UI.QualityCheckRole.QualityCheckWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author pavansomashekar
 */
public class NGORole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new NGOWorkAreaJPanel(userProcessContainer, account, (NGOAdminOrganization)organization,enterprise, business);
    }
    
}
