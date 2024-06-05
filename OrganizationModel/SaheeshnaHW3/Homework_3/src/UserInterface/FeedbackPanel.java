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
import Business.ProfessorList;
import Business.ProfessorLoginList;
import Business.StudentList;
import Business.StudentLoginList;
import Business.ThirdPartyList;

/**
 *
 * @author kamuni.saheeshna
 */
public class FeedbackPanel extends javax.swing.JPanel {

    /**
     * Creates new form FeedbackPanel
     */
    MainJFrame frame;
    JPanel userProcessContainer;
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    ThirdPartyList thirdPartyList;

    
    public FeedbackPanel(JPanel userProcessContainer, ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList, StudentList studentList, StudentLoginList studentLoginList, ThirdPartyList thirdPartyList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList = courseList;
        this.studentList = studentList;
        this.studentLoginList = studentLoginList;
        this.thirdPartyList =  thirdPartyList;
        
        //populateAvailableCourseTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFeedbackTitle = new javax.swing.JLabel();
        lblText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRateProf = new javax.swing.JTable();
        txtRate = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnRate = new javax.swing.JButton();

        lblFeedbackTitle.setText("Rate My Professor");

        lblText.setText("Rate out of 5");

        tblRateProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course ID", "Professor Name", "Ratings"
            }
        ));
        jScrollPane1.setViewportView(tblRateProf);

        txtRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRateActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRate.setText("Rate");
        btnRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblText))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)
                        .addGap(204, 204, 204)
                        .addComponent(lblFeedbackTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFeedbackTitle)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addComponent(lblText)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRate))
                .addContainerGap(181, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnRateActionPerformed

    private void txtRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel rate = (DefaultTableModel) tblRateProf.getModel();
        int selectedRowIndex = tblRateProf.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a professor");
            return;
        }
        
        try {

    double enteredRating = Double.parseDouble(txtRate.getText());
    
 
    if (enteredRating > 0 && enteredRating <= 5) {
        rate.setValueAt(enteredRating, selectedRowIndex, 2);
    } else {
        JOptionPane.showMessageDialog(this, "Enter a number between 1 and 5");
    }
} catch (NumberFormatException e) {
   
    JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid number.");
}
    }//GEN-LAST:event_txtRateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFeedbackTitle;
    private javax.swing.JLabel lblText;
    private javax.swing.JTable tblRateProf;
    private javax.swing.JTextField txtRate;
    // End of variables declaration//GEN-END:variables
    
//    private void populateAvailableCourseTable() {
//   
//    DefaultTableModel model = (DefaultTableModel) tblRateProf.getModel();
//    model.setRowCount(0);
//
//    for (int i = 0; i < courseList.getCourseList().size(); i++){
//        Course c = courseList.getCourseList().get(i);
//        
//        Object[] row = new Object[3];
//        row[0] = c; 
//        row[1] = c.getProfCName();
//       
//         
//        model.addRow(row);
//    }
//   }
//    
   public DefaultTableModel getRateMyProfTable(){
       DefaultTableModel model = (DefaultTableModel) tblRateProf.getModel();
       return model;
   }
}
