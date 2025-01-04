/*
This is a code by Thyhappy
Thank you for using this code
If you have any problem, please contact me at busilpio@outlook.com
*/
import java.util.Scanner;

// This is the main class
public class Main {

  // This is the main method
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to our supermarket\nChoose a kind of these things\nDo you want to buy something?");
    System.out.println("true or false");
    boolean Start = sc.nextBoolean();
    double total = 0;
    if (Start) {
      while (Start) {
        System.out.println("What do you want to buy? (Enter 'done' to finish;Enter 'menu' to see the menu)");
        String Buy = sc.nextLine();
        if (Buy.equalsIgnoreCase("done")) {
          Start = false;
        } else if (Buy.equalsIgnoreCase("menu")) {
          System.out.println("1. Apple: 2.5 AED\n2. Orange: 1.5 AED\n3. Banana: 1.0 AED\n4. Mango: 3.0 AED\n5. Pineapple: 4.0 AED\n6. Watermelon: 5.0 AED\n7. Grapes: 2.0 AED\n8. Strawberry: 3.0 AED\n9. Blueberry: 2.5 AED\n10. Peach: 2.0 AED");
        } else {
          double price = getPrice(Buy);
          if (price != -1) {
            total += price;
            System.out.println("Added " + Buy + " to your cart. Total: " + total);
          } else {
            System.out.println("Invalid item. Please choose from the available items.");
          }
        }
      }
      System.out.println("Your total is: " + total);
    }
  }

  // Get the price of an item
  public static double getPrice(String item) {
    switch (item.toLowerCase()) {
      case "apple":
        return 2.5;
      case "orange":
        return 1.5;
      case "banana":
        return 1.0;
      case "mango":
        return 3.0;
      case "pineapple":
        return 4.0;
      case "watermelon":
        return 5.0;
      case "grapes":
        return 2.0;
      case "strawberry":
        return 3.0;
      case "blueberry":
        return 2.5;
      case "peach":
        return 2.0;
      default:
        return -1; // Invalid item
    }
  }
}
