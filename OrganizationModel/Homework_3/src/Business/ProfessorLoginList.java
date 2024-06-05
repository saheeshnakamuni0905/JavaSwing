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
public class ProfessorLoginList {
    private ArrayList<ProfessorLogin> ProfessorLoginList;

    public ProfessorLoginList() {
        this.ProfessorLoginList = new ArrayList<>();
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
}
