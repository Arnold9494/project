
/******************************
 * @Title: OpokuArnoldEvansFileInputOutput
 * @Purpose: To practice file operation
 * @author: (Opoku Arnold Evans)
 * @Date: 09/26/2021
 * @version: 1.0
 ******************************/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class OpokuArnoldEvansFileInputOutput {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter input file name >> ");
            String input = sc.nextLine();
            System.out.print("Enter output file name >> ");
            String output = sc.nextLine();
            sc.close();

            File file = new File(input);
            if (!file.exists()) {
                System.out.println("File Not Exists !! ");
                System.exit(0);
            }

            sc = new Scanner(file);

            File fileoutput = new File(output);
            PrintWriter printWriter = new PrintWriter(fileoutput);

            String local;
            while (sc.hasNext()) {
                local = sc.nextLine();
                // going to each line
                local = local.toUpperCase();
                printWriter.write(local + "\n");
            }

            sc.close();
            printWriter.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            System.out.println("Text File Not Found");
        }
    }

}
