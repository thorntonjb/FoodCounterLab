/**
 * ITSC1212-103 - Professor von Briesen
 * @author John Thornton
 * @since December 1, 2022
 * @version 1.0
 * Setting up a basic business using arrays, objects, and methods
 * 
 */

/*
 * Business Name: John's Street Venezuela
 * Menu Items:
 *  1) Small drink
 *  2) Medium drink
 *  3) Large drink
 *  4) Hallacas
 *  5) Pabellon Taco (with option of bowl)
 *  6) Empanadas (Chicken, Beef)
 *  7) Arepas (Chicken, Beef)
 *  8) Pastelas (Chicken, Beef)
 *  9) Venezuelan Hot Dog (Papitas, Onions, Ketchup, Salsa Rosada)
 *  10) Desserts (Cocosette, Guava & Cheese Empanada, Nutella Tequeños)
 */

import java.util.*;

public class ThorntonJohnBusinessDriver
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner console = new Scanner(System.in);
        
        String companyName = "Street Venezuela";
        String ownerName = "John";
        String customerName = "";
        String welcome = "Welcome to " + companyName + "!";
        String decorativeLine = "\n#############################\n";

        System.out.println(decorativeLine);

        System.out.println(welcome);
        System.out.print("I'm " + ownerName + ", what's your name? ");
        customerName = console.nextLine();
        String greeting = "What's up, " + customerName + "! Take a look at our menu.";
        System.out.println(greeting);

        String[] entreeMenuItems = {"Soft Drink", "Hallacas", "Pabellon", "Empanadas", "Arepas", "Pasteles", "Venezuelan Hot Dog"};
        String[] dessertMenuItems = {"Cocosette", "Guava and Cheese Empanada", "Nutella Tequeño"};
        int orderNumber = 0;
        
        System.out.println("\nEntree Menu: ");
        while(orderNumber < entreeMenuItems.length)
        {
            System.out.println((orderNumber + 1) + ") " + entreeMenuItems[orderNumber]);
            orderNumber++;
        } // end while loop

        orderNumber = 0;
        System.out.println("\nDessert Menu:");
        while(orderNumber < dessertMenuItems.length)
        {
            System.out.println((orderNumber + 8) + ") " + dessertMenuItems[orderNumber]);
            orderNumber++;
        } // end while loop
        
        System.out.println(decorativeLine);

        System.out.print("How many items would you like to order? ");
        String customerInput = console.nextLine();
        int numberOfItems = Integer.parseInt(customerInput);

        String[] orderedItems = new String[numberOfItems];
        String order = ""; 
        for (int counter = 0; counter < orderedItems.length; counter++)
        {
            System.out.print("Which item would you like? Please give the number: ");
            customerInput = console.nextLine();
            orderNumber = Integer.parseInt(customerInput);
            if (orderNumber < 8)
            {
                orderedItems[counter] = entreeMenuItems[orderNumber - 1];
                // System.out.println(orderedItems[counter]);
            }
            else
            {
                orderedItems[counter] = dessertMenuItems[orderNumber - 8];
                // System.out.println(orderedItems[counter]);
            }

            Thread.sleep(500);
            System.out.println("Order of '" + orderedItems[counter] + "' added to cart.");
            order = order + "\n" + (counter + 1) + ") " + orderedItems[counter];
            
        }
        System.out.println(decorativeLine);
        
        System.out.println("\nProcessing list of your order... thank you, " + customerName +"!\n");
        Thread.sleep(1000);
        System.out.println(customerName + "'s order: \n" + order); 

        System.out.println("Your order will be ready shortly. Have a wonderful day!");       

        console.close();
    } // end main()
} // end class