package homework2;

import java.util.Scanner;

public class Homework2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("Please enter a positive integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Error! Enter a number greater than zero!");
                }
            } else {
                System.out.println("Error! Please enter an integer.");
                scanner.next();
            }
        }

        int sumOfDigits = 0;
        for (int i = 1; i <= number; i++) {
            sumOfDigits += i;
        }
        System.out.println("The sum from 1 to " + number + " is " + sumOfDigits + ".");
        scanner.close();
    }
}
