/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Employee.Employee;
import Model.Role.SystemAdminRole;
import Model.UserAccount.UserAccount;
import Model.WorkQueue.InventoryDirectory;

/**
 *
 * @author pavansomashekar
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
    
     EcoSystem system = EcoSystem.getInstance();
        
        Employee employee = system.getEmployeeDirectory().createEmployee("sysadmin");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;

    }
    
}
