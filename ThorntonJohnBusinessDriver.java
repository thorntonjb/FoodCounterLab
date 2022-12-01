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
    public static void main(String[] args)
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

        String[] entreeMenuItems = {"Soft Drink", "Hallacas", "Pabellon (Bowl or Taco)", "Empanadas", "Arepas", "Pasteles", "Venezuelan Hot Dog"};
        String[] dessertMenuItems = {"Cocosette", "Guava and Cheese Empanada", "Nutella Tequeño"};

        System.out.println("\nEntree Menu: ");
        for (int counter = 0; counter < entreeMenuItems.length; counter++)
        {
            System.out.println((counter + 1) + ") " + entreeMenuItems[counter]);
        }

        System.out.println("\nDessert Menu:");
        for (int counter = 0; counter < dessertMenuItems.length; counter++)
        {
            System.out.println((counter + 1) + ") " + dessertMenuItems[counter]);
        }
        
        System.out.println(decorativeLine);

        console.close();
    }
}