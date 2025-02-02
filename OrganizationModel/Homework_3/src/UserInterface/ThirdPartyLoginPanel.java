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
import Business.Course.CourseList;
import Business.DegreeList;
import Business.ProfessorList;
import Business.ProfessorLoginList;
import Business.StudentList;
import Business.StudentLoginList;
import Business.ThirdPartyList;

/**
 *
 * @author kamuni.saheeshna
 */
public class ThirdPartyLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThirdPartyLogin
     */
    MainJFrame frame;
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    ThirdPartyList thirdPartyList;
    DegreeList degreeList;
    JPanel userProcessContainer;
    
    public ThirdPartyLoginPanel(JPanel userProcessContainer, ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList, StudentList studentList, StudentLoginList studentLoginList, ThirdPartyList thirdPartyList, DegreeList degreeList) {
        initComponents();
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList = courseList;
        this.studentList = studentList;
        this.studentLoginList = studentLoginList;
        this.thirdPartyList = thirdPartyList;
        this.degreeList = degreeList;
        this.userProcessContainer = userProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDegreeTitle = new javax.swing.JLabel();
        lblDegreeUsername = new javax.swing.JLabel();
        lblDegreePassword = new javax.swing.JLabel();
        txtDegreeUsername = new javax.swing.JTextField();
        txtDegreePassword = new javax.swing.JPasswordField();
        btnLoginDegree = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        lblDegreeTitle.setText("Degree Approval Portal");

        lblDegreeUsername.setText("Username:");

        lblDegreePassword.setText("Password:");

        btnLoginDegree.setText("Login");
        btnLoginDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginDegreeActionPerformed(evt);
            }
        });

        jButton1.setText("<<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(155, 155, 155)
                        .addComponent(lblDegreeTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDegreePassword)
                            .addComponent(lblDegreeUsername))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLoginDegree)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDegreeUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addComponent(txtDegreePassword)))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDegreeTitle)
                    .addComponent(jButton1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDegreeUsername)
                    .addComponent(txtDegreeUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDegreePassword)
                    .addComponent(txtDegreePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnLoginDegree)
                .addContainerGap(158, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginDegreeActionPerformed
        // TODO add your handling code here:
        String Username = txtDegreeUsername.getText();
        char[] PasswordChar = txtDegreePassword.getPassword();
        String Password = new String(PasswordChar);

        if (Username.equals("auth") && Password.equals("auth")) {
            ThirdPartyApprovalPanel approval = new ThirdPartyApprovalPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList, degreeList);
             userProcessContainer.add("ThirdPartyApprovalPanel",approval);
             CardLayout layout = (CardLayout) userProcessContainer.getLayout();
             layout.next(userProcessContainer);
        } 
        else {
            JOptionPane.showMessageDialog(this,"Wrong Credentials");
        }
    }//GEN-LAST:event_btnLoginDegreeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginDegree;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblDegreePassword;
    private javax.swing.JLabel lblDegreeTitle;
    private javax.swing.JLabel lblDegreeUsername;
    private javax.swing.JPasswordField txtDegreePassword;
    private javax.swing.JTextField txtDegreeUsername;
    // End of variables declaration//GEN-END:variables
}
