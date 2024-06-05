/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author metla
 */
public class Degree {
    private String degreeName;
    private String requiredCredits;
    private String requiredGPA;

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getRequiredCredits() {
        return requiredCredits;
    }

    public void setRequiredCredits(String requiredCredits) {
        this.requiredCredits = requiredCredits;
    }

    public String getRequiredGPA() {
        return requiredGPA;
    }

    public void setRequiredGPA(String requiredGPA) {
        this.requiredGPA = requiredGPA;
    }
    @Override
    public String toString(){
        return degreeName;
    }
}
