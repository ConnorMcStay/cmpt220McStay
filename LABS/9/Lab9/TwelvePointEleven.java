 import java.util.*;
 import java.io.*;
 
public class TwelvePointEleven {

	public static void main(String[] args) {

        if (args.length != 2) {

            System.out.println("Invalid arguments.");

            System.out.println("Usage: java Chapter_12.Exercise_11 word filename");

            System.exit(1);

        }
        // Check 
        File filename = new File(args[1]);

        if (!filename.exists()) {

            System.out.println(args[1] + " does not exist.");

            System.out.println(2);

        }
        // create input

        String s = "";

        try {

            Scanner input = new Scanner(filename);

            while (input.hasNext()) {

                s += input.nextLine();

            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }

        s = s.replaceAll(args[0], "");

        try {

            PrintWriter output = new PrintWriter(filename);

            System.out.println(s);

            output.write(s);

            output.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        }
        System.out.println("Complete");

    }

}