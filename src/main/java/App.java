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
                Party userParty = new Party(0,"a","b","c");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Welcome to Collin's Crazy Party Planning Service! We do parties for small, medium, and large sized parties ");
                System.out.println("How many people are you going to have for your party");

                String userInputPeople = bufferedReader.readLine();
                int userInputPeopleVal = Integer.parseInt(userInputPeople);

                System.out.println("What type of food do you want at your party?Please respond with the corresponding word meat)meat::::: fish)fish:::: veg)vegetarian");

                String food = bufferedReader.readLine();
                userParty.getFood(food);


                System.out.println("What type of drink package do you want at your party?Please respond with the corresponding word beer)beer :::::wine)wine soda)soda");

                String beverage = bufferedReader.readLine();
                userParty.getBeverages(beverage);

                System.out.println("What type of entertainment package do you want at your party?Please respond with the word rock)Rock band ::::::dj)Live DJ ::::::none)None");

                String entertainment = bufferedReader.readLine();
                userParty.getEntertainment(entertainment);

                System.out.println(userParty.getFood(food));
                System.out.println(userParty.getBeverages(beverage));
                System.out.println(userParty.getEntertainment(entertainment));
                System.out.println(userInputPeopleVal);
                int userTotal = userInputPeopleVal * (userParty.getFood(food)+userParty.getBeverages(beverage)) + userParty.getEntertainment(entertainment);
        //        int discountPrice = entertainmentCost + drinkCost + foodCost;
                System.out.println("Your current total is" + " " + userTotal);
                System.out.println("Would you like to apply a coupon: We currently have two coupons one triggers if have a party of 500 or more and the other is choosing 'a' for each input");

                if (userInputPeopleVal > 499) {
                    userTotal -= 3000;
                }
//                if (discountPrice == 783) {
//                    userTotal -= 250;
//                }
//                System.out.println("Your total with discount is" + "  " + userTotal);

                programRunning = false;


            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
