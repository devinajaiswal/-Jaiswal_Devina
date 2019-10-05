/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author devinajaiswal
 */
public class ProductCatalog {
    private ArrayList<Product> productList;

    public ProductCatalog() {
        this.productList= new ArrayList<Product>();
        
        
    }
    
    public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> accountList) {
        this.productList = accountList;
    }
    
    
    
    
    
    public void deleteProduct(Product product){
        
        productList.remove(product);
    }
    
    public Product searchProduct(String productName){
        for(Product product: productList)
        {
          if (product.getName().equals(productName))
          
            return product;
          
         
        }
         return null;
    }
    
}
