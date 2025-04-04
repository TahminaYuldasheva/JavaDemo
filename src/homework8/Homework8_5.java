package homework8;

import java.util.Scanner;

public class Homework8_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Пожалуйста, введите слово: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            result.append(c).append(c);
        }

        System.out.println("Результат: " + result);

        scanner.close();
    }
}
