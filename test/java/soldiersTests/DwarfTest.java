package soldiersTests;

import org.junit.Before;
import org.junit.Test;
import soldiers.Armour;
import soldiers.Dwarf;
import soldiers.Weapon;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Weapon club;
    Armour leather;

    @Before
    public void before(){
        club = new Weapon("Club", 5);
        leather = new Armour("Leather", 3);
        dwarf = new Dwarf("Gimili", 100, club, leather);

    }

    @Test
    public void dwarfHasName(){
        assertEquals("Gimili", dwarf.getName());
    }

    @Test
    public void dwarfHasHealth(){
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void dwarfHasWeapon(){
        assertEquals("Club", dwarf.getWeapon().getType());
    }

    @Test public void dwarfHasArmour(){
        assertEquals("Leather", dwarf.getArmour().getType());
    }


}
