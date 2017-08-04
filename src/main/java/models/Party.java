package models;

/**
 * Created by Guest on 8/4/17.
 */
public class Party {
    private int numberOfPeople;
    private String food;
    private String beverages;
    private String entertaiment;

    public Party(int numberOfPeople, String food, String beverages, String entertainment)    {
        this.numberOfPeople = numberOfPeople;
        this.food = food;
        this.beverages = beverages;
        this.entertaiment = entertainment;
}

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getBeverages() {
        return beverages;
    }

    public String getEntertaiment() {
        return entertaiment;
    }

    public String getFood() {
        return food;
    }
}
