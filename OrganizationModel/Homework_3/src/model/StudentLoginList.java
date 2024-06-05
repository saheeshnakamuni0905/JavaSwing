/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author metla
 */
public class StudentLoginList {
    private ArrayList<StudentLogin> StudentLoginList;
     public StudentLoginList() {
        this.StudentLoginList = new ArrayList<StudentLogin>();
    }

    public ArrayList<StudentLogin> getStudentLoginList() {
        return StudentLoginList;
    }

    public void setStudentLoginList(ArrayList<StudentLogin> StudentLoginList) {
        this.StudentLoginList = StudentLoginList;
    }

    

    
    public StudentLogin addNewStudentLogin(){
        StudentLogin newStudentLogin = new StudentLogin();
        StudentLoginList.add(newStudentLogin);
        return newStudentLogin;
    }
    public void deleteStudentLogin(StudentLogin studentLogin){
        StudentLoginList.remove(studentLogin);
    }
    public ArrayList<StudentLogin> SearchStudentLogin(String searchKeyword) {
        ArrayList<StudentLogin> enSearch = new ArrayList();
        for(StudentLogin i: StudentLoginList)
        {
            if(i.getStudentUsername().equals(searchKeyword)){
                enSearch.add(i);
            }
            
        }
        return enSearch;    
    }
    
}
