package models;

import db.CustomerDBHelper;
import db.DBHelper;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String emailAddress;
    private String username;
    private Basket basket;
    private Set<StockItem> pendingItems;

    private Set<StockItem> purchasedItems;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String gender, int age, String emailAddress, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
        this.emailAddress = emailAddress;
        this.username = username;

//        this.pendingItems = new Set<>();
        this.purchasedItems = new HashSet<>();
//        this.shop = shop;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Column(name = "email_address")
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @OneToOne(fetch = FetchType.LAZY)
    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    //    @Column(name = "purchased_items")
//    public Set<StockItem> getPurchasedItems() {
//        return purchasedItems;
//    }
//
//    public void setPurchasedItems(Set<StockItem> purchasedItems) {
//        this.purchasedItems = purchasedItems;
//    }

    public String displayName(){
        return getFirstName() + " " + getLastName();
    }

//    public static void addToBasket(StockItem item, Basket basket){
//        basket.addItem(item);
//        item.setBaskets(basket);
//        DBHelper.saveOrUpdate(basket);
//        DBHelper.saveOrUpdate(item);
//    }

//    @Column(name = "shop")
//    public Shop getShop() {
//        return shop;
//    }
//
//    public void setShop(Shop shop) {
//        this.shop = shop;
//    }

//    public List<Bike> findAllAccessories(){
//        List<Bike> allAvailableAccessories = CustomerDBHelper.getAvailableStock(Accessory.class);
//        return allAvailableAccessories;
//    }
//
//    public List<Bike> findAllClothing(){
//        List<Bike> allAvailableClothing = CustomerDBHelper.getAvailableStock(Clothing.class);
//        return allAvailableClothing;
//    }

}
