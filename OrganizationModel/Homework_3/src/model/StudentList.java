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
public class StudentList {
    private ArrayList<Student> StudentList;

    public StudentList(ArrayList<Student> StudentList) {
        this.StudentList = StudentList;
    }
    

    
    public StudentList() {
        this.StudentList = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(ArrayList<Student> StudentList) {
        this.StudentList = StudentList;
    }

   
    public Student addNewStudent(){
        Student newStudent = new Student();
        StudentList.add(newStudent);
        return newStudent;
    }
    public void deleteStudent(Student student){
        StudentList.remove(student);
    }
    public ArrayList<Student> SearchStudent(String searchKeyword) {
        ArrayList<Student> enSearch = new ArrayList();
        for(Student i: StudentList)
        {
            if(i.getStudentName().equals(searchKeyword)){
                enSearch.add(i);
            }
            
        }
        return enSearch;    
    }

    
}
