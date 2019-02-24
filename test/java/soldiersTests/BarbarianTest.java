package soldiersTests;


import org.junit.Before;
import org.junit.Test;
import soldiers.Armour;
import soldiers.Barbarian;
import soldiers.Weapon;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Weapon sword;
    Armour chainMail;

    @Before
    public void before(){
        sword = new Weapon("Sword", 15);
        chainMail = new Armour("chainMail", 10);
        barbarian = new Barbarian("Bob", 100, sword, chainMail);

    }

    @Test
    public void babarianHasName(){
        assertEquals("Bob", barbarian.getName());
    }

    @Test
    public void barbarianHasHealth(){
        assertEquals(100, barbarian.getHealth());
    }

    @Test
    public void barbarianHasWeapon(){
        assertEquals("Sword", barbarian.getWeapon().getType());
    }

    @Test public void barbarianHasArmour(){
        assertEquals("chainMail", barbarian.getArmour().getType());
    }

    @Test
    public void barbarianCanRecieveDamage(){
        barbarian.damage(15);
        assertEquals(95, barbarian.getHealth());
    }

    @Test
    public void babarianCanBeHealed(){
        barbarian.damage(15);
        barbarian.heal(5);
        assertEquals(100, barbarian.getHealth());
    }





}