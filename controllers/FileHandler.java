package controllers;

import java.io.File;
import models.*;

public class FileHandler {
    static File usersFile = new File("data/usersFile.txt");
    static File foodsFile = new File("data/foodsFile.txt");
    static File goalsFile = new File("data/goalsFile.txt");

    static Users usersInfo;
    static Foods foodsInfo;
    static Goals goalsInfo;

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

    protected int infoSetter() {
        // 0 = no problems, anything other it should retry
        int output = 0;
        return output;
    }
    /*
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
    */
    public static void main(String[] args) {
        fileChecker();
    }
}
