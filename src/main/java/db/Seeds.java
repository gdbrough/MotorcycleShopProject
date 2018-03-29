package db;

import models.*;
import sun.misc.BASE64Decoder;
import sun.tools.asm.Cover;

import java.util.List;
import java.util.Set;

public class Seeds {
//    public static void main(String[] args) {
    public static void seedData() {

        DBHelper.deleteAll(Shop.class);
        DBHelper.deleteAll(Bike.class);
        DBHelper.deleteAll(Accessory.class);
        DBHelper.deleteAll(Clothing.class);
        DBHelper.deleteAll(Customer.class);

        Customer customer1 = new Customer("Will", "MacIntyre", "M", 32, "inferno@gmail.com", "willmac");
        DBHelper.save(customer1);

        Shop shop = new Shop("Jurassic Motorcycles", 0.00);
        DBHelper.save(shop);

        Basket basket1 = new Basket(customer1);
        DBHelper.save(basket1);
        customer1.setBasket(basket1);
        DBHelper.update(customer1);

        Bike bike1 = new Bike("Neiman Marcus Limited Edition Fighter", 11000000, 1, "/images/neiman_marcus.jpeg", "Clockwork Metal", 120, true);
        DBHelper.save(bike1);

        Accessory accessory1 = new Accessory("DSYJ Windproof Face Mask Cover", 0.76, 20, "/images/DSYJ_facemask.jpeg");
        DBHelper.save(accessory1);
        Clothing clothing2 = new Clothing("Arai RX7", 499.99, 1, "/images/arai_rx7.jpg", "multi", "58", ClothingType.HELMET);
        DBHelper.save(clothing2);
        Clothing clothing3 = new Clothing("Gloves", 49.99, 0, "null", "black", "large", ClothingType.GLOVES);
        DBHelper.save(clothing3);

        Clothing clothing1 = new Clothing("All Black Waterproof Armoured Motorcycle Trousers", 44, 3, "/images/black_trousers.jpeg", "Black", "All Sizes", ClothingType.TROUSER);
        DBHelper.save(clothing1);

//        DBHelper.addToBasket(bike1, 1, customer1, basket1);
//        DBHelper.addToBasket(accessory1, 2, customer1, basket1);
//        DBHelper.addToBasket(clothing1, 1, customer1, basket1);
//        DBHelper.addToBasket(clothing2, 1, customer1, basket1);
//
//        DBHelper.addToBasket(bike1, 1, customer1);
        DBHelper.addToBasket(accessory1, 2, customer1);
        DBHelper.addToBasket(clothing1, 1, customer1);
        DBHelper.addToBasket(clothing2, 1, customer1);


//        StockItem stockItemToDelete = DBHelper.find(5, StockItem.class);
//
//        DBHelper.deleteFromBasket(stockItemToDelete, customer1);
////        Customer testCust = DBHelper.findCustomerByUsername(customer1.getUsername());
////
////
//        Set<StockItem> testBasketCust1 = DBHelper.findBasketItems(customer1.getBasket());
    }




}
