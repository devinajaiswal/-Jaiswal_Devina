/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarDirectory;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.JPanel;

/**
 *
 * @author devinajaiswal
 */
public class UpdatedDate extends javax.swing.JPanel {

    /**
     * Creates new form UpdatedDate
     */
    private JPanel userProcessContainer;
    private CarDirectory carList;
    public UpdatedDate(JPanel userProcessContainer, CarDirectory carList) {
        initComponents();
        this.carList=carList;
    this.userProcessContainer=userProcessContainer;
     updateDate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        updatedDateTextField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 1000));

        jLabel1.setFont(new java.awt.Font("Hiragino Kaku Gothic StdN", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Car Catalog was last Updated on");

        updatedDateTextField.setBackground(new java.awt.Color(204, 204, 255));
        updatedDateTextField.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        updatedDateTextField.setForeground(new java.awt.Color(153, 0, 51));
        updatedDateTextField.setEnabled(false);

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnBack)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(updatedDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addGap(144, 144, 144)
                .addComponent(updatedDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(691, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout=(CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField updatedDateTextField;
    // End of variables declaration//GEN-END:variables

    private void updateDate() {
        Date date= carList.getUpdatedOn();
        updatedDateTextField.setText(date.toString());
    }
}
