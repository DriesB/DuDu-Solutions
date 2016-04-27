package domein;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class VoorwerpRepositoryTest
{

    private DraagbaarRepository verzameling;

    @Before
    public void before()
    {
        verzameling = new DraagbaarRepository();
    }

    @Test
    public void controleerLegeRepo()
    {
        Assert.assertEquals("collectie is leeg\n", verzameling.toonOverzicht());
    }

    @Test
    public void controleerEenWapenInRepo()
    {
        verzameling.voegDraagbaarItemToe(new Wapen("Colt", 1.5, 3, 6, false));
        Assert.assertEquals("Wapen Colt met gewicht 1,500 kg uit niveau 3 en met kracht 6 nog niet gebruikt.\n\n",
                verzameling.toonOverzicht());
    }

    @Test
    public void controleerEenSleutelInRepo()
    {
        verzameling.voegDraagbaarItemToe(new Sleutel("voordeur", 0.5, 3, 1));
        Assert.assertEquals("Sleutel voordeur met gewicht 0,500 kg uit niveau 3 past op deur 1. Er zijn 1 sleutel(s) in omloop.\n\n",
                verzameling.toonOverzicht());
    }

}
