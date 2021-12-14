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

    public FoodsController(Foods newFood) {
        this.newFood = newFood;
    }

    public int newFood() {
        name = FoodsView.getFoodNameField();
        return 1;
    }
}
