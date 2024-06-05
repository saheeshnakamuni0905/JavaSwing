/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ThirdParty;

import Business.ThirdParty.ThirdParty;
import java.util.ArrayList;

/**
 *
 * @author kamuni.saheeshna
 */
public class ThirdPartyList {
    
    private ArrayList<ThirdParty> thirdParty;

    public ThirdPartyList() {
        this.thirdParty = new ArrayList<>();
    }

    public ArrayList<ThirdParty> getThirdPartyList() {
        return thirdParty;
    }

    public void setThirdPartyList(ArrayList<ThirdParty> thirdParty) {
        this.thirdParty = thirdParty;
    }
    
    public ThirdParty addThirdParty(){
        ThirdParty tp = new ThirdParty();
        thirdParty.add(tp);
        return tp;
    }
    
    public void deleteThirdParty(ThirdParty tp){
        thirdParty.remove(tp);
    }
    
    
    
    
    
}
