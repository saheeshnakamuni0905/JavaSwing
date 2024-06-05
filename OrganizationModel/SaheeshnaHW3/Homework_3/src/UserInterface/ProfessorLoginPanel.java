/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import Business.Course.Course;
import Business.Course.CourseList;
import Business.Professor;
import Business.ProfessorList;
import Business.ProfessorLogin;
import Business.ProfessorLoginList;
import Business.StudentList;
import Business.StudentLoginList;
import Business.ThirdPartyList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kamuni.saheeshna
 */
public class ProfessorLoginPanel extends javax.swing.JPanel {

/**
     * Creates new form ProfessorLoginPanel
     */
   
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    JPanel userProcessContainer;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    ThirdPartyList thirdPartyList;
    
    HashMap<String, List<Course>> studentCour;
    public ProfessorLoginPanel(JPanel userProcessContainer, ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList,  StudentList studentList, StudentLoginList studentLoginList,ThirdPartyList thirdPartyList, HashMap<String, List<Course>> studentCour ) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList = courseList;
        this.studentList =studentList;
        this.studentLoginList = studentLoginList;
        this.thirdPartyList = thirdPartyList;
        this.studentCour = studentCour;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProfLoginTitle = new javax.swing.JLabel();
        lblProfUsername = new javax.swing.JLabel();
        lblProfPassword = new javax.swing.JLabel();
        txtProfUsername = new javax.swing.JTextField();
        btnProfLogin = new javax.swing.JButton();
        txtProfPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();

        lblProfLoginTitle.setText("Professor Login");

        lblProfUsername.setText("Username:");

        lblProfPassword.setText("Password");

        btnProfLogin.setText(" Login");
        btnProfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfLoginActionPerformed(evt);
            }
        });

        btnBack.setText("<<Back");
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
                        .addGap(182, 182, 182)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProfPassword)
                            .addComponent(lblProfUsername)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblProfLoginTitle)
                    .addComponent(btnProfLogin)
                    .addComponent(txtProfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(txtProfPassword))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfLoginTitle)
                    .addComponent(btnBack))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProfUsername)
                    .addComponent(txtProfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfPassword)
                    .addComponent(txtProfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnProfLogin)
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfLoginActionPerformed
        // TODO add your handling code here:
        int rowCount = 0;
        ProfessorCatalogPanel profCatalog = new ProfessorCatalogPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList,studentLoginList, thirdPartyList);
        DefaultTableModel profModel = profCatalog.getProfCatalogTable();
        CourseCatalogPanel courseCatalog = new CourseCatalogPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList);
        DefaultTableModel courseModel = courseCatalog.getCourseCatalogTable();
        
        String enteredUsername = txtProfUsername.getText();
        char[] enteredPasswordChar = txtProfPassword.getPassword();
        String enteredPassword = new String(enteredPasswordChar);
 
        if(profModel.getRowCount()==0)
            JOptionPane.showMessageDialog(this, "No Professor Registered.");
        
        for(int i =0; i < profModel.getRowCount(); i++){
            ProfessorLogin login = (ProfessorLogin) profModel.getValueAt(i, 1);
            String username = login.getProfUsername();
            String password = login.getProfPassword();
          
            if(enteredUsername.equals(username) && (enteredPassword.equals(password))){
                ProfessorDetailsPanel detailsPanel = new ProfessorDetailsPanel(userProcessContainer,professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList, studentCour);
                Professor prof = (Professor) profModel.getValueAt(i, 0);
            
                DefaultTableModel detailsTable = detailsPanel.getProfDetailsTable();
                
                detailsPanel.setProfID(prof.getProfId());
                detailsPanel.setProfName(prof.getProfName());
                detailsPanel.setProfEmail(prof.getProfEmail());
                
                for (int j = 0; j < courseModel.getRowCount(); j++) {
                    Course course = (Course) courseModel.getValueAt(j, 0);
                    if (course.getProfCName().equals(prof.getProfName())) {
                        detailsTable.setRowCount(rowCount);
                        Object[] rowAdd = new Object[6];
                        rowAdd[0] = course; 
                        rowAdd[1] = course.getCourseName();
                        rowAdd[2] = course.getCoursePrice();
                        rowAdd[3] = course.getCourseDuration();
                        rowAdd[4] = course.getCredits();
                        rowAdd[5] = course.getProfCName();   
                        detailsTable.addRow(rowAdd);
                        rowCount++;
                    }
                }
                    
                    userProcessContainer.add("ProfessorDetailsPanel",detailsPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                break;
            }
            else if(enteredUsername.equals(username) && (!enteredPassword.equals(password) )) {
                JOptionPane.showMessageDialog(this, "Wrong Password");
                break;
            }
        }
    }//GEN-LAST:event_btnProfLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProfLogin;
    private javax.swing.JLabel lblProfLoginTitle;
    private javax.swing.JLabel lblProfPassword;
    private javax.swing.JLabel lblProfUsername;
    private javax.swing.JPasswordField txtProfPassword;
    private javax.swing.JTextField txtProfUsername;
    // End of variables declaration//GEN-END:variables
    
}
