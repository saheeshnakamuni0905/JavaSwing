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
public class DegreeList {
    private ArrayList<Degree> DegreeList;

    public DegreeList() {
        this.DegreeList = new ArrayList<Degree>();
    }
     public ArrayList<Degree> getDegreeList() {
        return DegreeList;
    }

    public void setDegreeList(ArrayList<Degree> DegreeList) {
        this.DegreeList = DegreeList;
    }
    

    
    
    
    public Degree addNewDegree(){
        Degree newDegree = new Degree();
        DegreeList.add(newDegree);
        return newDegree;
    }
    public void deleteDegree(Degree degree){
        DegreeList.remove(degree);
    }
    public ArrayList<Degree> SearchDegree(String searchKeyword) {
        ArrayList<Degree> enSearch = new ArrayList();
        for(Degree i: DegreeList)
        {
            if(i.getDegreeName().equals(searchKeyword)){
                enSearch.add(i);
            }
            
        }
        return enSearch;    
    }

    

   
    
}
