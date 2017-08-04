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


}