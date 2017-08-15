package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Collin on 8/4/17.
 */
public class PartyTest {


    @Test
    public void FoodPrice_FindPriceOfMeat_15() throws Exception {
        Party newParty = new Party(10, "meat", "a", "a");
        assertEquals(15, newParty.getFood("meat"));

    }

    @Test
    public void FoodPrice_FindPriceOfFish_20() throws Exception {
        Party newParty = new Party(10, "fish", "a", "a");
        assertEquals(20, newParty.getFood("fish"));

    }

    @Test
    public void FoodPrice_FindPriceOfVeg_15() throws Exception {
        Party newParty = new Party(10, "veg", "a", "a");
        assertEquals(12, newParty.getFood("veg"));
    }

    @Test
    public void FoodPrice_FindPriceOfUnexpectedValue_0() throws Exception {
        Party newParty = new Party(10, "steak", "beer", "dj");
        assertEquals(0, newParty.getFood("steak"));
    }

    @Test
    public void BeveragePrice_FindPriceOfBeer_15() throws Exception {
        Party newParty = new Party(10, "meat", "beer", "rock");
        assertEquals(15, newParty.getBeverages("beer"));

    }

    @Test
    public void BeveragePrice_FindPriceOfWine_15() throws Exception {
        Party newParty = new Party(10, "meat", "wine", "rock");
        assertEquals(25, newParty.getBeverages("wine"));
    }

    @Test
    public void BeveragePrice_FindPriceOfSoda_15() throws Exception {
        Party newParty = new Party(10, "meat", "soda", "rock");
        assertEquals(10, newParty.getBeverages("soda"));
    }

    @Test
    public void BeveragePrice_FindPriceOfUnexpectedValue_0() throws Exception {
        Party newParty = new Party(10, "meat", "soda", "rock");
        assertEquals(0, newParty.getBeverages("sprite"));
    }

    @Test
    public void EntertainmentPrice_FindPriceOfDJ_500() throws Exception {
        Party newParty = new Party(10, "meat", "beer", "dj");
        assertEquals(500, newParty.getEntertainment("dj"));

    }

    @Test
    public void EntertainmentPrice_FindPriceOfRockBand_750() throws Exception {
        Party newParty = new Party(10, "meat", "wine", "rock");
        assertEquals(750, newParty.getEntertainment("rock"));
    }

    @Test
    public void EntertainmentPrice_FindPriceOfNoEntertainment_0() throws Exception {
        Party newParty = new Party(10, "meat", "soda", "rock");
        assertEquals(0, newParty.getEntertainment("none"));
    }

    @Test
    public void EntertainmentPrice_FindPriceOfUnexpectedValue_0() throws Exception {
        Party newParty = new Party(10, "meat", "soda", "rock");
        assertEquals(0, newParty.getEntertainment("big band"));
    }

    @Test
    public void NumberCost_FindPricePerPerson_100() throws Exception {
        Party newParty = new Party(10, "meat", "soda", "rock");
        assertEquals(10, newParty.getNumberOfPeople(10));
    }

    @Test
    public void NumberCost_FindCostPerFoodAndBeverageSelection_40() throws Exception {
        Party newParty = new Party(10, "meat", "wine", "rock");
        int beverageFoodCost = newParty.getCostPerPerson(newParty.getFood("meat"), newParty.getBeverages("wine"));
        assertEquals(40, beverageFoodCost);
    }

    @Test
    public void TotalCost_CaculatesTotalCost_890() throws Exception {
        Party newParty = new Party(10, "meat", "wine", "rock");
        int beverageFoodCost = newParty.getCostPerPerson(newParty.getFood("meat"), newParty.getBeverages("wine"));
        int totalCost = newParty.getTotalCost(newParty.getNumberOfPeople(10), beverageFoodCost, newParty.getEntertainment("rock"));
        assertEquals(800, totalCost);
    }

    @Test
    public void TotalCost_CaculatesTotalWithOneDiscount_500() throws Exception {
        Party newParty = new Party(4, "meat", "wine", "rock");
        int beverageFoodCost = newParty.getCostPerPerson(newParty.getFood("meat"), newParty.getBeverages("wine"));
        int DiscountCode = newParty.getTotalCostDiscount(newParty.getNumberOfPeople(25),beverageFoodCost,newParty.getEntertainment("none"));
        assertEquals(500, DiscountCode);
    }

    @Test
    public void TotalCost_CaculatesTotalWithTwoDiscount_890() throws Exception {
        Party newParty = new Party(4, "meat", "wine", "rock");
        int beverageFoodCost = newParty.getCostPerPerson(newParty.getFood("meat"), newParty.getBeverages("wine"));
        int DiscountCode = newParty.getTotalCostDiscount(newParty.getNumberOfPeople(25),beverageFoodCost,newParty.getEntertainment("rock"));
        assertEquals(1000, DiscountCode);
    }
}