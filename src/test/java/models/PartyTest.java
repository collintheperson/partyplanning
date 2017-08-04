package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Collin on 8/4/17.
 */
public class PartyTest {
    @Test
    public void PartyPlanning_FindTheCostOfOneVendor_a() throws Exception {
        Party newPeople = new Party(1,"a","g","d");
        assertEquals(1, newPeople.numberOfPeople);
    }
}