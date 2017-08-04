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
        assertEquals(1, newPeople.getNumberOfPeople());
    }

    @Test
    public void PartyPlanning_FindsExpectedOutOfString_a() throws Exception   {
        Party newParty = new Party(1,"a","a","a");
        assertEquals("a",newParty.getFood());
    }

    @Test
    public void PartyPlanning_FindsCostofOnePerson_10() throws Exception   {
        Party newParty= new Party(1,"a","a","a");
        int newCost = newParty.getNumberOfPeople() *10;
        assertEquals(10,newCost);
    }
    @Test
    public void PartyPlanning_FindsCostofTwoItems_15() throws Exception   {
        Party newParty= new Party(1,"a","a","a");
        int newCost = newParty.getNumberOfPeople() *10;
        String userInput = newParty.getFood();
        Integer newCost1= 0;
        if (userInput == "a") {
             newCost1=5;
        }
        int totalCost = newCost1 + newCost;
        assertEquals(15,totalCost);
    }
    @Test
    public void PartyPlanning_FindsCostofFourItems_15() throws Exception   {
        Party newParty= new Party(2,"a","a","a");
        int newCost = newParty.getNumberOfPeople() *10;
        String userInput1 = newParty.getFood();
        String userInput2 = newParty.getBeverages();
        String userInput3 = newParty.getEntertaiment();
        Integer newCost1= 0;
        Integer newCost2= 0;
        Integer newCost3= 0;
        if (userInput1 == "a") {
            newCost1=5;
        }
        if (userInput2 == "a") {
            newCost2=10;
        }
        if (userInput3 == "a") {
            newCost3=500;
        }
        int totalCost = newCost1 + newCost + newCost2 + newCost3;
        assertEquals(535,totalCost);
    }
    @Test
    public void PartyPlanning_FindsCostofFourItemsMinus1Coupon_4525() throws Exception   {
        Party newParty= new Party(501,"a","a","a");
        int newCost = newParty.getNumberOfPeople() *10;
        int totalPeople = newParty.getNumberOfPeople();
        String userInput1 = newParty.getFood();
        String userInput2 = newParty.getBeverages();
        String userInput3 = newParty.getEntertaiment();
        Integer newCost1= 0;
        Integer newCost2= 0;
        Integer newCost3= 0;
        Integer newCoupon1=0;
        if (userInput1 == "a") {
            newCost1=5;
        }
        if (userInput2 == "a") {
            newCost2=10;
        }
        if (userInput3 == "a") {
            newCost3=500;
        }
        if (totalPeople >= 500)
            newCoupon1= -1000;
        int totalCost = newCost1 + newCost + newCost2 + newCost3 + newCoupon1;
        assertEquals(4525,totalCost);
    }
    @Test
    public void PartyPlanning_FindsCostofFourItemsMinus2Coupon_4275() throws Exception   {
        Party newParty= new Party(501,"a","a","a");
        int newCost = newParty.getNumberOfPeople() *10;
        int totalPeople = newParty.getNumberOfPeople();
        String userInput1 = newParty.getFood();
        String userInput2 = newParty.getBeverages();
        String userInput3 = newParty.getEntertaiment();
        Integer newCost1= 0;
        Integer newCost2= 0;
        Integer newCost3= 0;
        Integer newCoupon1=0;
        Integer newCoupon2=0;
        if (userInput1 == "a") {
            newCost1=5;
        }
        if (userInput2 == "a") {
            newCost2=10;
        }
        if (userInput3 == "a") {
            newCost3=500;
        }
        if (totalPeople >= 500)
            newCoupon1= -1000;
        if (userInput1=="a" && userInput2=="a" && userInput3=="a")
            newCoupon2= -250;
        int totalCost = newCost1 + newCost + newCost2 + newCost3 + newCoupon1 +newCoupon2;
        assertEquals(4275,totalCost);
    }
    @Test
    public void PartyPlanning_FindsTotalCost_4275() throws Exception   {
        Party newParty= new Party(501,"a","a","a");
        int newCost = newParty.getNumberOfPeople() *10;
        int totalPeople = newParty.getNumberOfPeople();
        String userInput1 = newParty.getFood();
        String userInput2 = newParty.getBeverages();
        String userInput3 = newParty.getEntertaiment();
        Integer newCost1= 0;
        Integer newCost2= 0;
        Integer newCost3= 0;
        Integer newCoupon1=0;
        Integer newCoupon2=0;
        if (userInput1 == "a") {
            newCost1=5;
        }
        if (userInput2 == "a") {
            newCost2=10;
        }
        if (userInput3 == "a") {
            newCost3=500;
        }
        if (totalPeople >= 500)
            newCoupon1= -1000;
        if (userInput1=="a" && userInput2=="a" && userInput3=="a")
            newCoupon2= -250;
        int totalCost = newCost * (newCost1 + newCost2) + newCost3 + newCoupon1 +newCoupon2;
        assertEquals(74400,totalCost);
    }



}