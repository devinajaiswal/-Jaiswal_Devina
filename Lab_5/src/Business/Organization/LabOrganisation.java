/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author devinajaiswal
 */
public class LabOrganisation extends Organization{
     public LabOrganisation(){
    
    super(Type.Lab.getValue());
    }
    @Override
    public ArrayList<String> getSupportedRole(){
        ArrayList<String> roles= new ArrayList<>();
        roles.add("Lab Assistant");
        return roles;
    }
}
