package models;

public class Foods {
    private String foodName;
    private int foodQuantity; /* Portion quantity as shown in the nutritional table you have access */
    private double foodCalories; /* All information as shown in the nutritional table you have access */
    private double foodProteins;
    private double foodCarbs;
    private double foodFats;

    public Foods(String foodName, int foodQuantity, double foodCalories, double foodProteins, double foodCarbs, double foodFats) {
        this.foodName = foodName;
        this.foodQuantity = foodQuantity;
        this.foodCalories = foodCalories;
        this.foodProteins = foodProteins;
        this.foodCarbs = foodCarbs;
        this.foodFats = foodFats;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }
    
    public double getFoodCalories() {
        return foodCalories;
    }

    public void setFoodCalories(double foodCalories) {
        this.foodCalories = foodCalories;
    }
    
    public double getFoodProteins() {
        return foodProteins;
    }

    public void setFoodProteins(double foodProteins) {
        this.foodProteins = foodProteins;
    }
    
    public double getFoodCarbs() {
        return foodCarbs;
    }

    public void setFoodCarbs(double foodCarbs) {
        this.foodCarbs = foodCarbs;
    }
    
    public double getFoodFats() {
        return foodFats;
    }

    public void setFoodFats(double foodFats) {
        this.foodFats = foodFats;
    }
    
}
