import java.util.Scanner;

import javax.xml.stream.events.EndElement;

public class classlab2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the velocity in mph");
        int vel = keyboard.nextInt();

        int distance;
        int hours;
        do {
            System.out.println("Enter the time in hours");
            hours = keyboard.nextInt();
        }

        while (hours < 0 || hours > 10);
        System.out.println("Hour\t\t DistanceTravelled");
        System.out.println("===================================");
        int i = 1;

        do {
            distance = vel * i;
            System.out.println(i + "\t\t\t\t" + distance);
            i++;
        } while (i <= hours);

    }

}

/*
 * 1. B 2. B 3. B 4. A 5. A
 */