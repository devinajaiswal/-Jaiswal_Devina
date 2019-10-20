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
public class DoctorOrganisation extends Organization {
     public DoctorOrganisation(){
    
    super(Organization.Type.Doctor.getValue());
    }
    @Override
    public ArrayList<String> getSupportedRole(){
        ArrayList<String> roles= new ArrayList<>();
        roles.add("Doctor");
        return roles;
    }
}
