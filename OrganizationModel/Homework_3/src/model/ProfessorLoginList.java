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
public class ProfessorLoginList {
    private ArrayList<ProfessorLogin> ProfessorLoginList;

    public ProfessorLoginList() {
        this.ProfessorLoginList = new ArrayList<ProfessorLogin>();
    }

 

    public ArrayList<ProfessorLogin> getProfessorLoginList() {
        return ProfessorLoginList;
    }

    public void setProfessorLoginList(ArrayList<ProfessorLogin> ProfessorLoginList) {
        this.ProfessorLoginList = ProfessorLoginList;
    }
    
    public ProfessorLogin addNewProfessorLogin(){
        ProfessorLogin newProfessorLogin = new ProfessorLogin();
        ProfessorLoginList.add(newProfessorLogin);
        return newProfessorLogin;
    }
    
    public void deleteProfessorLogin(ProfessorLogin professorLogin){
        ProfessorLoginList.remove(professorLogin);
    }
    
//    public ArrayList<Professor> SearchProfessor(String searchKeyword) {
//        ArrayList<Professor> enSearch = new ArrayList();
//        for(ProfessorLogin i: ProfessorLoginList)
//        {
//            if(i.getProfUsername().equals(searchKeyword)){
//                enSearch.add(i);
//            }
//            
//        }
//        return enSearch;    
//    }
    
}
