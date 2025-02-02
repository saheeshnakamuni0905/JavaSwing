/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import Business.Course.Course;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Course.CourseList;
import Business.ProfessorList;
import Business.ProfessorLoginList;
import Business.Student;
import Business.StudentList;
import Business.StudentLogin;
import Business.StudentLoginList;
import Business.ThirdPartyList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author kamuni.saheeshna
 */
public class StudentLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentLoginPanel
     */
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    MainJFrame frame;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    ThirdPartyList thirdPartyList;
    JPanel userProcessContainer;
    HashMap<String, List<Course>> studentCour;
    int rowCount = 0;
    
    public StudentLoginPanel(JPanel userProcessContainer, ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList,  StudentList studentList, StudentLoginList studentLoginList, ThirdPartyList thirdPartyList, HashMap<String, List<Course>> studentCour) {
        initComponents();
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList = courseList;
        this.studentList =studentList;
        this.studentLoginList = studentLoginList;
        this.thirdPartyList = thirdPartyList;
        this.userProcessContainer = userProcessContainer;
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

        jLabel1 = new javax.swing.JLabel();
        lblStudentLoginTitle = new javax.swing.JLabel();
        lblStudentUsername = new javax.swing.JLabel();
        lblStudentPassword = new javax.swing.JLabel();
        txtStudentUsername = new javax.swing.JTextField();
        btnStudentLogin = new javax.swing.JButton();
        txtStudentPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        lblStudentLoginTitle.setText("Student Login");

        lblStudentUsername.setText("Username:");

        lblStudentPassword.setText("Password");

        btnStudentLogin.setText(" Login");
        btnStudentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentLoginActionPerformed(evt);
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
                            .addComponent(lblStudentPassword)
                            .addComponent(lblStudentUsername)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnBack)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblStudentLoginTitle)
                    .addComponent(btnStudentLogin)
                    .addComponent(txtStudentUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(txtStudentPassword))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentLoginTitle)
                    .addComponent(btnBack))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStudentUsername)
                    .addComponent(txtStudentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentPassword)
                    .addComponent(txtStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnStudentLogin)
                .addContainerGap(239, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentLoginActionPerformed
        // TODO add your handling code here:
        StudentCatalogPanel studCatalog = new StudentCatalogPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList);
        DefaultTableModel studModel = studCatalog.getStudentTable();
        
        String enteredUsername = txtStudentUsername.getText();
        char[] enteredPasswordChar = txtStudentPassword.getPassword();
        String enteredPassword = new String(enteredPasswordChar);
        
        if(studModel.getRowCount()==0)
            JOptionPane.showMessageDialog(this, "No student Registered");
        
        for(int i=0;i < studModel.getRowCount(); i++){
            StudentLogin loginStud = (StudentLogin) studModel.getValueAt(i, 1);
            String username = loginStud.getStudentUsername();
            String password = loginStud.getStudentPassword();
            
            if(enteredUsername.equals(username) && enteredPassword.equals(password)){
              StudentDetailsPanel detailsPanel = new StudentDetailsPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList, studentCour);
              Student stud = (Student) studModel.getValueAt(i, 0);
              
              detailsPanel.setStudentID(stud.getStudentID());
              detailsPanel.setStudentName(stud.getStudentName());
              detailsPanel.setStudentEmail(stud.getStudentEmail());
                userProcessContainer.add("StudentDetailsPanel", detailsPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

                break;  
            } else if(enteredUsername.equals(username) && (!enteredPassword.equals(password) )) {
                JOptionPane.showMessageDialog(this, "Wrong Password");
                break;
            }   
        }
    }//GEN-LAST:event_btnStudentLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStudentLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblStudentLoginTitle;
    private javax.swing.JLabel lblStudentPassword;
    private javax.swing.JLabel lblStudentUsername;
    private javax.swing.JPasswordField txtStudentPassword;
    private javax.swing.JTextField txtStudentUsername;
    // End of variables declaration//GEN-END:variables
}
