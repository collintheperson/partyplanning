package models;

/**
 * Created by Guest on 8/4/17.
 */
public class Party {
    private int numberOfPeople;
    private String food;
    private String beverages;
    private String entertainment;
    private int finalCost;

    public Party(int numberOfPeople, String food, String beverages, String entertainment)    {
        this.numberOfPeople = numberOfPeople;
        this.food = food;
        this.beverages = beverages;
        this.entertainment = entertainment;
}

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public int getBeverages(String beverages) {
        int beverageCost = 0;
        if ( beverages == "beer") {
            beverageCost = 15;
        } else if (beverages == "wine") {
            beverageCost = 25;
        } else if (beverages == "soda") {
            beverageCost = 10;
        }
        return beverageCost;
    }

    public int getEntertainment(String entertainment) {
        int entertainmentCost = 0;
        if ( entertainment == "dj") {
            entertainmentCost = 500;
        } else if (entertainment == "rock") {
            entertainmentCost = 750;
        } else if (entertainment == "none") {
            entertainmentCost = 0;
        }
        return entertainmentCost;
    }

    public int getFood(String food) {
        int foodCost = 0;
        if (food == "meat") {
            foodCost = 15;
        } else if (food == "fish") {
            foodCost = 20;
        } else if (food == "veg") {
            foodCost = 12;
        }
        return foodCost;
    }

//    public int getFinalCost {
//        getNumberOfPeople()*10(getFood("")+getBeverages(""))+getEntertainment("");
//        return finalCost;
//    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setBeverages(String beverages) {
        this.beverages = beverages;
    }

    public void setEntertainment(String entertainment) {
        this.entertainment = entertainment;
    }
}
