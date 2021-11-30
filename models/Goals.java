package models;

public class Goals {
    private int waterGoal;
    private int caloricGoal;
    private int proteicGoal;
    private int carbsGoal;
    private int fatsGoal;

    public Goals(int waterGoal, int caloricGoal, int proteicGoal, int carbsGoal, int fatsGoal) {
        this.waterGoal = waterGoal;
        this.caloricGoal = caloricGoal;
        this.proteicGoal = proteicGoal;
        this.carbsGoal = carbsGoal;
        this.fatsGoal = fatsGoal;
    }

    public int getWaterGoal() {
        return waterGoal;
    }
    public void setWaterGoal(int waterGoal) {
        this.waterGoal = waterGoal;
    }

    public int getCaloricGoal() {
        return caloricGoal;
    }
    public void setCaloricGoal(int caloricGoal) {
        this.caloricGoal = caloricGoal;
    }

    public int getProteicGoal() {
        return proteicGoal;
    }
    public void setProteicGoal(int proteicGoal) {
        this.proteicGoal = proteicGoal;
    }

    public int getCarbsGoal() {
        return carbsGoal;
    }
    public void setCarbsGoal(int carbsGoal) {
        this.carbsGoal = carbsGoal;
    }

    public int getFatsGoal() {
        return fatsGoal;
    }
    public void setFatsGoal(int fatsGoal) {
        this.fatsGoal = fatsGoal;
    }

}
