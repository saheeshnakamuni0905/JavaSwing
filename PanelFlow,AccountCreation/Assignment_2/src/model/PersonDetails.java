/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kamuni.saheeshna
 */
public class PersonDetails {
    
    private int neuID;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;

    public int getNeuID() {
        return neuID;
    }

    public void setNeuID(int neuID) {
        this.neuID = neuID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    } 
    
    @Override
    public String toString(){
        return String.valueOf(neuID);
    }
}
