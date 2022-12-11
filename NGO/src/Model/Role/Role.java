/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 package Model.Role;

import Model.EcoSystem;
import Model.Enterprise.Enterprise;
import Model.Organization.Organization;
import Model.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author pavansomashekar
 */
public abstract class Role {
    
    public enum RoleType{
    NGORole("NGORole"), 
    AdminRole("AdminRole"),
    DistributorRole("DistributorRole"),
    QualityCheckRole("QualityCheckRole"),
    ShelterRole("ShelterRole"),
    SupplierRole("SupplierRole");

     private String value;
     
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}

