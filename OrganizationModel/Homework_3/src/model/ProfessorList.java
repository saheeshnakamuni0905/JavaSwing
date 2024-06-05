/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author metla
 */
public class ProfessorList {

   
    private ArrayList<Professor> ProfessorList;
    
     public ProfessorList() {
        this.ProfessorList = new ArrayList<Professor>();
    }

    public ArrayList<Professor> getProfessorList() {
        return ProfessorList;
    }

    public void setProfessorList(ArrayList<Professor> ProfessorList) {
        this.ProfessorList = ProfessorList;
    }

    public Professor addNewProfessor(){
        Professor newProfessor = new Professor();
        ProfessorList.add(newProfessor);
        return newProfessor;
    }
    public void deleteProfessor(Professor newProfessor){
        ProfessorList.remove(newProfessor);
    }
    public ArrayList<Professor> SearchProfessor(String searchKeyword) {
        ArrayList<Professor> enSearch = new ArrayList();
        for(Professor i: ProfessorList)
        {
            if(i.getProfName().equals(searchKeyword)){
                enSearch.add(i);
            }
            
        }
        return enSearch;    
    }
}
