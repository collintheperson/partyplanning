package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Collin on 8/4/17.
 */
public class PartyTest {


    @Test
    public void FindValueOfInput_15() throws Exception {
        Party newParty = new Party (10,"meat","a","a");
        assertEquals(15, newParty.getFood("meat"));

    }
    @Test
    public void FindValueOfOtherInput_15() throws Exception {
        Party newParty = new Party (10,"meat","a","rock");
        newParty.getEntertainment("rock");
        assertEquals(750, newParty.getEntertainment("rock"));

    }

}