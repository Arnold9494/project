
//import java Scanner
import java.util.Random;
import java.util.Scanner;

public class lab_5_2 
{

    // generate computer choice randomly
    public static int getRandomChoice()
     {
        Random randomNumbers = new Random();
        // Generate a number between 1 and 3
        int numbers = randomNumbers.nextInt(3) + 1;
        return numbers;
    }

    // Display a message for users choice
    public static void menu()
     {
        System.out.println(" == Rock Paper Scissors == ");
        System.out.println(" == Rock : 1 == ");
        System.out.println(" == Rock : 2 == ");
        System.out.println(" == Rock : 3 == ");
    }

    public static int playerChoice() 
    {
        // create instance of scanner and create some variables
        Scanner keyboard = new Scanner(System.in);
        int game = 0;

        // To get a valid choice
        while (game < 1 || game > 3) 
        {
            System.out.println("Please make your choice ");
            String choice = keyboard.nextLine();

            // If invalid input
            try {
                game = Integer.parseInt(choice);
            } catch (NumberFormatException e) 
            {
                System.out.println("Invalid input");
            }
        }
        return game;
    }

    // to determine the winner
    public static String getWinner(int cp, int po) 
    {

        // Computer's choice is 1
        if (cp == 1) {
            if (po == 1) {
                return "DRAW";
            } else if (po == 2) 
            {
                return "USER";
            } else {
                return "COMPUTER";
            }
        }

        // Computer's choice is 2
        else if (cp == 2) 
        {
            if (po == 1) 
            {
                return "COMPUTER";
            } else if (po == 2) 
            {
                return "DRAW";
            } else {
                return "USER";
            }
        }

        // Computers's choice is 3
        else {
            if (po == 1) 
            {
                return "USER";
            }
             else if (po == 2) 
            {
                return "COMPUTER";
            }
             else {
                return "DRAW";
            }
        }
    }

    // calling the private methods in the main methods
    public static void main(String[] args) {
        menu();
        int cp = getRandomChoice();
        int po = playerChoice();
        String winner = getWinner(cp, po);
        System.out.println("The computer chose: " + cp);
        System.out.println("The winner is: " + winner);
    }

}