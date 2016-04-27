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

public class Sleutel extends Voorwerp
{
    private int deur;
    private static int aantalInOmloop = 0;
    
    public Sleutel(String naam, double gewicht, int niveau, int deur)
    {
        super(naam, gewicht, niveau);
        stelDeurIn(deur);
        ++aantalInOmloop;
    }

    private void stelDeurIn(int deur)
    {
        this.deur = deur;
    }
    
    public boolean pastOp(int deur)
    {
        return this.deur == deur;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s past op deur %d.%nEr zijn %d sleutel(s) in omloop.%n",
                super.toString(), deur, aantalInOmloop);
    }
    
    @Override
    protected void finalize()
    {        
        --aantalInOmloop;
    }
    
    public boolean isDraagbaar()
    {
        return true;
    }
    
    //<editor-fold desc="Getters & Setters" defaultstate="collapsed">
    public int getDeur()
    {
        return deur;
    }
    
    public void setDeur(int deur)
    {
        if(deur > 0)
            stelDeurIn(deur);
    }

    public static int getAantalInOmloop()
    {
        return aantalInOmloop;
    }
    // </editor-fold>
    
    
}

