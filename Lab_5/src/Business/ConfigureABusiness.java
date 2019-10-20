/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganisation;
import Business.Organization.LabOrganisation;
import Business.UserAccount.UserAccount;

/**
 *
 * @author ran
 */
public class ConfigureABusiness {
    
    public static Business configure(){
        // Three roles: LabAssistant, Doctor, Admin
        
        Business business = Business.getInstance();
        
        AdminOrganization adminOrganization = new    AdminOrganization();
        business.getOrganizationDirectory().getOrganizationList().add(adminOrganization);
        
        Employee employee= new Employee();
        employee.setName("Abc Xyz");
        
        UserAccount account= new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole("Admin");
        account.setEmployee(employee);
        
        adminOrganization.getEmployeeDirectory().getEmployeeList().add(employee);
        adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        
         // Create doctor organization
        DoctorOrganisation doctorOrganisation = new DoctorOrganisation();
        business.getOrganizationDirectory().getOrganizationList().add(doctorOrganisation);

        // Create a new employee
        Employee employee1 = new Employee();
        employee1.setName("Jackie");
   //     employee1.setEmployer(doctorOrganisation);

        // Create a new account
        UserAccount account1 = new UserAccount();
        account1.setUsername("doctor");
        account1.setPassword("doctor");
        account1.setRole("Doctor");
        account1.setEmployee(employee1);

        // Add the employee into admin organization
        doctorOrganisation.getEmployeeDirectory().getEmployeeList().add(employee1);
        // Add the account into admin organization
        doctorOrganisation.getUserAccountDirectory().getUserAccountList().add(account1);

        
        
        
        
        
        
           // Create Lab organization
        LabOrganisation labOrganisation = new LabOrganisation();
        business.getOrganizationDirectory().getOrganizationList().add(labOrganisation);

        // Create a new employee
        Employee employee2 = new Employee();
        employee2.setName("Ben");
   //     employee1.setEmployer(doctorOrganisation);

        // Create a new account
        UserAccount account2 = new UserAccount();
        account2.setUsername("lab");
        account2.setPassword("lab");
        account2.setRole("Lab Assistant");
        account2.setEmployee(employee2);

        // Add the employee into admin organization
        labOrganisation.getEmployeeDirectory().getEmployeeList().add(employee2);
        // Add the account into admin organization
        labOrganisation.getUserAccountDirectory().getUserAccountList().add(account2);

        
        
        
        
        
        
        return business;
    }
    
}
