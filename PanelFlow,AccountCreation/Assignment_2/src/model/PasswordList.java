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
public class PasswordList {
    
    private ArrayList<Password> passwordList;
    
    public PasswordList() {
        this.passwordList = new ArrayList<>();
    }

    public ArrayList<Password> getPasswordList() {
        return passwordList;
    }

    public void setPasswordList(ArrayList<Password> passwordList) {
        this.passwordList = passwordList;
    }
        
    public void addPassword(Password hash){
            passwordList.add(hash);
    }
    
    public Password newPasswordList(){
        Password password = new Password();
        passwordList.add(password);
        return password;
    }
}
