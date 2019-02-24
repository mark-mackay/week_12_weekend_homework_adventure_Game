import healers.Cleric;
import magicals.Beast;
import magicals.Wizard;
import magicals.Spell;
import org.junit.Before;
import org.junit.Test;
import rooms.DojoRoom;
import rooms.TreasureRoom;
import soldiers.Armour;
import soldiers.Barbarian;
import soldiers.Weapon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {
    Game game;
    DojoRoom dojoRoom;
    TreasureRoom treasureRoom;

    Cleric cleric;
    Wizard wizard;
    Barbarian barbarian;
    Beast beast;
    Spell spell;
    Weapon sword;
    Armour chainMail;

   @Before
   public void before(){
       game = new Game("Gamey McGameFace");
       spell = new Spell("fart", 10);
       beast = new Beast("ogre", 20);
       barbarian = new Barbarian("Bob", 100, sword, chainMail );
       sword = new Weapon("Sword", 25);
       chainMail = new Armour("ChainMail", 10);
       wizard = new Wizard("Merlin", 100, spell, beast);
       treasureRoom = new TreasureRoom("Oodles of Cash", "Treasure", 500);
       dojoRoom = new DojoRoom("Oodles of Smash", "Fighting", 200);
       cleric = new Cleric("Gav", 25);

       game.addRoom(dojoRoom);
       game.addCharacter(barbarian);
       game.addCharacter(wizard);
       game.addCharacter(cleric);


   }

   @Test
    public void gameHasARoom(){
       assertEquals(1, game.getRooms().size());
   }
    @Test
    public void gameHasACharacter(){
        assertEquals(3, game.getCharacters().size());
    }




}
