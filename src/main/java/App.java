import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/4/17.
 */
public class App {
    public static void main(String[] args) {

        boolean programRunning = true;

        while (programRunning)  {

//            int newCost = newParty.numberOfPeople *10;
//            int totalPeople = newParty.numberOfPeople;
//            String userInput1 = newParty.food;
//            String userInput2 = newParty.beverages;
//            String userInput3 = newParty.entertaiment;

            Integer newCost1= 0;
            Integer newCost2= 0;
            Integer newCost3= 0;
            Integer newCoupon1=0;
            Integer newCoupon2=0;

            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Welcome to Collin's Crazy Party Planning Service! We do parties for small, medium, and large sized parties ");
                System.out.println("How many people are you going to have for your party");

                String userInputPeople= bufferedReader.readLine();
                int userInputPeopleVal= Integer.parseInt(userInputPeople);

                System.out.println("What type of food do you want at your party?Please respond with the corresponding letter a)meat b)fish c)vegetarian");

                String userInputFood= bufferedReader.readLine();
                if (userInputFood == "a") {
                    newCost1=15;
                } else if (userInputFood == "b") {
                    newCost2=20;
                } else if (userInputFood == "c") {
                    newCost3=12;
                }
            programRunning =false;
            }
            catch(IOException e){
                    e.printStackTrace();
            }
        }
    }
}
