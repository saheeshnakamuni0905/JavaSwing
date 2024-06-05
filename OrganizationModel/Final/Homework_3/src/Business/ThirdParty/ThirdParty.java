/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ThirdParty;

/**
 *
 * @author kamuni.saheeshna
 */
public class ThirdParty {
    
    private String authorityName;

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }
    
    @Override
    public String toString(){
        return authorityName;
    }
    
}
