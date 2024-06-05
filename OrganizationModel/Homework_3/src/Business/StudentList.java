/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author metla
 */
public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> StudentList) {
        this.studentList = StudentList;
    }
   
    public Student addNewStudent(){
        Student newStudent = new Student();
        studentList.add(newStudent);
        return newStudent;
    }
    
    public void deleteStudent(Student student){
        studentList.remove(student);
    }
    
    public ArrayList<Student> searchStudent(String searchKeyword) {
        ArrayList<Student> enSearch = new ArrayList();
        for(Student i: studentList)
        {
            if(i.getStudentName().equals(searchKeyword)){
                enSearch.add(i);
            }
            
        }
        return enSearch;    
    }
}
