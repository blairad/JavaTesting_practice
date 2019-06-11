import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Water_Bottle_Test {

    Water_Bottle water_bottle;

    @Before
    public void before() {water_bottle = new Water_Bottle(100, 10, 0);}

    @Test
    public void hasVolume() {
        assertEquals(100, water_bottle.getVolume());
    }

    @Test
    public void hasDrink() {
        assertEquals(90, water_bottle.getDrink());
    }

    @Test
    public void hasEmptied() {
        assertEquals(true, water_bottle.isEmpty());
    }
    @Test
    public void refillIfEqualToZero(){
        assertEquals(0, water_bottle.refillIfEqualToZero());
    }


}
