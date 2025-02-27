package homework2;

import java.util.Scanner;

public class Homework2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature:");
        int temperature = scanner.nextInt();

        if (temperature > -5) {
            System.out.println("Warm!");
        } else if (temperature > -20) {
            System.out.println("Normal!");
        } else {
            System.out.println("Cold!");
        }
        scanner.close();
    }
}
