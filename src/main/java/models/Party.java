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

    public int getNumberOfPeople(int numberOfPeople) {
        int CostOfNumberOfPeople = numberOfPeople;
        return CostOfNumberOfPeople;
    }

    public int getBeverages(String beverages) {
        int beverageCost = 0;
        switch (beverages) {
            case "beer":
                beverageCost = 15;
                break;
            case "wine":
                beverageCost = 25;
                break;
            case "soda":
                beverageCost = 10;
                break;
        }
        return beverageCost;
    }

    public int getEntertainment(String entertainment) {
        int entertainmentCost = 0;
        switch (entertainment) {
            case "dj":
                entertainmentCost = 500;
                break;
            case "rock":
                entertainmentCost = 750;
                break;
            case "none":
                entertainmentCost = 0;
                break;
        }
        return entertainmentCost;
    }

    public int getFood(String food) {
        int foodCost = 0;
        switch (food) {
            case "meat":
                foodCost = 15;
                break;
            case "fish":
                foodCost = 20;
                break;
            case "veg":
                foodCost = 12;
                break;
        }
        return foodCost;
    }

    public int getCostPerPerson ( int foodCost, int beverageCost) {
        int finalCost = (foodCost+beverageCost);
        return finalCost;
    }
    public int getTotalCost ( int numberOfPeople ,int finalCost, int entertainmentCost) {
        int totalCost = numberOfPeople +finalCost + entertainmentCost;

        return totalCost;
    }
    public int getTotalCostDiscount ( int numberOfPeople ,int finalCost, int entertainmentCost) {
        int totalCostDiscount = numberOfPeople * finalCost + entertainmentCost;
        if (entertainmentCost == 750)   {
            totalCostDiscount -= 250;
        }
        if (numberOfPeople >= 25) {
            totalCostDiscount -= 500;
        }
            return totalCostDiscount;
        }
}
