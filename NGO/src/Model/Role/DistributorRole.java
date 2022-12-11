/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.DistributorOrganization;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import UI.DistributorRole.DistributorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author pavansomashekar
 */
public class DistributorRole extends Role {
 
      @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DistributorWorkAreaJPanel(userProcessContainer, account, (DistributorOrganization)organization, enterprise, business);
    }
    
    
}
