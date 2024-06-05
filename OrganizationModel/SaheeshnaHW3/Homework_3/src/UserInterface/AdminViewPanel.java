/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface;

import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Course.CourseList;
import Business.ProfessorList;
import Business.ProfessorLoginList;
import Business.StudentList;
import Business.StudentLoginList;
import Business.ThirdPartyList;

/**
 *
 * @author metla
 */
public class AdminViewPanel extends javax.swing.JPanel {
    /**
     * Creates new form AdminViewPanel
     */
    MainJFrame frame;
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    ThirdPartyList thirdPartyList;
    JPanel userProcessContainer;
    
    public AdminViewPanel(JPanel userProcessContainer, ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList, StudentList studentList, StudentLoginList studentLoginList, ThirdPartyList thirdPartyList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList =  courseList;
        this.studentList = studentList;
        this.studentLoginList = studentLoginList;
        this.thirdPartyList = thirdPartyList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminView = new javax.swing.JLabel();
        lblChoose = new javax.swing.JLabel();
        btnProfessorCatalog = new javax.swing.JButton();
        btnCourseCatalog = new javax.swing.JButton();
        btnStudentCatalog = new javax.swing.JButton();
        btnThird = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblAdminView.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAdminView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminView.setText("ADMIN VIEW");

        lblChoose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblChoose.setText("Choose one of the controls below:");

        btnProfessorCatalog.setText("Professor Catalog");
        btnProfessorCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorCatalogActionPerformed(evt);
            }
        });

        btnCourseCatalog.setText("Course Catalog");
        btnCourseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseCatalogActionPerformed(evt);
            }
        });

        btnStudentCatalog.setText("Student Catalog");
        btnStudentCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentCatalogActionPerformed(evt);
            }
        });

        btnThird.setText("3rd Party Certification");
        btnThird.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThirdActionPerformed(evt);
            }
        });

        btnBack.setText("Admin Logout");
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
                        .addGap(48, 48, 48)
                        .addComponent(lblChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblAdminView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCourseCatalog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnThird))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnProfessorCatalog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnStudentCatalog)
                                .addGap(8, 8, 8)))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCourseCatalog, btnProfessorCatalog, btnStudentCatalog, btnThird});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdminView)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(lblChoose)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfessorCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentCatalog))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCourseCatalog)
                    .addComponent(btnThird))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCourseCatalog, btnProfessorCatalog, btnStudentCatalog, btnThird});

    }// </editor-fold>//GEN-END:initComponents

    private void btnProfessorCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorCatalogActionPerformed
        // TODO add your handling code here:
        ProfessorCatalogPanel professorcatalog = new ProfessorCatalogPanel(userProcessContainer,professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList);          
        userProcessContainer.add("ProfessorCatalog", professorcatalog);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
  
    }//GEN-LAST:event_btnProfessorCatalogActionPerformed

    private void btnStudentCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentCatalogActionPerformed
        // TODO add your handling code here:
        StudentCatalogPanel studentcatalog = new StudentCatalogPanel(userProcessContainer, professorList, professorLoginList,courseList, studentList, studentLoginList, thirdPartyList);          
        userProcessContainer.add("StudentCatalog", studentcatalog);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnStudentCatalogActionPerformed

    private void btnCourseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseCatalogActionPerformed
        // TODO add your handling code here:
        CourseCatalogPanel coursecatalog = new CourseCatalogPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList);          
        userProcessContainer.add("CourseCatalog", coursecatalog);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  
    }//GEN-LAST:event_btnCourseCatalogActionPerformed

    private void btnThirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThirdActionPerformed
        // TODO add your handling code here:
        ThirdPartyCatalogPanel certification = new ThirdPartyCatalogPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList);               
        userProcessContainer.add("ThirdPartyCatalog", certification);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnThirdActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCourseCatalog;
    private javax.swing.JButton btnProfessorCatalog;
    private javax.swing.JButton btnStudentCatalog;
    private javax.swing.JButton btnThird;
    private javax.swing.JLabel lblAdminView;
    private javax.swing.JLabel lblChoose;
    // End of variables declaration//GEN-END:variables
}
