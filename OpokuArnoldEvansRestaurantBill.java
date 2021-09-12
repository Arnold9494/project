import java.util.Scanner;

/******************************
 * @Title: OpokuArnoldEvansRestaurantBill
 * @Purpose: To get familiar with primitive arithmetic data types,and conditional statements in Java
 * @author: (Opoku Arnold Evans)
 * @Date: 09/09/2021
 * @version: 1.0
 ******************************/

public class OpokuArnoldEvansRestaurantBill {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Declaration of a string array names of size 3
        String[] names = new String[3];
        // Declaration of a double array price of size 3
        double[] price = new double[3];
        // Declaration of an integer array amount of size 3
        int[] amount = new int[3];
        // Declaration and initialization of a double variable total with 0
        double total = 0;

        // first_item_name
        System.out.print("Enter first item name: ");
        names[0] = keyboard.next();

        // first_item_price
        System.out.print("Enter first item price: ");
        price[0] = keyboard.nextDouble();

        // first_item_amount
        System.out.print("Enter first item amount: ");
        amount[0] = keyboard.nextInt();

         //Checking whether the entered price is negative or not
    if(price[0] < 0){
        System.out.println("Error: price cannot be negative");
        return ;
    }
    

        // second_item_name
        System.out.print("Enter second item name: ");
        names[1] = keyboard.next();

        // second_item_price
        System.out.print("Enter second item price: ");
        price[1] = keyboard.nextDouble();

        // second_item_amount
        System.out.print("Enter second item amount: ");
        // Storing the entered amount at 1st index of array amount
        amount[1] = keyboard.nextInt();

         //Checking whether the entered price is negative or not
    if(price[0] < 0){
        System.out.println("Error: price cannot be negative");
        return ;
    }

        // third_item_name
        System.out.print("Enter third item name: ");
        names[2] = keyboard.next();

        // third_item_price
        System.out.print("Enter third item price: ");
        price[2] = keyboard.nextDouble();

        // third_item_amount
        System.out.print("Enter third item amount: ");
        amount[2] = keyboard.nextInt();

         //Checking whether the entered price is negative or not
    if(price[0] < 0){
        System.out.println("Error: price cannot be negative");
        return ;
    }

        // for loop which iterates for 3 times
        // in the 1st iteration, i=0
        // in the second iteration, i=1
        // in the 3rd iteration i=2
        for (int i = 0; i < 3; i++) {
            total = total + price[i] * amount[i];
        }
        System.out.println("\nOutput:\n");
        System.out.println("Item\t  Price\t  Amount");
        System.out.println("---------------------------");

        // for loop which iterates for 3 times
        for (int i = 0; i < 3; i++) {

            System.out.print(names[i] + "\t  $");
            System.out.printf("%.2f", price[i]);
            System.out.println("\t  " + amount[i]);
        }

        System.out.println("\nTotal: $" + total);

        

    }
}
