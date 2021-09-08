import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        double grade1, grade2, grade3, grade4;

        System.out.println("Enter the First grade");
        grade1 = keyboard.nextDouble();

        System.out.println("Enter the Second grade");
        grade2 = keyboard.nextDouble();

        System.out.println("Enter the Third grade");
        grade3 = keyboard.nextDouble();

        System.out.println("Enter the Forth grade");
        grade4 = keyboard.nextDouble();

        double average = (grade1 + grade2 + grade3 + grade4) / 4;
        System.out.println("The average is " + average);

        if (average >= 90 && average <= 100) {
            System.out.println("Your grade is A");
        } else if (average >= 80) {
            System.out.println("Your grade is B");
        } else if (average >= 70) {
            System.out.println("Your grade is C");
        } else if (average >= 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }
    }
}
