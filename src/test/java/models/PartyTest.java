package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Collin on 8/4/17.
 */
public class PartyTest {

    @Test
    public void PartyPlanning_FindTheAmountofPeople_1() throws Exception {
        Party newPeople = new Party(1,"a","g","d");
        assertEquals(1, newPeople.numberOfPeople);
    }

    @Test
    public void PartyPlanning_FindsExpectedOutOfString_a() throws Exception   {
        Party newParty = new Party(1,"a","a","a");
        assertEquals("a",newParty.food);
    }

    @Test
    public void PartyPlanning_FindsCostofOnePerson_10() throws Exception   {
        Party newParty= new Party(1,"a","a","a");
        int newCost = newParty.numberOfPeople *10;
        assertEquals(10,newCost);
    }
    @Test
    public void PartyPlanning_FindsCostofTwoItems_15() throws Exception   {
        Party newParty= new Party(1,"a","a","a");
        int newCost = newParty.numberOfPeople *10;
        String userInput = newParty.food;
        Integer newCost1= 0;
        if (userInput == "a") {
             newCost1=5;
        };
        int totalCost = newCost1 + newCost;
        assertEquals(15,totalCost);
    }
    @Test
    public void PartyPlanning_FindsCostofFourItems_15() throws Exception   {
        Party newParty= new Party(2,"a","a","a");
        int newCost = newParty.numberOfPeople *10;
        String userInput1 = newParty.food;
        String userInput2 = newParty.beverages;
        String userInput3 = newParty.entertaiment;
        Integer newCost1= 0;
        Integer newCost2= 0;
        Integer newCost3= 0;
        if (userInput1 == "a") {
            newCost1=5;
        };
        if (userInput2 == "a") {
            newCost2=10;
        };
        if (userInput3 == "a") {
            newCost3=500;
        };
        int totalCost = newCost1 + newCost + newCost2 + newCost3;
        assertEquals(535,totalCost);
    }
    @Test
    public void PartyPlanning_FindsCostofFourItemsMinus1Coupon_15() throws Exception   {
        Party newParty= new Party(501,"a","a","a");
        int newCost = newParty.numberOfPeople *10;
        int totalPeople = newParty.numberOfPeople;
        String userInput1 = newParty.food;
        String userInput2 = newParty.beverages;
        String userInput3 = newParty.entertaiment;
        Integer newCost1= 0;
        Integer newCost2= 0;
        Integer newCost3= 0;
        Integer newCoupon1=0;
        Integer newCoupon2=0;
        if (userInput1 == "a") {
            newCost1=5;
        };
        if (userInput2 == "a") {
            newCost2=10;
        };
        if (userInput3 == "a") {
            newCost3=500;
        };
        if (totalPeople >= 500)
            newCoupon1= -1000;
        int totalCost = newCost1 + newCost + newCost2 + newCost3 + newCoupon1;
        assertEquals(535,totalCost);
    }


}