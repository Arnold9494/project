import java.util.Scanner;

public class exercisetwo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please Enter First Name: ");
        String first_name = keyboard.nextLine();

        System.out.print("Please Enter Last Name: ");
        String last_name = keyboard.nextLine();

        System.out.print("Please Enter Student ID: ");
        int stud_id = keyboard.nextInt();

        System.out.print("Please Enter Major: ");
        String major = keyboard.next();

        System.out.print("Please Enter Age: ");
        int age = keyboard.nextInt();

        System.out.print("Please Enter Social Club: ");
        String Soc_club = keyboard.next();

        System.out.println("Your name is " + first_name + "," + last_name);
        System.out.println("Your Student ID is " + stud_id);
        System.out.println("Your Major is " + major);
        System.out.println("Your Age is " + age);
        System.out.println("You belong to " + Soc_club);

    }
}
