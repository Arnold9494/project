
/******************************
 * @Title: OpokuArnoldEvansBankCharges
 * @Purpose: To practice java if statements and formatted printing.
 * @author: (Opoku Arnold Evans)
 * @Date: 09/26/2021
 * @version: 1.0
 ******************************/
import java.util.Scanner;

public class OpokuArnoldEvansBankCharges {
    public static void main(String[] args) {
        // create scanner
        Scanner keyboard = new Scanner(System.in);

        // create user input for the month
        System.out.print("Please enter the month: ");
        String month = keyboard.nextLine();

        // create user input for number of checks
        System.out.print("How many check(s) were written for the month of " + month + ": ");
        int checks = keyboard.nextInt();

        double fees = points(checks) + 100;
        System.out.printf("The bank's service fee for the month of " + month + " is: $%.2f ", fees);
        keyboard.close();
    }

    // method to return charges
    public static double points(int nu) {
        if (nu < 25)
            return nu * .50;
        else if (nu > 24 && nu < 46)
            return nu * .18;
        else if (nu > 45 && nu < 61)
            return nu * .10;
        else if (nu > 60)
            return nu * .06;
        else
            return 0;

    }
}
