package magicalsTests;

import magicals.Beast;
import magicals.Spell;
import magicals.Witch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WitchTest {

    Witch witch;
    Beast beast;
    Spell spell;

    @Before
    public void before(){
        spell = new Spell("7 Wonders", 15);
        beast = new Beast("Ogre", 15);
        witch = new Witch("Stevie",100, spell, beast);

    }

    @Test
    public void witchHasName(){
        assertEquals("Stevie", witch.getName());
    }

    @Test
    public void witchHasHealth(){
        assertEquals(100, witch.getHealth());
    }

    @Test
    public void witchHasWeapon(){
        assertEquals("7 Wonders", witch.getSpell().getName());
    }

    @Test public void witchHasBeast(){
        assertEquals("Ogre", witch.getBeast().getName());
    }

    @Test
    public void witchCanBeDamaged(){
        witch.damage(20);
        assertEquals(95, witch.getHealth());
    }
}
