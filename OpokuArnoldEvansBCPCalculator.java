
/******************************
* @Title: OpokuArnoldEvansBCPCalculator
* @Purpose: To practice looping and if conditions.
* @author: (Opoku Arnold Evans)
* @Date: 09/26/2021
* @version: 1.0
******************************/

import java.util.Scanner;

public class OpokuArnoldEvansBCPCalculator {
    public static void main(String ars[]) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("**************************WELCOME TO PIKACHU BOOKHEAVEN STORE**********************");
        System.out.print("Please enter the name of the user: ");
        String name = sc.nextLine();
        System.out.println();

        System.out.print("Please enter the first month of book purchase: ");
        String firstmonth = sc.nextLine();

        System.out.print("Number of book(s) purchased in the month of " + firstmonth + ": ");
        int numfirstmonth = sc.nextInt();
        System.out.println();

        System.out.print("Please enter the second month of book purchase: ");
        String secondmonth = sc1.nextLine();

        System.out.print("Number of book(s) purchased in the month of " + secondmonth + ": ");
        int numsecondmonth = sc1.nextInt();
        System.out.println();

        System.out.print("Please enter the third month of book purchase: ");
        String thirdmonth = sc2.nextLine();

        System.out.print("Number of book(s) purchased in the month of " + thirdmonth + ": ");
        int numthirdmonth = sc2.nextInt();
        System.out.println();

        System.out.println("The total number of books purchased " + (numfirstmonth + numsecondmonth + numthirdmonth));
        System.out.println("The number of points awarded as follows: ");

        System.out.println(firstmonth + ":" + points(numfirstmonth) + "s");
        System.out.println(secondmonth + ":" + points(numsecondmonth) + "s");
        System.out.println(thirdmonth + ":" + points(numthirdmonth) + "s");
        System.out.println("--------------------------------------------");
        int total = points(numfirstmonth) + points(numsecondmonth) + points(numthirdmonth);
        System.out.println(name + " earned " + total + " points from " + firstmonth + " till " + thirdmonth);
        sc.close();
        sc1.close();
        sc2.close();
    }

    public static int points(int nu) {
        if (nu == 0)
            return 0;
        else if (nu == 1)
            return nu * 10;
        else if (nu == 2)
            return nu * 25;
        else if (nu == 3)
            return nu * 30;
        else if (nu >= 4)
            return nu * 40;
        else
            return 0;
    }
}
