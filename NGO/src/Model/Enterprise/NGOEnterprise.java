/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Alisha Khan
 */
public class NGOEnterprise extends Enterprise{
    
    public NGOEnterprise(String name){
        super(name,Enterprise.EnterpriseType.NGO);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
