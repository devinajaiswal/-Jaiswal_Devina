/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author devinajaiswal
 */

public class CarDirectory {
    
    private ArrayList<Car> carList;
     public static Date updatedOn;
    public CarDirectory() {
        this.carList = new ArrayList<Car>();
         CarDirectory.updatedOn= new Date();
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true,2);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true,12);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true,3);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true,2);
        Car car5 = new Car(true, "Suzuki", 2017, 1, 4, 5, "T2", "Chicago", true,2);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true,3);
        Car car7 = new Car(true, "Ferrari", 2016, 1, 4, 7, "Xq", "Seattle", true,23);
        Car car8 = new Car(false, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true,0.1);
        Car car9 = new Car(true, "Toyota", 2019, 1, 4, 9, "T3", "Austin", true,3);
        Car car10 = new Car(true, "GM", 2019, 1, 4, 10, "G3", "Austin", false,2);
       // Car car11 = new Car(true, "Fiat", 2019, 1, 4, 10, "G3", "Austin", false,2);
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
 
 //       carList.add(car11);
        
    }

    public  Date getUpdatedOn() {
        return updatedOn;
    }
    
    public Car addCar(){
        Car car = new Car();
        CarDirectory.updatedOn= new Date();
        carList.add(car);
        return car;
      
        
    }

    public ArrayList<Car> getCarList() {
        //CarDirectory.updatedOn= new Date();
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    
    
    
    
    
    public void deleteCar(Car car){
        CarDirectory.updatedOn= new Date();
        carList.remove(car);
    }
    
    
    public ArrayList<Car> getMinMaxSeatList(int maxSeats, int minSeats){
    
      ArrayList<Car> minMaxSeatList=new ArrayList<>();
       for (Car c: carList)
       {
           if(c.getMaxSeats()<=maxSeats && c.getMinSeats()>=minSeats )
           {
           minMaxSeatList.add(c);
           }
       
       
       }
    
    return minMaxSeatList;
    
    }
    
    public ArrayList<Car> getExpMaintananceCertificateList(){
    
      ArrayList<Car> expMCList=new ArrayList<>();
       for (Car car: carList)
       {
           if(car.isMaintenanceCertificate()==false)
           {
          expMCList.add(car);
           }
       
       
       }
    
    return expMCList;
    
    }
    
    
     public ArrayList<Car> getAvailCarList(){
    
      ArrayList<Car> availCarList=new ArrayList<>();
       for (Car car: carList)
       {
           if(car.isAvailablityOfCar()==true)
           {
        availCarList.add(car);
           }
       
       
       }
    
    return availCarList;
    
    }
     
     public ArrayList<Car> getManufacturerList(){
         ArrayList<Car> manufacturerList=new ArrayList<>();
         int countFerrari=0;
         int countBMW=0;
        int countVolkwagen=0;
        int countGM=0;
         int countToyota=0;
 
       int countFord=0;
       int countFiat=0;
       int countHonda=0;
       int countRenault=0;
       int countHyundai=0;
       int countNissan=0;
       int countTesla=0;
       int countSuzuki=0;
       
       
       
     for (Car car: carList)
     { 
         if(car.getMake()=="Tesla"){
           countTesla=countTesla+1;
           
          if(countTesla==1)
              manufacturerList.add(car);
    }
         
         
       if(car.getMake()=="Suzuki"){
           countSuzuki=countSuzuki+1;
           
          if(countSuzuki==1)
              manufacturerList.add(car);
    }
           
         
         
         
if(car.getMake()=="Nissan"){
           countNissan=countNissan+1;
           
          if(countNissan==1)
              manufacturerList.add(car);
    }
         
if(car.getMake()=="Renault"){
           countRenault=countRenault+1;
           
          if(countRenault==1)
              manufacturerList.add(car);
    }
         
         
        
          if(car.getMake()=="Hyundai"){
           countHyundai=countHyundai+1;
           
          if(countHyundai==1)
              manufacturerList.add(car);
    }
         
         if(car.getMake()=="Honda"){
           countHonda=countHonda+1;
           
          if(countHonda==1)
              manufacturerList.add(car);
    }
         if(car.getMake()=="Ford"){
           countFord=countFord+1;
           
          if(countFord==1)
              manufacturerList.add(car);
    }
       if(car.getMake()=="Ferrari"){
           countFerrari=countFerrari+1;
           
          if(countFerrari==1)
              manufacturerList.add(car);
    }
       if(car.getMake()=="BMW"){
           countBMW=countBMW+1;
          if(countBMW==1)
              manufacturerList.add(car);
    }
       
       if(car.getMake()=="Volkswagen"){
           countVolkwagen=countVolkwagen+1;
           
          if(countVolkwagen==1)
              manufacturerList.add(car);
    }
     
     if(car.getMake()=="GM"){
           countGM=countGM+1;
           
          if(countGM==1)
              manufacturerList.add(car);
    }
      if(car.getMake()=="Toyota"){
           countToyota=countToyota+1;
           
          if(countToyota==1)
              manufacturerList.add(car);
    }
      if(car.getMake()=="Fiat"){
           countFiat=countFiat+1;
           
          if(countFiat==1)
              manufacturerList.add(car);
    }
      if(car.getMake()=="Toyota"){
           countToyota=countToyota+1;
           
          if(countToyota==1)
              manufacturerList.add(car);
    }
     }
     return manufacturerList;
     }
    

     
     
     
     
     
     
     
}
        
        
        
        
    
    
    
    

