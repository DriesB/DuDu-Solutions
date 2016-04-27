/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author user
 */
public class DomeinController
{
    private DraagbaarRepository voorwerpRepo;
    
    public DomeinController()
    {
        voorwerpRepo = new DraagbaarRepository();
    }
    
    public void voegSleutelToe(String naam, double gewicht, int niveau, int deur)
    {
        Sleutel item = new Sleutel(naam, gewicht, niveau, deur);
        voorwerpRepo.voegDraagbaarItemToe(item);
    }
    
    public void voegWapenToe(String naam, double gewicht, int niveau, int kracht, boolean gebruikt)
    {
        Wapen item = new Wapen(naam, gewicht, niveau, kracht, gebruikt);
        voorwerpRepo.voegDraagbaarItemToe(item);
    }
    
    public void voegGebouwToe(String naam, double hoogte)
    {
        Gebouw item = new Gebouw(naam, hoogte);
        voorwerpRepo.voegDraagbaarItemToe(item);
    }
    
    public String toonOverzicht()
    {
        return voorwerpRepo.toonOverzicht();
    }
        
}
