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

public class MainController {

    public static void main(String[] args) {

        CustomerController customerController = new CustomerController();
        ShopController shopController = new ShopController();
        BikeController bikeController = new BikeController();
        ClothingController clothingController = new ClothingController();
        AccessoriesController accessoriesController = new AccessoriesController();

        Seeds.seedData();


        get("/", (req, res) -> {
            Map<String, Object> model = new HashMap<>();
            model.put("template","templates/main.vtl");
            return new ModelAndView(model, "templates/layout.vtl");
        }, new VelocityTemplateEngine());

    }
}
