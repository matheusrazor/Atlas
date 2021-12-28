package controllers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import models.*;

public class FileHandler {
    static File usersFile = new File("data/usersFile.txt");
    static File foodsFile = new File("data/foodsFile.txt");
    static File goalsFile = new File("data/goalsFile.txt");

    Users usersInfo;
    Foods foodsInfo;
    Goals goalsInfo;

    // private method filechecker checks if a file exists, if not, creates them
    private static void fileChecker() {
        try {
            if (!usersFile.exists()) {
                usersFile.createNewFile();
            }
            if (!foodsFile.exists()) {
                foodsFile.createNewFile();
            }
            if (!goalsFile.exists()) {
                goalsFile.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("An error has occurred while creating needed files");
        }
    }

    // this method is gonna run everytime the program is closed, and everytime a new object is added
    // if the program is closed with nothing new to add, it should handle that and not write anything new
    protected int infoSetter(int fileSwitch) throws IOException {
        // 0 = no problems, anything other it should retry
        FileWriter writerUsers = new FileWriter(usersFile);
        FileWriter writerFoods = new FileWriter(foodsFile);
        FileWriter writerGoals = new FileWriter(goalsFile);

        switch (fileSwitch) {
            case 1:
                // users
                break;
            case 2:
                // foods
                break;
            case 3:
                // goals
                break;
            default:
                System.out.println("Error on fileSwitch argument");
                break;
        }

        int output = 0;
        return output;
    }
    /*
     * these infoGetter methods take the info passed by the controllers to record in the file
     * the method infoDiver searches for the needed infos in the files
     * * infoDiver can be run multiple times, from the login page to everytime someone consults a food or tries to write a new one, based on whether the specific object exists,
     * * the infoDiver can determine which method to call, Getter or Poster
     * then theres the infoPoster methods that take infos from the files and displays it.
    public Users usersInfoGetter() {
        Users output;
        return output;
    }

    public Foods foodsInfoGetter() {
        Foods output;
        return output;
    }

    public Goals goalsInfoGetter() {
        Goals output;
        return output;
    }


    public Users usersInfoDiver() {
        Users output;
        return output;
    }

    public Foods foodsInfoDiver() {
        Foods output;
        return output;
    }

    public Goals goalsInfoDiver() {
        Goals output;
        return output;
    }

    
    public Users usersInfoPoster() {
        Users output;
        return output;
    }

    public Foods foodsInfoPoster() {
        Foods output;
        return output;
    }

    public Goals goalsInfoPoster() {
        Goals output;
        return output;
    }
    */
    public static void main(String[] args) {
        fileChecker();
    }
}
