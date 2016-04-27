/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domein.DomeinController;

/**
 *
 * @author user
 */
public class H10Oef1
{
    public H10Oef1()
    {
    
    }
    
    public void start()
    {        
        DomeinController dc = new DomeinController();
        dc.voegSleutelToe("heyo", 10, 2, 30);
        dc.voegSleutelToe("nee", 15, 1, 10);
        dc.voegWapenToe("Colt", 1.5, 3, 6, true);
        dc.voegWapenToe("Glock", 2, 5, 9, false);
        dc.voegGebouwToe("Hogent", 10.5);
        dc.voegGebouwToe("Astrid", 20);
        System.out.println(dc.toonOverzicht());
    }
}
