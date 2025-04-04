package homework8;

import java.util.Scanner;

public class Homework8_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();

        String first, second, third;

        if (str1.length() <= str2.length() && str1.length() <= str3.length()) {
            first = str1;
            if (str2.length() <= str3.length()) {
                second = str2;
                third = str3;
            } else {
                second = str3;
                third = str2;
            }
        } else if (str2.length() <= str1.length() && str2.length() <= str3.length()) {
            first = str2;
            if (str1.length() <= str3.length()) {
                second = str1;
                third = str3;
            } else {
                second = str3;
                third = str1;
            }
        } else {
            first = str3;
            if (str1.length() <= str2.length()) {
                second = str1;
                third = str2;
            } else {
                second = str2;
                third = str1;
            }
        }

        System.out.println("Строки в порядке возрастания длины:");
        System.out.println(first + " (длина: " + first.length() + ")");
        System.out.println(second + " (длина: " + second.length() + ")");
        System.out.println(third + " (длина: " + third.length() + ")");
        scanner.close();
    }
}

