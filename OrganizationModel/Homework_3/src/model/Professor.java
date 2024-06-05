/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author metla
 */
public class Professor {
    private String profId;
    private String profName;
    private String profEmail;

    public String getProfId() {
        return profId;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfEmail() {
        return profEmail;
    }

    public void setProfEmail(String profEmail) {
        this.profEmail = profEmail;
    }
    @Override
    public String toString(){
        return profId;
    }

    
}
