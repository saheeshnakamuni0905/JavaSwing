/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.Driver;

/**
 *
 * @author kamuni.saheeshna
 */
public class DriverJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DriverJPanel
     */
    public Driver driver;
    public DriverJPanel(Driver driver) {
        initComponents();
        this.driver = driver;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        driverScrollPane = new javax.swing.JScrollPane();
        driverPanel = new javax.swing.JPanel();
        lblDriverLicenseNumber = new javax.swing.JLabel();
        txtIssuingState = new javax.swing.JTextField();
        lblIssuingState = new javax.swing.JLabel();
        btnDriverSave = new javax.swing.JButton();
        txtDriverLicenseNumber = new javax.swing.JTextField();
        lblDateOfExpiration = new javax.swing.JLabel();
        txtDateOfExpiration = new javax.swing.JTextField();
        lblDriverTitle = new javax.swing.JLabel();

        driverPanel.setBackground(new java.awt.Color(153, 255, 204));

        lblDriverLicenseNumber.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        lblDriverLicenseNumber.setForeground(new java.awt.Color(255, 102, 102));
        lblDriverLicenseNumber.setText("Driver License Number");

        txtIssuingState.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        txtIssuingState.setForeground(new java.awt.Color(255, 102, 102));
        txtIssuingState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIssuingStateActionPerformed(evt);
            }
        });

        lblIssuingState.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        lblIssuingState.setForeground(new java.awt.Color(255, 102, 102));
        lblIssuingState.setText("Issuing State");

        btnDriverSave.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        btnDriverSave.setForeground(new java.awt.Color(255, 102, 102));
        btnDriverSave.setText("Save");
        btnDriverSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDriverSave.setBorderPainted(false);
        btnDriverSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDriverSaveActionPerformed(evt);
            }
        });

        txtDriverLicenseNumber.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        txtDriverLicenseNumber.setForeground(new java.awt.Color(255, 102, 102));

        lblDateOfExpiration.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        lblDateOfExpiration.setForeground(new java.awt.Color(255, 102, 102));
        lblDateOfExpiration.setText("Date Of Expiration");

        txtDateOfExpiration.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        txtDateOfExpiration.setForeground(new java.awt.Color(255, 102, 102));
        txtDateOfExpiration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfExpirationActionPerformed(evt);
            }
        });

        lblDriverTitle.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        lblDriverTitle.setForeground(new java.awt.Color(255, 102, 102));
        lblDriverTitle.setText("Driver Details");

        javax.swing.GroupLayout driverPanelLayout = new javax.swing.GroupLayout(driverPanel);
        driverPanel.setLayout(driverPanelLayout);
        driverPanelLayout.setHorizontalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(lblDriverTitle))
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIssuingState)
                            .addComponent(lblDriverLicenseNumber)
                            .addComponent(lblDateOfExpiration))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDriverLicenseNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                            .addComponent(txtIssuingState)
                            .addComponent(txtDateOfExpiration)))
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(btnDriverSave)))
                .addContainerGap(252, Short.MAX_VALUE))
        );

        driverPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDriverSave, lblDateOfExpiration, lblDriverLicenseNumber, lblDriverTitle, lblIssuingState, txtDateOfExpiration, txtDriverLicenseNumber, txtIssuingState});

        driverPanelLayout.setVerticalGroup(
            driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(driverPanelLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(driverPanelLayout.createSequentialGroup()
                        .addComponent(lblDriverTitle)
                        .addGap(18, 18, 18)
                        .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDriverLicenseNumber)
                            .addComponent(txtDriverLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblIssuingState))
                    .addComponent(txtIssuingState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(driverPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateOfExpiration)
                    .addComponent(txtDateOfExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDriverSave)
                .addContainerGap(187, Short.MAX_VALUE))
        );

        driverPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDriverSave, lblDateOfExpiration, lblDriverLicenseNumber, lblDriverTitle, lblIssuingState, txtDateOfExpiration, txtDriverLicenseNumber, txtIssuingState});

        driverScrollPane.setViewportView(driverPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(driverScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(driverScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIssuingStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIssuingStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIssuingStateActionPerformed

    private void txtDateOfExpirationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfExpirationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfExpirationActionPerformed

    private void btnDriverSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDriverSaveActionPerformed
        // TODO add your handling code here:
        driver.setDriverLicenseNumber(txtDriverLicenseNumber.getText());
        driver.setIssuingState(txtIssuingState.getText());
        driver.setDateOfExpiration(txtDateOfExpiration.getText());
       
        JOptionPane.showMessageDialog(this,"Driver Details Saved");
    }//GEN-LAST:event_btnDriverSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDriverSave;
    private javax.swing.JPanel driverPanel;
    private javax.swing.JScrollPane driverScrollPane;
    private javax.swing.JLabel lblDateOfExpiration;
    private javax.swing.JLabel lblDriverLicenseNumber;
    private javax.swing.JLabel lblDriverTitle;
    private javax.swing.JLabel lblIssuingState;
    private javax.swing.JTextField txtDateOfExpiration;
    private javax.swing.JTextField txtDriverLicenseNumber;
    private javax.swing.JTextField txtIssuingState;
    // End of variables declaration//GEN-END:variables
}
