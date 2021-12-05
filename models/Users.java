package models;

public class Users {
    private String userName; /* Name of the user */
    private double userWeight; /* Weight of the user in kilograms */
    private double userHeight; /* Height of the user in centimeters */
    private int userActivity; /* From 0-4, how active the user is, 0 being sedentary and 4 being very active */

    public Users(String userName, double userWeight, double userHeight, int userActivity) {
        this.userName = userName;
        this.userWeight = userWeight;
        this.userHeight = userHeight;
        this.userActivity = userActivity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }
    
    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }
    
    public int getUserActivity() {
        return userActivity;
    }

    public void setUserActivity(int userActivity) {
        this.userActivity = userActivity;
    }
    
}
