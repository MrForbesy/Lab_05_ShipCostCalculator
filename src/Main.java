///A application where the user enter the price of an item and the program
//computes the shipping costs. if the item is $100 or more, then shipping
//is free, otherwise it is 2% of the price. The program should output
// the shipping cost and the total price.

//class ShippingCost
//  main()
//      num itemCost = 0
//      num SHIP_TAX = .02
//      num shipCost = itemCost * SHIP_TAX
//      num totalCost = 0
//      output "What is the price of your purchase?"
//      input itemCost
//      if itemCost >= 100
//          totalCost = itemCost + shipCost
//          output = "You qualify for free shipping. Your total price is" + itemCost
//      else
//          totalCost = itemCost + shipCost
//          output "The cost of your item is" + itemCost + "and your shipping
//                  cost is" + shipCost + ". Your total is" + totalCost
//      endIf
//  return
//end class



import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        //Declaring my variables//
        double itemCost = 0;
        double SHIP_TAX = .02;
        double shipCost = 0;
        double totalCost = 0;

        System.out.printf("What is the price of your purchase?"); //Asking user to input their item price//

        itemCost = in.nextDouble(); //Storing inputted item price in itemCost and updating the value of my other variables//
        shipCost = itemCost * SHIP_TAX;
        totalCost = itemCost + shipCost;

        if(itemCost >= 100) //Checking to see if the price hits the $100 threshold and give the user their total based on if they have to pay for shipping or not.//
        {
            System.out.printf("You qualify for free shipping. Your total is " + itemCost);
        }
        else
        {
            System.out.printf("Your item cost " + itemCost + " and your shipping fee is " + shipCost + ". Your total purchase prices is " + totalCost);
        }
    }
}