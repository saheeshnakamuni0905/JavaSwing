/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;




/**
 *
 * @author kamuni.saheeshna
 */
public class Password {
    
    private String password;
    private String hashPassword; 
 


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }
    
    @Override
    public String toString(){
        return String.valueOf(password);
    }
    
    
}
