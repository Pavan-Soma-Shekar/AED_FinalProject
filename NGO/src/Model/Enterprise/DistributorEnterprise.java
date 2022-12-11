/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Enterprise;

import Model.Role.Role;
import Model.WorkQueue.InventoryDirectory;
import java.util.ArrayList;

/**
 *
 * @author Alisha Khan
 */
public class DistributorEnterprise extends Enterprise {
    
    public DistributorEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Distributor);
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
