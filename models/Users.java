package models;

public class Users {
    private static String userName; /* Name of the user */
    private static double userWeight; /* Weight of the user in kilograms */
    private static double userHeight; /* Height of the user in centimeters */
    private static int userActivity; /* From 0-4, how active the user is, 0 being sedentary and 4 being very active */

    private Users(String userName, double userWeight, double userHeight, int userActivity) {
        Users.userName = userName;
        Users.userWeight = userWeight;
        Users.userHeight = userHeight;
        Users.userActivity = userActivity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        Users.userName = userName;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(double userWeight) {
        Users.userWeight = userWeight;
    }
    
    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        Users.userHeight = userHeight;
    }
    
    public int getUserActivity() {
        return userActivity;
    }

    public void setUserActivity(int userActivity) {
        Users.userActivity = userActivity;
    }
    
}
