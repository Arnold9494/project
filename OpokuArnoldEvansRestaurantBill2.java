/******************************
 * @Title: OpokuArnoldEvansRestaurantBill2
 * @Purpose: To define and call methods
 * @author: (Opoku Arnold Evans)
 * @Date: 10/17/2021
 * @version: 1.0
 ******************************/

// import java Scanner
import java.util.Scanner;

public class OpokuArnoldEvansRestaurantBill2 {

  //create a scanner object
 static Scanner keyboard  = new Scanner(System.in);

//method to get number of items
 public static int getItemNum(int num) {
  System.out.printf("Enter how many Items %d: ", num);
  return Integer.parseInt(keyboard.nextLine());
 }

  //method to get items name
    public static String enterItemName(int num) {
        System.out.printf("Enter name for item No %d: ", num);
        return keyboard.nextLine();
    }

    //method to get item price
  public static double enterItemPrice(int num) {
    System.out.printf("Enter price for item No %d: ", num);
    return Double.parseDouble(keyboard.nextLine());
  }

  //item to get item amount
  public static int enterItemAmount(int num) {
    System.out.printf("Enter amount for item no %d: ", num);
    return Integer.parseInt(keyboard.nextLine());
  }


//main method to call out functions
  public static void main(String[] args) {

    System.out.print("Enter customer name: ");
    String customerName = keyboard.nextLine().strip();

    int[] item = new int[3];
    String[] names = new String[3];
    double[] prices = new double[3];
    int[] amount = new int[3];

    double total = 0;

    //create an instance for user to make an option
    char choice = 'y';
    while (choice == 'y') {

      //loop to ask for price item and amount for at least 3 times
      for (int i = 0; i < 3; ++i) {
        item[i] = getItemNum( i++);
        names[i] = enterItemName(i + 1);
        prices[i] = enterItemPrice(i + 1);
        amount[i] = enterItemAmount(i + 1);

        total += prices[i] * amount[i];
      }

      System.out.println("\nCustomer Name: " + customerName);
      System.out.println("Items     Price  Amount");
      System.out.println("------------------------");
      for (int i = 0; i < 3; ++i) {
        System.out.printf("%-9s $%.2f %d\n", names[i], prices[i], amount[i]);
      }
      System.out.printf("\nTotal $%.2f\n", total);

      System.out.println("\nDo you want to continue (Y/N) ");
      choice = Character.toLowerCase(keyboard.nextLine().strip().charAt(0));
    }
  }
}