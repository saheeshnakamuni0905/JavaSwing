/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kamuni.saheeshna
 */
public class PersonDetailsList {
    
    private ArrayList<PersonDetails> personList;

    public PersonDetailsList() {
        this.personList = new ArrayList<>();
    }

    public ArrayList<PersonDetails> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<PersonDetails> personList) {
        this.personList = personList;
    }
    
    public PersonDetails addNewPerson(){
        PersonDetails newPerson = new PersonDetails();
        personList.add(newPerson);
        return newPerson;
    }
    
    public void deletePerson(PersonDetails person) {
        personList.remove(person);
    }
    
}
