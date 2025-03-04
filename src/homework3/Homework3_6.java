package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        System.out.println("Выберите способ заполнения массива. 1 - случайными числами, 2 - вручную: ");
        int choice = scanner.nextInt();
        if (choice == 1) {
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(10);
            }

        } else {
            System.out.println("Введите " + number + " элемента(-ов) массива: ");

            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.toString(array));
        boolean increasing = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i - 1]) {
                increasing = false;
                break;
            }
        }
        if (increasing) {
            System.out.println("Массив является возрастающей последовательностью.");
        } else {
            System.out.println("Массив НЕ является возрастающей последовательностью.");
        }
        scanner.close();
    }
}
