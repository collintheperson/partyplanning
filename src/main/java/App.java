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

        while (programRunning) {

            try {

                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Welcome to Collin's Crazy Party Planning Service! We do parties for small, medium, and large sized parties ");
                System.out.println("How many people are you going to have for your party");

                int people = Integer.parseInt(bufferedReader.readLine());
                int finalPeople = people * 10;

                System.out.println("What type of food do you want at your party?Please respond with the corresponding word meat)meat::::: fish)fish:::: veg)vegetarian");

                String food = bufferedReader.readLine();

                System.out.println("What type of drink package do you want at your party?Please respond with the corresponding word beer)beer :::::wine)wine::::: soda)soda");

                String beverage = bufferedReader.readLine();


                System.out.println("What type of entertainment package do you want at your party?Please respond with the word rock)Rock band ::::::dj)Live DJ ::::::none)None");

                String entertainment = bufferedReader.readLine();

                Party userParty = new Party(people,food,beverage,entertainment);

                int pricePerPerson = userParty.getCostPerPerson((userParty.getFood(food)),(userParty.getBeverages(beverage)));
                int priceTotal=userParty.getTotalCost(finalPeople,pricePerPerson,(userParty.getEntertainment(entertainment)));

                System.out.println("Your current total is" + " " + priceTotal);
                System.out.println("Would you like to apply a coupon: We currently have two coupons one triggers if have a party of 500 or more and the other is choosing 'a' for each input");

                if (pricePerPerson > 30) {
                    priceTotal -= 10;
                }
                if (people > 783) {
                    priceTotal -= 250;
                }
                System.out.println("Your total with discount is" + "  " + priceTotal);

                programRunning = false;


            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
