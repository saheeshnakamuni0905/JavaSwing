/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import Business.Course.CourseList;
import Business.DegreeList;
import Business.Professor;
import Business.ProfessorList;
import Business.ProfessorLogin;
import Business.ProfessorLoginList;
import Business.StudentList;
import Business.StudentLoginList;
import Business.ThirdPartyList;


/**
 *@author metla
 *@author kamuni.saheeshna
 */
public class ProfessorCatalogPanel extends javax.swing.JPanel {
    /**
     * Creates new form ProfessorCatalog
     */
    MainJFrame frame;
    JPanel userProcessContainer;
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    ThirdPartyList thirdPartyList;
    DegreeList degreeList;
    JPanel userProcessConatiner;
    public ProfessorCatalogPanel(JPanel userProcessContainer, ProfessorList professorList,ProfessorLoginList professorLoginList, CourseList courseList, StudentList studentList, StudentLoginList studentLoginList,ThirdPartyList thirdPartyList,DegreeList degreeList) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.professorList= professorList;
       this.professorLoginList= professorLoginList;
       this.courseList = courseList;
       this.studentList =studentList;
       this.studentLoginList = studentLoginList;
       this.thirdPartyList =  thirdPartyList;
       this.degreeList = degreeList;
       populateProfTable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProfessorCatalog = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProf = new javax.swing.JTable();
        btnUpdateProf = new javax.swing.JButton();
        btnDeleteProf = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAddProf = new javax.swing.JButton();
        lblProfId = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblProfName = new javax.swing.JLabel();
        lblEmailId = new javax.swing.JLabel();
        txtProfId = new javax.swing.JTextField();
        txtProfUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtProfName = new javax.swing.JTextField();
        txtProfEmail = new javax.swing.JTextField();

        lblProfessorCatalog.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblProfessorCatalog.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfessorCatalog.setText("PROFESSOR CATALOG");

        tblProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Professor ID", "User Name", "Password", "Professor Name", "Email ID"
            }
        ));
        jScrollPane1.setViewportView(tblProf);

        btnUpdateProf.setText("UPDATE PROFESSOR");
        btnUpdateProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProfActionPerformed(evt);
            }
        });

        btnDeleteProf.setText("DELETE PROFESSOR");
        btnDeleteProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteProfActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAddProf.setText("ADD PROFESSOR");
        btnAddProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProfActionPerformed(evt);
            }
        });

        lblProfId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProfId.setText("Professor ID:");

        lblUserId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUserId.setText("User Name:");

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        lblProfName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblProfName.setText("Professor Name: ");

        lblEmailId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailId.setText("Email ID:");

        txtProfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProfUserNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblProfessorCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(btnAddProf))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblEmailId)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUserId)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPassword)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblProfName)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblProfId)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtProfId, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdateProf)
                                        .addGap(64, 64, 64)
                                        .addComponent(btnDeleteProf)))))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmailId, lblPassword, lblProfId, lblProfName, lblUserId});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAddProf, btnDeleteProf, btnUpdateProf});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtProfEmail, txtProfId, txtProfName, txtProfUserName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessorCatalog)
                    .addComponent(btnBack))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfId)
                    .addComponent(txtProfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfName)
                    .addComponent(txtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProf)
                    .addComponent(btnUpdateProf)
                    .addComponent(btnDeleteProf))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblEmailId, lblPassword, lblProfId, lblProfName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAddProf, btnDeleteProf, btnUpdateProf});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPassword, txtProfEmail, txtProfId, txtProfName, txtProfUserName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtProfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProfUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfUserNameActionPerformed

    private void btnAddProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProfActionPerformed
        // TODO add your handling code here;
    String profId = txtProfId.getText();
    String profName = txtProfName.getText();
    String profEmail = txtProfEmail.getText();
    String profUsername = txtProfUserName.getText();
    String profPassword = txtPassword.getText();
    
    if(tblProf.getRowCount()==0){
        if(profPassword.length() >= 8 && isEmail(profEmail)) {
            Professor prof = professorList.addNewProfessor();
            ProfessorLogin proflogin = professorLoginList.addNewProfessorLogin();

            prof.setProfId(profId);
            prof.setProfName(profName);
            prof.setProfEmail(profEmail);
            proflogin.setProfUsername(profUsername);
            proflogin.setProfPassword(profPassword);
            populateProfTable();

            JOptionPane.showMessageDialog(this, "Professor added");
        } else {
            JOptionPane.showMessageDialog(this, "Password should have at least 8 characters and Email ID should be valid.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }    
    }else{
        if(searchProfessorID(profId)) {
            if(profPassword.length() >= 8 && isEmail(profEmail)) {
                Professor prof = professorList.addNewProfessor();
                ProfessorLogin proflogin = professorLoginList.addNewProfessorLogin();

                prof.setProfId(profId);
                prof.setProfName(profName);
                prof.setProfEmail(profEmail);
                proflogin.setProfUsername(profUsername);
                proflogin.setProfPassword(profPassword);
                populateProfTable();

                JOptionPane.showMessageDialog(this, "Professor added");
            } else {
            JOptionPane.showMessageDialog(this, "Password should have at least 8 characters and Email ID should be valid.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Professor ID must be unique.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
        }}
    }//GEN-LAST:event_btnAddProfActionPerformed

    private void btnUpdateProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProfActionPerformed
        // TODO add your handling code here:
        String profId = txtProfId.getText();
        String profName = txtProfName.getText();
        String profEmail = txtProfEmail.getText();
        String profUsername = txtProfUserName.getText();
        String profPassword = txtPassword.getText();
        DefaultTableModel model= (DefaultTableModel) tblProf.getModel();
        int selectedRowIndex = tblProf.getSelectedRow();
        Professor selectedProfessor = (Professor) model.getValueAt(selectedRowIndex, 0);
        ProfessorLogin selectedProfessorLogin = (ProfessorLogin) model.getValueAt(selectedRowIndex, 1);
        
        selectedProfessor.setProfId(profId);
        selectedProfessor.setProfName(profName);
        selectedProfessor.setProfEmail(profEmail);
        selectedProfessorLogin.setProfUsername(profUsername);
        selectedProfessorLogin.setProfPassword(profPassword);
        populateProfTable();
        JOptionPane.showMessageDialog(this, "Professor updated");

    }//GEN-LAST:event_btnUpdateProfActionPerformed

    private void btnDeleteProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteProfActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblProf.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblProf.getModel();
        Professor selectedProfessor = (Professor) model.getValueAt(selectedRowIndex, 0);
        ProfessorLogin selectedProfessorLogin = (ProfessorLogin) model.getValueAt(selectedRowIndex, 1);
        professorList.deleteProfessor(selectedProfessor);
        JOptionPane.showMessageDialog(this, "Professor deleted.");
        professorLoginList.deleteProfessorLogin(selectedProfessorLogin);
        populateProfTable();  
    }//GEN-LAST:event_btnDeleteProfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProf;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteProf;
    private javax.swing.JButton btnUpdateProf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblProfId;
    private javax.swing.JLabel lblProfName;
    private javax.swing.JLabel lblProfessorCatalog;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JTable tblProf;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtProfEmail;
    private javax.swing.JTextField txtProfId;
    private javax.swing.JTextField txtProfName;
    private javax.swing.JTextField txtProfUserName;
    // End of variables declaration//GEN-END:variables

    private void populateProfTable() {
    DefaultTableModel model = (DefaultTableModel) tblProf.getModel();
    model.setRowCount(0);

    for (int i = 0; i < professorList.getProfessorList().size(); i++){
        Professor p = professorList.getProfessorList().get(i);
        ProfessorLogin pl = professorLoginList.getProfessorLoginList().get(i);
        
        Object[] row = new Object[5];
        row[0] = p; 
        row[1] = pl;
        row[2] = pl.getProfPassword();
        row[3] = p.getProfName();
        row[4] = p.getProfEmail();

        model.addRow(row);
    }
}
    public boolean searchProfessorID(String searchID) {
        for(Professor prof: professorList.getProfessorList())
        {
            if(prof.getProfId().equals(searchID)){
                return false;
            } 
        }
        return true;    
    }
   
    private boolean isEmail(String e){
        String r = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(r); 
        if (e == null) 
            return false; 
        return pat.matcher(e).matches(); 
    }

    public DefaultTableModel getProfCatalogTable(){
        DefaultTableModel model = (DefaultTableModel) tblProf.getModel();
        return model;
    }
}
