
/******************************
 * @Title: OpokuArnoldEvansRectangleArea
 * @Purpose: To create a class
 * @author: (Opoku Arnold Evans)
 * @Date: 10/17/2021
 * @version: 1.0
 ******************************/

 
//import java scanner
import java.util.Scanner;

public class OpokuArnoldEvansRectangleArea {
    static Scanner keyboard = new Scanner(System.in);

    public static double getLength() 
    {

        System.out.print("Enter the length: ");
        double length = keyboard.nextDouble();
        return length;
    }

    public static double getWidth() 
    {
        System.out.print("Enter rectangle width: ");
        double width = keyboard.nextDouble();
        return width;
    }

    public static double getArea(double length, double width)
    {
        return length * width;
    }

    public static void displayData(double length, double width, double area) 
    {
        System.out.println("Length of rectangle: " + length);
        System.out.println("Width of rectangle : " + width);
        System.out.printf("Area of rectangle: %.2f ", area);
    }

    public static void main(String[] args) 
    {

        double length, // The rectangle's length
                width, // The rectangle's width
                area; // The rectangle's area

        // Get the rectangle's length from the user.
        length = getLength();

        // Get the rectangle's width from the user.
        width = getWidth();

        // Get the rectangle's area.
        area = getArea(length, width);

        // Display the rectangle data.
        displayData(length, width, area);

    }

}