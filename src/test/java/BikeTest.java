import db.DBHelper;
import models.Bike;
import models.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BikeTest {

//    private Shop shop;
    private Bike bike;

    @Before
    public void setUp() {
//        shop = new Shop("Jurassic Motorcycles", 0);
        bike = new Bike("Yamaha R1", 2995.99, 1, "blue", 1000, false);
        DBHelper.save(bike);
    }

    @Test
    public void testCanSaveBike() {
        assertEquals(1, DBHelper.getAll(Bike.class).size());
    }
}
