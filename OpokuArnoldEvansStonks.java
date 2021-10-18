/******************************
 * @Title: OpokuArnoldEvansStonks
 * @Purpose: To create a class
 * @author: (Opoku Arnold Evans)
 * @Date: 10/17/2021
 * @version: 1.0
 ******************************/

 //import java Scanner
 import java.util.Scanner;

public class OpokuArnoldEvansStonks {
    // main method
    public static void main(String[] args) {

        // create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // prompt inputs from user
        System.out.print("\nEnter the number of shares : ");
        int ns = keyboard.nextInt();

        System.out.print("Enter the purchase price per share : ");
        double pp = keyboard.nextDouble();

        System.out.print("Enter the purchase commision paid : ");
        double pc = keyboard.nextDouble();

        System.out.print("Enter the sales price per share : ");
        double sp = keyboard.nextDouble();

        System.out.print("Enter the sales commision per share : ");
        double sc = keyboard.nextDouble();

        // print profit
        if (profitLoss(ns, pp, pc, sp, sc) > 0) {
            System.out.println("\nThe Profit is " + profitLoss(ns, pp, pc, sp, sc));
        }

        // if loss occurs then print loss
        else {
            System.out.println("\nThe loss is " + profitLoss(ns, pp, pc, sp, sc));
        }
    }

    // method named profitLoss takes arguments int ns, double pp, double pc, double
    // sp, double sc
    public static double profitLoss(int ns, double pp, double pc, double sp, double sc)

    {
        // calculate profit or loss and return it
        double pl = ((ns * sp) - sc) - ((ns * pp) + pc);
        return pl;
    }
}
