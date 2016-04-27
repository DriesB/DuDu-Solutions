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
public class Gebouw implements Draagbaar
{
    private String naam;
    private double hoogte;
    
    public Gebouw(String naam, double hoogte)
    {
        this.naam = naam;
        setHoogte(hoogte);
    }
    
    @Override
    public boolean isDraagbaar()
    {
        return false;
    }
    
    private void stelHoogteIn(double hoogte)
    {
        if (hoogte <= 3)
            throw new IllegalArgumentException("De hoogte moet minimum 3 zijn");
        else
            this.hoogte = hoogte;
    }
    
    @Override
    public String toString()
    {
        return (String.format("Residentie %s met hoogte %.1f is %s", naam, hoogte, (isDraagbaar() ? "draagbaar" : "niet draagbaar")));
    }
    
    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    public String getNaam()
    {
        return naam;
    }

    public void setNaam(String naam)
    {
        this.naam = naam;
    }

    public double getHoogte()
    {
        return hoogte;
    }

    public void setHoogte(double hoogte)
    {
        stelHoogteIn(hoogte);
    }
    //</editor-fold>
       
}
