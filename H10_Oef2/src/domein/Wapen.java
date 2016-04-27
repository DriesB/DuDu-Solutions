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
public class Wapen extends Voorwerp
{    
    private int kracht;
    private boolean gebruikt;
    
    public Wapen(String naam, double gewicht, int niveau, int kracht, boolean gebruikt)
    {
        super(naam, gewicht, niveau);
        stelNiveauIn(niveau);
        stelKrachtIn(kracht);
        stelGebruiktIn(gebruikt);
    }
    
    private void stelKrachtIn(int kracht)
    {
        if(kracht > 0)
            this.kracht = kracht;
    }
    
    private void stelGebruiktIn(boolean gebruikt)
    {
        this.gebruikt = gebruikt;
    }
    
    private void stelNiveauIn(int niveau)
    {
        if(niveau >= 1 && niveau <= 5)
            super.setNiveau(niveau);
    }
    
    @Override
    public String toString()
    {
        String temp = "";
        if(gebruikt)
            temp = "al gebruikt";
        else
            temp = "nog niet gebruikt";
        
        return String.format("%s en met kracht %d %s.%n",
                super.toString(), kracht, temp);
    }
    
    @Override
    public boolean isDraagbaar()
    {
        return true;
    }
    
    //<editor-fold desc="Getters & Setters" defaultstate="collapsed">
    public int getKracht()
    {
        return kracht;
    }
    
    public void setKracht(int kracht)
    {        
        stelKrachtIn(kracht);
    }

    public boolean isGebruikt()
    {
        return gebruikt;
    }

    public void setGebruikt(boolean gebruikt)
    {
        this.gebruikt = gebruikt;
    }    
    // </editor-fold>

    
}


