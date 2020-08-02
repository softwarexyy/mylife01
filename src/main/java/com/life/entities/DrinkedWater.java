package com.life.entities;

public class DrinkedWater {

    private int id;
    private String drinkName;    // 喝水人
    private double drinkAmount;  // 喝水量
    private String drinkTime;    // 喝水时间

    public DrinkedWater() {
    }

    public DrinkedWater(int id, String drinkName, double drinkAmount, String drinkTime) {
        this.id = id;
        this.drinkName = drinkName;
        this.drinkAmount = drinkAmount;
        this.drinkTime = drinkTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public double getDrinkAmount() {
        return drinkAmount;
    }

    public void setDrinkAmount(double drinkAmount) {
        this.drinkAmount = drinkAmount;
    }

    public String getDrinkTime() {
        return drinkTime;
    }

    public void setDrinkTime(String drinkTime) {
        this.drinkTime = drinkTime;
    }

    @Override
    public String toString() {
        return "DrinkedWater{" +
                "id=" + id +
                ", drinkName='" + drinkName + '\'' +
                ", drinkAmount=" + drinkAmount +
                ", drinkTime='" + drinkTime + '\'' +
                '}';
    }
}
