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


            Integer newCoupon1=0;
            Integer newCoupon2=0;

            try {
                int foodCost= 0;
                int drinkCost= 0;
                int entertainmentCost= 0;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Welcome to Collin's Crazy Party Planning Service! We do parties for small, medium, and large sized parties ");
                System.out.println("How many people are you going to have for your party");

                String userInputPeople= bufferedReader.readLine();
                int userInputPeopleVal= Integer.parseInt(userInputPeople);

                System.out.println("What type of food do you want at your party?Please respond with the corresponding letter a)Meat b)Fish c)Vegetarian");

                String userInputFood= bufferedReader.readLine();
                System.out.println(userInputFood);

                if ( "a".equalsIgnoreCase(userInputFood))  {
                    foodCost = 15;
                } else if ( "b".equalsIgnoreCase(userInputFood)) {
                    foodCost = 20;
                } else if ( "c".equalsIgnoreCase(userInputFood)) {
                    foodCost = 12;
                } else  {
                    System.out.println("It did not take a or b or c");
                }
                System.out.println("What type of drink package do you want at your party?Please respond with the corresponding letter a)Beer & Wine b)Beer,wine, and hard liquor c)Soda and juices");

                String userInputBeverage= bufferedReader.readLine();
                if ( "a".equalsIgnoreCase(userInputBeverage)) {
                    drinkCost = 15;
                } else if ("b".equalsIgnoreCase(userInputBeverage)) {
                    drinkCost = 20;
                } else if ("c".equalsIgnoreCase(userInputBeverage)) {
                    drinkCost = 12;
                }
                System.out.println("What type of entertainment package do you want at your party?Please respond with the corresponding letter a)Rock band b)Live DJ c)None");

                String userInputEntertainment= bufferedReader.readLine();
                if ("a".equalsIgnoreCase(userInputEntertainment)) {
                    entertainmentCost=15;
                } else if ("b".equalsIgnoreCase(userInputEntertainment)) {
                    entertainmentCost=20;
                } else if ("c".equalsIgnoreCase(userInputEntertainment)) {
                    entertainmentCost=0;
                }
                int userTotal= userInputPeopleVal *(drinkCost+foodCost)+ entertainmentCost;
                System.out.println("Your current total is" + " " + userTotal);
            programRunning =false;
            }
            catch(IOException e){
                    e.printStackTrace();
            }
        }
    }
}
