package homework8;

import java.util.Scanner;

public class Homework8_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();

        double averageLength = (str1.length() + str2.length() + str3.length()) / 3.0;

        System.out.println("Строки, длина которых меньше средней " + averageLength + ":");
        if (str1.length() < averageLength) {
            System.out.println("Строка: " + str1 + "." + " Её длина равна " + str1.length());
        }
        if (str2.length() < averageLength) {
            System.out.println("Строка: " + str2 + "." + " Её длина равна " + str2.length());
        }
        if (str3.length() < averageLength) {
            System.out.println("Строка: " + str3 + "." + " Её длина равна " + str3.length());
        }
        scanner.close();
    }
}
