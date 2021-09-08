import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args)
    {
      
       String name;
       double width; 
       double height;
       double depth;
       double capacity;

       Scanner keyboard = new Scanner(System.in);

       System.out.println(" Enter Model");
      name = keyboard.nextLine();
       
       System.out.println(" Enter width");
       width = keyboard.nextDouble();
    
       System.out.println(" Enter height");
       height = keyboard.nextDouble();
      
       System.out.println(" Enter depth");
       depth = keyboard.nextDouble();
       

       capacity = width*height*depth;
       //convertion
        capacity = capacity * 0.000578703704; 
       System.out.println(" Your " + name + " Refrigerator is " + capacity + " Cubic Feet");


    }

     
}