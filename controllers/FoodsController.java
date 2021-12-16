package controllers;

import models.Foods;
import views.FoodsView;

public class FoodsController {

    private Foods newFood;
    private String name;
    private int quantity;
    private double calories;
    private double proteins;
    private double carbs;
    private double fats;
    private FoodsView instanceMenu;

    public FoodsController() {
        // Using the builder only for testing right now with main and view
        instanceMenu();
        newFood();
    }

    public void instanceMenu() {
        instanceMenu = new FoodsView();
    }

    public int newFood() {

        this.name = instanceMenu.getFoodNameField();
        this.quantity = instanceMenu.getfoodQuantityField();
        this.calories = instanceMenu.getFoodCalorieField();
        this.proteins = instanceMenu.getFoodProteinField();
        this.carbs = instanceMenu.getFoodCarbField();
        this.fats = instanceMenu.getFoodFatField();

        this.newFood = new Foods(name, quantity, calories, proteins, carbs, fats);

        System.out.println(name + "\n" + quantity + "\n" + calories);

        return 1;
    }

}
