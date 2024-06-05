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
public class CourseList {
    private ArrayList<Course> CourseList;

    public CourseList(ArrayList<Course> CourseList) {
        this.CourseList = CourseList;
    }

    public CourseList() {
        this.CourseList = new ArrayList<Course>();
    }

    public ArrayList<Course> getCourseList() {
        return CourseList;
    }

    public void setCourseList(ArrayList<Course> CourseList) {
        this.CourseList = CourseList;
    }
    
    
    public Course addNewCourse(){
        Course newCourse = new Course();
        CourseList.add(newCourse);
        return newCourse;
    }
    public void deleteCourse(Course course){
        CourseList.remove(course);
    }
    public ArrayList<Course> SearchCourse(String searchKeyword) {
        ArrayList<Course> enSearch = new ArrayList();
        for(Course i: CourseList)
        {
            if(i.getCourseName().equals(searchKeyword)){
                enSearch.add(i);
            }
            
        }
        return enSearch;    
    }

   
    
}
