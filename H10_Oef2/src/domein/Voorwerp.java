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
public abstract class Voorwerp implements Draagbaar
{
    private final String naam;
    private double gewicht;
    private int niveau;
    
    public Voorwerp(String naam, double gewicht, int niveau)
    {
        this.naam = naam;
        stelGewichtIn(gewicht);
        stelNiveauIn(niveau);
    }    
    
    private void stelGewichtIn(double gewicht)
    {
        if(gewicht > 0 && gewicht < 1000)
            this.gewicht = gewicht;
    }
    
    private void stelNiveauIn(int niveau)
    {
        if(niveau >= 1 && niveau <= 10)
            this.niveau = niveau;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s %s met gewicht %.3f uit niveau %d", getClass().getSimpleName(), naam, gewicht, niveau);
    }
    
    @Override
    public boolean isDraagbaar()
    {
        return true;
    }

    //<editor-fold desc="Getters" defaultstate="collapsed">
    public void setGewicht(double gewicht)
    {        
        stelGewichtIn(gewicht);
    }
    
    public void setNiveau(int niveau)
    {        
        stelNiveauIn(niveau);
    }
    
    public String getNaam()
    {
        return naam;
    }    

    public double getGewicht()
    {
        return gewicht;
    }


    public int getNiveau()
    {
        return niveau;
    }
    // </editor-fold>
    
}


