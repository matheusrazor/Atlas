package controllers;

import models.Goals;
import views.GoalsView;

public class GoalsController {
    
    private Goals newGoals;
    private int water;
    private int calories;
    private int proteins;
    private int carbs;
    private int fats;
    private GoalsView instanceMenu;

    public GoalsController() {
        instanceMenu();
        newGoals();
    }

    public void instanceMenu() {
        instanceMenu = new GoalsView();
    }

    public int newGoals() {
        
        this.water = instanceMenu.getGoalWaterField();
        this.calories = instanceMenu.getGoalCalorieField();
        this.proteins = instanceMenu.getGoalProteinField();
        this.carbs = instanceMenu.getGoalCarbField();
        this.fats = instanceMenu.getGoalFatField();

        this.newGoals = new Goals(water, calories, proteins, carbs, fats);

        return 1;
    }

    public Goals getNewGoals() {
        return newGoals;
    }
    
}
