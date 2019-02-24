package healersTests;
import healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    Cleric cleric;

    @Before
    public void before(){
        cleric = new Cleric("Homer", 125);
    }
    @Test
    public void clericHasName(){
        assertEquals("Homer", cleric.getName());
    }
    @Test
    public void clericHasHealingPower(){
        assertEquals(125, cleric.getHealingPower());
    }

}
