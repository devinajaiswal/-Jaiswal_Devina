/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.CarType;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author devinajaiswal
 */
public class ViewCarPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewCarPanel
     */
    
    private CarType car;
    public ViewCarPanel(CarType car) {
        initComponents();
        displayCar(car);
     
    }
    
    private void displayCar(CarType car){
        
        
        
        
        String carMake=car.getMake();
        makeTextField.setText(carMake);
        
        String carModel=car.getModel();
        modelTextField.setText(carModel);
        
        String carExtColor=car.getExtColor();
        extColorTextField.setText(carExtColor);
        
        String carIntColor=car.getIntColor();
        intColorTextField.setText(carIntColor);
        
        String carEngine=car.getEngine();
        engineTextField.setText(carEngine);
        
        String carPrice=car.getPrice();
        priceTextField.setText(carPrice);
        
        String carTransmission=car.getTransmission();
        transmissionTextField.setText(carTransmission);
        
        String carCityMpg=car.getCityMpg();
        cityMPGTextField.setText(carCityMpg);
        
        String carHighwayMpg=car.getHighwayMpg();
        highwayMPGTextField.setText(carHighwayMpg);
        
        String carCylinder=car.getCylinder();
        cylinderTextField.setText(carCylinder);
        
        String carGrossVehicleWt=car.getGrossvehiclewt();
        grossVehicleWtTextField.setText(carGrossVehicleWt);
        
        String carFuelCapacity=car.getFuelCapacity();
        fuelCapacityTextField.setText(carFuelCapacity);
        
        String carSunroofAvail=car.getSunroofAvail();
        sunroofAvailTextField.setText(carSunroofAvail);
        
        String carFuelSource=car.getFuelSource();
        fuelSourceTextField.setText(carFuelSource);
        
        String carWarranty=car.getWarranty();
        warrantyTextField.setText(carWarranty);
        
        //Code for viewing uploaded image in View Panel
        
        String p=CreateCarPanel.imPath;  //copying selected image path in another variable
//        
//        carImageLabel.setIcon(displayImage(p))
        ImageIcon imageIcon = new ImageIcon(p); 
        Image cimage= imageIcon.getImage();
        //System.out.print(carImageLabel.getWidth());
        //System.out.print(carImageLabel.getHeight());
        Image scaledIm= cimage.getScaledInstance(200,280, Image.SCALE_SMOOTH ); // Scaling Image
        ImageIcon finalImage=new ImageIcon(scaledIm);

        carImageLabel.setIcon(finalImage);
        

    
        
        
        
        
        
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel17 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        carImageLabel = new javax.swing.JLabel();
        cityMPGTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        makeTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        modelTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        extColorTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        intColorTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        engineTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        priceTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        transmissionTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        highwayMPGTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cylinderTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        grossVehicleWtTextField = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fuelCapacityTextField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        sunroofAvailTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        fuelSourceTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        warrantyTextField = new javax.swing.JTextField();

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/cari.jpeg"))); // NOI18N
        jLabel17.setText("jLabel17");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("Car Description");

        carImageLabel.setPreferredSize(new java.awt.Dimension(103, 16));
        carImageLabel.setSize(new java.awt.Dimension(150, 150));

        jLabel3.setText("Make");

        makeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Model");

        jLabel5.setText("Exterior Color");

        jLabel6.setText("Interior Color");

        jLabel7.setText("Engine");

        jLabel8.setText("Price");

        jLabel9.setText("Transmission");

        jLabel10.setText("City MPG");

        jLabel11.setText("Highway MPG");

        highwayMPGTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highwayMPGTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("Cylinder");

        jLabel13.setText("Gross Vehicle weight");

        jLabel14.setText("Fuel Capacity");

        fuelCapacityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fuelCapacityTextFieldActionPerformed(evt);
            }
        });

        jLabel16.setText("Sunroof Availability ");

        jLabel15.setText("Fuel source");

        jLabel18.setText("Warranty");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel18)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cylinderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grossVehicleWtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuelCapacityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sunroofAvailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fuelSourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warrantyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(engineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(makeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(extColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(intColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transmissionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cityMPGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(highwayMPGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(carImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel2)))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(95, 95, 95)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9)
                        .addComponent(jLabel10)
                        .addComponent(jLabel5)
                        .addComponent(jLabel11)
                        .addComponent(jLabel8))
                    .addContainerGap(569, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(carImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(makeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(modelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(extColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(intColorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(engineTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transmissionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cityMPGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(highwayMPGTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cylinderTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grossVehicleWtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fuelCapacityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sunroofAvailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fuelSourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(warrantyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(jLabel5)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel6)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel7)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel8)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel9)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel10)
                    .addGap(22, 22, 22)
                    .addComponent(jLabel11)
                    .addContainerGap(342, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void makeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_makeTextFieldActionPerformed

    private void highwayMPGTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highwayMPGTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_highwayMPGTextFieldActionPerformed

    private void fuelCapacityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fuelCapacityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fuelCapacityTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carImageLabel;
    private javax.swing.JTextField cityMPGTextField;
    private javax.swing.JTextField cylinderTextField;
    private javax.swing.JTextField engineTextField;
    private javax.swing.JTextField extColorTextField;
    private javax.swing.JTextField fuelCapacityTextField;
    private javax.swing.JTextField fuelSourceTextField;
    private javax.swing.JTextField grossVehicleWtTextField;
    private javax.swing.JTextField highwayMPGTextField;
    private javax.swing.JTextField intColorTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField makeTextField;
    private javax.swing.JTextField modelTextField;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JTextField sunroofAvailTextField;
    private javax.swing.JTextField transmissionTextField;
    private javax.swing.JTextField warrantyTextField;
    // End of variables declaration//GEN-END:variables
}