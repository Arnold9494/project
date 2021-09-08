import java.util.Scanner;

public class inclass2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter year");
        int year = keyboard.nextInt();

        if (year % 4 == 0 && year % 100 != 0)
         {
            System.out.print("This is a leap year");
        }
         else if (year % 100 == 0 && year % 400 != 0)
          {
            System.out.println("This is a leap year");
        } 
        else 
        {
            System.out.println(year + " Is not a leap year");
        }
    }
}


