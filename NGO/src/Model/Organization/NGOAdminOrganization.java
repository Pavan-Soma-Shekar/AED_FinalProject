/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Organization;

import Model.Role.AdminRole;
import Model.Role.NGORole;
import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author pavansomashekar
 */
public class NGOAdminOrganization extends Organization{
    
     public NGOAdminOrganization() {
        super(Organization.Type.NgoFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGORole());
        return roles;
    }
    
}
