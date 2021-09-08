import java.util.Scanner;

public class exercise {

    public static void main(String[] args) {

        double mass, kg;
        double speed, acc;
        double time, force;

        


        Scanner keyboard = new Scanner(System.in);

        // mass in kg
        System.out.println("Enter Mass in pounds");
        mass = keyboard.nextDouble();
        kg = mass / 2.2;

        // deceleration
        System.out.println("Enter the speed of the car in (m/s) during the crash ");
        speed = keyboard.nextDouble();

        // time
        System.out.println("Enter the duration in seconds when the car completely stops. ");
        time = keyboard.nextDouble();
        acc = (0 - speed) / time;

        // force
        force = kg * acc;
        
        System.out.println("Mass of car in Kg is " + kg + "kg");
        System.out.println("Accelaration of the Car is " + acc + " m/s");
        System.out.println("Force is " + force + " N ");
        
    }
}