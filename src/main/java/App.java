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

                System.out.println("What type of food do you want at your party?Please respond with the corresponding word");
                System.out.println("meat: steak, tri-tip, pork shoulder");
                System.out.println("fish:shrimp, halibut, tuna, ");
                System.out.println("veg: vegetarian skewers, soup and salad galore, and fruit bowls inside of fruit bowls");
                String food = bufferedReader.readLine();

                System.out.println("What type of drink package do you want at your party?Please respond with the corresponding word");
                System.out.println("beer:beer and soda");
                System.out.println("wine: wine and soda");
                System.out.println("soda: soda");
                String beverage = bufferedReader.readLine();


                System.out.println("What type of entertainment package do you want at your party?Please respond with the word");
                System.out.println("rock : The awesome local hair metal group Hair Splitters");
                System.out.println("dj : DJ Dogowner is here to fetch the hottest beats");
                System.out.println("none : You either have your own entertainment or want a quieter party");
                String entertainment = bufferedReader.readLine();

                Party userParty = new Party(people,food,beverage,entertainment);

                int pricePerPerson = userParty.getCostPerPerson((userParty.getFood(food)),(userParty.getBeverages(beverage)));

                System.out.println("Would you like to apply a coupon: We currently have two coupons one triggers if you pick the rock band  and the other is for having more than 25 people");

                int finalCost= userParty.getTotalCostDiscount(people,pricePerPerson,userParty.getEntertainment(entertainment));
                System.out.println("Your total with discount is" + "  " + finalCost);

                    programRunning = false;

            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
