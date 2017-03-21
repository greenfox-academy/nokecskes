/**
 * Created by Connor on 2017.03.21..
 */

import java.util.Scanner;

public class CountFromTo {

    public static void main (String[] args) {

        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
        // "The second number should be bigger"
        //
        // If it is bigger it should count from the first number to the second by one
        //
        // example:
        //
        // first number: 3, second number: 6, should print:
        //
        // 3
        // 4
        // 5

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a number: ");
        int a = scanner.nextInt();

        System.out.println("Please give me a second one: ");
        int b = scanner.nextInt();

        while (a > b) {
            System.out.println("The second number should be bigger. \nNumber two: ");
            b = scanner.nextInt();
        }

        System.out.println("Excellent! And now let's count!");

        for (int i = a; i <= b; i++){
            System.out.println(i);
        }

    }

}
