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
public class LoginCredentialsList {
    
    private ArrayList<LoginCredentials> loginList;
    
    public LoginCredentialsList() {
        this.loginList = new ArrayList<>();
    }

    public ArrayList<LoginCredentials> getLoginList() {
        return loginList;
    }

    public void setLoginList(ArrayList<LoginCredentials> loginList) {
        this.loginList = loginList;
    }
   
    public LoginCredentials addCredentials() {
        LoginCredentials loginCreds = new LoginCredentials();
        loginList.add(loginCreds);
        return loginCreds;
    }
    
    public void deleteCredentials(LoginCredentials login) {
        loginList.remove(login);
    }
    
}
