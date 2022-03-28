import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterbottle;
    @Before
    public void beforeEach(){
        waterbottle = new WaterBottle();
    }
    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }
    @Test
    public void canDrink() {
        assertEquals(90, waterbottle.drink());
    }
//    @Test
//    public void canDrinkTwice() {
//        waterbottle.drink();
//        waterbottle.drink();
//        assertEquals(80, waterbottle.getVolume());
//    }
    @Test
    public void canEmpty(){
        assertEquals(0, waterbottle.empty());
    }
    @Test
    public void canRefill(){
        assertEquals(100, waterbottle.refill());
    }

}
