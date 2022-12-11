/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.DistributorRole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pavansomashekar
 */
public class DistributorOrganization extends Organization{
 
     public DistributorOrganization() {
        super(Organization.Type.DistributorFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorRole());
        return roles;
    }
}
