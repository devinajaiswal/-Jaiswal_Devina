/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.CarDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author devinajaiswal
 */
public class CarMngWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CarMngWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private CarDirectory carList;
    public CarMngWorkAreaJPanel(JPanel userProcessContainer, CarDirectory accountDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.carList=accountDirectory;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdminLogin = new javax.swing.JButton();
        btnUserlogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        minSeatsTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        MaxSeatsTextField = new javax.swing.JTextField();
        btnMinMaxSeat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnUpdatedDate = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1200, 1200));

        btnAdminLogin.setText("Create");
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        btnUserlogin.setText("Search");
        btnUserlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserloginActionPerformed(evt);
            }
        });

        jLabel1.setText("Minimum Seats");

        minSeatsTextField.setText("1");
        minSeatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minSeatsTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Maximum Seats");

        MaxSeatsTextField.setText("4");

        btnMinMaxSeat.setText("Find");
        btnMinMaxSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinMaxSeatActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Update Date of Car Catalog");

        btnUpdatedDate.setText("View");
        btnUpdatedDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatedDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnMinMaxSeat)
                                .addComponent(btnAdminLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUserlogin, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdatedDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MaxSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(617, 617, 617))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(minSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnAdminLogin)
                .addGap(28, 28, 28)
                .addComponent(btnUserlogin)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(minSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MaxSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnMinMaxSeat)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnUpdatedDate))
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminLoginActionPerformed
        // TODO add your handling code here:
        CreateCarJPanel panel= new CreateCarJPanel(userProcessContainer,carList); 
        userProcessContainer.add("CreateCarJPanel", panel);
        CardLayout layout= (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAdminLoginActionPerformed

    private void btnUserloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserloginActionPerformed
        // TODO add your handling code here:
        ManageCarJPanel panel= new ManageCarJPanel(userProcessContainer,carList);
        userProcessContainer.add("ManageCarJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUserloginActionPerformed

    private void btnMinMaxSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinMaxSeatActionPerformed
        // TODO add your handling code here:
        String maxSeatsS= MaxSeatsTextField.getText();
        String minSeatsS= minSeatsTextField.getText();
        int maxSeatsI= maxSeatsS.equals("") ? Integer.MAX_VALUE : Integer.parseInt(maxSeatsS);
         int minSeatsI= minSeatsS.equals("") ? Integer.MIN_VALUE : Integer.parseInt(minSeatsS);
        MinMaxSeatsJPanel panel= new MinMaxSeatsJPanel (userProcessContainer, carList, maxSeatsI, minSeatsI);
        userProcessContainer.add("MinMaxSeatsJPanel",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMinMaxSeatActionPerformed

    private void minSeatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minSeatsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minSeatsTextFieldActionPerformed

    private void btnUpdatedDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatedDateActionPerformed
        // TODO add your handling code here:
        UpdatedDate panel= new UpdatedDate (userProcessContainer, carList);
        userProcessContainer.add("UpdatedDate",panel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnUpdatedDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MaxSeatsTextField;
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JButton btnMinMaxSeat;
    private javax.swing.JButton btnUpdatedDate;
    private javax.swing.JButton btnUserlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField minSeatsTextField;
    // End of variables declaration//GEN-END:variables
}
