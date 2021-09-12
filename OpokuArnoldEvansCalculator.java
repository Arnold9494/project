import java.util.Scanner;

/******************************
 * @Title: OpokuArnoldEvansCalculator
 * @Purpose: To get familiar with simple calculations and comparison in java 
 * @author; (Opoku Arnold Evans)
 * @Date: 09/09/2021
 * @version: 1.0
 ******************************/
public class OpokuArnoldEvansCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // first_number//
        System.out.println("Enter First Number");
        double first_number = keyboard.nextDouble();

        // second_number //
        System.out.println("Enter Second Number");
        double second_number = keyboard.nextDouble();

        // sign/
        System.out.println("Enter Operation");
        String operation = keyboard.next();

        if (operation.equals("+")) {
            double add = first_number + second_number;
            System.out.println("Result: " + add);
        } else if (operation.equals("-")) {
            double subtract = first_number - second_number;
            System.out.println("Result: " + subtract);
        } else if (operation.equals("*")) {
            double mulitply = first_number * second_number;
            System.out.println("Result: " + mulitply);
        } else if (operation.equals("/")) {
            double divide = first_number / second_number;
            System.out.println("Result: " + divide);
        } else {
            System.out.println("Error: Received invalid operation. Valid operations are +, -, *, /");
        }

    }
}