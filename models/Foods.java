package models;

public class Foods {
    private static String foodName;
    private static int foodQuantity; /* Portion quantity as shown in the nutritional table you have access */
    private static double foodCalories; /* All information as shown in the nutritional table you have access */
    private static double foodProteins;
    private static double foodCarbs;
    private static double foodFats;

    private Foods(String foodName, int foodQuantity, double foodCalories, double foodProteins, double foodCarbs, double foodFats) {
        Foods.foodName = foodName;
        Foods.foodQuantity = foodQuantity;
        Foods.foodCalories = foodCalories;
        Foods.foodProteins = foodProteins;
        Foods.foodCarbs = foodCarbs;
        Foods.foodFats = foodFats;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        Foods.foodName = foodName;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        Foods.foodQuantity = foodQuantity;
    }
    
    public double getFoodCalories() {
        return foodCalories;
    }

    public void setFoodCalories(double foodCalories) {
        Foods.foodCalories = foodCalories;
    }
    
    public double getFoodProteins() {
        return foodProteins;
    }

    public void setFoodProteins(double foodProteins) {
        Foods.foodProteins = foodProteins;
    }
    
    public double getFoodCarbs() {
        return foodCarbs;
    }

    public void setFoodCarbs(double foodCarbs) {
        Foods.foodCarbs = foodCarbs;
    }
    
    public double getFoodFats() {
        return foodFats;
    }

    public void setFoodFats(double foodFats) {
        Foods.foodFats = foodFats;
    }
    
}
