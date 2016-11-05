package standard.engine;

import java.util.Scanner;

/**
 * Created by Milos on 05/11/2016.
 */
public class Engine
{
    public static void main(String [] args)
    {
        byte[] test = new byte[10000];
        System.out.println("test");


        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Enter something : ");
            String input = scanner.nextLine();

            if ("q".equals(input)) {
                System.out.println("Exit!");
                break;
            }

            System.out.println("input : " + input);
            System.out.println("-----------\n");
        }

        scanner.close();
    }
}
