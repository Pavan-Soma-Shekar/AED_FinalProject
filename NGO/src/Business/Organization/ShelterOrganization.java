/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ShelterRole;
import java.util.ArrayList;

/**
 *
 * @author pavansomashekar
 */
public class ShelterOrganization extends Organization{
    
     public ShelterOrganization() {
        super(Organization.Type.ShelterFoodOrganization.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ShelterRole());
        return roles;
    }
    
}
