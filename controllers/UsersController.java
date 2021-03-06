package controllers;

import models.Users;
import views.UsersView;

public class UsersController {
    
    private static Users newUser;
    private String name;
    private double height;
    private double weight;
    private int activity;
    private UsersView instanceMenu;

    public UsersController() {

        instanceMenu();
        newUser();

    }

    public void instanceMenu() {
        instanceMenu = new UsersView();
    }

    public int newUser() {

        this.name = instanceMenu.getUserNameField();
        this.height = instanceMenu.getUserHeightField();
        this.weight = instanceMenu.getUserWeightField();
        this.activity = instanceMenu.getUserActivityField();

        UsersController.newUser = new Users(name, height, weight, activity);

        return 1;
    }

    public static Users getNewUser() {
        return newUser;
    }
    
}
