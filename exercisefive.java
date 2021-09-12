import java.util.Scanner;

public class exercisefive {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter Number");
        int num = keyboard.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even  and positive");
        } else {
            System.out.println(num + " is odd  and negative");
        }

    }
}
