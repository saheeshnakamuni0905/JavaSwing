/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleSelection.Student;

import UserInterface.RoleSelection.Student.FeedbackPanel;
import UserInterface.RoleSelection.Professor.ProfessorDetailsPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Course.Course;
import Business.Course.CourseList;
import Business.Degree.Degree;
import Business.Degree.DegreeList;
import Business.Professor.ProfessorList;
import Business.ProfessorLogin.ProfessorLoginList;
import Business.Student.Student;
import Business.Student.StudentList;
import Business.StudentLogin.StudentLoginList;
import Business.ThirdParty.ThirdPartyList;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;


/**
 *
 * @author kamuni.saheeshna
 */
public class StudentDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentDetailsPanel
     */
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    ThirdPartyList thirdPartyList;
    JPanel userProcessContainer;
    DegreeList degreeList; 
    private int r=0;
    private int creditsComp =0; 
  
    HashMap<String, List<Course>> studentCour;
    
    public StudentDetailsPanel(JPanel userProcessContainer,ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList,  StudentList studentList, StudentLoginList studentLoginList, ThirdPartyList thirdPartyList, HashMap<String, List<Course>> studentCour, DegreeList degreeList) {
        initComponents();
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList = courseList; 
        this.studentList = studentList;
        this.studentLoginList =studentLoginList;
        this.thirdPartyList = thirdPartyList; 
        this.userProcessContainer = userProcessContainer;
        this.studentCour = studentCour;
        this.degreeList = degreeList;
        populateAvailableCourseTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollCoursesTaken1 = new javax.swing.JScrollPane();
        tblCoursesTaken1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        lblStudentDetailsTitle = new javax.swing.JLabel();
        lblStudentId = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblCoursesTaken = new javax.swing.JLabel();
        scrollCoursesTaken = new javax.swing.JScrollPane();
        tblCoursesTaken = new javax.swing.JTable();
        btnRegisterCourse = new javax.swing.JButton();
        btnPayFee = new javax.swing.JButton();
        btnRequestDegree = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAvailC = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        tblCoursesTaken1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course ID ", "Course Name", "Professor Name", "Fee Paid", "Credits"
            }
        ));
        scrollCoursesTaken1.setViewportView(tblCoursesTaken1);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        lblStudentDetailsTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblStudentDetailsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentDetailsTitle.setText("Student Details");

        lblStudentId.setText("Student ID:");

        txtStudentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentIdActionPerformed(evt);
            }
        });

        lblName.setText("Name:");

        lblEmail.setText("Email:");

        lblCoursesTaken.setText("Courses Taken:");

        tblCoursesTaken.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Course ID ", "Course Name", "Professor Name", "Fee Paid", "Credits So Far"
            }
        ));
        scrollCoursesTaken.setViewportView(tblCoursesTaken);

        btnRegisterCourse.setBackground(new java.awt.Color(204, 204, 255));
        btnRegisterCourse.setText("Register Course");
        btnRegisterCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCourseActionPerformed(evt);
            }
        });

        btnPayFee.setBackground(new java.awt.Color(204, 204, 255));
        btnPayFee.setText("Pay Course Fee");
        btnPayFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayFeeActionPerformed(evt);
            }
        });

        btnRequestDegree.setBackground(new java.awt.Color(204, 204, 255));
        btnRequestDegree.setText("Request Degree");
        btnRequestDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestDegreeActionPerformed(evt);
            }
        });

        btnFeedback.setBackground(new java.awt.Color(204, 204, 255));
        btnFeedback.setText("Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        tblAvailC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Professor Name", "Price", "Duration", "Credits"
            }
        ));
        jScrollPane1.setViewportView(tblAvailC);

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setText("Logout");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(scrollCoursesTaken)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(lblName))
                                    .addComponent(lblStudentId, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblEmail)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblCoursesTaken)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(232, 232, 232)
                                .addComponent(btnRequestDegree)
                                .addGap(18, 18, 18)
                                .addComponent(btnPayFee)
                                .addGap(18, 18, 18)
                                .addComponent(btnFeedback))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(369, 369, 369)
                                .addComponent(btnRegisterCourse))
                            .addComponent(btnBack))
                        .addGap(0, 522, Short.MAX_VALUE))
                    .addComponent(lblStudentDetailsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtEmail, txtName, txtStudentId});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStudentDetailsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStudentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnRegisterCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCoursesTaken)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollCoursesTaken, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRequestDegree)
                    .addComponent(btnPayFee)
                    .addComponent(btnFeedback))
                .addGap(212, 212, 212))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1118, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtStudentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentIdActionPerformed

    private void btnPayFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayFeeActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCoursesTaken.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a course.");
            return;
        }
       
        DefaultTableModel model = (DefaultTableModel) tblCoursesTaken.getModel();
        model.setValueAt("Paid", selectedRowIndex, 3);
        Course course = (Course) model.getValueAt(selectedRowIndex, 0);
        course.setFee((String) model.getValueAt(selectedRowIndex, 3));
   
    }//GEN-LAST:event_btnPayFeeActionPerformed

    private void btnRegisterCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourseActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel avail = (DefaultTableModel) tblAvailC.getModel();
        
        int selectedRowIndex = tblAvailC.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a course.");
            return;
        }
        Course selectedAvailableCourse = (Course) avail.getValueAt(selectedRowIndex, 0);
        
        if (!studentCour.containsKey(txtName.getText())) {
        studentCour.put(txtName.getText(), new ArrayList<>());
    }
      
    List<Course> coursesTaken = studentCour.get(txtName.getText());
    coursesTaken.add(selectedAvailableCourse);
    ProfessorDetailsPanel profPanel = new ProfessorDetailsPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList, studentCour, degreeList);
    profPanel.setStudentCourses(studentCour);
    
    
    DefaultTableModel coursesTakenTable = (DefaultTableModel) tblCoursesTaken.getModel();
    
    int cred_taken = Integer.parseInt(selectedAvailableCourse.getCredits());
        creditsComp = creditsComp + cred_taken;
      
        Student s = studentList.searchStudent(txtStudentId.getText());
        s.setCreditsCompleted(String.valueOf(creditsComp));
     
    if(creditsComp>0 && creditsComp<=8)
    {
            coursesTakenTable.setRowCount(r);
            
            Object[] row = new Object[5];
            row[0] = selectedAvailableCourse; 
            row[1] = selectedAvailableCourse.getCourseName();
            row[2] = selectedAvailableCourse.getProfCName();
            row[3] = "To be paid";
            row[4] = String.valueOf(creditsComp);
            coursesTakenTable.addRow(row);
            r++;
            
    JOptionPane.showMessageDialog(this, "Course Registered"); 
    }else {
        JOptionPane.showMessageDialog(this, "More than 8 credits. Cannot register."); 
    }
        
    }//GEN-LAST:event_btnRegisterCourseActionPerformed

    private void btnRequestDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestDegreeActionPerformed
        // TODO add your handling code here:
        int flag =0;
        String degreeName = JOptionPane.showInputDialog("Which degree are you applying for?");
        for(Degree d: degreeList.getDegreeList()){
            if(d.getDegreeName().equals(degreeName) && d.getRequiredCredits().equals(String.valueOf(creditsComp))){
                flag = 1;
                Student s = studentList.searchStudent(txtStudentId.getText());
                s.setStudDegree(degreeName);
                JOptionPane.showMessageDialog(this, "Request is sent to Third Party to approve."); 
            }    
        }
        
//        if(flag == 0)
//            JOptionPane.showMessageDialog(this, "Credits not sufficient");
    }//GEN-LAST:event_btnRequestDegreeActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        // TODO add your handling code here:
        FeedbackPanel feedback = new FeedbackPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList,studentCour, degreeList);
        DefaultTableModel model = feedback.getRateMyProfTable();
        model.setRowCount(0);

    for (int i = 0; i < courseList.getCourseList().size(); i++){
        Course c = courseList.getCourseList().get(i);
        
        Object[] row = new Object[3];
        row[0] = c; 
        row[1] = c.getProfCName();
       
         
        model.addRow(row);
    }
       
        userProcessContainer.add("FeedbackPanel", feedback);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnPayFee;
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JButton btnRequestDegree;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCoursesTaken;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStudentDetailsTitle;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JScrollPane scrollCoursesTaken;
    private javax.swing.JScrollPane scrollCoursesTaken1;
    private javax.swing.JTable tblAvailC;
    private javax.swing.JTable tblCoursesTaken;
    private javax.swing.JTable tblCoursesTaken1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
    
    public void setStudentID(String id){
        txtStudentId.setText(id);
    }
    
    public String getStudID(){
        return txtStudentId.getText();
    }
    
    public void setStudentName(String name){
        txtName.setText(name);
    }
    
    public void setStudentEmail(String email){
        txtEmail.setText(email);
    }
  
    private void populateAvailableCourseTable() {
    //CourseCatalog catalog = new CourseCatalog(professorList, professorLoginList, courseList, studentList, studentLoginList, thirdPartyList);
    
    DefaultTableModel model = (DefaultTableModel) tblAvailC.getModel();
    model.setRowCount(0);

    for (int i = 0; i < courseList.getCourseList().size(); i++){
        Course c = courseList.getCourseList().get(i);
        
        Object[] row = new Object[6];
        row[0] = c; 
        row[1] = c.getCourseName();
        row[2] = c.getProfCName();
        row[3] = c.getCoursePrice();
        row[4] = c.getCourseDuration();
        row[5] = c.getCredits();
        
        model.addRow(row);
    }
   }
    
    public DefaultTableModel getCourseTable(){
        DefaultTableModel model = (DefaultTableModel) tblCoursesTaken.getModel();
        return model;
    }

}

