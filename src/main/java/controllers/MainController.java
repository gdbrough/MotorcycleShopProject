package controllers;

import db.CustomerDBHelper;
import db.DBHelper;
import db.Seeds;
import models.Bike;
import models.Customer;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.get;
import static spark.SparkBase.staticFileLocation;

public class MainController {

    public static void main(String[] args) {

        staticFileLocation("/public");

        Seeds.seedData();

        CustomerController customerController = new CustomerController();
        ShopController shopController = new ShopController();
        BikeController bikeController = new BikeController();
        ClothingController clothingController = new ClothingController();
        AccessoriesController accessoriesController = new AccessoriesController();
        LoginController loginController = new LoginController();
        BasketController basketController = new BasketController();

        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            String loggedInUser = LoginController.getLoggedInUserName(req, res);
            model.put("user", loggedInUser);
            model.put("template","templates/main.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

    }
}
