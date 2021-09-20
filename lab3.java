import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a  Character Between A and Z");
        char ct = keyboard.next().charAt(0);
        int n = ct - 'a';
        char temp;
        n += 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)

            {
                temp = (char) ('a' + (j - 1));
                System.out.print(temp);
            }
            System.out.println();

        }

    }
}
