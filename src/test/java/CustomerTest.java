import db.DBHelper;
import models.Basket;
import models.Customer;
import models.Shop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Basket basket;

    @Before
    public void setUp() throws Exception {

        basket = new Basket();
        DBHelper.save(basket);
        customer = new Customer("First", "Customer", "M", 49, "me@me.com", "wibble");
        DBHelper.save(customer);
    }

//    @After
//    public void tearDown() throws Exception {
//        DBHelper.deleteAll(Customer.class);
//    }

    @Test
    public void testCanAddCustomer() {
//        DBHelper.save(customer);
        assertEquals(1, DBHelper.getAll(Customer.class).size());
    }

//    @Test
//    public void testCanFindSpecificCustomer() {
////        Customer customer1 = new Customer("Found", "Customer", "M", 49, "me@mine.com");
////        DBHelper.save(customer);
//        Customer foundCustomer = DBHelper.find(customer.getId(), Customer.class);
//        assertEquals("First Customer", foundCustomer.displayName());
//    }
}
