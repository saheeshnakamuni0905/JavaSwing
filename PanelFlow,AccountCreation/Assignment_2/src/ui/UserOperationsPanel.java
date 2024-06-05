/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.table.DefaultTableModel;
import model.LoginCredentials;
import model.LoginCredentialsList;
import model.PasswordList;
import model.PersonDetails;
import model.PersonDetailsList;

/**
 *
 * @author kamuni.saheeshna
 */

public class UserOperationsPanel extends javax.swing.JPanel {

/**
     * Creates new form UserOperationsPanel
     */
    PersonDetailsList personList;
    LoginCredentialsList loginList; 
    PasswordList passwordList;
    public UserOperationsPanel(PersonDetailsList personList, LoginCredentialsList loginList, PasswordList passwordList) {
        initComponents();
        this.personList = personList;
        this.loginList =loginList; 
        this.passwordList =passwordList;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userOpSplitPane = new javax.swing.JSplitPane();
        userOpControlArea = new javax.swing.JPanel();
        btnUpdateDetails = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();
        userOpWorkArea = new javax.swing.JPanel();
        lblUserOpNEUID = new javax.swing.JLabel();
        lblUserOpTitle = new javax.swing.JLabel();
        lblUserOpUsername = new javax.swing.JLabel();
        lblUserOpFirstName = new javax.swing.JLabel();
        lblUserOpLastName = new javax.swing.JLabel();
        lblUserOpGender = new javax.swing.JLabel();
        lblUserOpDOB = new javax.swing.JLabel();
        txtUserOpNEUID = new javax.swing.JTextField();
        txtUserOpUsername = new javax.swing.JTextField();
        txtUserOpFirstName = new javax.swing.JTextField();
        txtUserOpLastName = new javax.swing.JTextField();
        txtUserOpGender = new javax.swing.JTextField();
        txtUserOpDOB = new javax.swing.JFormattedTextField();

        btnUpdateDetails.setText("Update Details");
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userOpControlAreaLayout = new javax.swing.GroupLayout(userOpControlArea);
        userOpControlArea.setLayout(userOpControlAreaLayout);
        userOpControlAreaLayout.setHorizontalGroup(
            userOpControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userOpControlAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userOpControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdateDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userOpControlAreaLayout.setVerticalGroup(
            userOpControlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userOpControlAreaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnUpdateDetails)
                .addGap(31, 31, 31)
                .addComponent(btnViewDetails)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        userOpSplitPane.setLeftComponent(userOpControlArea);

        lblUserOpNEUID.setText("NEU ID:");

        lblUserOpTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUserOpTitle.setText("View Personal Details");

        lblUserOpUsername.setText("Username:");

        lblUserOpFirstName.setText("First Name:");

        lblUserOpLastName.setText("Last Name:");

        lblUserOpGender.setText("Gender:");

        lblUserOpDOB.setText("Date Of Birth:");

        txtUserOpNEUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserOpNEUIDActionPerformed(evt);
            }
        });

        txtUserOpFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserOpFirstNameActionPerformed(evt);
            }
        });

        txtUserOpGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserOpGenderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userOpWorkAreaLayout = new javax.swing.GroupLayout(userOpWorkArea);
        userOpWorkArea.setLayout(userOpWorkAreaLayout);
        userOpWorkAreaLayout.setHorizontalGroup(
            userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userOpWorkAreaLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userOpWorkAreaLayout.createSequentialGroup()
                        .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserOpFirstName)
                            .addComponent(lblUserOpUsername)
                            .addComponent(lblUserOpLastName)
                            .addComponent(lblUserOpGender)
                            .addComponent(lblUserOpDOB)
                            .addComponent(lblUserOpNEUID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUserOpNEUID)
                            .addComponent(txtUserOpUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtUserOpFirstName)
                            .addComponent(txtUserOpLastName)
                            .addComponent(txtUserOpGender)
                            .addComponent(txtUserOpDOB)))
                    .addGroup(userOpWorkAreaLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblUserOpTitle)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        userOpWorkAreaLayout.setVerticalGroup(
            userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userOpWorkAreaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblUserOpTitle)
                .addGap(26, 26, 26)
                .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserOpNEUID)
                    .addComponent(txtUserOpNEUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserOpUsername)
                    .addComponent(txtUserOpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserOpFirstName)
                    .addComponent(txtUserOpFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserOpLastName)
                    .addComponent(txtUserOpLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUserOpGender)
                    .addComponent(txtUserOpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userOpWorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserOpDOB)
                    .addComponent(txtUserOpDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        userOpSplitPane.setRightComponent(userOpWorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userOpSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userOpSplitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        // TODO add your handling code here:
        UserDetailsUpdatePanel updatePanel = new UserDetailsUpdatePanel(personList, loginList, passwordList);
        userOpSplitPane.setRightComponent(updatePanel);
    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void txtUserOpNEUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserOpNEUIDActionPerformed
        // TODO add your handling code here:       
    }//GEN-LAST:event_txtUserOpNEUIDActionPerformed

    private void txtUserOpFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserOpFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserOpFirstNameActionPerformed

    private void txtUserOpGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserOpGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserOpGenderActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int userOperationsRowCount =-1;
        userOpSplitPane.setRightComponent(userOpWorkArea);
        AdminOperationsPanel admin = new AdminOperationsPanel(personList, loginList, passwordList);
        DefaultTableModel model= admin.getTable();
        String inputNEUId = txtUserOpNEUID.getText();
    
        for (int i = 0; i < model.getRowCount(); i++) {
            String neuId = model.getValueAt(i, 0).toString();
            if (neuId.equals(inputNEUId)) {
                userOperationsRowCount = i;
                break;
            }
        }
        PersonDetails selectedNEUID = (PersonDetails) model.getValueAt(userOperationsRowCount, 0);       
        txtUserOpFirstName.setText(selectedNEUID.getFirstName());
        txtUserOpLastName.setText(selectedNEUID.getLastName());
        txtUserOpGender.setText(selectedNEUID.getGender());
        txtUserOpDOB.setText(selectedNEUID.getDateOfBirth());
        
        LoginCredentials selectedLogin = (LoginCredentials) model.getValueAt(userOperationsRowCount, 3);
        txtUserOpUsername.setText(selectedLogin.getUserName());
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel lblUserOpDOB;
    private javax.swing.JLabel lblUserOpFirstName;
    private javax.swing.JLabel lblUserOpGender;
    private javax.swing.JLabel lblUserOpLastName;
    private javax.swing.JLabel lblUserOpNEUID;
    private javax.swing.JLabel lblUserOpTitle;
    private javax.swing.JLabel lblUserOpUsername;
    private javax.swing.JFormattedTextField txtUserOpDOB;
    private javax.swing.JTextField txtUserOpFirstName;
    private javax.swing.JTextField txtUserOpGender;
    private javax.swing.JTextField txtUserOpLastName;
    private javax.swing.JTextField txtUserOpNEUID;
    private javax.swing.JTextField txtUserOpUsername;
    private javax.swing.JPanel userOpControlArea;
    private javax.swing.JSplitPane userOpSplitPane;
    private javax.swing.JPanel userOpWorkArea;
    // End of variables declaration//GEN-END:variables
   
    public void settxtNEUID(String id){
        txtUserOpNEUID.setText(id);
    }
    public void settxtUsername(String un){
        txtUserOpUsername.setText(un);
    }
    public void settxtFirstName(String fn){
        txtUserOpFirstName.setText(fn);
    }
    public void settxtLastName(String ln){
        txtUserOpLastName.setText(ln);
    }
    public void settxtGender(String g){
        txtUserOpGender.setText(g);
    }
    public void settxtDOB(String dob){
        txtUserOpDOB.setText(dob);
    }
    public String gettxtUsername(){
        return txtUserOpUsername.getText();
    }
}
