/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.util.Date;

/**
 *
* @author devinajaiswal
 */
 public abstract class Customer extends User {
        private ProductDirectory directory;
        private Date createdOn;
        public Customer(String password, String userName) {
        super(password, userName, "CUSTOMER");
        createdOn=new Date();
        directory = new ProductDirectory();
        
    }
         public ProductDirectory getDirectory() {
        return directory;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }
    public int compareTo(Customer o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
