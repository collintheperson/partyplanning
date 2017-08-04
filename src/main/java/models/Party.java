package models;

/**
 * Created by Guest on 8/4/17.
 */
public class Party {
    public int numberOfPeople;
    public String food;
    public String beverages;
    public String entertaiment;

    public Party(int numberOfPeople, String food, String beverages, String entertainment)    {
        this.numberOfPeople = numberOfPeople;
        this.food = food;
        this.beverages = beverages;
        this.entertaiment = entertainment;
    }


}
