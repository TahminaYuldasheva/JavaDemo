package homework8;

import java.util.Scanner;


public class Homework8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();

        String longest = str1;
        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }

        String shortest = str1;
        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }

        System.out.println("Самая длинная строка: " + longest + " (длина: " + longest.length() + ")");
        System.out.println("Самая короткая строка: " + shortest + " (длина: " + shortest.length() + ")");
        scanner.close();
    }
}

