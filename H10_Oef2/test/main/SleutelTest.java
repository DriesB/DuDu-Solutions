package domein;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class SleutelTest
{
    private Sleutel sleutel1, sleutel2, sleutel3;

    @Before
    public void before()
    {
        sleutel1 = new Sleutel("schuur", 1.5, 1, 3);
        sleutel2 = new Sleutel("geheime kamer", 0.9, 5, 10);
        sleutel3 = new Sleutel("tuinberging", 0.4, 7, 22);
    }

    @Test
    public void sleutelsInOmloop()
    {
        System.gc();
        try 
        {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {}
        Assert.assertEquals(3, Sleutel.getAantalInOmloop());
    }

    @Test
    public void geefDeurVanSleutel()
    {
        Assert.assertEquals(3, sleutel1.getDeur());
    }

    @Test (expected = IllegalArgumentException.class)
    public void geefFoutmeldingFouteDeur()
    {
        sleutel2.setDeur(-5);
    }

    @Test
    public void isPassendeSleutel()
    {
        Assert.assertTrue(sleutel1.pastOp(3));
    }
    
    @Test
    public void isNietPassendeSleutel()
    {
        Assert.assertFalse(sleutel1.pastOp(13));
    }

    @Test
    public void wijzigDeurVanSleutel()
    {
        sleutel1.setDeur(15);
        Assert.assertEquals(15, sleutel1.getDeur());
    }
    
    @Test
    public void geefOutputVanSleutel()
    {
        System.gc();
        try 
        {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {}
        Assert.assertEquals(String.format("%s %s",
            "Sleutel tuinberging met gewicht 0,400 kg uit niveau 7 past op deur 22.",
            "Er zijn 3 sleutel(s) in omloop."), sleutel3.toString());
    }
    
    @Test
    public void isSleutelDraagbaar()
    {
        Assert.assertTrue(sleutel1.isDraagbaar());
    }
}


