//import java Scanner
import java.util.Scanner;
import java.util.function.DoubleConsumer;

public class lab_5_1 {
    public static void menu() {
        System.out.println("1: convert to kilometers ");
        System.out.println("2: convert to inches ");
        System.out.println("3: convert to feet");
        System.out.println("4: convert to program");
    }

    public static void main(String[] args) {
        // create instance of scanner and create some variables
        Scanner keyboard = new Scanner(System.in);
        double keyboardMeters = 0;
        int choice = 0;

        // use a loop to ensure the user enter a valid distance
        do {
            System.out.println("Enter a positive distance is meters");
            keyboardMeters = keyboard.nextDouble();
        } while (keyboardMeters < 0);

        // create a loop to run the converter
        while (true) {
            // call the menu method to display the menu
            menu();

            // ask the user for their choice and store it
            System.out.println("Enter your choice");
            choice = keyboard.nextInt();

            // call the appropriate method based on the user's choice
            if (choice == 1) {
                showKilometers(keyboardMeters);
            } else if (choice == 2) {
                showInches(keyboardMeters);
            } else if (choice == 3) {
                showFeet(keyboardMeters);
            } else if (choice == 4) {
                System.out.println("you have ended the program, toodlers");
                System.exit(0);
            } else {
                System.out.println("invalid choice, enter 1-4");
            }

        }

    }

    // converts meters to feet and print it out
    public static void showFeet(double meters) {
        double feet = meters * 3.281;
        System.out.println(meters + "meters is " + feet + " feet");
    }

    // converts meters to inches andd print it out
    public static void showInches(double meters) {
        double inches = meters * 39.37;
        System.out.println(meters + "meters is " + inches + " inches");
    }

    // converts meters to kilometers and print it oiut
    public static void showKilometers(double meters) {
        double kilometers = meters * 0.001;
        System.out.println(meters + "meters is " + kilometers + " kikometers");
    }
}

/*
 * 1. A 2. A 3. 4. E 5. B
 */