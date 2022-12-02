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

        String[] menuItems = {"Soft Drink", "Hallacas", "Pabellon", "Empanadas", "Arepas", 
                            "Pasteles", "Venezuelan Hot Dog", "Cocosette", 
                            "Guava and Cheese Empanada", "Nutella Tequeño"};
        int orderNumber = 0;

        System.out.println("\nEntree Menu: ");
        while(orderNumber < menuItems.length)
        {
            System.out.println((orderNumber + 1) + ") " + menuItems[orderNumber]);
        
            if (orderNumber == 6)
            {
                System.out.println("Dessert Menu: ");
            }
            
            orderNumber++;
        } // end while loop
        
        System.out.println(decorativeLine);

        System.out.print("How many items would you like to order? ");
        String customerInput = console.nextLine();
        if (customerInput.equalsIgnoreCase("x") || customerInput.trim().equals(""))
        {
            System.out.println("UNDERSTANDABLE, HAVE A NICE DAY ✌️");
            System.exit(0);
        }
        int numberOfItems = Integer.parseInt(customerInput);

        String[] orderedItems = new String[numberOfItems];
        String order = ""; 
        for (int counter = 0; counter < orderedItems.length; counter++)
        {
            if (counter >= 1)
            {
                System.out.print("Would you still like to order " + numberOfItems + " things? (y/n) ");
                String customerDecision = console.nextLine();
                if (customerDecision.equalsIgnoreCase("n")) { break; }
            } // end if

            System.out.print("Which item would you like? Please give the number: ");
            customerInput = console.nextLine();
            orderNumber = Integer.parseInt(customerInput);

            if (customerInput.equalsIgnoreCase("x") || customerInput.trim().equals(""))
            {
                System.out.println("UNDERSTANDABLE, HAVE A NICE DAY ✌️");
                System.exit(0);
            } // end if

            if (orderNumber < menuItems.length && orderNumber > 0) { orderedItems[counter] = menuItems[orderNumber - 1]; }
            else 
            { 
                while (orderNumber > 11 || orderNumber < 0)
                {
                    System.out.println("Your entry is invalid. "); 
                    System.out.print("Please give a valid number: ");
                    customerInput = console.nextLine();
                    orderNumber = Integer.parseInt(customerInput);
                }
            } // end if

            Thread.sleep(500);
            System.out.println("Order of '" + orderedItems[counter] + "' added to cart.");
            order = order + "\n" + (counter + 1) + ") " + orderedItems[counter];
            
        }
        System.out.println(decorativeLine);

        System.out.println("\nProcessing list of your order... thank you, " + customerName +"!\n");
        Thread.sleep(1000);
        System.out.println(customerName + "'s order: \n" + order); 

        System.out.println("Order will be ready shortly. Have a wonderful day!");       

        console.close();
    } // end main()
} // end class