/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DraagbaarRepository
{
    private ArrayList<Draagbaar> voorwerpRepo;
    
    public DraagbaarRepository()
            {
                voorwerpRepo = new ArrayList<>();
            }
    
    public void voegDraagbaarItemToe(Draagbaar voorwerp)
    {        
        voorwerpRepo.add(voorwerp);
    }
    
    public String toonOverzicht()
    {
        if(voorwerpRepo.isEmpty())
        {
            return String.format("collectie is leeg");
        }
        else            
        {
            String uitvoer = "";
           for(Draagbaar vw: voorwerpRepo)
           {
               uitvoer += vw.toString();
           }
           return uitvoer;
        }        
    }
}
