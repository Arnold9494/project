import java.util.Scanner;

import javax.security.auth.kerberos.KerberosKey;

public class exercisethree {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter first test score");
        double score1 = keyboard.nextDouble();

        System.out.println("Enter second test score");
        double score2 = keyboard.nextDouble();

        System.out.println("Enter third test score");
        double score3 = keyboard.nextDouble();

        double sum = score1 + score2 + score3;
        double average = sum / 3;
        System.out.println("Test score average: " + average);

    }
}
