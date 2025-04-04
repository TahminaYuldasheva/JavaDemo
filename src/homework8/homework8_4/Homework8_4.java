package homework8.homework8_4;

import java.util.Scanner;

import static homework8.homework8_4.Check.check;

public class Homework8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = scanner.nextLine();
        System.out.println("Введите третью строку: ");
        String str3 = scanner.nextLine();

        System.out.println("Слова с уникальными символами: ");
        boolean found = false;

        String[] allWords = (str1 + " " + str2 + " " + str3).split(" ");

        for (String word : allWords) {
            if (!word.isEmpty() && check(word)) {
                System.out.println("- " + word);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Слов с уникальными символами нет!");
        }
        scanner.close();
    }
}
