package magicalsTests;

import magicals.Beast;
import magicals.Spell;
import magicals.Wizard;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class WizardTest {


        Wizard wizard;
        Beast beast;
        Spell spell;

        @Before
        public void before(){
            spell = new Spell("FireBall", 10);
            beast = new Beast("Dragon", 20);
            wizard = new Wizard("Norman",100, spell, beast);

        }

        @Test
        public void wizardHasName(){
            assertEquals("Norman", wizard.getName());
        }

        @Test
        public void wizardHasHealth(){
            assertEquals(100, wizard.getHealth());
        }

        @Test
        public void wizardHasWeapon(){
            assertEquals("FireBall", wizard.getSpell().getName());
        }

        @Test public void WizardHasBeast(){
            assertEquals("Dragon", wizard.getBeast().getName());
        }


    }
