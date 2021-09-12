import java.util.Scanner;

public class exerciseone {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please Enter the First Number: ");
        int num1 = keyboard.nextInt();

        System.out.println("Please Enter the Second Number: ");
        int num2 = keyboard.nextInt();

        int sum = num1 + num2;
        double average = sum / 2;
        System.out.println("The First Number is " + num1 + " and the second number is " + num2);
        System.out.println("The result of their sum is " + sum);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + average);

    }
}
