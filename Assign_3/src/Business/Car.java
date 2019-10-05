 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author devinajaiswal
 */
public class Car{
    
    private boolean availablityOfCar;
    private String make;
    private int manufacturedYear;
    private int minSeats;
    private int maxSeats;
    private int serialNo;
    private String modelNo;
    private String availableCity;
    private boolean maintenanceCertificate;
    private double distance;
    // private Date createdOn;

//    public Car() {
//        this.createdOn = new Date();
//        
//    }
//    
   
    public Car(boolean availablity, String make, int manufacturedYear, int minSeats, int maxSeats, int serialNo, String modelNo, String availableCity, boolean maintenanceCertificate, double distance) {
        this.availablityOfCar= availablity;
        this.make= make;
        this.manufacturedYear= manufacturedYear;
        this.minSeats = minSeats;
        this.maxSeats = maxSeats;
        this.serialNo = serialNo;
        this.modelNo = modelNo;
        this.availableCity = availableCity;
        this.maintenanceCertificate = maintenanceCertificate;
        this.distance=distance;
    }
public Car() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //System.out.println("Car Constructor");
    }

    
    
 @Override
  public String toString(){
  return make;
  
  }

    public boolean isAvailablityOfCar() {
        return availablityOfCar;
    }

    public void setAvailablityOfCar(boolean availablityOfCar) {
        this.availablityOfCar = availablityOfCar;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getManufacturedYear() {
        return manufacturedYear;
    }

    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }

    public int getMinSeats() {
        return minSeats;
    }

    public void setMinSeats(int minSeats) {
        this.minSeats = minSeats;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(int maxSeats) {
        this.maxSeats = maxSeats;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getAvailableCity() {
        return availableCity;
    }

    public void setAvailableCity(String availableCity) {
        this.availableCity = availableCity;
    }

   public boolean isMaintenanceCertificate() {
       return maintenanceCertificate;
   }

   public void setMaintenanceCertificate(boolean maintenanceCertificate) {
       this.maintenanceCertificate = maintenanceCertificate;
  }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
    
    
    
}
