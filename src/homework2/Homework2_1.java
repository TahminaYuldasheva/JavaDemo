package homework2;

import java.util.Scanner;

public class Homework2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int enteredNumber = scanner.nextInt();

        if (enteredNumber % 2 == 0) {
            System.out.println("Your number is even!");
        } else {
            System.out.println("Your number is odd!");
        }
        scanner.close();
    }
}
